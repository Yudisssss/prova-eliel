package com.example.escola.curso.service;

import com.example.escola.aluno.entity.AlunoEntity;
import com.example.escola.aluno.repository.JpaAlunoRepository;
import com.example.escola.curso.entity.CursoEntity;
import com.example.escola.curso.model.dto.CursoRequestDTO;
import com.example.escola.curso.model.dto.CursoResponseDTO;
import com.example.escola.curso.repository.JpaCursoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    @Autowired
    private JpaCursoRepository jpaCursoRepository;
    @Autowired
    private JpaAlunoRepository jpaAlunoRepository;
    @Autowired
    private ModelMapper modelMapper;

    public CursoResponseDTO create(CursoRequestDTO dto) {
        List<AlunoEntity> alunos = new ArrayList<>();
        for (Long alunoId : dto.getAlunosId()) {
            AlunoEntity alunoEntity = jpaAlunoRepository.findById(alunoId)
                    .orElseThrow(() -> new RuntimeException("Aluno not found with id: " + alunoId));
            alunos.add(alunoEntity);
        }

        CursoEntity cursoEntity = new CursoEntity();
        cursoEntity.setNome(dto.getNome());
        cursoEntity.setCargaHoraria(dto.getCargaHoraria());
        cursoEntity.setAlunos(alunos);

        return modelMapper.map(jpaCursoRepository.save(cursoEntity), CursoResponseDTO.class);
    }

    public CursoResponseDTO get(Long cursoId) {
        CursoEntity cursoEntity = jpaCursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso not found with id: " + cursoId));
        return modelMapper.map(cursoEntity, CursoResponseDTO.class);
    }

    public List<CursoResponseDTO> list() {
        return jpaCursoRepository.findAll().stream()
                .map(cursoEntity -> modelMapper.map(cursoEntity, CursoResponseDTO.class))
                .toList();
    }

    public CursoResponseDTO update(Long cursoId, CursoRequestDTO dto) {
        CursoEntity cursoEntity = jpaCursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso not found with id: " + cursoId));

        List<AlunoEntity> alunos = new ArrayList<>();
        for (Long alunoId : dto.getAlunosId()) {
            AlunoEntity alunoEntity = jpaAlunoRepository.findById(alunoId)
                    .orElseThrow(() -> new RuntimeException("Aluno not found with id: " + alunoId));
            alunos.add(alunoEntity);
        }

        cursoEntity.setNome(dto.getNome());
        cursoEntity.setCargaHoraria(dto.getCargaHoraria());
        cursoEntity.setAlunos(alunos);

        return modelMapper.map(jpaCursoRepository.save(cursoEntity), CursoResponseDTO.class);
    }

    public CursoResponseDTO delete(Long cursoId) {
        CursoEntity cursoEntity = jpaCursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso not found with id: " + cursoId));
        jpaCursoRepository.delete(cursoEntity);
        return modelMapper.map(cursoEntity, CursoResponseDTO.class);
    }
}
