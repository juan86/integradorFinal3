package com.jmercado.integradorfinal3.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jmercado.integradorfinal3.dto.GeneroDTO;
import com.jmercado.integradorfinal3.entity.Genero;
import com.jmercado.integradorfinal3.mapper.GeneroMapper;
import com.jmercado.integradorfinal3.repository.GeneroRepository;
import com.jmercado.integradorfinal3.repository.PeliculaRepository;
import com.jmercado.integradorfinal3.service.GeneroService;
import com.jmercado.integradorfinal3.exceptions.GenericException;
import com.jmercado.integradorfinal3.exceptions.NotFoundException;

@Service
public class GeneroServiceImpl implements GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public GeneroDTO crearGenero(GeneroDTO generoDTO) {
        Genero genero = generoRepository.save(generoMapper.toEntity(generoDTO));
        return generoMapper.toDto(genero);
    }

    @Override
    public GeneroDTO modificarGenero(Long id, GeneroDTO generoDTO) {
        Genero genero = generoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(""));

        generoMapper.updateEntity(genero, generoMapper.toEntity(generoDTO));
        genero.setId(id);

        generoRepository.save(genero);

        return generoMapper.toDto(genero);
    }

    @Override
    public GeneroDTO eliminarGenero(Long id) {
        Genero genero = generoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Genero no encontrado"));

        if (peliculaRepository.existByGeneroId(id))
            throw new GenericException("No se puede eliminar el genero porque hay peliculas asociadas a el", HttpStatus.BAD_REQUEST);

        generoRepository.delete(genero);

        return generoMapper.toDto(genero);
    }

    @Override
    public GeneroDTO getGeneroPorId(Long id) {
        Genero genero = generoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Genero no encontrado"));

        return generoMapper.toDto(genero);
    }

    @Override
    public List<GeneroDTO> listarTodosLosGeneros() {
        return generoMapper.toDTOList(generoRepository.findAll());
    }
}