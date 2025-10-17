package com.example.IntegrandoBancos.infrastructure.data.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IntegrandoBancos.infrastructure.data.model.AlunoEntity;


public interface IAlunoJpaRepository extends JpaRepository<AlunoEntity, Long> {}
