package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_app_config database table.
 * 
 */
@Entity
@Table(name="berry_app_config")
@NamedQuery(name="BerryAppConfig.findAll", query="SELECT b FROM BerryAppConfig b")
public class BerryAppConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_config")
	private int idConfig;

	@Column(name="id_web")
	private int idWeb;

	private String name;

	@Lob
	private String value;

	public BerryAppConfig() {
	}

	public int getIdConfig() {
		return this.idConfig;
	}

	public void setIdConfig(int idConfig) {
		this.idConfig = idConfig;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}