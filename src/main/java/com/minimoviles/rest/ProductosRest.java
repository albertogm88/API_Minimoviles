package com.minimoviles.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.minimoviles.jto.ProductoJTO;
import com.minimoviles.service.ProductosService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path = "/productos")
@Api(value = "Productos", description = "API CRUD para productos")
public class ProductosRest {

	
	@Autowired
	private ProductosService productosServicio;
	
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody List<ProductoJTO> getProductoCompleto() {
	
		return productosServicio.getListaProducto();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody ProductoJTO getProductoCompleto(@PathVariable("id") String idProducto) {
	
		return productosServicio.getProductoCompleto(Integer.valueOf(idProducto));
	}
	
}
