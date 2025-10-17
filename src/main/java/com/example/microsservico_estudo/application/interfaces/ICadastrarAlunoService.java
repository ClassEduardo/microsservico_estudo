package com.example.microsservico_estudo.application.interfaces;

import java.util.List;

import com.example.microsservico_estudo.domain.entities.Aluno;

public interface ICadastrarAlunoService {
    Aluno Executar(Aluno aluno);

    List<Aluno> Listar();
}
