package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fix_guia_image database table.
 * 
 */
@Entity
@Table(name="fix_guia_image")
@NamedQuery(name="FixGuiaImage.findAll", query="SELECT f FROM FixGuiaImage f")
public class FixGuiaImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_image")
	private int idImage;

	@Column(name="id_media")
	private int idMedia;

	@Column(name="id_paso")
	private int idPaso;

	private int num;

	@Column(name="original_source")
	private String originalSource;

	public FixGuiaImage() {
	}

	public int getIdImage() {
		return this.idImage;
	}

	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}

	public int getIdMedia() {
		return this.idMedia;
	}

	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}

	public int getIdPaso() {
		return this.idPaso;
	}

	public void setIdPaso(int idPaso) {
		this.idPaso = idPaso;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getOriginalSource() {
		return this.originalSource;
	}

	public void setOriginalSource(String originalSource) {
		this.originalSource = originalSource;
	}

}