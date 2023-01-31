package br.com.banco.controllers;

import br.com.banco.mapper.TransferenciaMapper;
import br.com.banco.request.TransferenciaRequest;
import br.com.banco.response.TransferenciaResponse;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;



    @GetMapping
    //Caso não seja informado nenhum filtro, retornar todos os dados de transferência.
    public List<TransferenciaResponse> returnAllTransfers() {
        return TransferenciaMapper.modelToResponseList(transferenciaService.returnAllTransfers());

    }
//A sua api deve fornecer os dados de transferência de acordo com o número da conta bacária.

//Caso não seja informado nenhum filtro, retornar todos os dados de transferência.

//Caso seja informado um período de tempo, retornar todas as transferências relacionadas à aquele período de tempo.

//Caso seja informado o nome do operador da transação, retornar todas as transferências relacionados à aquele operador.

//Caso todos os filtros sejam informados, retornar todas as transferências com base no período de tempo informado e o nome do operador.
}
