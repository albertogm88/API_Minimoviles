package com.minimoviles.jto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.minimoviles.entidades.AppProductsProduct;
import com.minimoviles.entidades.AppProductsSpec;

public class ProductoJTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idProducto;
	
	private String name;
	
	private String niceName;
	
	private int idBrand;
	
	private int mediaIdFront;
	
	private int idCategoria;
	
	private HashMap<String, String> specs;

	public ProductoJTO() {
		super();
		specs = new HashMap<>();
	}
	
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNiceName() {
		return niceName;
	}

	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}

	public int getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public int getMediaIdFront() {
		return mediaIdFront;
	}

	public void setMediaIdFront(int mediaIdFront) {
		this.mediaIdFront = mediaIdFront;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Map<String, String> getSpecs() {
		return specs;
	}

	public void setSpecs(HashMap<String, String> specs) {
		this.specs = specs;
	}
	
	
	public void setearProducto(AppProductsProduct producto) {
		this.idProducto = producto.getIdProduct();
		this.idBrand = producto.getIdBrand();
		this.idCategoria = producto.getIdCategory();
		this.mediaIdFront = producto.getMediaIdFront();
		this.name = producto.getName();
		this.niceName = producto.getNicename();
	}
	
	public void setearSpecs(List<AppProductsSpec> specs) {
		for(AppProductsSpec spec : specs) {
			this.specs.put(spec.getSpecName(), spec.getSpecValue());
		}
		
	}

}
