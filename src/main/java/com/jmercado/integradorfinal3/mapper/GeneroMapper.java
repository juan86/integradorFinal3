package com.jmercado.integradorfinal3.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.springframework.stereotype.Component;

import com.jmercado.integradorfinal3.dto.GeneroDTO;
import com.jmercado.integradorfinal3.entity.Genero;

@Component
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface GeneroMapper extends IGenericMapper<Genero, GeneroDTO>{
}