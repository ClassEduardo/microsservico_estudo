package com.example.microsservico_estudo.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.microsservico_estudo.application.interfaces.ICadastrarAlunoService;
import com.example.microsservico_estudo.domain.entities.Aluno;
import com.example.microsservico_estudo.domain.interfaces.IAlunoRepository;

@Service
public class CadastrarAlunoService implements ICadastrarAlunoService {
    private final IAlunoRepository repo;

    public CadastrarAlunoService(IAlunoRepository repo) {
        this.repo = repo;
    };

    @Override
    public Aluno Executar(Aluno aluno) {
        return repo.Salvar(aluno);
    }

    @Override
    public List<Aluno> Listar() {
        return repo.Listar();
    }
}
