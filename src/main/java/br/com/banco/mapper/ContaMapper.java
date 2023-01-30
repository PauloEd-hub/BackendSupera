package br.com.banco.mapper;

import br.com.banco.entities.Conta.Conta;
import br.com.banco.request.ContaRequest;
import br.com.banco.response.ContaResponse;

public class ContaMapper {

    public static Conta requestToModel(ContaRequest contaRequest) {
        return Conta
                .builder()
                .nome_responsavel(contaRequest.getNome_responsavel())
                .build();
    }

    public static ContaResponse modelToResponse(Conta conta) {
        return ContaResponse
                .builder()
                .nome_responsavel(conta.getNome_responsavel())
                .build();

    }
}
