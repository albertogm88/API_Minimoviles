package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_cms_panel_var database table.
 * 
 */
@Entity
@Table(name="berry_cms_panel_var")
@NamedQuery(name="BerryCmsPanelVar.findAll", query="SELECT b FROM BerryCmsPanelVar b")
public class BerryCmsPanelVar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_panel_var")
	private int idPanelVar;

	@Column(name="id_panel")
	private int idPanel;

	@Column(name="id_web")
	private int idWeb;

	private String name;

	private int type;

	@Lob
	private String value;

	public BerryCmsPanelVar() {
	}

	public int getIdPanelVar() {
		return this.idPanelVar;
	}

	public void setIdPanelVar(int idPanelVar) {
		this.idPanelVar = idPanelVar;
	}

	public int getIdPanel() {
		return this.idPanel;
	}

	public void setIdPanel(int idPanel) {
		this.idPanel = idPanel;
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

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}