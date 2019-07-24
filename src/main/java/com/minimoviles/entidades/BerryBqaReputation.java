package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_bqa_reputation database table.
 * 
 */
@Entity
@Table(name="berry_bqa_reputation")
@NamedQuery(name="BerryBqaReputation.findAll", query="SELECT b FROM BerryBqaReputation b")
public class BerryBqaReputation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_reputation")
	private int idReputation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	private Date dateUpdate;

	@Column(name="id_user")
	private int idUser;

	@Column(name="id_user_trigger")
	private int idUserTrigger;

	private int reputation;

	@Column(name="target_id")
	private int targetId;

	@Column(name="target_type")
	private String targetType;

	private String type;

	public BerryBqaReputation() {
	}

	public int getIdReputation() {
		return this.idReputation;
	}

	public void setIdReputation(int idReputation) {
		this.idReputation = idReputation;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateUpdate() {
		return this.dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdUserTrigger() {
		return this.idUserTrigger;
	}

	public void setIdUserTrigger(int idUserTrigger) {
		this.idUserTrigger = idUserTrigger;
	}

	public int getReputation() {
		return this.reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}