package com.example.escola.aluno.model.dto;

import com.example.escola.aluno.model.StatusAluno;


public class AlunoRequestDTO {

    private String nome;
    private String matricula;
    private StatusAluno statusAluno;
    private Long cursoId;

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

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public AlunoRequestDTO(String nome, String matricula, StatusAluno statusAluno, Long cursoId) {
        this.nome = nome;
        this.matricula = matricula;
        this.statusAluno = statusAluno;
        this.cursoId = cursoId;
    }

    public AlunoRequestDTO() {
    }
}
