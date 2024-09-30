package com.infnet.Carrinho.service;

import com.infnet.Carrinho.model.Jogos;
import org.springframework.web.client.RestClient;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class JogosService {
    public Jogos getbyId(){
        RestClient restClient = RestClient.create();
        var serverUrl = String.format("http://localhost:8081/%id",id);
        return restClient.get().uri(serverUrl).retrieve().toEntity(Jogos.class).getBody();
    }
}
