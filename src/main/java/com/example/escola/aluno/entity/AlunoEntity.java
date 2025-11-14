package com.example.escola.aluno.entity;

import com.example.escola.aluno.model.StatusAluno;
import com.example.escola.curso.entity.CursoEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
@Table(name = "alunos")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column(unique = true)
    private String matricula;

    @Enumerated(EnumType.STRING)
    private StatusAluno status;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    @JsonBackReference
    private CursoEntity curso;

    public AlunoEntity() {
    }

    public AlunoEntity(Long id, String nome, String matricula, StatusAluno status, CursoEntity curso) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.status = status;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public StatusAluno getStatus() {
        return status;
    }

    public void setStatus(StatusAluno status) {
        this.status = status;
    }

    public CursoEntity getCurso() {
        return curso;
    }

    public void setCurso(CursoEntity curso) {
        this.curso = curso;
    }
}
