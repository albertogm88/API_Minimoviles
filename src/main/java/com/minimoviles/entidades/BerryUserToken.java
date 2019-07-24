package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the berry_user_token database table.
 * 
 */
@Entity
@Table(name="berry_user_token")
@NamedQuery(name="BerryUserToken.findAll", query="SELECT b FROM BerryUserToken b")
public class BerryUserToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_token")
	private int idToken;

	@Column(name="client_name")
	private String clientName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_last_access")
	private Date dateLastAccess;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expires_at")
	private Date expiresAt;

	@Column(name="id_user")
	private int idUser;

	@Column(name="id_web")
	private int idWeb;

	@Column(name="ip_last_access")
	private String ipLastAccess;

	@Column(name="ip_login")
	private String ipLogin;

	private String token;

	@Column(name="user_agent")
	private String userAgent;

	public BerryUserToken() {
	}

	public int getIdToken() {
		return this.idToken;
	}

	public void setIdToken(int idToken) {
		this.idToken = idToken;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateLastAccess() {
		return this.dateLastAccess;
	}

	public void setDateLastAccess(Date dateLastAccess) {
		this.dateLastAccess = dateLastAccess;
	}

	public Date getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getIpLastAccess() {
		return this.ipLastAccess;
	}

	public void setIpLastAccess(String ipLastAccess) {
		this.ipLastAccess = ipLastAccess;
	}

	public String getIpLogin() {
		return this.ipLogin;
	}

	public void setIpLogin(String ipLogin) {
		this.ipLogin = ipLogin;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

}