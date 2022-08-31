package com.desafio.desafiogit.repository;

import com.desafio.desafiogit.model.RespostaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RespostaRepository extends JpaRepository<RespostaModel, Long> {
    public List<RespostaModel> findByStatus (String status);
}
