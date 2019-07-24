package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the app_applestock_part database table.
 * 
 */
@Entity
@Table(name="app_applestock_part")
@NamedQuery(name="AppApplestockPart.findAll", query="SELECT a FROM AppApplestockPart a")
public class AppApplestockPart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_part")
	private int idPart;

	private String name;

	@Column(name="name_complete")
	private String nameComplete;

	@Column(name="part_name")
	private String partName;

	public AppApplestockPart() {
	}

	public int getIdPart() {
		return this.idPart;
	}

	public void setIdPart(int idPart) {
		this.idPart = idPart;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameComplete() {
		return this.nameComplete;
	}

	public void setNameComplete(String nameComplete) {
		this.nameComplete = nameComplete;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

}