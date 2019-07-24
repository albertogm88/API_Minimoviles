package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_cms_content_copy database table.
 * 
 */
@Entity
@Table(name="berry_cms_content_copy")
@NamedQuery(name="BerryCmsContentCopy.findAll", query="SELECT b FROM BerryCmsContentCopy b")
public class BerryCmsContentCopy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_content")
	private int idContent;

	@Lob
	private String content;

	@Lob
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
	private int idCollection;

	@Column(name="id_lang")
	private int idLang;

	@Column(name="id_media")
	private int idMedia;

	@Column(name="id_parent")
	private int idParent;

	@Column(name="id_user")
	private int idUser;

	@Column(name="id_user_last_modified")
	private int idUserLastModified;

	@Column(name="id_web")
	private int idWeb;

	@Column(name="is_public")
	private byte isPublic;

	@Column(name="is_published")
	private byte isPublished;

	@Column(name="is_trash")
	private byte isTrash;

	@Column(name="is_working_copy")
	private byte isWorkingCopy;

	private String name;

	private String nicename;

	private String permalink;

	private int type;

	public BerryCmsContentCopy() {
	}

	public int getIdContent() {
		return this.idContent;
	}

	public void setIdContent(int idContent) {
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

	public int getIdCollection() {
		return this.idCollection;
	}

	public void setIdCollection(int idCollection) {
		this.idCollection = idCollection;
	}

	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	public int getIdMedia() {
		return this.idMedia;
	}

	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}

	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdUserLastModified() {
		return this.idUserLastModified;
	}

	public void setIdUserLastModified(int idUserLastModified) {
		this.idUserLastModified = idUserLastModified;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public byte getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(byte isPublic) {
		this.isPublic = isPublic;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public byte getIsTrash() {
		return this.isTrash;
	}

	public void setIsTrash(byte isTrash) {
		this.isTrash = isTrash;
	}

	public byte getIsWorkingCopy() {
		return this.isWorkingCopy;
	}

	public void setIsWorkingCopy(byte isWorkingCopy) {
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

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}