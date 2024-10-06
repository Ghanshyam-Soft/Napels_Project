package com.kpn.napels.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="NUM_SERVICENUMMER")
public class NumServiceNummerEntity {

	@Id
	@Column(name="SNR_NUMMER_LAAG", columnDefinition = "CHAR")
	private String snrNumberLow;
	
	@Column(name="SNR_NUMMER_HOOG", columnDefinition = "CHAR")
	private String snrNumberHigh;
	
	@Column(name="FK_NOP_INTERNE_OPERATOR_ID",columnDefinition = "CHAR" )
	private String fkNopInterneOpId;
	
	@Column(name="SNR_PULS_CODE")
	private String snrPulsCode;
	
	@Column(name="SNR_TARIEF_CODE",columnDefinition = "CHAR" )
	private String snrTarrifCode;
	
	@Column(name="SNR_BTW_CODE",columnDefinition = "NUMBER" )
	private int snrBtwCode;
	
	@Column(name="SNR_ACCESS_AREA_CODE",columnDefinition = "CHAR" )
	private String snrAccessCode;
	
	
	@Column(name="SNR_GEBRUIKER_ID_MUTATIE_MOMEN",columnDefinition = "CHAR" )
	private String snrGebIdMut;	
	
	@Column(name="SNR_BESTEMMING_ID",columnDefinition = "CHAR" )
	private String snrBestemmingId;	
	
	@Column(name="FK_SAC_ID",columnDefinition = "CHAR" )
	private String fkScId;	
	
	@Column(name="FK_NUM_VOIP_PLATFORM_ID",columnDefinition = "NUMBER" )
	private Integer fkNumVoipPlatformId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SNR_LAATSTE_MUTATIE_MOMENT",columnDefinition="TIMESTAMP")
	private Date snrLaatsteMut;

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

	public String getSnrTarrifCode() {
		return snrTarrifCode;
	}

	public void setSnrTarrifCode(String snrTarrifCode) {
		this.snrTarrifCode = snrTarrifCode;
	}

	public int getSnrBtwCode() {
		return snrBtwCode;
	}

	public void setSnrBtwCode(int snrBtwCode) {
		this.snrBtwCode = snrBtwCode;
	}

	public String getSnrAccessCode() {
		return snrAccessCode;
	}

	public void setSnrAccessCode(String snrAccessCode) {
		this.snrAccessCode = snrAccessCode;
	}

	public String getSnrGebIdMut() {
		return snrGebIdMut;
	}

	public void setSnrGebIdMut(String snrGebIdMut) {
		this.snrGebIdMut = snrGebIdMut;
	}

	public String getSnrBestemmingId() {
		return snrBestemmingId;
	}

	public void setSnrBestemmingId(String snrBestemmingId) {
		this.snrBestemmingId = snrBestemmingId;
	}

	public String getFkScId() {
		return fkScId;
	}

	public void setFkScId(String fkScId) {
		this.fkScId = fkScId;
	}

	public Integer getFkNumVoipPlatformId() {
		return fkNumVoipPlatformId;
	}

	public void setFkNumVoipPlatformId(Integer fkNumVoipPlatformId) {
		this.fkNumVoipPlatformId = fkNumVoipPlatformId;
	}

	public Date getSnrLaatsteMut() {
		return snrLaatsteMut;
	}

	public void setSnrLaatsteMut(Date snrLaatsteMut) {
		this.snrLaatsteMut = snrLaatsteMut;
	}

	@Override
	public String toString() {
		return "NumServiceNummerEntity [snrNumberLow=" + snrNumberLow + ", snrNumberHigh=" + snrNumberHigh
				+ ", fkNopInterneOpId=" + fkNopInterneOpId + ", snrTarrifCode=" + snrTarrifCode + ", snrBtwCode="
				+ snrBtwCode + ", snrAccessCode=" + snrAccessCode + ", snrGebIdMut=" + snrGebIdMut
				+ ", snrBestemmingId=" + snrBestemmingId + ", fkScId=" + fkScId + ", fkNumVoipPlatformId="
				+ fkNumVoipPlatformId + ", snrLaatsteMut=" + snrLaatsteMut + "]";
	}

	public String getSnrPulsCode() {
		return snrPulsCode;
	}

	public void setSnrPulsCode(String snrPulsCode) {
		this.snrPulsCode = snrPulsCode;
	}
	
	
}
