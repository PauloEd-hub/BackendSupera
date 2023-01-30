package br.com.banco.response;

import br.com.banco.Enums.TipoTransferencia;
import br.com.banco.entities.Conta.Conta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaResponse {

    private Long id;
    private LocalDate data_transferencia;
    private float valor;
    private TipoTransferencia tipo;
    private String nome_operador_transacao;
    private Conta conta_id;
}
