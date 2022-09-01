package com.desafio.desafiogit.service;

import com.desafio.desafiogit.model.DefinirStatus;
import com.desafio.desafiogit.model.RespostaModel;
import com.desafio.desafiogit.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public List<RespostaModel>ListDeResposta(){return respostaRepository.findAll();}
    public Optional<RespostaModel>buscarId(Long id){return respostaRepository.findById(id);}

    public List<RespostaModel>buscarStatus(String status){return respostaRepository.findByStatus(status);}


    public RespostaModel novaResposta(RespostaModel respostaModel, DefinirStatus definirStatus){
        String novoStatus = String.valueOf(definirStatus.decidirStatus(respostaModel.getStatus()));
        respostaModel.getId();
        respostaModel.getDataCriacao();
        respostaModel.getSolucao();
        respostaModel.setStatus(novoStatus);
        return respostaRepository.save(respostaModel);

    }
}
