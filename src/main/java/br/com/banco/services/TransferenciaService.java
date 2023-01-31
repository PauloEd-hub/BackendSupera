package br.com.banco.services;

import br.com.banco.entities.Transferencia.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;


//    public Transferencia save(Transferencia transferencia) {
//        return transferenciaRepository.save(transferencia);
//    }

    public List<Transferencia> returnAllTransfers() {
        return transferenciaRepository.findAll();
    }
}
