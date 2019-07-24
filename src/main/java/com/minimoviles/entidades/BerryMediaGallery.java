package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_media_gallery database table.
 * 
 */
@Entity
@Table(name="berry_media_gallery")
@NamedQuery(name="BerryMediaGallery.findAll", query="SELECT b FROM BerryMediaGallery b")
public class BerryMediaGallery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public BerryMediaGallery() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}