package com.jmercado.integradorfinal3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "imagen_pelicula")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ImagenPelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_archivo", nullable = false, length = 50)
    private String nombreArchivo;

    @Column(name = "contenido", nullable = false)
    private byte[] contenido;

}
