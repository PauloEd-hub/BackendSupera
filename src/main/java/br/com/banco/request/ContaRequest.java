package br.com.banco.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContaRequest {
    private String nome_responsavel;

}
