package com.minimoviles.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.minimoviles.entidades.BerryCmsTag;
import com.minimoviles.repositorio.TagRepositorio;

@RestController
@RequestMapping(path = "/tags")
public class TagRest {
	
	@Autowired
	private TagRepositorio tagRepositorio;
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody Iterable<BerryCmsTag> getAllTags() {
		return tagRepositorio.findAll();
	}
	
	

}
