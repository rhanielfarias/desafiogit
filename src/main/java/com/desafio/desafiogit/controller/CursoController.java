package com.desafio.desafiogit.controller;

import com.desafio.desafiogit.model.CursoModel;
import com.desafio.desafiogit.model.enumeric.Categorias;
import com.desafio.desafiogit.repository.ICursoRepository;
import com.desafio.desafiogit.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @Autowired
    private ICursoRepository iCursoRepository;

    @PostMapping
    public ResponseEntity<CursoModel> cadastrarNovoCurso(@RequestBody CursoModel cursoModel) {
        CursoModel cursos = cursoService.cadastrarCursos(cursoModel);
        return new ResponseEntity<>(cursos, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CursoModel>> exibirCursosCadastrados() {
        return ResponseEntity.ok(cursoService.exibirTodosCursos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<CursoModel>> buscarCursosCadastradosViaId(@PathVariable Long id) {
        return ResponseEntity.ok(cursoService.mostrarCursosViaId(id));
    }

    @GetMapping(path = "/categorias/{categorias}")
    public ResponseEntity<List<CursoModel>> exibirCategoriasDeCursos(@PathVariable Categorias categorias) {
        return ResponseEntity.ok(iCursoRepository.findByCategorias(categorias));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<CursoModel> alterarCursosRegistrados(@RequestBody CursoModel cursoModel) {
        return ResponseEntity.ok(cursoService.alterarRegistroCursos(cursoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarCursoCadastrado(@PathVariable Long id) {
        cursoService.deletarCursos(id);
    }

}
