package com.kpn.napels.dto;

import java.util.Date;

import com.kpn.napels.entity.NumServiceHistoriePKEntity;

public class ServiceNummerDetailDTO {

	//NUM_SERVICENUMMER
	
	private String snrNumberLow;
	private String snrNumberHigh;
	private String fkNopInterneOpId;
	private String snrPulsCode;
	private Date snrLaatsteMut;
	private String snrAccessCode;
	private String snrTarrifCode;
	private String snrBestemmingId;	
	private int snrBtwCode;
	private String snrGebIdMut;	
	private int fkNumVoipPlatformId;
	private String fkScId;
	
	//NUM_VOIP_PLATFORM
	private int platformId;
	private String platformOmschrijving;
	
	//NUM_SOORT_ACTIE
	
	private String sacId;
	private String sacOmschrijving;
	
	//NUM_SERVICENUMMER_LRI
	private String sliLri;
	
	//NUM_SERVICENUMMER_HISTORIE
	
	private NumServiceHistoriePKEntity numServiceHistoriePKEntity;
	private String snhSoortActie;
	private String snhGebruikerIdMutatieMomen;
	private String snhAccessAreaCode;
	private String snhOperatorExploitant;
	private String snhPulsCode;
	private String snhTariefCode;
	private Integer snhBtwCode;
	private Integer snhPlatformId;

	public String getSnrNumberLow() {
		return snrNumberLow;
	}

	public void setSnrNumberLow(String snrNumberLow) {
		this.snrNumberLow = snrNumberLow;
	}

	public String getSnrNumberHigh() {
		return snrNumberHigh;
	}

	public void setSnrNumberHigh(String snrNumberHigh) {
		this.snrNumberHigh = snrNumberHigh;
	}

	public String getFkNopInterneOpId() {
		return fkNopInterneOpId;
	}

	public void setFkNopInterneOpId(String fkNopInterneOpId) {
		this.fkNopInterneOpId = fkNopInterneOpId;
	}

	public String getSnrPulsCode() {
		return snrPulsCode;
	}

	public void setSnrPulsCode(String snrPulsCode) {
		this.snrPulsCode = snrPulsCode;
	}

	public Date getSnrLaatsteMut() {
		return snrLaatsteMut;
	}

	public void setSnrLaatsteMut(Date snrLaatsteMut) {
		this.snrLaatsteMut = snrLaatsteMut;
	}

	public String getSnrAccessCode() {
		return snrAccessCode;
	}

	public void setSnrAccessCode(String snrAccessCode) {
		this.snrAccessCode = snrAccessCode;
	}

	public String getSnrTarrifCode() {
		return snrTarrifCode;
	}

	public void setSnrTarrifCode(String snrTarrifCode) {
		this.snrTarrifCode = snrTarrifCode;
	}

	public String getSnrBestemmingId() {
		return snrBestemmingId;
	}

	public void setSnrBestemmingId(String snrBestemmingId) {
		this.snrBestemmingId = snrBestemmingId;
	}

	public int getSnrBtwCode() {
		return snrBtwCode;
	}

	public void setSnrBtwCode(int snrBtwCode) {
		this.snrBtwCode = snrBtwCode;
	}

	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public String getPlatformOmschrijving() {
		return platformOmschrijving;
	}

	public void setPlatformOmschrijving(String platformOmschrijving) {
		this.platformOmschrijving = platformOmschrijving;
	}

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

	public String getSliLri() {
		return sliLri;
	}

	public void setSliLri(String sliLri) {
		this.sliLri = sliLri;
	}

	public String getSnrGebIdMut() {
		return snrGebIdMut;
	}

	public void setSnrGebIdMut(String snrGebIdMut) {
		this.snrGebIdMut = snrGebIdMut;
	}

	public int getFkNumVoipPlatformId() {
		return fkNumVoipPlatformId;
	}

	public void setFkNumVoipPlatformId(int fkNumVoipPlatformId) {
		this.fkNumVoipPlatformId = fkNumVoipPlatformId;
	}

	public String getFkScId() {
		return fkScId;
	}

	public void setFkScId(String fkScId) {
		this.fkScId = fkScId;
	}

	

	public String getSnhSoortActie() {
		return snhSoortActie;
	}

	public void setSnhSoortActie(String snhSoortActie) {
		this.snhSoortActie = snhSoortActie;
	}

	public String getSnhGebruikerIdMutatieMomen() {
		return snhGebruikerIdMutatieMomen;
	}

	public void setSnhGebruikerIdMutatieMomen(String snhGebruikerIdMutatieMomen) {
		this.snhGebruikerIdMutatieMomen = snhGebruikerIdMutatieMomen;
	}

	public String getSnhAccessAreaCode() {
		return snhAccessAreaCode;
	}

	public void setSnhAccessAreaCode(String snhAccessAreaCode) {
		this.snhAccessAreaCode = snhAccessAreaCode;
	}

	public String getSnhOperatorExploitant() {
		return snhOperatorExploitant;
	}

	public void setSnhOperatorExploitant(String snhOperatorExploitant) {
		this.snhOperatorExploitant = snhOperatorExploitant;
	}

	public String getSnhPulsCode() {
		return snhPulsCode;
	}

	public void setSnhPulsCode(String snhPulsCode) {
		this.snhPulsCode = snhPulsCode;
	}

	public String getSnhTariefCode() {
		return snhTariefCode;
	}

	public void setSnhTariefCode(String snhTariefCode) {
		this.snhTariefCode = snhTariefCode;
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

	public NumServiceHistoriePKEntity getNumServiceHistoriePKEntity() {
		return numServiceHistoriePKEntity;
	}

	public void setNumServiceHistoriePKEntity(NumServiceHistoriePKEntity numServiceHistoriePKEntity) {
		this.numServiceHistoriePKEntity = numServiceHistoriePKEntity;
	}

	@Override
	public String toString() {
		return "ServiceNummerDetailDTO [snrNumberLow=" + snrNumberLow + ", snrNumberHigh=" + snrNumberHigh
				+ ", fkNopInterneOpId=" + fkNopInterneOpId + ", snrPulsCode=" + snrPulsCode + ", snrLaatsteMut="
				+ snrLaatsteMut + ", snrAccessCode=" + snrAccessCode + ", snrTarrifCode=" + snrTarrifCode
				+ ", snrBestemmingId=" + snrBestemmingId + ", snrBtwCode=" + snrBtwCode + ", snrGebIdMut=" + snrGebIdMut
				+ ", fkNumVoipPlatformId=" + fkNumVoipPlatformId + ", fkScId=" + fkScId + ", platformId=" + platformId
				+ ", platformOmschrijving=" + platformOmschrijving + ", sacId=" + sacId + ", sacOmschrijving="
				+ sacOmschrijving + ", sliLri=" + sliLri + ", numServiceHistoriePKEntity=" + numServiceHistoriePKEntity
				+ ", snhSoortActie=" + snhSoortActie + ", snhGebruikerIdMutatieMomen=" + snhGebruikerIdMutatieMomen
				+ ", snhAccessAreaCode=" + snhAccessAreaCode + ", snhOperatorExploitant=" + snhOperatorExploitant
				+ ", snhPulsCode=" + snhPulsCode + ", snhTariefCode=" + snhTariefCode + ", snhBtwCode=" + snhBtwCode
				+ ", snhPlatformId=" + snhPlatformId + "]";
	}

	
	
}
