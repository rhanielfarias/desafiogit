package com.desafio.desafiogit.service;

import com.desafio.desafiogit.model.TopicoModel;
import com.desafio.desafiogit.repository.GitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    GitRepository gitRepository;

    public Optional<TopicoModel> buscaPorId(Long id){
        return gitRepository.findById(id);
    }

    public List<TopicoModel> buscaTopico (String titulo){
        return gitRepository.findByTitulo(titulo);
    }

    public TopicoModel cadastraTopico (TopicoModel topicoModel){
        return gitRepository.save(topicoModel);
    }

    public TopicoModel alteraTopico (TopicoModel topicoModel){
        return gitRepository.save(topicoModel);
    }

    public void deletaTopico(Long id){
        gitRepository.deleteById(id);
    }


}
