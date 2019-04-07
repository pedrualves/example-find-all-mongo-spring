package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ModeloRepository;
import com.example.demo.model.Modelo;

@RestController
public class Controller {

	@Autowired
	private ModeloRepository repo;

	@GetMapping("/teste")
	public List<Modelo> teste() {
		return repo.findAll();
	}

}
