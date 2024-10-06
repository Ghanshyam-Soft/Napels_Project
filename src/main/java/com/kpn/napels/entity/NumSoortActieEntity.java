package com.kpn.napels.entity;

import javax.persistence.*;



@Entity
@Table(name="NUM_SOORT_ACTIE")
public class NumSoortActieEntity {
	
	@Id
	@Column(name="SAC_ID")
	private String sacId;
	
	@Column(name="SAC_OMSCHRIJVING")
	private String sacOmschrijving;

	public String getSacId() {
		return sacId;
	}

	public void setSacId(String sacId) {
		this.sacId = sacId;
	}

	public String getSacOmschrijving() {
		return sacOmschrijving;
	}

	public void setSacOmschrijving(String sacOmschrijving) {
		this.sacOmschrijving = sacOmschrijving;
	}

	@Override
	public String toString() {
		return "NumSoortActieEntity [sacId=" + sacId + ", sacOmschrijving=" + sacOmschrijving + "]";
	}
	
	
	

}
