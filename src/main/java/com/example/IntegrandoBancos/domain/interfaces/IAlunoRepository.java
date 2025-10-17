package com.example.IntegrandoBancos.domain.interfaces;

import java.util.List;

import com.example.IntegrandoBancos.domain.entities.Aluno;

public interface IAlunoRepository {
    Aluno Salvar(Aluno aluno);

    List<Aluno> Listar();
}
