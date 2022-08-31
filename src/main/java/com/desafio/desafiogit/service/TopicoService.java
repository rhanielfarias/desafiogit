package com.desafio.desafiogit.service;

import com.desafio.desafiogit.model.TopicoModel;
import com.desafio.desafiogit.repository.GitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    GitRepository gitRepository;

    public Optional<TopicoModel> buscaPorId(Long id){
        return gitRepository.findById(id);
    }


}
