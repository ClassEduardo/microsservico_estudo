package com.example.IntegrandoBancos.application.interfaces;

import java.util.List;

import com.example.IntegrandoBancos.domain.entities.Aluno;

public interface ICadastrarAlunoService {
    Aluno Executar(Aluno aluno);

    List<Aluno> Listar();
}
