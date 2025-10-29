package com.example.microsservico_estudo.infrastructure.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microsservico_estudo.domain.entities.Aluno;

@Repository
public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> fundByEmail(String email);

    List<Aluno> findByNomeContainingIgnoreCase(String nome);

    List<Aluno> findByStatus(String status);


}
