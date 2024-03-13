package com.jmercado.integradorfinal3.service;


import java.util.List;

import com.jmercado.integradorfinal3.dto.GeneroDTO;

public interface GeneroService {

    GeneroDTO crearGenero(GeneroDTO generoDTO);
    GeneroDTO modificarGenero(Long id, GeneroDTO generoDTO);
    GeneroDTO eliminarGenero(Long id);
    GeneroDTO getGeneroPorId(Long id);
    List<GeneroDTO> listarTodosLosGeneros();

}