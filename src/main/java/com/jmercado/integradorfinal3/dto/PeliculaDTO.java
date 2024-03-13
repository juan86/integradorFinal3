package com.jmercado.integradorfinal3.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PeliculaDTO {

    private Long id;
    private String titulo;
    private String generos;
    private String urlSitioWeb;
    private String nombreArchivoImagen;
}