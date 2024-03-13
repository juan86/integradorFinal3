package com.jmercado.integradorfinal3.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genero")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
}