package br.com.banco.Enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum TipoTransferencia {
    DEPOSITO,
    SAQUE,
    TRANSFERENCIA;

    private String tipo_Transferencia;
}
