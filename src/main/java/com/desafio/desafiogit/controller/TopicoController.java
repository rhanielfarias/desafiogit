package com.desafio.desafiogit.controller;

import com.desafio.desafiogit.model.TopicoModel;
import com.desafio.desafiogit.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping(path = "/{id}")
    public Optional<TopicoModel> buscaId(@PathVariable Long id){
        return topicoService.buscaPorId(id);
    }

    @GetMapping(path = "/titulo/{titulo}")
    public ResponseEntity<List<TopicoModel>> buscaTopico(@PathVariable String titulo){
        return ResponseEntity.ok(topicoService.buscaTopico(titulo));
    }

    @PostMapping
    public ResponseEntity<TopicoModel> cadastraTopico(@RequestBody TopicoModel topicoModel){
        TopicoModel topico = topicoService.cadastraTopico(topicoModel);
        return new ResponseEntity<>(topico, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{titulo}")
    public ResponseEntity<TopicoModel> alteraTopico(@PathVariable Long id, @RequestBody TopicoModel topicoModel){
        TopicoModel topico1 = topicoService.alteraTopico(topicoModel);
        return new ResponseEntity<>(topico1, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/{id}")
    public void deletaTopico(@PathVariable Long id){
        topicoService.deletaTopico(id);
    }

    
}
