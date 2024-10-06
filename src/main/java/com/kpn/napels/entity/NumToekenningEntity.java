package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NUM_TOEKENNING database table.
 * 
 */
@Entity
@Table(name="NUM_TOEKENNING")
public class NumToekenningEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TOK_NUMMER_LAAG")
	private String tokNummerLaag;
	
	@Column(name="TOK_NUMMER_HOOG")
	private String tokNummerHoog;
	
	@Column(name="TOK_NETNUMMER")
	private String tokNetnummer;

	@Column(name="FK_HST_SPC_ID")
	private String fkHstSpcId;
	
	@Column(name="FK_CGB_CODE")
	private Integer fkCgbCode;
	
	@Column(name="TOK_TYPE_TOEKENNING")
	private String tokTypeToekenning;
	
	@Column(name="TOK_STATUS_TOEKENNING")
	private String tokStatusToekenning;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TOK_CREATIE_DATUM_TIJD")
	private Date tokCreatieDatumTijd;

	@Column(name="TOK_CREATIE_GEBRUIKER_ID")
	private String tokCreatieGebruikerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TOK_MUTATIE_DATUM_TIJD")
	private Date tokMutatieDatumTijd;

	@Column(name="TOK_MUTATIE_GEBRUIKER_ID")
	private String tokMutatieGebruikerId;	

	public NumToekenningEntity() {
	}

	public String getTokNummerLaag() {
		return this.tokNummerLaag;
	}

	public void setTokNummerLaag(String tokNummerLaag) {
		this.tokNummerLaag = tokNummerLaag;
	}

	

	public String getFkHstSpcId() {
		return this.fkHstSpcId;
	}

	public void setFkHstSpcId(String fkHstSpcId) {
		this.fkHstSpcId = fkHstSpcId;
	}

	public Date getTokCreatieDatumTijd() {
		return this.tokCreatieDatumTijd;
	}

	public void setTokCreatieDatumTijd(Date tokCreatieDatumTijd) {
		this.tokCreatieDatumTijd = tokCreatieDatumTijd;
	}

	public String getTokCreatieGebruikerId() {
		return this.tokCreatieGebruikerId;
	}

	public void setTokCreatieGebruikerId(String tokCreatieGebruikerId) {
		this.tokCreatieGebruikerId = tokCreatieGebruikerId;
	}

	public Date getTokMutatieDatumTijd() {
		return this.tokMutatieDatumTijd;
	}

	public void setTokMutatieDatumTijd(Date tokMutatieDatumTijd) {
		this.tokMutatieDatumTijd = tokMutatieDatumTijd;
	}

	public String getTokMutatieGebruikerId() {
		return this.tokMutatieGebruikerId;
	}

	public void setTokMutatieGebruikerId(String tokMutatieGebruikerId) {
		this.tokMutatieGebruikerId = tokMutatieGebruikerId;
	}

	public String getTokNetnummer() {
		return this.tokNetnummer;
	}

	public void setTokNetnummer(String tokNetnummer) {
		this.tokNetnummer = tokNetnummer;
	}

	public Integer getFkCgbCode() {
		return fkCgbCode;
	}

	public void setFkCgbCode(Integer fkCgbCode) {
		this.fkCgbCode = fkCgbCode;
	}

	public String getTokNummerHoog() {
		return this.tokNummerHoog;
	}

	public void setTokNummerHoog(String tokNummerHoog) {
		this.tokNummerHoog = tokNummerHoog;
	}

	public String getTokStatusToekenning() {
		return this.tokStatusToekenning;
	}

	public void setTokStatusToekenning(String tokStatusToekenning) {
		this.tokStatusToekenning = tokStatusToekenning;
	}

	public String getTokTypeToekenning() {
		return this.tokTypeToekenning;
	}

	public void setTokTypeToekenning(String tokTypeToekenning) {
		this.tokTypeToekenning = tokTypeToekenning;
	}

	@Override
	public String toString() {
		return "NumToekenning [tokNummerLaag=" + tokNummerLaag + ", tokNummerHoog=" + tokNummerHoog + ", tokNetnummer="
				+ tokNetnummer + ", fkHstSpcId=" + fkHstSpcId + ", fkCgbCode=" + fkCgbCode + ", tokTypeToekenning="
				+ tokTypeToekenning + ", tokStatusToekenning=" + tokStatusToekenning + ", tokCreatieDatumTijd="
				+ tokCreatieDatumTijd + ", tokCreatieGebruikerId=" + tokCreatieGebruikerId + ", tokMutatieDatumTijd="
				+ tokMutatieDatumTijd + ", tokMutatieGebruikerId=" + tokMutatieGebruikerId + "]";
	}

}