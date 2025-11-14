package com.example.escola.aluno.model.dto;

import com.example.escola.aluno.model.StatusAluno;
import com.example.escola.curso.model.dto.CursoDTO;


public class AlunoResponseDTO {

    private Long id;
    private String nome;
    private String matricula;
    private StatusAluno statusAluno;
    private CursoDTO curso;

    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(Long id, String nome, String matricula, StatusAluno statusAluno, CursoDTO curso) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.statusAluno = statusAluno;
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

    public StatusAluno getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(StatusAluno statusAluno) {
        this.statusAluno = statusAluno;
    }

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }
}
