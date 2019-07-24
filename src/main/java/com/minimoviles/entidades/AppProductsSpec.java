package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the app_products_spec database table.
 * 
 */
@Entity
@Table(name="app_products_spec")
@NamedQuery(name="AppProductsSpec.findAll", query="SELECT a FROM AppProductsSpec a")
public class AppProductsSpec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_spec")
	private int idSpec;

	@Column(name="id_product")
	private int idProduct;

	@Column(name="spec_name")
	private String specName;

	@Column(name="spec_value")
	private String specValue;

	public AppProductsSpec() {
	}

	public int getIdSpec() {
		return this.idSpec;
	}

	public void setIdSpec(int idSpec) {
		this.idSpec = idSpec;
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getSpecName() {
		return this.specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecValue() {
		return this.specValue;
	}

	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

}