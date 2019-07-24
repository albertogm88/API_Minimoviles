package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_cms_comment database table.
 * 
 */
@Entity
@Table(name="berry_cms_comment")
@NamedQuery(name="BerryCmsComment.findAll", query="SELECT b FROM BerryCmsComment b")
public class BerryCmsComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_comment")
	private int idComment;

	@Column(name="author_email")
	private String authorEmail;

	@Column(name="author_name")
	private String authorName;

	@Column(name="author_url")
	private String authorUrl;

	@Lob
	private String comment;

	@Column(name="comment_format")
	private String commentFormat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="id_user")
	private int idUser;

	@Column(name="id_web")
	private int idWeb;

	private String ip;

	@Column(name="replay_to")
	private int replayTo;

	@Column(name="resource_id")
	private int resourceId;

	@Column(name="resource_type")
	private String resourceType;

	private byte status;

	public BerryCmsComment() {
	}

	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}

	public String getAuthorEmail() {
		return this.authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorUrl() {
		return this.authorUrl;
	}

	public void setAuthorUrl(String authorUrl) {
		this.authorUrl = authorUrl;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentFormat() {
		return this.commentFormat;
	}

	public void setCommentFormat(String commentFormat) {
		this.commentFormat = commentFormat;
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

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getReplayTo() {
		return this.replayTo;
	}

	public void setReplayTo(int replayTo) {
		this.replayTo = replayTo;
	}

	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}