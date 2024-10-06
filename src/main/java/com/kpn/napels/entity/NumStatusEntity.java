package com.kpn.napels.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NUM_STATUS")
public class NumStatusEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STA_ID")
	private String staId;

	@Column(name="STA_OMSCHRIJVING")
	private String staOmschrijving;

	public String getStaId() {
		return staId;
	}

	public void setStaId(String staId) {
		this.staId = staId;
	}

	public String getStaOmschrijving() {
		return staOmschrijving;
	}

	public void setStaOmschrijving(String staOmschrijving) {
		this.staOmschrijving = staOmschrijving;
	}

	@Override
	public String toString() {
		return "NumStatus [staId=" + staId + ", staOmschrijving=" + staOmschrijving + "]";
	}
}
