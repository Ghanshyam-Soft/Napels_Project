package com.kpn.napels.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="NUM_AANGESLOTEN_NR")
public class NumAangeslotenEntity {

	@Id
	@Column(name="ANR_NUMMER_LAAG", columnDefinition = "CHAR")
	private String anrNummerLow;
	
	@Column(name="ANR_CVI_KENMERK")
	private String anrCviKenmerk;

	@Column(name="ANR_CVI_TELCO")
	private String anrCviTelco;

	@Column(name="ANR_HEEFT_CVI_DIENST_JN")
	private String anrHeeftCviDienstJn;

	@Column(name="ANR_HEEFT_CVI_ZM_DIENST_YN")
	private String anrHeeftCviZmDienstYn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ANR_LOGISCH_MUTATIEMOMENT")
	private Date anrLogischMutatiemoment;

	@Column(name="ANR_LRI")
	private String anrLri;

	@Column(name="ANR_MUTATIE_GEBRUIKER_ID")
	private String anrMutatieGebruikerId;

	@Column(name="ANR_NETNUMMER")
	private String anrNetnummer;

	@Column(name="ANR_NUMMER_HOOG")
	private String anrNummerHoog;

	@Column(name="ANR_ROEPNUMMER")
	private String anrRoepnummer;

	@Column(name="ANR_SOORT_DIENST")
	private String anrSoortDienst;

	@Temporal(TemporalType.DATE)
	@Column(name="ANR_TECHNISCH_MUTATIEMOMENT")
	private Date anrTechnischMutatiemoment;
	
	@Column(name="FK_EIGENAAR_NOP_INT_OPER_ID")
	private String operatorId;
	
	@Column(name="FK_DIENST_HST_SPC_ID")
	private String dienstHstSpcId;
	
	@Column(name="FK_DIENST_CGB_CODE")
	private Integer dienstCgbCode;
	
	@Column(name="FK_MOEDER_HST_SPC_ID")
	private String moederHstSpcId;

	@Column(name="FK_MOEDER_CGB_CODE")
	private Integer fkMoedercgbCode;

	@Column(name="FK_NUM_VOIP_PLATFORM_ID")
	private Integer fkPlatformId;
	
	@Column(name="FK_EXPLOIT_NOP_INT_OPER_ID")
	private String fkexploitOperId;
	
	@Column(name="FK_STA_ID")
	private String fkStaId;
	
	@Column(name="FK_SAC_ID")
	private String fkSacId;
	
	
	
	

	public String getAnrNummerLow() {
		return anrNummerLow;
	}



	public void setAnrNummerLow(String anrNummerLow) {
		this.anrNummerLow = anrNummerLow;
	}



	public String getAnrCviKenmerk() {
		return anrCviKenmerk;
	}



	public void setAnrCviKenmerk(String anrCviKenmerk) {
		this.anrCviKenmerk = anrCviKenmerk;
	}



	public String getAnrCviTelco() {
		return anrCviTelco;
	}



	public void setAnrCviTelco(String anrCviTelco) {
		this.anrCviTelco = anrCviTelco;
	}



	public String getAnrHeeftCviDienstJn() {
		return anrHeeftCviDienstJn;
	}



	public void setAnrHeeftCviDienstJn(String anrHeeftCviDienstJn) {
		this.anrHeeftCviDienstJn = anrHeeftCviDienstJn;
	}



	public String getAnrHeeftCviZmDienstYn() {
		return anrHeeftCviZmDienstYn;
	}



	public void setAnrHeeftCviZmDienstYn(String anrHeeftCviZmDienstYn) {
		this.anrHeeftCviZmDienstYn = anrHeeftCviZmDienstYn;
	}



	public Date getAnrLogischMutatiemoment() {
		return anrLogischMutatiemoment;
	}



	public void setAnrLogischMutatiemoment(Date anrLogischMutatiemoment) {
		this.anrLogischMutatiemoment = anrLogischMutatiemoment;
	}



	public String getAnrLri() {
		return anrLri;
	}



	public void setAnrLri(String anrLri) {
		this.anrLri = anrLri;
	}



	public String getAnrMutatieGebruikerId() {
		return anrMutatieGebruikerId;
	}



	public void setAnrMutatieGebruikerId(String anrMutatieGebruikerId) {
		this.anrMutatieGebruikerId = anrMutatieGebruikerId;
	}



	public String getAnrNetnummer() {
		return anrNetnummer;
	}



	public void setAnrNetnummer(String anrNetnummer) {
		this.anrNetnummer = anrNetnummer;
	}



	public String getAnrNummerHoog() {
		return anrNummerHoog;
	}



	public void setAnrNummerHoog(String anrNummerHoog) {
		this.anrNummerHoog = anrNummerHoog;
	}



	public String getAnrRoepnummer() {
		return anrRoepnummer;
	}



	public void setAnrRoepnummer(String anrRoepnummer) {
		this.anrRoepnummer = anrRoepnummer;
	}



	public String getAnrSoortDienst() {
		return anrSoortDienst;
	}



	public void setAnrSoortDienst(String anrSoortDienst) {
		this.anrSoortDienst = anrSoortDienst;
	}



	public Date getAnrTechnischMutatiemoment() {
		return anrTechnischMutatiemoment;
	}



	public void setAnrTechnischMutatiemoment(Date anrTechnischMutatiemoment) {
		this.anrTechnischMutatiemoment = anrTechnischMutatiemoment;
	}



	public String getOperatorId() {
		return operatorId;
	}



	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}



	public String getDienstHstSpcId() {
		return dienstHstSpcId;
	}



	public void setDienstHstSpcId(String dienstHstSpcId) {
		this.dienstHstSpcId = dienstHstSpcId;
	}


	


	public Integer getDienstCgbCode() {
		return dienstCgbCode;
	}



	public void setDienstCgbCode(Integer dienstCgbCode) {
		this.dienstCgbCode = dienstCgbCode;
	}



	public String getMoederHstSpcId() {
		return moederHstSpcId;
	}



	public void setMoederHstSpcId(String moederHstSpcId) {
		this.moederHstSpcId = moederHstSpcId;
	}

	public Integer getFkPlatformId() {
		return fkPlatformId;
	}



	public void setFkPlatformId(Integer fkPlatformId) {
		this.fkPlatformId = fkPlatformId;
	}



	public String getFkexploitOperId() {
		return fkexploitOperId;
	}



	public void setFkexploitOperId(String fkexploitOperId) {
		this.fkexploitOperId = fkexploitOperId;
	}



	public String getFkStaId() {
		return fkStaId;
	}



	public void setFkStaId(String fkStaId) {
		this.fkStaId = fkStaId;
	}

	public String getFkSacId() {
		return fkSacId;
	}



	public void setFkSacId(String fkSacId) {
		this.fkSacId = fkSacId;
	}



	public Integer getFkMoedercgbCode() {
		return fkMoedercgbCode;
	}



	public void setFkMoedercgbCode(Integer fkMoedercgbCode) {
		this.fkMoedercgbCode = fkMoedercgbCode;
	}



	@Override
	public String toString() {
		return "NumAangeslotenEntity [anrNummerLow=" + anrNummerLow + ", anrCviKenmerk=" + anrCviKenmerk
				+ ", anrCviTelco=" + anrCviTelco + ", anrHeeftCviDienstJn=" + anrHeeftCviDienstJn
				+ ", anrHeeftCviZmDienstYn=" + anrHeeftCviZmDienstYn + ", anrLogischMutatiemoment="
				+ anrLogischMutatiemoment + ", anrLri=" + anrLri + ", anrMutatieGebruikerId=" + anrMutatieGebruikerId
				+ ", anrNetnummer=" + anrNetnummer + ", anrNummerHoog=" + anrNummerHoog + ", anrRoepnummer="
				+ anrRoepnummer + ", anrSoortDienst=" + anrSoortDienst + ", anrTechnischMutatiemoment="
				+ anrTechnischMutatiemoment + ", operatorId=" + operatorId + ", dienstHstSpcId=" + dienstHstSpcId
				+ ", dienstCgbCode=" + dienstCgbCode + ", moederHstSpcId=" + moederHstSpcId + ", fkMoedercgbCode="
				+ fkMoedercgbCode + ", fkPlatformId=" + fkPlatformId + ", fkexploitOperId=" + fkexploitOperId
				+ ", fkStaId=" + fkStaId + ", fkSacId=" + fkSacId + "]";
	}



	



	



	

	

	

	
}
