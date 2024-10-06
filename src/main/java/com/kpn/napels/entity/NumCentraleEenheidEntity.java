package com.kpn.napels.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="NUM_CENTRALE_EENHEID")
public class NumCentraleEenheidEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	NumCentraleEenheidPKEntity numCentralPKEntity;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="CEH_CREATIE_DATUM_TIJD")
	private Date cehCreatieDatumTijd;

	public NumCentraleEenheidEntity() {
	}
	

	public Date getCehCreatieDatumTijd() {
		return cehCreatieDatumTijd;
	}

	public void setCehCreatieDatumTijd(Date cehCreatieDatumTijd) {
		this.cehCreatieDatumTijd = cehCreatieDatumTijd;
	}

	public NumCentraleEenheidPKEntity getNumCentralPKEntity() {
		return numCentralPKEntity;
	}

	public void setNumCentralPKEntity(NumCentraleEenheidPKEntity numCentralPKEntity) {
		this.numCentralPKEntity = numCentralPKEntity;
	}

	@Override
	public String toString() {
		return "NumCentraleEenheidEntity [numCentralPKEntity=" + numCentralPKEntity + ", cehCreatieDatumTijd="
				+ cehCreatieDatumTijd + "]";
	}

	

	
}
