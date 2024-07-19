package br.com.alura.controller;

import br.com.alura.dto.FraseDTO;
import br.com.alura.services.FraseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FraseController {

    @Autowired
    private FraseServices services;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria (){
        return services.obterFraseAleatoria();
    }

}
