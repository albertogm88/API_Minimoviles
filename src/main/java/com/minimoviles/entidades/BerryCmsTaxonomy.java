package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_cms_taxonomy database table.
 * 
 */
@Entity
@Table(name="berry_cms_taxonomy")
@NamedQuery(name="BerryCmsTaxonomy.findAll", query="SELECT b FROM BerryCmsTaxonomy b")
public class BerryCmsTaxonomy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_taxonomy")
	private int idTaxonomy;

	@Column(name="id_content")
	private int idContent;

	@Column(name="id_tag")
	private int idTag;

	@Column(name="id_web")
	private int idWeb;

	public BerryCmsTaxonomy() {
	}

	public int getIdTaxonomy() {
		return this.idTaxonomy;
	}

	public void setIdTaxonomy(int idTaxonomy) {
		this.idTaxonomy = idTaxonomy;
	}

	public int getIdContent() {
		return this.idContent;
	}

	public void setIdContent(int idContent) {
		this.idContent = idContent;
	}

	public int getIdTag() {
		return this.idTag;
	}

	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

}