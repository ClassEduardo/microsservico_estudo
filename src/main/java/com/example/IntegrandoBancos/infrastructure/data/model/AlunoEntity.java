package com.example.IntegrandoBancos.infrastructure.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "alunos")
@Data
public class AlunoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer idade;
    private String curso;
    
    public AlunoEntity(String nome, Integer idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
}