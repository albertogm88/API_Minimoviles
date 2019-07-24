package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fix_guia_guia database table.
 * 
 */
@Entity
@Table(name="fix_guia_guia")
@NamedQuery(name="FixGuiaGuia.findAll", query="SELECT f FROM FixGuiaGuia f")
public class FixGuiaGuia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_guia")
	private int idGuia;

	@Lob
	private String content;

	@Column(name="original_source")
	private String originalSource;

	private String slug;

	private String title;

	public FixGuiaGuia() {
	}

	public int getIdGuia() {
		return this.idGuia;
	}

	public void setIdGuia(int idGuia) {
		this.idGuia = idGuia;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOriginalSource() {
		return this.originalSource;
	}

	public void setOriginalSource(String originalSource) {
		this.originalSource = originalSource;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}