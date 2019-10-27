package com.minimoviles.rest.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.minimoviles.entidades.BerryAppMenuItem;
import com.minimoviles.repositorio.MenuRepositorio;

import io.swagger.annotations.Api;


@RestController
@RequestMapping(path = "/menu")
@Api(value = "Menu", description = "API CRUD para gestionar las opciones de menu")
public class MenuRest {
	
	@Autowired
	private MenuRepositorio menuService;
	
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody Iterable<BerryAppMenuItem> getAllMenu() {
		return menuService.findAll();
	}

	@GetMapping(value="/web/{id}", produces = "application/json")
	public @ResponseBody Iterable<BerryAppMenuItem> getMenuByIdWeb(@PathVariable("id") Integer id) {
		return menuService.getMenuByIdWeb(id);
	}

	@GetMapping(value="/{id}", produces = "application/json")
	public @ResponseBody Iterable<BerryAppMenuItem> getMenuByIdMenu(@PathVariable("id") Integer id) {
		return menuService.getMenuByIdMenu(id);
	}
	

}
