package com.example.escola.curso.controller;

import com.example.escola.curso.model.dto.CursoRequestDTO;
import com.example.escola.curso.model.dto.CursoResponseDTO;
import com.example.escola.curso.service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    @Operation(summary = "criar curso", description = "método para criar curso")
    public CursoResponseDTO create(@RequestBody CursoRequestDTO cursoRequestDTO) {
        return this.cursoService.create(cursoRequestDTO);
    }

    @GetMapping("/{cursoId}")
    @Operation(summary = "mostrar curso", description = "método para mostrar curso por id")
    public CursoResponseDTO getById(@PathVariable(name = "cursoId") Long cursoId) {
        return this.cursoService.get(cursoId);
    }

    @GetMapping
    @Operation(summary = "mostrar curso", description = "método para mostrar todos os curso")
    public List<CursoResponseDTO> list() {
        return this.cursoService.list();
    }

    @PutMapping("/{cursoId}")

    @Operation(summary = "alterar curso", description = "método para alterar parcialmente o curso")
    public CursoResponseDTO update(@PathVariable(name = "cursoId") Long cursoId,
                                   @RequestBody CursoRequestDTO cursoRequestDTO) {
        return this.cursoService.update(cursoId, cursoRequestDTO);
    }

    @DeleteMapping("/{cursoId}")
    @Operation(summary = "deletar curso", description = "método para deletar curso por id")
    public CursoResponseDTO delete(@PathVariable(name = "cursoId") Long cursoId) {
        return this.cursoService.delete(cursoId);
    }
}
