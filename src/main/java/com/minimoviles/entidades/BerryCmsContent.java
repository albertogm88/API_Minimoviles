package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the berry_cms_content database table.
 * 
 */
@Entity
@Table(name="berry_cms_content")
@NamedQuery(name="BerryCmsContent.findAll", query="SELECT b FROM BerryCmsContent b")
public class BerryCmsContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_content")
	private String idContent;

	private String content;

	@Column(name="content_description")
	private String contentDescription;

	@Column(name="content_type")
	private String contentType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_publish")
	private Date datePublish;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	private Date dateUpdate;

	@Column(name="id_collection")
	private BigInteger idCollection;

	@Column(name="id_lang")
	private BigInteger idLang;

	@Column(name="id_media")
	private BigInteger idMedia;

	@Column(name="id_parent")
	private BigInteger idParent;

	@Column(name="id_user")
	private BigInteger idUser;

	@Column(name="id_user_last_modified")
	private BigInteger idUserLastModified;

	@Column(name="id_web")
	private BigInteger idWeb;

	@Column(name="is_public")
	private int isPublic;

	@Column(name="is_published")
	private int isPublished;

	@Column(name="is_trash")
	private int isTrash;

	@Column(name="is_working_copy")
	private int isWorkingCopy;

	private String name;

	private String nicename;

	private String permalink;

	private BigInteger type;

	public BerryCmsContent() {
	}

	public String getIdContent() {
		return this.idContent;
	}

	public void setIdContent(String idContent) {
		this.idContent = idContent;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentDescription() {
		return this.contentDescription;
	}

	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDatePublish() {
		return this.datePublish;
	}

	public void setDatePublish(Date datePublish) {
		this.datePublish = datePublish;
	}

	public Date getDateUpdate() {
		return this.dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public BigInteger getIdCollection() {
		return this.idCollection;
	}

	public void setIdCollection(BigInteger idCollection) {
		this.idCollection = idCollection;
	}

	public BigInteger getIdLang() {
		return this.idLang;
	}

	public void setIdLang(BigInteger idLang) {
		this.idLang = idLang;
	}

	public BigInteger getIdMedia() {
		return this.idMedia;
	}

	public void setIdMedia(BigInteger idMedia) {
		this.idMedia = idMedia;
	}

	public BigInteger getIdParent() {
		return this.idParent;
	}

	public void setIdParent(BigInteger idParent) {
		this.idParent = idParent;
	}

	public BigInteger getIdUser() {
		return this.idUser;
	}

	public void setIdUser(BigInteger idUser) {
		this.idUser = idUser;
	}

	public BigInteger getIdUserLastModified() {
		return this.idUserLastModified;
	}

	public void setIdUserLastModified(BigInteger idUserLastModified) {
		this.idUserLastModified = idUserLastModified;
	}

	public BigInteger getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(BigInteger idWeb) {
		this.idWeb = idWeb;
	}

	public int getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(int isPublic) {
		this.isPublic = isPublic;
	}

	public int getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(int isPublished) {
		this.isPublished = isPublished;
	}

	public int getIsTrash() {
		return this.isTrash;
	}

	public void setIsTrash(int isTrash) {
		this.isTrash = isTrash;
	}

	public int getIsWorkingCopy() {
		return this.isWorkingCopy;
	}

	public void setIsWorkingCopy(int isWorkingCopy) {
		this.isWorkingCopy = isWorkingCopy;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNicename() {
		return this.nicename;
	}

	public void setNicename(String nicename) {
		this.nicename = nicename;
	}

	public String getPermalink() {
		return this.permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public BigInteger getType() {
		return this.type;
	}

	public void setType(BigInteger type) {
		this.type = type;
	}

}