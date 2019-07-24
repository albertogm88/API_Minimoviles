package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the app_products_brand database table.
 * 
 */
@Entity
@Table(name="app_products_brand")
@NamedQuery(name="AppProductsBrand.findAll", query="SELECT a FROM AppProductsBrand a")
public class AppProductsBrand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_brand")
	private int idBrand;

	private String name;

	private String nicename;

	public AppProductsBrand() {
	}

	public int getIdBrand() {
		return this.idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNicename() {
		return this.nicename;
	}

	public void setNicename(String nicename) {
		this.nicename = nicename;
	}

}