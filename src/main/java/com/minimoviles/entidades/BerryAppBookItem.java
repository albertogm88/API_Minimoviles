package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_app_book_item database table.
 * 
 */
@Entity
@Table(name="berry_app_book_item")
@NamedQuery(name="BerryAppBookItem.findAll", query="SELECT b FROM BerryAppBookItem b")
public class BerryAppBookItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_book_item")
	private int idBookItem;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	private Date dateUpdate;

	@Column(name="depth_index")
	private int depthIndex;

	@Column(name="id_book")
	private int idBook;

	@Column(name="id_web")
	private int idWeb;

	private String name;

	@Column(name="order_index")
	private int orderIndex;

	@Column(name="parent_id")
	private int parentId;

	private String slug;

	@Column(name="target_id")
	private int targetId;

	@Column(name="target_type")
	private String targetType;

	@Column(name="target_url")
	private String targetUrl;

	private String title;

	public BerryAppBookItem() {
	}

	public int getIdBookItem() {
		return this.idBookItem;
	}

	public void setIdBookItem(int idBookItem) {
		this.idBookItem = idBookItem;
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

	public int getDepthIndex() {
		return this.depthIndex;
	}

	public void setDepthIndex(int depthIndex) {
		this.depthIndex = depthIndex;
	}

	public int getIdBook() {
		return this.idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderIndex() {
		return this.orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
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

	public String getTargetUrl() {
		return this.targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}