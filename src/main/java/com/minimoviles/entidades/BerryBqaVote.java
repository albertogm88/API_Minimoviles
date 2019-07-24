package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_bqa_vote database table.
 * 
 */
@Entity
@Table(name="berry_bqa_vote")
@NamedQuery(name="BerryBqaVote.findAll", query="SELECT b FROM BerryBqaVote b")
public class BerryBqaVote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_vote")
	private int idVote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="id_user")
	private int idUser;

	@Column(name="vote_target_id")
	private int voteTargetId;

	@Column(name="vote_target_type")
	private String voteTargetType;

	@Column(name="vote_value")
	private int voteValue;

	public BerryBqaVote() {
	}

	public int getIdVote() {
		return this.idVote;
	}

	public void setIdVote(int idVote) {
		this.idVote = idVote;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getVoteTargetId() {
		return this.voteTargetId;
	}

	public void setVoteTargetId(int voteTargetId) {
		this.voteTargetId = voteTargetId;
	}

	public String getVoteTargetType() {
		return this.voteTargetType;
	}

	public void setVoteTargetType(String voteTargetType) {
		this.voteTargetType = voteTargetType;
	}

	public int getVoteValue() {
		return this.voteValue;
	}

	public void setVoteValue(int voteValue) {
		this.voteValue = voteValue;
	}

}