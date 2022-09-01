package com.desafio.desafiogit.controller;

import com.desafio.desafiogit.model.TopicoModel;
import com.desafio.desafiogit.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    
}
