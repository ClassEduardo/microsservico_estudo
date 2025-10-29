package com.example.microsservico_estudo.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microsservico_estudo.application.interfaces.ICadastrarAlunoService;
import com.example.microsservico_estudo.domain.entities.Aluno;
import com.example.microsservico_estudo.infrastructure.data.repositories.IAlunoRepository;

@Service
public class CadastrarAlunoService implements ICadastrarAlunoService {
    
    @Autowired
    private IAlunoRepository _alunoRepository;

    @Override
    public Aluno Executar(Aluno aluno) {
        return _alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> Listar() {
        return _alunoRepository.findAll();
    }
}
