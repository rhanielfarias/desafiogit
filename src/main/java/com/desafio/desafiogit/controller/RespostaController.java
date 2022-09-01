package com.desafio.desafiogit.controller;

import com.desafio.desafiogit.model.DefinirStatus;
import com.desafio.desafiogit.model.RespostaModel;
import com.desafio.desafiogit.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RespostaController {

    @Autowired
    RespostaService respostaService;

    @GetMapping(path = "/respostas")
    public ResponseEntity<List<RespostaModel>> mostrarRespostar(){return ResponseEntity.ok(respostaService.ListDeResposta());}

    @GetMapping(path = "/respostas/{id}")
    public Optional<RespostaModel>buscarPorId(@PathVariable Long id){return  respostaService.buscarId(id);}

    @GetMapping(path = "/respostas/status/{status}")
    public List<RespostaModel>buscarPorStatus(@PathVariable String status){return respostaService.buscarStatus(status);}

    @PostMapping(path = "/respostas")
    public ResponseEntity<RespostaModel>cadastroResposta(@RequestBody RespostaModel respostaModel, DefinirStatus definirStatus){
        return ResponseEntity.ok(respostaService.novaResposta(respostaModel, definirStatus));}
    }
