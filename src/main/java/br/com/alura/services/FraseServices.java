package br.com.alura.services;

import br.com.alura.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServices {

    @Autowired
    private FraseRepository repositorio;

}
