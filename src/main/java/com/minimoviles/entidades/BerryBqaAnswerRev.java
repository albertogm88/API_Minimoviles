package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_bqa_answer_rev database table.
 * 
 */
@Entity
@Table(name="berry_bqa_answer_rev")
@NamedQuery(name="BerryBqaAnswerRev.findAll", query="SELECT b FROM BerryBqaAnswerRev b")
public class BerryBqaAnswerRev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_answer_rev")
	private int idAnswerRev;

	@Lob
	private String body;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="extends_from")
	private int extendsFrom;

	@Column(name="id_answer")
	private int idAnswer;

	@Column(name="user_id")
	private int userId;

	public BerryBqaAnswerRev() {
	}

	public int getIdAnswerRev() {
		return this.idAnswerRev;
	}

	public void setIdAnswerRev(int idAnswerRev) {
		this.idAnswerRev = idAnswerRev;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public int getExtendsFrom() {
		return this.extendsFrom;
	}

	public void setExtendsFrom(int extendsFrom) {
		this.extendsFrom = extendsFrom;
	}

	public int getIdAnswer() {
		return this.idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}