package com.example.microsservico_estudo.infrastructure.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.microsservico_estudo.domain.Enum.StatusAluno;
import com.example.microsservico_estudo.domain.entities.Aluno;
@Repository
public interface IAlunoRepository extends JpaRepository<Aluno, Long> {

    // Métodos derivados automaticamente do JPA
    Optional<Aluno> fundByEmail(String email);
    List<Aluno> findByNomeContainingIgnoreCase(String nome);
    List<Aluno> findByStatus(String status);
    boolean existsByEmail(String email);

    // @Query personalizada com JPQL
    @Query("SELECT a FROM Aluno a WHERE a.nome LIKE %:termo% OR a.email LIKE %:termo%")
    List<Aluno> buscarPorTermo(@Param("termo") String termo);

    // Query nativa SQL
    @Query(value ="SELECT * FROM Aluno WHERE YEAR(data_nascimento) = :ano", nativeQuery = true)
    List<Aluno> buscarPorAnoNascimento(@Param("ano") int ano);

    // Contagem
    long countByStatus(StatusAluno status);
}
