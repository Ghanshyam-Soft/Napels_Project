package com.kpn.napels.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.kpn.napels.entity.NumNummermutatiePKEntity;

public class NummerHistoryDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	//NUM_AANGESLOTEN_NR

	private String anrNummerLow;
	private String anrNummerHoog;
	private String operatorId;
	private String anrNetnummer;
	private String fkexploitOperId;
	private String dienstHstSpcId;
	private Integer dienstCgbCode;
	private String anrSoortDienst;
	private String anrRoepnummer;
	private String anrLri;
	private String anrHeeftCviDienstJn;
	private String anrCviTelco;
	private String fkStaId;
	private Date anrLogischMutatiemoment;
	private String fkSacId;
	private Integer fkPlatformId;

	//NUM_NUMMERMUTATIE

	private NumNummermutatiePKEntity numNummermutatiePK;
	private String nmtMutatielabel;
	private String nmtOperatorExploitantVorig;
	private String nmtVoorkeursSpcId;
	private String nmtInDienstSpcIdVorig;
	private String nmtSoortDienstVorig;
	private String nmtRoepnummer;
	private String nmtLriVorig;
	private String nmtHeeftCviZmYnVorig;
	private String nmtHeeftCviTelcoVorig;
	private BigDecimal nmtPlatformIdVorig;
	private String nmtLaatsteSoortActieCode;
	private String nmtStatusCode;

	//NUM_SOORT_ACTIE
	private String sacOmschrijving;

	//NUM_CENTRALEGEBIED table dto
	private Integer cgbCode;
	private String cgbNaamVerkort;
	private Integer fkBdoNummer;
	
	//NUM_BESTEMMING
	private String bstBestemmingSoort;
	
	//NUM_NETNUMMERGEBIED
	private String netNummer;
	private String naamVerkort;
	
	//NUM_TOEKENNING
	private String tokTypeToekenning;

	//NUM_STATUS
	private String staOmschrijving;
	
	//NUM_VOIP_PLATFORM
	private String platformOmschrijving;

	public String getAnrNummerLow() {
		return anrNummerLow;
	}

	public void setAnrNummerLow(String anrNummerLow) {
		this.anrNummerLow = anrNummerLow;
	}

	public String getAnrNummerHoog() {
		return anrNummerHoog;
	}

	public void setAnrNummerHoog(String anrNummerHoog) {
		this.anrNummerHoog = anrNummerHoog;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getAnrNetnummer() {
		return anrNetnummer;
	}

	public void setAnrNetnummer(String anrNetnummer) {
		this.anrNetnummer = anrNetnummer;
	}

	public String getFkexploitOperId() {
		return fkexploitOperId;
	}

	public void setFkexploitOperId(String fkexploitOperId) {
		this.fkexploitOperId = fkexploitOperId;
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

	public String getAnrSoortDienst() {
		return anrSoortDienst;
	}

	public void setAnrSoortDienst(String anrSoortDienst) {
		this.anrSoortDienst = anrSoortDienst;
	}

	public String getAnrRoepnummer() {
		return anrRoepnummer;
	}

	public void setAnrRoepnummer(String anrRoepnummer) {
		this.anrRoepnummer = anrRoepnummer;
	}

	public String getAnrLri() {
		return anrLri;
	}

	public void setAnrLri(String anrLri) {
		this.anrLri = anrLri;
	}

	public String getAnrHeeftCviDienstJn() {
		return anrHeeftCviDienstJn;
	}

	public void setAnrHeeftCviDienstJn(String anrHeeftCviDienstJn) {
		this.anrHeeftCviDienstJn = anrHeeftCviDienstJn;
	}

	public String getAnrCviTelco() {
		return anrCviTelco;
	}

	public void setAnrCviTelco(String anrCviTelco) {
		this.anrCviTelco = anrCviTelco;
	}

	public NumNummermutatiePKEntity getNumNummermutatiePK() {
		return numNummermutatiePK;
	}
	public void setNumNummermutatiePK(NumNummermutatiePKEntity numNummermutatiePK) {
		this.numNummermutatiePK = numNummermutatiePK;
	}

	public String getNmtMutatielabel() {
		return nmtMutatielabel;
	}

	public void setNmtMutatielabel(String nmtMutatielabel) {
		this.nmtMutatielabel = nmtMutatielabel;
	}

	public String getNmtOperatorExploitantVorig() {
		return nmtOperatorExploitantVorig;
	}

	public void setNmtOperatorExploitantVorig(String nmtOperatorExploitantVorig) {
		this.nmtOperatorExploitantVorig = nmtOperatorExploitantVorig;
	}

	public String getNmtVoorkeursSpcId() {
		return nmtVoorkeursSpcId;
	}

	public void setNmtVoorkeursSpcId(String nmtVoorkeursSpcId) {
		this.nmtVoorkeursSpcId = nmtVoorkeursSpcId;
	}

	public String getNmtInDienstSpcIdVorig() {
		return nmtInDienstSpcIdVorig;
	}

	public void setNmtInDienstSpcIdVorig(String nmtInDienstSpcIdVorig) {
		this.nmtInDienstSpcIdVorig = nmtInDienstSpcIdVorig;
	}

	public String getNmtSoortDienstVorig() {
		return nmtSoortDienstVorig;
	}

	public void setNmtSoortDienstVorig(String nmtSoortDienstVorig) {
		this.nmtSoortDienstVorig = nmtSoortDienstVorig;
	}

	public String getNmtRoepnummer() {
		return nmtRoepnummer;
	}

	public void setNmtRoepnummer(String nmtRoepnummer) {
		this.nmtRoepnummer = nmtRoepnummer;
	}

	public String getNmtLriVorig() {
		return nmtLriVorig;
	}

	public void setNmtLriVorig(String nmtLriVorig) {
		this.nmtLriVorig = nmtLriVorig;
	}

	public String getNmtHeeftCviZmYnVorig() {
		return nmtHeeftCviZmYnVorig;
	}

	public void setNmtHeeftCviZmYnVorig(String nmtHeeftCviZmYnVorig) {
		this.nmtHeeftCviZmYnVorig = nmtHeeftCviZmYnVorig;
	}

	public String getNmtHeeftCviTelcoVorig() {
		return nmtHeeftCviTelcoVorig;
	}

	public void setNmtHeeftCviTelcoVorig(String nmtHeeftCviTelcoVorig) {
		this.nmtHeeftCviTelcoVorig = nmtHeeftCviTelcoVorig;
	}

	public BigDecimal getNmtPlatformIdVorig() {
		return nmtPlatformIdVorig;
	}

	public void setNmtPlatformIdVorig(BigDecimal nmtPlatformIdVorig) {
		this.nmtPlatformIdVorig = nmtPlatformIdVorig;
	}

	public String getNmtLaatsteSoortActieCode() {
		return nmtLaatsteSoortActieCode;
	}

	public void setNmtLaatsteSoortActieCode(String nmtLaatsteSoortActieCode) {
		this.nmtLaatsteSoortActieCode = nmtLaatsteSoortActieCode;
	}

	public String getNmtStatusCode() {
		return nmtStatusCode;
	}

	public void setNmtStatusCode(String nmtStatusCode) {
		this.nmtStatusCode = nmtStatusCode;
	}

	public String getSacOmschrijving() {
		return sacOmschrijving;
	}

	public void setSacOmschrijving(String sacOmschrijving) {
		this.sacOmschrijving = sacOmschrijving;
	}

	public Integer getCgbCode() {
		return cgbCode;
	}

	public void setCgbCode(Integer cgbCode) {
		this.cgbCode = cgbCode;
	}

	public String getCgbNaamVerkort() {
		return cgbNaamVerkort;
	}

	public void setCgbNaamVerkort(String cgbNaamVerkort) {
		this.cgbNaamVerkort = cgbNaamVerkort;
	}

	public Integer getFkBdoNummer() {
		return fkBdoNummer;
	}

	public void setFkBdoNummer(Integer fkBdoNummer) {
		this.fkBdoNummer = fkBdoNummer;
	}

	public String getBstBestemmingSoort() {
		return bstBestemmingSoort;
	}

	public void setBstBestemmingSoort(String bstBestemmingSoort) {
		this.bstBestemmingSoort = bstBestemmingSoort;
	}

	public String getNetNummer() {
		return netNummer;
	}

	public void setNetNummer(String netNummer) {
		this.netNummer = netNummer;
	}

	public String getNaamVerkort() {
		return naamVerkort;
	}

	public void setNaamVerkort(String naamVerkort) {
		this.naamVerkort = naamVerkort;
	}

	public String getTokTypeToekenning() {
		return tokTypeToekenning;
	}

	public void setTokTypeToekenning(String tokTypeToekenning) {
		this.tokTypeToekenning = tokTypeToekenning;
	}

	public String getStaOmschrijving() {
		return staOmschrijving;
	}

	public void setStaOmschrijving(String staOmschrijving) {
		this.staOmschrijving = staOmschrijving;
	}
	public String getFkStaId() {
		return fkStaId;
	}

	public void setFkStaId(String fkStaId) {
		this.fkStaId = fkStaId;
	}

	public Date getAnrLogischMutatiemoment() {
		return anrLogischMutatiemoment;
	}

	public void setAnrLogischMutatiemoment(Date anrLogischMutatiemoment) {
		this.anrLogischMutatiemoment = anrLogischMutatiemoment;
	}

	public String getFkSacId() {
		return fkSacId;
	}

	public void setFkSacId(String fkSacId) {
		this.fkSacId = fkSacId;
	}

	public Integer getFkPlatformId() {
		return fkPlatformId;
	}

	public void setFkPlatformId(Integer fkPlatformId) {
		this.fkPlatformId = fkPlatformId;
	}

	public String getPlatformOmschrijving() {
		return platformOmschrijving;
	}

	public void setPlatformOmschrijving(String platformOmschrijving) {
		this.platformOmschrijving = platformOmschrijving;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NummerHistoryDTO [anrNummerLow=" + anrNummerLow + ", anrNummerHoog=" + anrNummerHoog + ", operatorId="
				+ operatorId + ", anrNetnummer=" + anrNetnummer + ", fkexploitOperId=" + fkexploitOperId
				+ ", dienstHstSpcId=" + dienstHstSpcId + ", dienstCgbCode=" + dienstCgbCode + ", anrSoortDienst="
				+ anrSoortDienst + ", anrRoepnummer=" + anrRoepnummer + ", anrLri=" + anrLri + ", anrHeeftCviDienstJn="
				+ anrHeeftCviDienstJn + ", anrCviTelco=" + anrCviTelco + ", fkStaId=" + fkStaId
				+ ", anrLogischMutatiemoment=" + anrLogischMutatiemoment + ", fkSacId=" + fkSacId + ", fkPlatformId="
				+ fkPlatformId + ", numNummermutatiePK=" + numNummermutatiePK + ", nmtMutatielabel=" + nmtMutatielabel
				+ ", nmtOperatorExploitantVorig=" + nmtOperatorExploitantVorig + ", nmtVoorkeursSpcId="
				+ nmtVoorkeursSpcId + ", nmtInDienstSpcIdVorig=" + nmtInDienstSpcIdVorig + ", nmtSoortDienstVorig="
				+ nmtSoortDienstVorig + ", nmtRoepnummer=" + nmtRoepnummer + ", nmtLriVorig=" + nmtLriVorig
				+ ", nmtHeeftCviZmYnVorig=" + nmtHeeftCviZmYnVorig + ", nmtHeeftCviTelcoVorig=" + nmtHeeftCviTelcoVorig
				+ ", nmtPlatformIdVorig=" + nmtPlatformIdVorig + ", nmtLaatsteSoortActieCode="
				+ nmtLaatsteSoortActieCode + ", nmtStatusCode=" + nmtStatusCode + ", sacOmschrijving=" + sacOmschrijving
				+ ", cgbCode=" + cgbCode + ", cgbNaamVerkort=" + cgbNaamVerkort + ", fkBdoNummer=" + fkBdoNummer
				+ ", bstBestemmingSoort=" + bstBestemmingSoort + ", netNummer=" + netNummer + ", naamVerkort="
				+ naamVerkort + ", tokTypeToekenning=" + tokTypeToekenning + ", staOmschrijving=" + staOmschrijving
				+ ", platformOmschrijving=" + platformOmschrijving + "]";
	}

	

	

	


}
