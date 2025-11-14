package com.example.escola.aluno.service;

import com.example.escola.aluno.entity.AlunoEntity;
import com.example.escola.aluno.model.dto.AlunoRequestDTO;
import com.example.escola.aluno.model.dto.AlunoResponseDTO;
import com.example.escola.aluno.repository.JpaAlunoRepository;
import com.example.escola.curso.entity.CursoEntity;
import com.example.escola.curso.repository.JpaCursoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private  JpaAlunoRepository jpaAlunoRepository;
    @Autowired
    private  JpaCursoRepository jpaCursoRepository;
    @Autowired
    private  ModelMapper modelMapper;

    public AlunoResponseDTO create(AlunoRequestDTO alunoRequestDTO) {
        CursoEntity curso = jpaCursoRepository.findById(alunoRequestDTO.getCursoId())
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        AlunoEntity aluno = new AlunoEntity();
        aluno.setNome(alunoRequestDTO.getNome());
        aluno.setMatricula(alunoRequestDTO.getMatricula());
        aluno.setStatus(alunoRequestDTO.getStatusAluno());
        aluno.setCurso(curso);

        return modelMapper.map(jpaAlunoRepository.save(aluno), AlunoResponseDTO.class);
    }

    public AlunoResponseDTO get(Long id) {
        AlunoEntity aluno = jpaAlunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        return modelMapper.map(aluno, AlunoResponseDTO.class);
    }

    public List<AlunoResponseDTO> list() {
        return jpaAlunoRepository.findAll().stream()
                .map(aluno -> modelMapper.map(aluno, AlunoResponseDTO.class))
                .toList();
    }

    public AlunoResponseDTO update(Long alunoId, AlunoRequestDTO alunoRequestDTO) {
        AlunoEntity aluno = jpaAlunoRepository.findById(alunoId)
                .orElseThrow(() -> new RuntimeException("Aluno encontrado"));

        CursoEntity curso = jpaCursoRepository.findById(alunoRequestDTO.getCursoId())
                .orElseThrow(() -> new RuntimeException("Curso encontrado"));

        aluno.setNome(alunoRequestDTO.getNome());
        aluno.setMatricula(alunoRequestDTO.getMatricula());
        aluno.setStatus(alunoRequestDTO.getStatusAluno());
        aluno.setCurso(curso);

        return modelMapper.map(jpaAlunoRepository.save(aluno), AlunoResponseDTO.class);
    }

    public AlunoResponseDTO delete(Long id) {
        AlunoEntity aluno = jpaAlunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        jpaAlunoRepository.delete(aluno);
        return modelMapper.map(aluno, AlunoResponseDTO.class);
    }
}
