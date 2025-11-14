package com.example.escola.aluno.model.dto;

import com.example.escola.aluno.model.StatusAluno;

public class AlunoDTO {

    private Integer id;
    private String nome;
    private String matricula;
    private StatusAluno statusAluno;

    public AlunoDTO() {
    }

    public AlunoDTO(Integer id, String nome, String matricula, StatusAluno statusAluno) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.statusAluno = statusAluno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
