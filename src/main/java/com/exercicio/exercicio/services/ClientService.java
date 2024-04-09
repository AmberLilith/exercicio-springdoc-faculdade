package com.exercicio.exercicio.services;

import com.exercicio.exercicio.Client;
import com.exercicio.exercicio.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Método para cadastrar um novo cliente
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    // Método para alterar um cliente existente
    public Client updateClient(Long id, Client newClientData) {
        Optional<Client> existingClientOptional = clientRepository.findById(id);
        if (existingClientOptional.isPresent()) {
            Client existingClient = existingClientOptional.get();
            existingClient.setName(newClientData.getName());
            existingClient.setPhone(newClientData.getPhone());
            return clientRepository.save(existingClient);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado com o ID: " + id);
        }
    }

    // Método para excluir um cliente pelo ID
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    // Método para listar todos os clientes
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
