package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the app_applestock_update database table.
 * 
 */
@Entity
@Table(name="app_applestock_update")
@NamedQuery(name="AppApplestockUpdate.findAll", query="SELECT a FROM AppApplestockUpdate a")
public class AppApplestockUpdate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_update")
	private int idUpdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="part_name")
	private String partName;

	@Column(name="pickup_display")
	private String pickupDisplay;

	@Column(name="pickup_quote")
	private String pickupQuote;

	@Column(name="store_number")
	private String storeNumber;

	public AppApplestockUpdate() {
	}

	public int getIdUpdate() {
		return this.idUpdate;
	}

	public void setIdUpdate(int idUpdate) {
		this.idUpdate = idUpdate;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public String getPartName() {
		return this.partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPickupDisplay() {
		return this.pickupDisplay;
	}

	public void setPickupDisplay(String pickupDisplay) {
		this.pickupDisplay = pickupDisplay;
	}

	public String getPickupQuote() {
		return this.pickupQuote;
	}

	public void setPickupQuote(String pickupQuote) {
		this.pickupQuote = pickupQuote;
	}

	public String getStoreNumber() {
		return this.storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

}