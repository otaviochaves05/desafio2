package com.devocs.desafio2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;
}
