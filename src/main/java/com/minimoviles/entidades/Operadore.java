package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the operadores database table.
 * 
 */
@Entity
@Table(name="operadores")
@NamedQuery(name="Operadore.findAll", query="SELECT o FROM Operadore o")
public class Operadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_operador")
	private int idOperador;

	@Column(name="afiliado_link")
	private int afiliadoLink;

	@Column(name="cobertura_id")
	private int coberturaId;

	private String name;

	private String nicename;

	public Operadore() {
	}

	public int getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public int getAfiliadoLink() {
		return this.afiliadoLink;
	}

	public void setAfiliadoLink(int afiliadoLink) {
		this.afiliadoLink = afiliadoLink;
	}

	public int getCoberturaId() {
		return this.coberturaId;
	}

	public void setCoberturaId(int coberturaId) {
		this.coberturaId = coberturaId;
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