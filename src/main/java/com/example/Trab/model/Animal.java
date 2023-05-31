package com.example.Trab.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

//nome, espécie, raça, idade e status (disponível, adotado)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "animal")
public class Animal {
    private int id;

    private String nome;

    private String raca;

    private float idade;

    private String status;


}
