package com.kpn.napels.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.*;

@Embeddable
public class NumCentraleEenheidPKEntity implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="FK_CEH_HST_SPC_ID", insertable=false, updatable=false)
	private String fkCehHstSpcId;

	@Column(name="FK_CEH_CGB_CODE", insertable=false, updatable=false)
	private long fkCehCgbCode;

	public NumCentraleEenheidPKEntity() {
	}

	public NumCentraleEenheidPKEntity(String fkCehHstSpcId, long fkCehCgbCode) {
		super();
		this.fkCehHstSpcId = fkCehHstSpcId;
		this.fkCehCgbCode = fkCehCgbCode;
	}

	public String getFkCehHstSpcId() {
		return fkCehHstSpcId;
	}

	public void setFkCehHstSpcId(String fkCehHstSpcId) {
		this.fkCehHstSpcId = fkCehHstSpcId;
	}

	public long getFkCehCgbCode() {
		return fkCehCgbCode;
	}

	public void setFkCehCgbCode(long fkCehCgbCode) {
		this.fkCehCgbCode = fkCehCgbCode;
	}

	
}
