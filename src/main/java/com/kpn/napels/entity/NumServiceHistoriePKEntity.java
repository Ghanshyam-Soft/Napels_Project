package com.kpn.napels.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Embeddable
public class NumServiceHistoriePKEntity implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SNH_NUMMER_LAAG")
	private String snhNummerLaag;

	@Temporal(TemporalType.DATE)
	@Column(name="SNH_LAATSTE_MUTATIE_MOMENT")
	private java.util.Date snhLaatsteMutatieMoment;

	public NumServiceHistoriePKEntity() {
	}
	public String getSnhNummerLaag() {
		return this.snhNummerLaag;
	}
	public void setSnhNummerLaag(String snhNummerLaag) {
		this.snhNummerLaag = snhNummerLaag;
	}
	public java.util.Date getSnhLaatsteMutatieMoment() {
		return this.snhLaatsteMutatieMoment;
	}
	public void setSnhLaatsteMutatieMoment(java.util.Date snhLaatsteMutatieMoment) {
		this.snhLaatsteMutatieMoment = snhLaatsteMutatieMoment;
	}

	public NumServiceHistoriePKEntity(String snhNummerLaag, Date snhLaatsteMutatieMoment) {
		super();
		this.snhNummerLaag = snhNummerLaag;
		this.snhLaatsteMutatieMoment = snhLaatsteMutatieMoment;
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NumServiceHistoriePKEntity)) {
			return false;
		}
		NumServiceHistoriePKEntity castOther = (NumServiceHistoriePKEntity)other;
		return 
			this.snhNummerLaag.equals(castOther.snhNummerLaag)
			&& this.snhLaatsteMutatieMoment.equals(castOther.snhLaatsteMutatieMoment);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.snhNummerLaag.hashCode();
		hash = hash * prime + this.snhLaatsteMutatieMoment.hashCode();
		
		return hash;
	}
	@Override
	public String toString() {
		return "NumServiceHistoriePKEntity [snhNummerLaag=" + snhNummerLaag + ", snhLaatsteMutatieMoment="
				+ snhLaatsteMutatieMoment + "]";
	}
}
