package org.example.cgn048spring_restclient.controller;


import lombok.RequiredArgsConstructor;
import org.example.cgn048spring_restclient.model.RAndMChar;
import org.example.cgn048spring_restclient.service.RAndMService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rick")
@RequiredArgsConstructor
public class RAndMController {

    private final RAndMService service;


    @GetMapping
    public List<RAndMChar> getAllRickAndMortyChars(){
        return service.getAllRickAndMortyChars();
    }

    @GetMapping
    public List<RAndMChar> getCharacterById(@PathVariable int id){
        return service.getCharacterById(id);
    }


}
