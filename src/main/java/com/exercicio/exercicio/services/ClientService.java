package com.exercicio.exercicio.services;

import com.exercicio.exercicio.models.Client;
import com.exercicio.exercicio.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    public Client createClient(Client client) {
        return clientRepository.save(client);
    }


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


    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }


    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
