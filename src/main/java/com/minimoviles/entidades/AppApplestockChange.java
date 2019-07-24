package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the app_applestock_change database table.
 * 
 */
@Entity
@Table(name="app_applestock_change")
@NamedQuery(name="AppApplestockChange.findAll", query="SELECT a FROM AppApplestockChange a")
public class AppApplestockChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_change")
	private int idChange;

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

	@Column(name="tweet_id")
	private String tweetId;

	public AppApplestockChange() {
	}

	public int getIdChange() {
		return this.idChange;
	}

	public void setIdChange(int idChange) {
		this.idChange = idChange;
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

	public String getTweetId() {
		return this.tweetId;
	}

	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}

}