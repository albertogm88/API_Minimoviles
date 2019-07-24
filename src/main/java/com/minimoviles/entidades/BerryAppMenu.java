package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the berry_app_menu database table.
 * 
 */
@Entity
@Table(name="berry_app_menu")
@NamedQuery(name="BerryAppMenu.findAll", query="SELECT b FROM BerryAppMenu b")
public class BerryAppMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_menu")
	private int idMenu;

	@Column(name="id_web")
	private int idWeb;

	@Column(name="items_order_by")
	private String itemsOrderBy;

	@Column(name="items_order_type")
	private String itemsOrderType;

	@Column(name="num_items")
	private int numItems;

	private String title;

	public BerryAppMenu() {
	}

	public int getIdMenu() {
		return this.idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getItemsOrderBy() {
		return this.itemsOrderBy;
	}

	public void setItemsOrderBy(String itemsOrderBy) {
		this.itemsOrderBy = itemsOrderBy;
	}

	public String getItemsOrderType() {
		return this.itemsOrderType;
	}

	public void setItemsOrderType(String itemsOrderType) {
		this.itemsOrderType = itemsOrderType;
	}

	public int getNumItems() {
		return this.numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}