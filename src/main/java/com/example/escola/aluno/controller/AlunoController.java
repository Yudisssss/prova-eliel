package com.example.escola.aluno.controller;

import com.example.escola.aluno.model.dto.AlunoRequestDTO;
import com.example.escola.aluno.model.dto.AlunoResponseDTO;
import com.example.escola.aluno.service.AlunoService;
import io.swagger.annotations.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    @Operation(summary = "criar aluno", description = "método para criação de aluno")
    public AlunoResponseDTO create (@RequestBody AlunoRequestDTO alunoRequestDTO) {
        return this.alunoService.create(alunoRequestDTO);
    }

    @GetMapping("/{alunoId}")
    @Operation(summary = "Mostrar aluno", description = "método para mostrar de aluno por id")
    public AlunoResponseDTO getById (@PathVariable(name = "alunoId") Long alunoId) {
        return this.alunoService.get(alunoId);
    }

    @GetMapping
    @Operation(summary = "Mostrar aluno", description = "método para mostrar todos alunos")
    public List<AlunoResponseDTO> list() {
        return this.alunoService.list();
    }

    @PutMapping("/{alunoId}")
    @Operation(summary = "alterar aluno", description = "método para alterar parcialmente informação dos alunos")
    public AlunoResponseDTO update (@PathVariable(name = "alunoId") Long alunoId,
                                    @RequestBody AlunoRequestDTO alunoRequestDTO) {
        return this.alunoService.update(alunoId, alunoRequestDTO);
    }

    @DeleteMapping("/{alunoId}")
    @Operation(summary = "deletar aluno", description = "método para deletar alunos por id")
    public AlunoResponseDTO delete (@PathVariable(name = "alunoId") Long alunoId) {
        return this.alunoService.delete(alunoId);
    }
}
