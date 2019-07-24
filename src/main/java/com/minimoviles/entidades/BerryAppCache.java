package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_app_cache database table.
 * 
 */
@Entity
@Table(name="berry_app_cache")
@NamedQuery(name="BerryAppCache.findAll", query="SELECT b FROM BerryAppCache b")
public class BerryAppCache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cache")
	private int idCache;

	@Column(name="expires_at")
	private int expiresAt;

	@Column(name="id_web")
	private int idWeb;

	private String name;

	@Lob
	private String value;

	public BerryAppCache() {
	}

	public int getIdCache() {
		return this.idCache;
	}

	public void setIdCache(int idCache) {
		this.idCache = idCache;
	}

	public int getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(int expiresAt) {
		this.expiresAt = expiresAt;
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