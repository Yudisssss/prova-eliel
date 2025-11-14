package com.example.escola.curso.model.dto;

import com.example.escola.aluno.model.dto.AlunoDTO;

import java.util.List;


public class CursoResponseDTO {

    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private List<AlunoDTO> alunos;

    public CursoResponseDTO() {
    }

    public CursoResponseDTO(Long id, String nome, Integer cargaHoraria, List<AlunoDTO> alunos) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
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

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<AlunoDTO> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoDTO> alunos) {
        this.alunos = alunos;
    }
}
