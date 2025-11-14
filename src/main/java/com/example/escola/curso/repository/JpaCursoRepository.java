package com.example.escola.curso.repository;

import com.example.escola.curso.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCursoRepository extends JpaRepository<CursoEntity, Long> {
}
