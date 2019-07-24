package com.minimoviles.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.minimoviles.entidades.BerryMedia;
import com.minimoviles.repositorio.MediaRepositorio;

@RestController
@RequestMapping(path = "/media")
public class MediaRest {
	
	@Autowired
	private MediaRepositorio mediaRepositorio;
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody Iterable<BerryMedia> getAllMedias(){
		
		return mediaRepositorio.findAll();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody Optional<BerryMedia> getMedia(@PathVariable("id") Integer id){
		
		return mediaRepositorio.findById(id);
	}
	

}
