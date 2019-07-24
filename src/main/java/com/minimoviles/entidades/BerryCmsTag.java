package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_cms_tag database table.
 * 
 */
@Entity
@Table(name="berry_cms_tag")
@NamedQuery(name="BerryCmsTag.findAll", query="SELECT b FROM BerryCmsTag b")
public class BerryCmsTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tag")
	private int idTag;

	@Column(name="id_parent")
	private int idParent;

	@Column(name="id_web")
	private int idWeb;

	@Column(name="is_hub")
	private byte isHub;

	private String name;

	private String nicename;

	private String permalink;

	private int quantity;

	@Column(name="taxonomy_type")
	private int taxonomyType;

	public BerryCmsTag() {
	}

	public int getIdTag() {
		return this.idTag;
	}

	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}

	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public byte getIsHub() {
		return this.isHub;
	}

	public void setIsHub(byte isHub) {
		this.isHub = isHub;
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

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTaxonomyType() {
		return this.taxonomyType;
	}

	public void setTaxonomyType(int taxonomyType) {
		this.taxonomyType = taxonomyType;
	}

}