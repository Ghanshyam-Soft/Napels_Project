package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NUM_NUMMERMUTATIE database table.
 * 
 */
@Entity
@Table(name="NUM_NUMMERMUTATIE")
public class NumNummermutatieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NumNummermutatiePKEntity numNummermutatiePK;

	@Column(name="NMT_BESTEMMING_ID")
	private String nmtBestemmingId;

	@Column(name="NMT_CVI_KENMERK")
	private String nmtCviKenmerk;

	@Column(name="NMT_CVI_KENMERK_VORIG")
	private String nmtCviKenmerkVorig;

	@Column(name="NMT_CVI_TELCO")
	private String nmtCviTelco;

	@Column(name="NMT_HEEFT_CVI_DIENST")
	private String nmtHeeftCviDienst;

	@Column(name="NMT_HEEFT_CVI_DIENST_JN_VORIG")
	private String nmtHeeftCviDienstJnVorig;

	@Column(name="NMT_HEEFT_CVI_TELCO_VORIG")
	private String nmtHeeftCviTelcoVorig;

	@Column(name="NMT_HEEFT_CVI_ZM_DIENST_YN")
	private String nmtHeeftCviZmDienstYn;

	@Column(name="NMT_HEEFT_CVI_ZM_YN_VORIG")
	private String nmtHeeftCviZmYnVorig;

	@Column(name="NMT_IN_DIENST_CGB_CODE")
	private String nmtInDienstCgbCode;

	@Column(name="NMT_IN_DIENST_CGB_CODE_VORIG")
	private String nmtInDienstCgbCodeVorig;

	@Column(name="NMT_IN_DIENST_SPC_ID")
	private String nmtInDienstSpcId;

	@Column(name="NMT_IN_DIENST_SPC_ID_VORIG")
	private String nmtInDienstSpcIdVorig;

	@Column(name="NMT_LAAG_IS_HOOG_JN")
	private String nmtLaagIsHoogJn;

	@Column(name="NMT_LAATSTE_SOORT_ACTIE_CODE", nullable = false)
	private String nmtLaatsteSoortActieCode;

	@Column(name="NMT_LRI")
	private String nmtLri;

	@Column(name="NMT_LRI_VORIG")
	private String nmtLriVorig;

	@Column(name="NMT_MUTATIE_GEBRUIKER_ID", nullable = false)
	private String nmtMutatieGebruikerId;

	@Column(name="NMT_MUTATIELABEL")
	private String nmtMutatielabel;

	@Column(name="NMT_NETNUMMER")
	private String nmtNetnummer;

	@Column(name="NMT_NUMMER_HOOG", nullable = false)
	private String nmtNummerHoog;

	@Column(name="NMT_OPERATOR_EIGENAAR")
	private String nmtOperatorEigenaar;

	@Column(name="NMT_OPERATOR_EXPLOITANT")
	private String nmtOperatorExploitant;

	@Column(name="NMT_OPERATOR_EXPLOITANT_VORIG")
	private String nmtOperatorExploitantVorig;

	@Column(name="NMT_PLATFORM_ID_NIEUW")
	private BigDecimal nmtPlatformIdNieuw;

	@Column(name="NMT_PLATFORM_ID_VORIG")
	private BigDecimal nmtPlatformIdVorig;

	@Column(name="NMT_ROEPNUMMER")
	private String nmtRoepnummer;

	@Column(name="NMT_ROEPNUMMER_VORIG")
	private String nmtRoepnummerVorig;

	@Column(name="NMT_SOORT_DIENST")
	private String nmtSoortDienst;

	@Column(name="NMT_SOORT_DIENST_VORIG")
	private String nmtSoortDienstVorig;

	@Column(name="NMT_STATUS_CODE", nullable = false)
	private String nmtStatusCode;

	@Column(name="NMT_STATUS_TOEKENNING")
	private String nmtStatusToekenning;

	@Column(name="NMT_STATUS_TOEKENNING_VORIG")
	private String nmtStatusToekenningVorig;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="NMT_TECHNISCH_MUTATIEMOMENT", nullable = false)
	private Date nmtTechnischMutatiemoment;

	@Column(name="NMT_TOEK_OF_DIENST_TD")
	private String nmtToekOfDienstTd;

	@Column(name="NMT_TYPE_TOEKENNING")
	private String nmtTypeToekenning;

	@Column(name="NMT_VOORKEURS_CGB_CODE")
	private String nmtVoorkeursCgbCode;

	@Column(name="NMT_VOORKEURS_CGB_CODE_VORIG")
	private String nmtVoorkeursCgbCodeVorig;

	@Column(name="NMT_VOORKEURS_SPC_ID")
	private String nmtVoorkeursSpcId;

	@Column(name="NMT_VOORKEURS_SPC_ID_VORIG")
	private String nmtVoorkeursSpcIdVorig;

	public NumNummermutatieEntity() {
	}

	public NumNummermutatiePKEntity getNumNummermutatiePK() {
		return numNummermutatiePK;
	}

	public void setNumNummermutatiePK(NumNummermutatiePKEntity numNummermutatiePK) {
		this.numNummermutatiePK = numNummermutatiePK;
	}

	public String getNmtBestemmingId() {
		return this.nmtBestemmingId;
	}

	public void setNmtBestemmingId(String nmtBestemmingId) {
		this.nmtBestemmingId = nmtBestemmingId;
	}

	public String getNmtCviKenmerk() {
		return this.nmtCviKenmerk;
	}

	public void setNmtCviKenmerk(String nmtCviKenmerk) {
		this.nmtCviKenmerk = nmtCviKenmerk;
	}

	public String getNmtCviKenmerkVorig() {
		return this.nmtCviKenmerkVorig;
	}

	public void setNmtCviKenmerkVorig(String nmtCviKenmerkVorig) {
		this.nmtCviKenmerkVorig = nmtCviKenmerkVorig;
	}

	public String getNmtCviTelco() {
		return this.nmtCviTelco;
	}

	public void setNmtCviTelco(String nmtCviTelco) {
		this.nmtCviTelco = nmtCviTelco;
	}

	public String getNmtHeeftCviDienst() {
		return this.nmtHeeftCviDienst;
	}

	public void setNmtHeeftCviDienst(String nmtHeeftCviDienst) {
		this.nmtHeeftCviDienst = nmtHeeftCviDienst;
	}

	public String getNmtHeeftCviDienstJnVorig() {
		return this.nmtHeeftCviDienstJnVorig;
	}

	public void setNmtHeeftCviDienstJnVorig(String nmtHeeftCviDienstJnVorig) {
		this.nmtHeeftCviDienstJnVorig = nmtHeeftCviDienstJnVorig;
	}

	public String getNmtHeeftCviTelcoVorig() {
		return this.nmtHeeftCviTelcoVorig;
	}

	public void setNmtHeeftCviTelcoVorig(String nmtHeeftCviTelcoVorig) {
		this.nmtHeeftCviTelcoVorig = nmtHeeftCviTelcoVorig;
	}

	public String getNmtHeeftCviZmDienstYn() {
		return this.nmtHeeftCviZmDienstYn;
	}

	public void setNmtHeeftCviZmDienstYn(String nmtHeeftCviZmDienstYn) {
		this.nmtHeeftCviZmDienstYn = nmtHeeftCviZmDienstYn;
	}

	public String getNmtHeeftCviZmYnVorig() {
		return this.nmtHeeftCviZmYnVorig;
	}

	public void setNmtHeeftCviZmYnVorig(String nmtHeeftCviZmYnVorig) {
		this.nmtHeeftCviZmYnVorig = nmtHeeftCviZmYnVorig;
	}

	public String getNmtInDienstCgbCode() {
		return this.nmtInDienstCgbCode;
	}

	public void setNmtInDienstCgbCode(String nmtInDienstCgbCode) {
		this.nmtInDienstCgbCode = nmtInDienstCgbCode;
	}

	public String getNmtInDienstCgbCodeVorig() {
		return this.nmtInDienstCgbCodeVorig;
	}

	public void setNmtInDienstCgbCodeVorig(String nmtInDienstCgbCodeVorig) {
		this.nmtInDienstCgbCodeVorig = nmtInDienstCgbCodeVorig;
	}

	public String getNmtInDienstSpcId() {
		return this.nmtInDienstSpcId;
	}

	public void setNmtInDienstSpcId(String nmtInDienstSpcId) {
		this.nmtInDienstSpcId = nmtInDienstSpcId;
	}

	public String getNmtInDienstSpcIdVorig() {
		return this.nmtInDienstSpcIdVorig;
	}

	public void setNmtInDienstSpcIdVorig(String nmtInDienstSpcIdVorig) {
		this.nmtInDienstSpcIdVorig = nmtInDienstSpcIdVorig;
	}

	public String getNmtLaagIsHoogJn() {
		return this.nmtLaagIsHoogJn;
	}

	public void setNmtLaagIsHoogJn(String nmtLaagIsHoogJn) {
		this.nmtLaagIsHoogJn = nmtLaagIsHoogJn;
	}

	public String getNmtLaatsteSoortActieCode() {
		return this.nmtLaatsteSoortActieCode;
	}

	public void setNmtLaatsteSoortActieCode(String nmtLaatsteSoortActieCode) {
		this.nmtLaatsteSoortActieCode = nmtLaatsteSoortActieCode;
	}

	public String getNmtLri() {
		return this.nmtLri;
	}

	public void setNmtLri(String nmtLri) {
		this.nmtLri = nmtLri;
	}

	public String getNmtLriVorig() {
		return this.nmtLriVorig;
	}

	public void setNmtLriVorig(String nmtLriVorig) {
		this.nmtLriVorig = nmtLriVorig;
	}

	public String getNmtMutatieGebruikerId() {
		return this.nmtMutatieGebruikerId;
	}

	public void setNmtMutatieGebruikerId(String nmtMutatieGebruikerId) {
		this.nmtMutatieGebruikerId = nmtMutatieGebruikerId;
	}

	public String getNmtMutatielabel() {
		return this.nmtMutatielabel;
	}

	public void setNmtMutatielabel(String nmtMutatielabel) {
		this.nmtMutatielabel = nmtMutatielabel;
	}

	public String getNmtNetnummer() {
		return this.nmtNetnummer;
	}

	public void setNmtNetnummer(String nmtNetnummer) {
		this.nmtNetnummer = nmtNetnummer;
	}

	public String getNmtNummerHoog() {
		return this.nmtNummerHoog;
	}

	public void setNmtNummerHoog(String nmtNummerHoog) {
		this.nmtNummerHoog = nmtNummerHoog;
	}

	public String getNmtOperatorEigenaar() {
		return this.nmtOperatorEigenaar;
	}

	public void setNmtOperatorEigenaar(String nmtOperatorEigenaar) {
		this.nmtOperatorEigenaar = nmtOperatorEigenaar;
	}

	public String getNmtOperatorExploitant() {
		return this.nmtOperatorExploitant;
	}

	public void setNmtOperatorExploitant(String nmtOperatorExploitant) {
		this.nmtOperatorExploitant = nmtOperatorExploitant;
	}

	public String getNmtOperatorExploitantVorig() {
		return this.nmtOperatorExploitantVorig;
	}

	public void setNmtOperatorExploitantVorig(String nmtOperatorExploitantVorig) {
		this.nmtOperatorExploitantVorig = nmtOperatorExploitantVorig;
	}

	public BigDecimal getNmtPlatformIdNieuw() {
		return this.nmtPlatformIdNieuw;
	}

	public void setNmtPlatformIdNieuw(BigDecimal nmtPlatformIdNieuw) {
		this.nmtPlatformIdNieuw = nmtPlatformIdNieuw;
	}

	public BigDecimal getNmtPlatformIdVorig() {
		return this.nmtPlatformIdVorig;
	}

	public void setNmtPlatformIdVorig(BigDecimal nmtPlatformIdVorig) {
		this.nmtPlatformIdVorig = nmtPlatformIdVorig;
	}

	public String getNmtRoepnummer() {
		return this.nmtRoepnummer;
	}

	public void setNmtRoepnummer(String nmtRoepnummer) {
		this.nmtRoepnummer = nmtRoepnummer;
	}

	public String getNmtRoepnummerVorig() {
		return this.nmtRoepnummerVorig;
	}

	public void setNmtRoepnummerVorig(String nmtRoepnummerVorig) {
		this.nmtRoepnummerVorig = nmtRoepnummerVorig;
	}

	public String getNmtSoortDienst() {
		return this.nmtSoortDienst;
	}

	public void setNmtSoortDienst(String nmtSoortDienst) {
		this.nmtSoortDienst = nmtSoortDienst;
	}

	public String getNmtSoortDienstVorig() {
		return this.nmtSoortDienstVorig;
	}

	public void setNmtSoortDienstVorig(String nmtSoortDienstVorig) {
		this.nmtSoortDienstVorig = nmtSoortDienstVorig;
	}

	public String getNmtStatusCode() {
		return this.nmtStatusCode;
	}

	public void setNmtStatusCode(String nmtStatusCode) {
		this.nmtStatusCode = nmtStatusCode;
	}

	public String getNmtStatusToekenning() {
		return this.nmtStatusToekenning;
	}

	public void setNmtStatusToekenning(String nmtStatusToekenning) {
		this.nmtStatusToekenning = nmtStatusToekenning;
	}

	public String getNmtStatusToekenningVorig() {
		return this.nmtStatusToekenningVorig;
	}

	public void setNmtStatusToekenningVorig(String nmtStatusToekenningVorig) {
		this.nmtStatusToekenningVorig = nmtStatusToekenningVorig;
	}

	public Date getNmtTechnischMutatiemoment() {
		return this.nmtTechnischMutatiemoment;
	}

	public void setNmtTechnischMutatiemoment(Date nmtTechnischMutatiemoment) {
		this.nmtTechnischMutatiemoment = nmtTechnischMutatiemoment;
	}

	public String getNmtToekOfDienstTd() {
		return this.nmtToekOfDienstTd;
	}

	public void setNmtToekOfDienstTd(String nmtToekOfDienstTd) {
		this.nmtToekOfDienstTd = nmtToekOfDienstTd;
	}

	public String getNmtTypeToekenning() {
		return this.nmtTypeToekenning;
	}

	public void setNmtTypeToekenning(String nmtTypeToekenning) {
		this.nmtTypeToekenning = nmtTypeToekenning;
	}

	public String getNmtVoorkeursCgbCode() {
		return this.nmtVoorkeursCgbCode;
	}

	public void setNmtVoorkeursCgbCode(String nmtVoorkeursCgbCode) {
		this.nmtVoorkeursCgbCode = nmtVoorkeursCgbCode;
	}

	public String getNmtVoorkeursCgbCodeVorig() {
		return this.nmtVoorkeursCgbCodeVorig;
	}

	public void setNmtVoorkeursCgbCodeVorig(String nmtVoorkeursCgbCodeVorig) {
		this.nmtVoorkeursCgbCodeVorig = nmtVoorkeursCgbCodeVorig;
	}

	public String getNmtVoorkeursSpcId() {
		return this.nmtVoorkeursSpcId;
	}

	public void setNmtVoorkeursSpcId(String nmtVoorkeursSpcId) {
		this.nmtVoorkeursSpcId = nmtVoorkeursSpcId;
	}

	public String getNmtVoorkeursSpcIdVorig() {
		return this.nmtVoorkeursSpcIdVorig;
	}

	public void setNmtVoorkeursSpcIdVorig(String nmtVoorkeursSpcIdVorig) {
		this.nmtVoorkeursSpcIdVorig = nmtVoorkeursSpcIdVorig;
	}

	@Override
	public String toString() {
		return "NumNummermutatie [numNummermutatiePK=" + numNummermutatiePK + ", nmtBestemmingId=" + nmtBestemmingId
				+ ", nmtCviKenmerk=" + nmtCviKenmerk + ", nmtCviKenmerkVorig=" + nmtCviKenmerkVorig + ", nmtCviTelco="
				+ nmtCviTelco + ", nmtHeeftCviDienst=" + nmtHeeftCviDienst + ", nmtHeeftCviDienstJnVorig="
				+ nmtHeeftCviDienstJnVorig + ", nmtHeeftCviTelcoVorig=" + nmtHeeftCviTelcoVorig
				+ ", nmtHeeftCviZmDienstYn=" + nmtHeeftCviZmDienstYn + ", nmtHeeftCviZmYnVorig=" + nmtHeeftCviZmYnVorig
				+ ", nmtInDienstCgbCode=" + nmtInDienstCgbCode + ", nmtInDienstCgbCodeVorig=" + nmtInDienstCgbCodeVorig
				+ ", nmtInDienstSpcId=" + nmtInDienstSpcId + ", nmtInDienstSpcIdVorig=" + nmtInDienstSpcIdVorig
				+ ", nmtLaagIsHoogJn=" + nmtLaagIsHoogJn + ", nmtLaatsteSoortActieCode=" + nmtLaatsteSoortActieCode
				+ ", nmtLri=" + nmtLri + ", nmtLriVorig=" + nmtLriVorig + ", nmtMutatieGebruikerId="
				+ nmtMutatieGebruikerId + ", nmtMutatielabel=" + nmtMutatielabel + ", nmtNetnummer=" + nmtNetnummer
				+ ", nmtNummerHoog=" + nmtNummerHoog + ", nmtOperatorEigenaar=" + nmtOperatorEigenaar
				+ ", nmtOperatorExploitant=" + nmtOperatorExploitant + ", nmtOperatorExploitantVorig="
				+ nmtOperatorExploitantVorig + ", nmtPlatformIdNieuw=" + nmtPlatformIdNieuw + ", nmtPlatformIdVorig="
				+ nmtPlatformIdVorig + ", nmtRoepnummer=" + nmtRoepnummer + ", nmtRoepnummerVorig=" + nmtRoepnummerVorig
				+ ", nmtSoortDienst=" + nmtSoortDienst + ", nmtSoortDienstVorig=" + nmtSoortDienstVorig
				+ ", nmtStatusCode=" + nmtStatusCode + ", nmtStatusToekenning=" + nmtStatusToekenning
				+ ", nmtStatusToekenningVorig=" + nmtStatusToekenningVorig + ", nmtTechnischMutatiemoment="
				+ nmtTechnischMutatiemoment + ", nmtToekOfDienstTd=" + nmtToekOfDienstTd + ", nmtTypeToekenning="
				+ nmtTypeToekenning + ", nmtVoorkeursCgbCode=" + nmtVoorkeursCgbCode + ", nmtVoorkeursCgbCodeVorig="
				+ nmtVoorkeursCgbCodeVorig + ", nmtVoorkeursSpcId=" + nmtVoorkeursSpcId + ", nmtVoorkeursSpcIdVorig="
				+ nmtVoorkeursSpcIdVorig + "]";
	}

}