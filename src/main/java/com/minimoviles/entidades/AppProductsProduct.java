package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the app_products_product database table.
 * 
 */
@Entity
@Table(name="app_products_product")
@NamedQuery(name="AppProductsProduct.findAll", query="SELECT a FROM AppProductsProduct a")
public class AppProductsProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_product")
	private int idProduct;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.DATE)
	@Column(name="date_launch")
	private Date dateLaunch;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	private Date dateUpdate;

	@Column(name="id_brand")
	private int idBrand;

	@Column(name="id_category")
	private int idCategory;

	@Column(name="is_published")
	private byte isPublished;

	@Column(name="media_id_front")
	private int mediaIdFront;

	private String name;

	private String nicename;

	@Column(name="predecessor_id")
	private int predecessorId;

	@Column(name="successor_id")
	private int successorId;

	public AppProductsProduct() {
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateLaunch() {
		return this.dateLaunch;
	}

	public void setDateLaunch(Date dateLaunch) {
		this.dateLaunch = dateLaunch;
	}

	public Date getDateUpdate() {
		return this.dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public int getIdBrand() {
		return this.idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public byte getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(byte isPublished) {
		this.isPublished = isPublished;
	}

	public int getMediaIdFront() {
		return this.mediaIdFront;
	}

	public void setMediaIdFront(int mediaIdFront) {
		this.mediaIdFront = mediaIdFront;
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

	public int getPredecessorId() {
		return this.predecessorId;
	}

	public void setPredecessorId(int predecessorId) {
		this.predecessorId = predecessorId;
	}

	public int getSuccessorId() {
		return this.successorId;
	}

	public void setSuccessorId(int successorId) {
		this.successorId = successorId;
	}

}