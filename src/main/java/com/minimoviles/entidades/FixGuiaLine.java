package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fix_guia_line database table.
 * 
 */
@Entity
@Table(name="fix_guia_line")
@NamedQuery(name="FixGuiaLine.findAll", query="SELECT f FROM FixGuiaLine f")
public class FixGuiaLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_line")
	private int idLine;

	private String bullet;

	@Column(name="id_paso")
	private int idPaso;

	private byte level;

	private int num;

	@Lob
	private String raw;

	@Lob
	private String texto;

	public FixGuiaLine() {
	}

	public int getIdLine() {
		return this.idLine;
	}

	public void setIdLine(int idLine) {
		this.idLine = idLine;
	}

	public String getBullet() {
		return this.bullet;
	}

	public void setBullet(String bullet) {
		this.bullet = bullet;
	}

	public int getIdPaso() {
		return this.idPaso;
	}

	public void setIdPaso(int idPaso) {
		this.idPaso = idPaso;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRaw() {
		return this.raw;
	}

	public void setRaw(String raw) {
		this.raw = raw;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}