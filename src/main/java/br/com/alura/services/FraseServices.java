package br.com.alura.services;

import br.com.alura.dto.FraseDTO;
import br.com.alura.model.Frase;
import br.com.alura.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServices {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getFrase(),frase.getPersonagem(),frase.getTitulo(),frase.getPoster());
    }
}
