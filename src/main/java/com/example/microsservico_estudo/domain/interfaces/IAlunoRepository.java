package com.example.microsservico_estudo.domain.interfaces;

import java.util.List;

import com.example.microsservico_estudo.domain.entities.Aluno;

public interface IAlunoRepository {
    Aluno Salvar(Aluno aluno);

    List<Aluno> Listar();
}
