package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the NUM_SERVICENUMMER_LRI database table.
 * 
 */
@Embeddable
public class NumServicenummerLriPKEntity implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FK_NOP_INT_OPER_ID", insertable=false, updatable=false)
	private String fkNopIntOperId;

	@Column(name="FK_POP_ACCESS_AREA", insertable=false, updatable=false)
	private String fkPopAccessArea;

	@Column(name="FK_BST_ID", insertable=false, updatable=false)
	private String fkBstId;

	@Column(name="FK_VOIP_PLATFORM_ID", insertable=false, updatable=false)
	private long fkVoipPlatformId;

	public NumServicenummerLriPKEntity() {
	}
	public String getFkNopIntOperId() {
		return this.fkNopIntOperId;
	}
	public void setFkNopIntOperId(String fkNopIntOperId) {
		this.fkNopIntOperId = fkNopIntOperId;
	}
	public String getFkPopAccessArea() {
		return this.fkPopAccessArea;
	}
	public void setFkPopAccessArea(String fkPopAccessArea) {
		this.fkPopAccessArea = fkPopAccessArea;
	}
	public String getFkBstId() {
		return this.fkBstId;
	}
	public void setFkBstId(String fkBstId) {
		this.fkBstId = fkBstId;
	}
	public long getFkVoipPlatformId() {
		return this.fkVoipPlatformId;
	}
	public void setFkVoipPlatformId(long fkVoipPlatformId) {
		this.fkVoipPlatformId = fkVoipPlatformId;
	}

	
	public NumServicenummerLriPKEntity(String fkNopIntOperId, String fkPopAccessArea, String fkBstId,
			long fkVoipPlatformId) {
		super();
		this.fkNopIntOperId = fkNopIntOperId;
		this.fkPopAccessArea = fkPopAccessArea;
		this.fkBstId = fkBstId;
		this.fkVoipPlatformId = fkVoipPlatformId;
	}
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NumServicenummerLriPKEntity)) {
			return false;
		}
		NumServicenummerLriPKEntity castOther = (NumServicenummerLriPKEntity)other;
		return 
			this.fkNopIntOperId.equals(castOther.fkNopIntOperId)
			&& this.fkPopAccessArea.equals(castOther.fkPopAccessArea)
			&& this.fkBstId.equals(castOther.fkBstId)
			&& (this.fkVoipPlatformId == castOther.fkVoipPlatformId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fkNopIntOperId.hashCode();
		hash = hash * prime + this.fkPopAccessArea.hashCode();
		hash = hash * prime + this.fkBstId.hashCode();
		hash = hash * prime + ((int) (this.fkVoipPlatformId ^ (this.fkVoipPlatformId >>> 32)));
		
		return hash;
	}
}