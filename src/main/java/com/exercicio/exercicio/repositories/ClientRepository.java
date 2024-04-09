package com.exercicio.exercicio.repositories;

import com.exercicio.exercicio.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}
