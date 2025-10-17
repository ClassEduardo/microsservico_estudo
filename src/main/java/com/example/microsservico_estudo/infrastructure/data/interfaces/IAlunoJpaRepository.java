package com.example.microsservico_estudo.infrastructure.data.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microsservico_estudo.infrastructure.data.model.AlunoEntity;


public interface IAlunoJpaRepository extends JpaRepository<AlunoEntity, Long> {}
