package com.desafio.desafiogit.repository;

import com.desafio.desafiogit.model.TopicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GitRepository extends JpaRepository<TopicoModel, Long> {

}
