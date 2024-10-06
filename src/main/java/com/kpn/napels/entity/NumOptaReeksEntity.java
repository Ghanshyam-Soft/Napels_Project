package com.kpn.napels.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NUM_OPTA_REEKS")
public class NumOptaReeksEntity {

	@Id
	@Column(name="OPR_TELEFOONNUMMER_STERNOTATIE")
	private String oprTeleNummerSter;
	
	@Column(name="OPR_NETNUMMER")
	private String oprNetNummer;
	
	@Column(name="DN_BSK_BESCHIKKINGSNUMMER")
	private String dnBsk;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DN_BSK_BESCHIKKINGSDATUM")
	private Date dnBskDatum;
	
	@Column(name="DN_BSK_GELDIGHEIDSDATUM")
	private Date dnBskGeld;
	
	@Column(name="OPR_PLANPERIODE")
	private String oprPlan;
	
	@Column(name="OPR_IS_DEFINITIEF_JN")
	private String oprIsDef;
	
	@Column(name="OPR_CREATIE_GEBRUIKER_ID")
	private String oprCreatie;
	
	@Temporal(TemporalType.DATE)
	@Column(name="OPR_CREATIE_DATUM_TIJD")
	private Date oprCreatieDatum;
	
	@Column(name="OPR_MUTATIE_GEBRUIKER_ID")
	private String oprMutGeb;
	
	@Column(name="OPR_MUTATIE_DATUM_TIJD")
	private Date oprMutDatTijd;
	
	@Column(name="FK_BSK_ID", columnDefinition = "NUMBER")
	private long fkBskId;
	
	@ManyToOne
	@JoinColumn(name="FK_BSK_ID",insertable = false, updatable = false)
	private NumBeschikkingEntity numBeschikking;
	

	public String getOprTeleNummerSter() {
		return oprTeleNummerSter;
	}

	public void setOprTeleNummerSter(String oprTeleNummerSter) {
		this.oprTeleNummerSter = oprTeleNummerSter;
	}

	public String getOprNetNummer() {
		return oprNetNummer;
	}

	public void setOprNetNummer(String oprNetNummer) {
		this.oprNetNummer = oprNetNummer;
	}

	public String getDnBsk() {
		return dnBsk;
	}

	public void setDnBsk(String dnBsk) {
		this.dnBsk = dnBsk;
	}

	public Date getDnBskDatum() {
		return dnBskDatum;
	}

	public void setDnBskDatum(Date dnBskDatum) {
		this.dnBskDatum = dnBskDatum;
	}

	public Date getDnBskGeld() {
		return dnBskGeld;
	}

	public void setDnBskGeld(Date dnBskGeld) {
		this.dnBskGeld = dnBskGeld;
	}

	public String getOprPlan() {
		return oprPlan;
	}

	public void setOprPlan(String oprPlan) {
		this.oprPlan = oprPlan;
	}

	public String getOprIsDef() {
		return oprIsDef;
	}

	public void setOprIsDef(String oprIsDef) {
		this.oprIsDef = oprIsDef;
	}

	public String getOprCreatie() {
		return oprCreatie;
	}

	public void setOprCreatie(String oprCreatie) {
		this.oprCreatie = oprCreatie;
	}

	public Date getOprCreatieDatum() {
		return oprCreatieDatum;
	}

	public void setOprCreatieDatum(Date oprCreatieDatum) {
		this.oprCreatieDatum = oprCreatieDatum;
	}

	public String getOprMutGeb() {
		return oprMutGeb;
	}

	public void setOprMutGeb(String oprMutGeb) {
		this.oprMutGeb = oprMutGeb;
	}

	public Date getOprMutDatTijd() {
		return oprMutDatTijd;
	}

	public void setOprMutDatTijd(Date oprMutDatTijd) {
		this.oprMutDatTijd = oprMutDatTijd;
	}

	public long getFkBskId() {
		return fkBskId;
	}

	public void setFkBskId(long fkBskId) {
		this.fkBskId = fkBskId;
	}
	
	

	public NumBeschikkingEntity getNumBeschikking() {
		return numBeschikking;
	}

	public void setNumBeschikking(NumBeschikkingEntity numBeschikking) {
		this.numBeschikking = numBeschikking;
	}

	@Override
	public String toString() {
		return "NumOptaReeksEntity [oprTeleNummerSter=" + oprTeleNummerSter + ", oprNetNummer=" + oprNetNummer
				+ ", dnBsk=" + dnBsk + ", dnBskDatum=" + dnBskDatum + ", dnBskGeld=" + dnBskGeld + ", oprPlan="
				+ oprPlan + ", oprIsDef=" + oprIsDef + ", oprCreatie=" + oprCreatie + ", oprCreatieDatum="
				+ oprCreatieDatum + ", oprMutGeb=" + oprMutGeb + ", oprMutDatTijd=" + oprMutDatTijd + ", fkBskId="
				+ fkBskId + ", numBeschikking=" + numBeschikking + "]";
	}

	
	
	
	
}
