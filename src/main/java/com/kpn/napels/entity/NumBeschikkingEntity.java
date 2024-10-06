package com.kpn.napels.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NUM_BESCHIKKING")
public class NumBeschikkingEntity {

	@Id
	@Column(name="BSK_ID")
	private long bskId;

	@Temporal(TemporalType.DATE)
	@Column(name="BSK_BESCHIKKINGSDATUM")
	private Date bskBeschikkingsdatum;

	@Column(name="BSK_BESCHIKKINGSNUMMER")
	private String bskBeschikkingsnummer;

	@Column(name="BSK_BESTEMMING_SOORT")
	private String bskBestemmingSoort;

	@Temporal(TemporalType.DATE)
	@Column(name="BSK_CREATIE_DATUM_TIJD")
	private Date bskCreatieDatumTijd;

	@Column(name="BSK_CREATIE_GEBRUIKER_ID")
	private String bskCreatieGebruikerId;

	@Temporal(TemporalType.DATE)
	@Column(name="BSK_GELDIGHEIDSDATUM")
	private Date bskGeldigheidsdatum;

	@Column(name="BSK_INTERNE_OPERATOR_ID")
	private String bskInterneOperatorId;

	@Temporal(TemporalType.DATE)
	@Column(name="BSK_MUTATIE_DATUM_TIJD")
	private Date bskMutatieDatumTijd;

	@Column(name="BSK_MUTATIE_GEBRUIKER_ID")
	private String bskMutatieGebruikerId;

	public long getBskId() {
		return bskId;
	}

	public void setBskId(long bskId) {
		this.bskId = bskId;
	}

	public Date getBskBeschikkingsdatum() {
		return bskBeschikkingsdatum;
	}

	public void setBskBeschikkingsdatum(Date bskBeschikkingsdatum) {
		this.bskBeschikkingsdatum = bskBeschikkingsdatum;
	}

	public String getBskBeschikkingsnummer() {
		return bskBeschikkingsnummer;
	}

	public void setBskBeschikkingsnummer(String bskBeschikkingsnummer) {
		this.bskBeschikkingsnummer = bskBeschikkingsnummer;
	}

	public String getBskBestemmingSoort() {
		return bskBestemmingSoort;
	}

	public void setBskBestemmingSoort(String bskBestemmingSoort) {
		this.bskBestemmingSoort = bskBestemmingSoort;
	}

	public Date getBskCreatieDatumTijd() {
		return bskCreatieDatumTijd;
	}

	public void setBskCreatieDatumTijd(Date bskCreatieDatumTijd) {
		this.bskCreatieDatumTijd = bskCreatieDatumTijd;
	}

	public String getBskCreatieGebruikerId() {
		return bskCreatieGebruikerId;
	}

	public void setBskCreatieGebruikerId(String bskCreatieGebruikerId) {
		this.bskCreatieGebruikerId = bskCreatieGebruikerId;
	}

	public Date getBskGeldigheidsdatum() {
		return bskGeldigheidsdatum;
	}

	public void setBskGeldigheidsdatum(Date bskGeldigheidsdatum) {
		this.bskGeldigheidsdatum = bskGeldigheidsdatum;
	}

	public String getBskInterneOperatorId() {
		return bskInterneOperatorId;
	}

	public void setBskInterneOperatorId(String bskInterneOperatorId) {
		this.bskInterneOperatorId = bskInterneOperatorId;
	}

	public Date getBskMutatieDatumTijd() {
		return bskMutatieDatumTijd;
	}

	public void setBskMutatieDatumTijd(Date bskMutatieDatumTijd) {
		this.bskMutatieDatumTijd = bskMutatieDatumTijd;
	}

	public String getBskMutatieGebruikerId() {
		return bskMutatieGebruikerId;
	}

	public void setBskMutatieGebruikerId(String bskMutatieGebruikerId) {
		this.bskMutatieGebruikerId = bskMutatieGebruikerId;
	}

	@Override
	public String toString() {
		return "NumBeschikkingEntity [bskId=" + bskId + ", bskBeschikkingsdatum=" + bskBeschikkingsdatum
				+ ", bskBeschikkingsnummer=" + bskBeschikkingsnummer + ", bskBestemmingSoort=" + bskBestemmingSoort
				+ ", bskCreatieDatumTijd=" + bskCreatieDatumTijd + ", bskCreatieGebruikerId=" + bskCreatieGebruikerId
				+ ", bskGeldigheidsdatum=" + bskGeldigheidsdatum + ", bskInterneOperatorId=" + bskInterneOperatorId
				+ ", bskMutatieDatumTijd=" + bskMutatieDatumTijd + ", bskMutatieGebruikerId=" + bskMutatieGebruikerId
				+ "]";
	}
	
	
}
