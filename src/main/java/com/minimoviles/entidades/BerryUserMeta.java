package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_user_meta database table.
 * 
 */
@Entity
@Table(name="berry_user_meta")
@NamedQuery(name="BerryUserMeta.findAll", query="SELECT b FROM BerryUserMeta b")
public class BerryUserMeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_meta")
	private int idMeta;

	@Column(name="id_web")
	private int idWeb;

	private String name;

	@Column(name="user_id")
	private int userId;

	@Lob
	private String value;

	public BerryUserMeta() {
	}

	public int getIdMeta() {
		return this.idMeta;
	}

	public void setIdMeta(int idMeta) {
		this.idMeta = idMeta;
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}