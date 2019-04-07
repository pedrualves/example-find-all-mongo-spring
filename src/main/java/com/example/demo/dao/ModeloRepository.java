package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Modelo;

public interface ModeloRepository extends MongoRepository<Modelo, String> {

}
