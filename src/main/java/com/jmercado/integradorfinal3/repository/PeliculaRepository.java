package com.jmercado.integradorfinal3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jmercado.integradorfinal3.entity.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    @Query("SELECT COUNT(p) > 0 FROM Pelicula p JOIN p.generos g WHERE g.id = :generoId")
    boolean existByGeneroId(Long generoId);
}