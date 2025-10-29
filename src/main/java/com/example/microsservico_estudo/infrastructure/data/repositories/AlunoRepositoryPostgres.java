// package com.example.microsservico_estudo.infrastructure.data.repositories;

// import java.util.List;
// import java.util.function.Function;

// import org.springframework.stereotype.Repository;

// import com.example.microsservico_estudo.domain.entities.Aluno;
// import com.example.microsservico_estudo.domain.interfaces.IAlunoRepository;
// import com.example.microsservico_estudo.infrastructure.data.interfaces.IAlunoJpaRepository;
// import com.example.microsservico_estudo.infrastructure.data.model.AlunoEntity;

// @Repository
// public class AlunoRepositoryPostgres implements IAlunoRepository {
//     private final IAlunoJpaRepository jpa;

//     public AlunoRepositoryPostgres(IAlunoJpaRepository jpa) {
//         this.jpa = jpa;
//     }

//     @Override
//     public Aluno Salvar(Aluno aluno) {
//         var entity = new AlunoEntity(aluno.getNome(), aluno.getIdade(), aluno.getCurso());

//         var salvo = jpa.save(entity);

//         aluno.setId(salvo.getId());
//         return aluno;
//     }

//     @Override
//     public List<Aluno> Listar() {
//         Function<AlunoEntity, Aluno> createAlunoFunctino = a -> {
//             return new Aluno(a.getNome(), a.getIdade(), a.getCurso());
//         };

//         return jpa.findAll().stream().map(createAlunoFunctino).toList();
//     }
// }
