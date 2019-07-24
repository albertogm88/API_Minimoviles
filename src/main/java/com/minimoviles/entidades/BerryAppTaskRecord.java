package com.minimoviles.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the berry_app_task_record database table.
 * 
 */
@Entity
@Table(name="berry_app_task_record")
@NamedQuery(name="BerryAppTaskRecord.findAll", query="SELECT b FROM BerryAppTaskRecord b")
public class BerryAppTaskRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_record")
	private int idRecord;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_add")
	private Date dateAdd;

	@Column(name="execution_id")
	private String executionId;

	@Column(name="execution_time")
	private BigDecimal executionTime;

	@Column(name="id_web")
	private int idWeb;

	@Lob
	private String response;

	@Lob
	@Column(name="response_raw")
	private String responseRaw;

	private int status;

	@Column(name="task_name")
	private String taskName;

	public BerryAppTaskRecord() {
	}

	public int getIdRecord() {
		return this.idRecord;
	}

	public void setIdRecord(int idRecord) {
		this.idRecord = idRecord;
	}

	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public BigDecimal getExecutionTime() {
		return this.executionTime;
	}

	public void setExecutionTime(BigDecimal executionTime) {
		this.executionTime = executionTime;
	}

	public int getIdWeb() {
		return this.idWeb;
	}

	public void setIdWeb(int idWeb) {
		this.idWeb = idWeb;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResponseRaw() {
		return this.responseRaw;
	}

	public void setResponseRaw(String responseRaw) {
		this.responseRaw = responseRaw;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}