package com.example.escola.curso.model.dto;



import java.util.List;


public class CursoRequestDTO {

    private String nome;
    private Integer cargaHoraria;
    private List<Long> alunosId;

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

    public List<Long> getAlunosId() {
        return alunosId;
    }

    public void setAlunosId(List<Long> alunosId) {
        this.alunosId = alunosId;
    }

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(String nome, Integer cargaHoraria, List<Long> alunosId) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunosId = alunosId;
    }
}
