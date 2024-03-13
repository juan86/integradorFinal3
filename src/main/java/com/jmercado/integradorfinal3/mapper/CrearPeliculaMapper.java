package com.jmercado.integradorfinal3.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.springframework.stereotype.Component;

import com.jmercado.integradorfinal3.dto.CrearPeliculaDTO;
import com.jmercado.integradorfinal3.entity.Pelicula;

@Component
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface CrearPeliculaMapper extends IGenericMapper<Pelicula, CrearPeliculaDTO> {

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "generos", ignore = true)
    @Mapping(target = "imagen", ignore = true)
    Pelicula toEntity(CrearPeliculaDTO crearPeliculaDTO);
}
