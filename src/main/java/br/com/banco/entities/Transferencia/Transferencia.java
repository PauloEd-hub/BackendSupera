package br.com.banco.entities.Transferencia;

import br.com.banco.Enums.TipoTransferencia;
import br.com.banco.entities.Conta.Conta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data_transferencia;
    private float valor;
    @Column(length = 15)
    private TipoTransferencia tipo;
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private String nome_operador_transacao;
    private Conta conta_id;
}
