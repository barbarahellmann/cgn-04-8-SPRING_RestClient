package org.example.cgn048spring_restclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class RAndMResponse {

    private List<RAndMChar> results; //Gleicher Name wie im JSON
}
