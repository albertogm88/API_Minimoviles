package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_cms_hub database table.
 * 
 */
@Entity
@Table(name="berry_cms_hub")
@NamedQuery(name="BerryCmsHub.findAll", query="SELECT b FROM BerryCmsHub b")
public class BerryCmsHub implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_hub")
	private int idHub;

	@Column(name="id_web")
	private int idWeb;

	private String nicename;

	private String permalink;

	private String title;

	public BerryCmsHub() {
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