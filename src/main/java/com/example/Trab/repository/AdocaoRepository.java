package com.example.Trab.repository;

import com.example.Trab.model.Adocao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AdocaoRepository extends MongoRepository<Adocao, Integer> {

    @Query("{'adocaoStatus' : { $regex: ?0 }")
    public List<Adocao> getAdocaoStatus(String situacao) ;
}
