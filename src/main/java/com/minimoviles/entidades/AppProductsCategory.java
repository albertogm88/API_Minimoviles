package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the app_products_category database table.
 * 
 */
@Entity
@Table(name="app_products_category")
@NamedQuery(name="AppProductsCategory.findAll", query="SELECT a FROM AppProductsCategory a")
public class AppProductsCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AppProductsCategoryPK id;

	private String name;

	private String slug;

	private String title;

	public AppProductsCategory() {
	}

	public AppProductsCategoryPK getId() {
		return this.id;
	}

	public void setId(AppProductsCategoryPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}