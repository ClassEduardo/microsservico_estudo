package com.example.microsservico_estudo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microsservico_estudo.application.interfaces.ICadastrarAlunoService;
import com.example.microsservico_estudo.domain.entities.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    final private ICadastrarAlunoService service;

    public AlunoController(ICadastrarAlunoService service) {
        this.service = service;
    };

    @PostMapping
    public Aluno Cadastrar(@RequestBody Aluno aluno) {
        return service.Executar(aluno);
    }

    @GetMapping
    public List<Aluno> Obter(){
        return service.Listar();
    }
}
