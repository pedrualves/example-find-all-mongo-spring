package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("modelo")
public class Modelo {

	@Id
	private String id;
	private String abc;
	private String def;

}
