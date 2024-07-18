package br.com.alura.repository;

import br.com.alura.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase,Long> {
}
