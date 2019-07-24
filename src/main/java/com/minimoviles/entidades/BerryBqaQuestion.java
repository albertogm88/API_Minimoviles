package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_bqa_question database table.
 * 
 */
@Entity
@Table(name="berry_bqa_question")
@NamedQuery(name="BerryBqaQuestion.findAll", query="SELECT b FROM BerryBqaQuestion b")
public class BerryBqaQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_question")
	private int idQuestion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_active")
	private Date dateActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_answer_first")
	private Date dateAnswerFirst;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_answer_last")
	private Date dateAnswerLast;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_edit_last")
	private Date dateEditLast;

	@Column(name="info_answers")
	private int infoAnswers;

	@Column(name="info_views")
	private int infoViews;

	@Column(name="question_rev_id")
	private int questionRevId;

	private String slug;

	@Column(name="user_id")
	private int userId;

	private int votes;

	@Column(name="votes_down")
	private int votesDown;

	@Column(name="votes_up")
	private int votesUp;

	public BerryBqaQuestion() {
	}

	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public Date getDateActive() {
		return this.dateActive;
	}

	public void setDateActive(Date dateActive) {
		this.dateActive = dateActive;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateAnswerFirst() {
		return this.dateAnswerFirst;
	}

	public void setDateAnswerFirst(Date dateAnswerFirst) {
		this.dateAnswerFirst = dateAnswerFirst;
	}

	public Date getDateAnswerLast() {
		return this.dateAnswerLast;
	}

	public void setDateAnswerLast(Date dateAnswerLast) {
		this.dateAnswerLast = dateAnswerLast;
	}

	public Date getDateEditLast() {
		return this.dateEditLast;
	}

	public void setDateEditLast(Date dateEditLast) {
		this.dateEditLast = dateEditLast;
	}

	public int getInfoAnswers() {
		return this.infoAnswers;
	}

	public void setInfoAnswers(int infoAnswers) {
		this.infoAnswers = infoAnswers;
	}

	public int getInfoViews() {
		return this.infoViews;
	}

	public void setInfoViews(int infoViews) {
		this.infoViews = infoViews;
	}

	public int getQuestionRevId() {
		return this.questionRevId;
	}

	public void setQuestionRevId(int questionRevId) {
		this.questionRevId = questionRevId;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVotes() {
		return this.votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public int getVotesDown() {
		return this.votesDown;
	}

	public void setVotesDown(int votesDown) {
		this.votesDown = votesDown;
	}

	public int getVotesUp() {
		return this.votesUp;
	}

	public void setVotesUp(int votesUp) {
		this.votesUp = votesUp;
	}

}