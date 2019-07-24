package com.minimoviles.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minimoviles.entidades.AppProductsProduct;
import com.minimoviles.entidades.AppProductsSpec;
import com.minimoviles.jto.ProductoJTO;
import com.minimoviles.repositorio.ProductosRepositorio;
import com.minimoviles.repositorio.ProductosSpecsRepositorio;

@Service
public class ProductosService {
	
	@Autowired
	private ProductosRepositorio productosRepositorio;
	
	@Autowired 
	private ProductosSpecsRepositorio productosSpecsRepositorio;
	
	
	public List<ProductoJTO> getListaProducto(){
		List<ProductoJTO> listaJTO = new ArrayList<>();
		Iterable<AppProductsProduct> listaProductos = productosRepositorio.findAll();
		for(AppProductsProduct producto : listaProductos ) {
			listaJTO.add(getProductoCompleto(producto.getIdProduct()));
		}
		return listaJTO;
		
	}
	
	public ProductoJTO getProductoCompleto(int idProducto) {
		ProductoJTO jto = new ProductoJTO();
		Optional<AppProductsProduct> optProducto = productosRepositorio.findById(idProducto);
		if(optProducto.isPresent()) {
			AppProductsProduct producto = optProducto.get();
			jto.setearProducto(producto);
			List<AppProductsSpec> optProductoSpecs = 
					productosSpecsRepositorio.getProductosByIdProducto(idProducto);
			if(!optProductoSpecs.isEmpty()) {
				jto.setearSpecs(optProductoSpecs);
			}
		}
		return jto;
	} 

}
