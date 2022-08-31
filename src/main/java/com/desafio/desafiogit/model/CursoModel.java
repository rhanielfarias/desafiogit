package com.desafio.desafiogit.model;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idCurso;


    @Column(name = "nome_do_curso",length = 50, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    private String categoria;







}
