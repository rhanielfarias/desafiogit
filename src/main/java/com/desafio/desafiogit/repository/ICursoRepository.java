package com.desafio.desafiogit.repository;

import com.desafio.desafiogit.model.CursoModel;
import com.desafio.desafiogit.model.enumeric.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<CursoModel, Long> {
    public List<CursoModel> findByCategorias(Categorias categorias);
}

