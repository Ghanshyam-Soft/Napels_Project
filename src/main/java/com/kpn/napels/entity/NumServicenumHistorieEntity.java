package com.kpn.napels.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="NUM_SERVICENUMMER_HISTORIE")
//@NamedQuery(name="NumServicenummerHistorie.findAll", query="SELECT n FROM NumServicenummerHistorie n")
public class NumServicenumHistorieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NumServiceHistoriePKEntity numServiceHistoriePKEntity;

	@Column(name="SNH_ACCESS_AREA_CODE")
	private String snhAccessAreaCode;

	@Column(name="SNH_BESTEMMING_ID")
	private String snhBestemmingId;

	@Column(name="SNH_BTW_CODE")
	private Integer snhBtwCode;

	@Column(name="SNH_GEBRUIKER_ID_MUTATIE_MOMEN")
	private String snhGebruikerIdMutatieMomen;

	@Column(name="SNH_MUTATIELABEL")
	private String snhMutatielabel;

	@Column(name="SNH_NUMMER_HOOG")
	private String snhNummerHoog;

	@Column(name="SNH_OPERATOR_EXPLOITANT")
	private String snhOperatorExploitant;

	@Column(name="SNH_PLATFORM_ID")
	private Integer snhPlatformId;

	@Column(name="SNH_PULS_CODE")
	private String snhPulsCode;

	@Column(name="SNH_SOORT_ACTIE")
	private String snhSoortActie;

	@Column(name="SNH_TARIEF_CODE")
	private String snhTariefCode;
	
	public NumServiceHistoriePKEntity getNumServiceHistoriePKEntity() {
		return numServiceHistoriePKEntity;
	}

	public void setNumServiceHistoriePKEntity(NumServiceHistoriePKEntity numServiceHistoriePKEntity) {
		this.numServiceHistoriePKEntity = numServiceHistoriePKEntity;
	}

	public Integer getSnhBtwCode() {
		return snhBtwCode;
	}

	public void setSnhBtwCode(Integer snhBtwCode) {
		this.snhBtwCode = snhBtwCode;
	}

	public Integer getSnhPlatformId() {
		return snhPlatformId;
	}

	public void setSnhPlatformId(Integer snhPlatformId) {
		this.snhPlatformId = snhPlatformId;
	}

	public String getSnhAccessAreaCode() {
		return this.snhAccessAreaCode;
	}

	public void setSnhAccessAreaCode(String snhAccessAreaCode) {
		this.snhAccessAreaCode = snhAccessAreaCode;
	}

	public String getSnhBestemmingId() {
		return this.snhBestemmingId;
	}

	public void setSnhBestemmingId(String snhBestemmingId) {
		this.snhBestemmingId = snhBestemmingId;
	}

	

	public String getSnhGebruikerIdMutatieMomen() {
		return this.snhGebruikerIdMutatieMomen;
	}

	public void setSnhGebruikerIdMutatieMomen(String snhGebruikerIdMutatieMomen) {
		this.snhGebruikerIdMutatieMomen = snhGebruikerIdMutatieMomen;
	}

	public String getSnhMutatielabel() {
		return this.snhMutatielabel;
	}

	public void setSnhMutatielabel(String snhMutatielabel) {
		this.snhMutatielabel = snhMutatielabel;
	}

	public String getSnhNummerHoog() {
		return this.snhNummerHoog;
	}

	public void setSnhNummerHoog(String snhNummerHoog) {
		this.snhNummerHoog = snhNummerHoog;
	}

	public String getSnhOperatorExploitant() {
		return this.snhOperatorExploitant;
	}

	public void setSnhOperatorExploitant(String snhOperatorExploitant) {
		this.snhOperatorExploitant = snhOperatorExploitant;
	}

	

	public String getSnhPulsCode() {
		return this.snhPulsCode;
	}

	public void setSnhPulsCode(String snhPulsCode) {
		this.snhPulsCode = snhPulsCode;
	}

	public String getSnhSoortActie() {
		return this.snhSoortActie;
	}

	public void setSnhSoortActie(String snhSoortActie) {
		this.snhSoortActie = snhSoortActie;
	}

	public String getSnhTariefCode() {
		return this.snhTariefCode;
	}

	public void setSnhTariefCode(String snhTariefCode) {
		this.snhTariefCode = snhTariefCode;
	}

	@Override
	public String toString() {
		return "NumServicenumHistorieEntity [numServiceHistoriePKEntity=" + numServiceHistoriePKEntity
				+ ", snhAccessAreaCode=" + snhAccessAreaCode + ", snhBestemmingId=" + snhBestemmingId + ", snhBtwCode="
				+ snhBtwCode + ", snhGebruikerIdMutatieMomen=" + snhGebruikerIdMutatieMomen + ", snhMutatielabel="
				+ snhMutatielabel + ", snhNummerHoog=" + snhNummerHoog + ", snhOperatorExploitant="
				+ snhOperatorExploitant + ", snhPlatformId=" + snhPlatformId + ", snhPulsCode=" + snhPulsCode
				+ ", snhSoortActie=" + snhSoortActie + ", snhTariefCode=" + snhTariefCode + "]";
	}

}
