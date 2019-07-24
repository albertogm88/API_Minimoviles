package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_cms_hub_slot database table.
 * 
 */
@Entity
@Table(name="berry_cms_hub_slot")
@NamedQuery(name="BerryCmsHubSlot.findAll", query="SELECT b FROM BerryCmsHubSlot b")
public class BerryCmsHubSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_slot")
	private int idSlot;

	@Column(name="hub_position")
	private int hubPosition;

	@Column(name="id_hub")
	private int idHub;

	@Column(name="id_web")
	private int idWeb;

	@Lob
	@Column(name="items_query")
	private String itemsQuery;

	private String nicename;

	private String permalink;

	private String title;

	public BerryCmsHubSlot() {
	}

	public int getIdSlot() {
		return this.idSlot;
	}

	public void setIdSlot(int idSlot) {
		this.idSlot = idSlot;
	}

	public int getHubPosition() {
		return this.hubPosition;
	}

	public void setHubPosition(int hubPosition) {
		this.hubPosition = hubPosition;
	}

	public int getIdHub() {
		return this.idHub;
	}

	public void setIdHub(int idHub) {
		this.idHub = idHub;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getItemsQuery() {
		return this.itemsQuery;
	}

	public void setItemsQuery(String itemsQuery) {
		this.itemsQuery = itemsQuery;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}