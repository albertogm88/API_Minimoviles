package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_bqa_answer database table.
 * 
 */
@Entity
@Table(name="berry_bqa_answer")
@NamedQuery(name="BerryBqaAnswer.findAll", query="SELECT b FROM BerryBqaAnswer b")
public class BerryBqaAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_answer")
	private int idAnswer;

	@Column(name="answer_rev_id")
	private int answerRevId;

	@Column(name="asker_approved")
	private int askerApproved;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="question_id")
	private int questionId;

	@Column(name="user_id")
	private int userId;

	private int votes;

	@Column(name="votes_down")
	private int votesDown;

	@Column(name="votes_up")
	private int votesUp;

	public BerryBqaAnswer() {
	}

	public int getIdAnswer() {
		return this.idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}

	public int getAnswerRevId() {
		return this.answerRevId;
	}

	public void setAnswerRevId(int answerRevId) {
		this.answerRevId = answerRevId;
	}

	public int getAskerApproved() {
		return this.askerApproved;
	}

	public void setAskerApproved(int askerApproved) {
		this.askerApproved = askerApproved;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
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