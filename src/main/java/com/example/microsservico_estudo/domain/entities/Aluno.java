package com.example.microsservico_estudo.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String curso;

    public Aluno(String nome, Integer idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
}
