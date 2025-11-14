package com.example.escola.aluno.repository;

import com.example.escola.aluno.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
