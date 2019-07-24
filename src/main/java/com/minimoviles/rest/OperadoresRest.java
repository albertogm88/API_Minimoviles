package com.minimoviles.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.minimoviles.entidades.Operadore;
import com.minimoviles.repositorio.OperadoresRepositorio;


@RestController
@RequestMapping(path = "/operadores")
public class OperadoresRest {
	
	@Autowired
	private OperadoresRepositorio operadoresRepositorio;
	
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody Iterable<Operadore> getPost() {
		return operadoresRepositorio.findAll();
	}
	
		
		
		


}
