package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the app_products_product_media database table.
 * 
 */
@Entity
@Table(name="app_products_product_media")
@NamedQuery(name="AppProductsProductMedia.findAll", query="SELECT a FROM AppProductsProductMedia a")
public class AppProductsProductMedia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_relation")
	private int idRelation;

	@Column(name="id_media")
	private int idMedia;

	@Column(name="id_product")
	private int idProduct;

	public AppProductsProductMedia() {
	}

	public int getIdRelation() {
		return this.idRelation;
	}

	public void setIdRelation(int idRelation) {
		this.idRelation = idRelation;
	}

	public int getIdMedia() {
		return this.idMedia;
	}

	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

}