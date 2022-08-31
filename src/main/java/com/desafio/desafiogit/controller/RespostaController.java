package com.desafio.desafiogit.controller;

import com.desafio.desafiogit.model.RespostaModel;
import com.desafio.desafiogit.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RespostaController {

    @Autowired
    RespostaService respostaService;

    @GetMapping(path = "/respostas")
    public ResponseEntity<List<RespostaModel>> mostrarRespostar(){return ResponseEntity.ok(respostaService.ListDeResposta());}

    @PostMapping(path = "/respostas")
    public ResponseEntity<RespostaModel>cadastroResposta(@RequestBody RespostaModel respostaModel){
        return ResponseEntity.ok(respostaService.novaResposta(respostaModel));}
    }
