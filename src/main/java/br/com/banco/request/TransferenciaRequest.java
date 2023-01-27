package br.com.banco.request;

import br.com.banco.Enums.TipoTransferencia;
import br.com.banco.entities.Conta.Conta;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TransferenciaRequest {
    private LocalDate data_transferencia;
    private double valor;
    private TipoTransferencia tipo;
    private String nome_operador_transacao;
    private Conta conta_id;
}
