package com.example.Trab.repository;

import com.example.Trab.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer> {

    @Query("{'nome' : { $regex: ?0 }")
    public List<Usuario> procuraNome(String nome) ;
}

