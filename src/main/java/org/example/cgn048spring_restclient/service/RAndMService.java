package org.example.cgn048spring_restclient.service;


import org.example.cgn048spring_restclient.model.RAndMChar;
import org.example.cgn048spring_restclient.model.RAndMResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RAndMService {

    private RestClient currywurst = RestClient.builder()
            .baseUrl("https://rickandmortyapi.com/api")
            .build();



    public List<RAndMChar> getAllRickAndMortyChars() {
        return currywurst.get()
                .uri("/character")
                .retrieve() // schickt Anfrage ab
                .body(RAndMResponse.class)
                .getResults();
    }


    public List<RAndMChar> getCharacterById(int id) {
        return currywurst.get()
                .uri("/character/" + id)
                .retrieve()
                .body(RAndMResponse.class)
                .getResults();
    }
}
