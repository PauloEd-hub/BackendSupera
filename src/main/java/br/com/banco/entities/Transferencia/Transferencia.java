package br.com.banco.entities.Transferencia;

import br.com.banco.Enums.TipoTransferencia;
import br.com.banco.entities.Conta.Conta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "transferencias")
public class Transferencia {

    private Long id;
    private LocalDate data_transferencia;
    private double valor;
    private TipoTransferencia tipo;
    private String nome_operador_transacao;
    private Conta conta_id;
}
