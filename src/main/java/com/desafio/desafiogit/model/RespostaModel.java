package com.desafio.desafiogit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "Resposta")

public class RespostaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String mensagem;
    @Column
    private LocalDate dataCraicao;
    @Column
    private Boolean solucao;
    @Column
    private String status;
}
