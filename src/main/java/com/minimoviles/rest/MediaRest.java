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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/media")
@Api(value = "Media", description = "API CRUD para gestionar los archivos multimedia")
public class MediaRest {
	
	@Autowired
	private MediaRepositorio mediaRepositorio;
	
	@GetMapping(path = "/", produces = "application/json")
	@ApiOperation(value = "Devuelve toda la lista de archivos multimedias")
	public @ResponseBody Iterable<BerryMedia> getAllMedias(){
		
		return mediaRepositorio.findAll();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody Optional<BerryMedia> getMedia(@PathVariable("id") Integer id){
		
		return mediaRepositorio.findById(id);
	}
	

}
