package br.com.banco.entities.Conta;

import lombok.Data;

import java.util.UUID;

@Data
public class Conta {

    private Long id_conta;
    private String nome_responsavel;

}
