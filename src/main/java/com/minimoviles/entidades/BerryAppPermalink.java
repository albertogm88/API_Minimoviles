package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_app_permalink database table.
 * 
 */
@Entity
@Table(name="berry_app_permalink")
@NamedQuery(name="BerryAppPermalink.findAll", query="SELECT b FROM BerryAppPermalink b")
public class BerryAppPermalink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_permalink")
	private int idPermalink;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_update")
	private Date dateUpdate;

	@Column(name="dispatch_action")
	private String dispatchAction;

	@Column(name="dispatch_controller")
	private String dispatchController;

	@Column(name="dispatch_params")
	private String dispatchParams;

	@Column(name="id_web")
	private int idWeb;

	private String permalink;

	public BerryAppPermalink() {
	}

	public int getIdPermalink() {
		return this.idPermalink;
	}

	public void setIdPermalink(int idPermalink) {
		this.idPermalink = idPermalink;
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

	public String getDispatchAction() {
		return this.dispatchAction;
	}

	public void setDispatchAction(String dispatchAction) {
		this.dispatchAction = dispatchAction;
	}

	public String getDispatchController() {
		return this.dispatchController;
	}

	public void setDispatchController(String dispatchController) {
		this.dispatchController = dispatchController;
	}

	public String getDispatchParams() {
		return this.dispatchParams;
	}

	public void setDispatchParams(String dispatchParams) {
		this.dispatchParams = dispatchParams;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getPermalink() {
		return this.permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

}