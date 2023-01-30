package br.com.banco.mapper;

import br.com.banco.entities.Transferencia.Transferencia;
import br.com.banco.request.TransferenciaRequest;
import br.com.banco.response.TransferenciaResponse;

public class TransferenciaMapper {

    public static Transferencia requestToModel(TransferenciaRequest transferenciaRequest) {
        return Transferencia
                .builder()
                .data_transferencia(transferenciaRequest.getData_transferencia())
                .valor(transferenciaRequest.getValor())
                .tipo(transferenciaRequest.getTipo())
                .nome_operador_transacao(transferenciaRequest.getNome_operador_transacao())
                .conta_id(transferenciaRequest.getConta_id())
                .build();
    }

    public static TransferenciaResponse modelToResponse(Transferencia transferencia) {
        return TransferenciaResponse
                .builder()
                .data_transferencia(transferencia.getData_transferencia())
                .valor(transferencia.getValor())
                .tipo(transferencia.getTipo())
                .nome_operador_transacao(transferencia.getNome_operador_transacao())
                .conta_id(transferencia.getConta_id())
                .build();

    }
}
