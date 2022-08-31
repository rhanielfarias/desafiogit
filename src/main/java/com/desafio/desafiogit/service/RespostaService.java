package com.desafio.desafiogit.service;

import com.desafio.desafiogit.model.RespostaModel;
import com.desafio.desafiogit.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public List<RespostaModel>ListDeResposta(){return respostaRepository.findAll();}


    public RespostaModel novaResposta(RespostaModel respostaModel){
        respostaModel.getId();
        respostaModel.getDataCraicao();
        respostaModel.getSolucao();
        respostaModel.getStatus();
        return respostaRepository.save(respostaModel);

    }
}
