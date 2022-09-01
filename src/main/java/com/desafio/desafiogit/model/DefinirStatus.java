package com.desafio.desafiogit.model;

import com.desafio.desafiogit.model.enumeric.RespostaEnum;

public class DefinirStatus {

    public RespostaEnum decidirStatus(String status){
        if(status.equalsIgnoreCase("não respondido")){
            return RespostaEnum.NAO_RESPONDIDO;
        } else if (status.equalsIgnoreCase("não solucionado")) {
            return RespostaEnum.NAO_SOLUCIONADO;
        } else if (status.equalsIgnoreCase("solucionado")) {
            return RespostaEnum.SOLUCIONADO;
        } else if (status.equalsIgnoreCase("fechado")) {
            return RespostaEnum.FECHADO;
        }else{
            return null;
        }
    }
}
