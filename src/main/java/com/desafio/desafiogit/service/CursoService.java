package com.desafio.desafiogit.service;

import com.desafio.desafiogit.model.CursoModel;
import com.desafio.desafiogit.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private ICursoRepository iCursoRepository;


    public CursoModel cadastrarCursos(CursoModel cursoModel) {
        return iCursoRepository.save(cursoModel);
    }

    public List<CursoModel> exibirTodosCursos() {
        return iCursoRepository.findAll();
    }

    public Optional<CursoModel> mostrarCursosViaId(Long id) {
        return iCursoRepository.findById(id);
    }

    public CursoModel alterarRegistroCursos(CursoModel cursoModel) {
        return iCursoRepository.save(cursoModel);
    }

    public void deletarCursos(Long id) {
        iCursoRepository.deleteById(id);
    }
}
