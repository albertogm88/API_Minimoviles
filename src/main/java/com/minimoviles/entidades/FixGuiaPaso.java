package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fix_guia_paso database table.
 * 
 */
@Entity
@Table(name="fix_guia_paso")
@NamedQuery(name="FixGuiaPaso.findAll", query="SELECT f FROM FixGuiaPaso f")
public class FixGuiaPaso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_paso")
	private int idPaso;

	@Column(name="id_guia")
	private int idGuia;

	private byte num;

	private String title;

	public FixGuiaPaso() {
	}

	public int getIdPaso() {
		return this.idPaso;
	}

	public void setIdPaso(int idPaso) {
		this.idPaso = idPaso;
	}

	public int getIdGuia() {
		return this.idGuia;
	}

	public void setIdGuia(int idGuia) {
		this.idGuia = idGuia;
	}

	public byte getNum() {
		return this.num;
	}

	public void setNum(byte num) {
		this.num = num;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}