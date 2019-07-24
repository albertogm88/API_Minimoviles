package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_cms_panel database table.
 * 
 */
@Entity
@Table(name="berry_cms_panel")
@NamedQuery(name="BerryCmsPanel.findAll", query="SELECT b FROM BerryCmsPanel b")
public class BerryCmsPanel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_panel")
	private int idPanel;

	@Column(name="container_name")
	private String containerName;

	@Column(name="container_resource")
	private String containerResource;

	@Column(name="id_web")
	private int idWeb;

	@Column(name="panel_parent_id")
	private int panelParentId;

	private int position;

	private String type;

	public BerryCmsPanel() {
	}

	public int getIdPanel() {
		return this.idPanel;
	}

	public void setIdPanel(int idPanel) {
		this.idPanel = idPanel;
	}

	public String getContainerName() {
		return this.containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}

	public String getContainerResource() {
		return this.containerResource;
	}

	public void setContainerResource(String containerResource) {
		this.containerResource = containerResource;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public int getPanelParentId() {
		return this.panelParentId;
	}

	public void setPanelParentId(int panelParentId) {
		this.panelParentId = panelParentId;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}