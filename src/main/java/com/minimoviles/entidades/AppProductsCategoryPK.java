package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the app_products_category database table.
 * 
 */
@Embeddable
public class AppProductsCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_category")
	private int idCategory;

	@Column(name="id_parent")
	private int idParent;

	public AppProductsCategoryPK() {
	}
	public int getIdCategory() {
		return this.idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public int getIdParent() {
		return this.idParent;
	}
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AppProductsCategoryPK)) {
			return false;
		}
		AppProductsCategoryPK castOther = (AppProductsCategoryPK)other;
		return 
			(this.idCategory == castOther.idCategory)
			&& (this.idParent == castOther.idParent);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCategory;
		hash = hash * prime + this.idParent;
		
		return hash;
	}
}