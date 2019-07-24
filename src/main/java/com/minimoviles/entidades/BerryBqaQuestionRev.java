package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_bqa_question_rev database table.
 * 
 */
@Entity
@Table(name="berry_bqa_question_rev")
@NamedQuery(name="BerryBqaQuestionRev.findAll", query="SELECT b FROM BerryBqaQuestionRev b")
public class BerryBqaQuestionRev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_question_rev")
	private int idQuestionRev;

	@Lob
	private String body;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="extends_from")
	private int extendsFrom;

	@Column(name="id_question")
	private int idQuestion;

	private String title;

	@Column(name="user_id")
	private int userId;

	public BerryBqaQuestionRev() {
	}

	public int getIdQuestionRev() {
		return this.idQuestionRev;
	}

	public void setIdQuestionRev(int idQuestionRev) {
		this.idQuestionRev = idQuestionRev;
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

	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}