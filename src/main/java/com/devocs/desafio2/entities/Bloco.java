package com.devocs.desafio2.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant inicio;

    private Instant fim;

}
