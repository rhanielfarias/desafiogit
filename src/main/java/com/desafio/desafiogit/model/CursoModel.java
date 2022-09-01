package com.desafio.desafiogit.model;

import com.desafio.desafiogit.model.enumeric.Categorias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curso")
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_do_curso", length = 50, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    private Categorias categorias;


}
