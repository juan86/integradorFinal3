package com.jmercado.integradorfinal3.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.mapstruct.NullValueCheckStrategy;

import com.jmercado.integradorfinal3.dto.PeliculaDTO;
import com.jmercado.integradorfinal3.entity.Pelicula;

@Component
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PeliculaMapper extends IGenericMapper<Pelicula, PeliculaDTO>{

    @Override
    @Mapping(target = "generos", ignore = true)
    PeliculaDTO toDto(Pelicula entity);

    @Override
    @Mapping(target = "generos", ignore = true)
    List<PeliculaDTO> toDTOList(List<Pelicula> peliculas);
}