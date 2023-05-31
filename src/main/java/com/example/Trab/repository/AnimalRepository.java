package com.example.Trab.repository;

import com.example.Trab.model.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, Integer> {
    @Query("{'status' : disponivel}")
    public List<Animal> getAnimalStatus(String disponivel);
}
