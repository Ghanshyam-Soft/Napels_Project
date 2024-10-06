package com.kpn.napels.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class NumberDetailDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//NUM_AANGESLOTEN_NR table dto
	private String anrNummerLow;
	private String anrNummerHoog;
	private String operatorId;
	private String anrNetnummer;
	private String moederHstSpcId;
	private Date anrLogischMutatiemoment;
	private String fkexploitOperId;
	private String anrSoortDienst;
	private String anrRoepnummer;
	private String anrLri;
	private String anrHeeftCviZmDienstYn;
	private String anrCviTelco;
	private String fkStaId;
	private Integer fkPlatformId;
	private String fkdienstHstSpcId;
	private Integer fkdienstCgbCode;
	private String fkSacId;
	private String anrHeeftCviDienstJn;
	
	//NUM_CENTRALEGEBIED table dto
	private Integer cgbCode;

    private String cgbNaamVerkort;
	private String dienstcgbNaamVerkort;
	private Integer dienstCgbCode;

	private Integer fkBdoNummer;
	
	//NUM_BEDRIJFSONDERDEEL
	
	private Integer bdoNummer;
	private Integer bdoTcdNummer;
	
	//NUM_TOEKENNING
	private String tokTypeToekenning;
	private String tokStatusToekenning;
	private String fkHstSpcId;
	
	//NUM_HOST
	private String dienstHstCentraleEenhNaam;
	private String hstCentraleEenhNaam;
	private String hstSpcId;
	private String toegewezenhstSpcId;
	private String dienstHstSpcId;
	
	//NUM_STATUS
	private String staOmschrijving;
	//NUM_VOIP_PLATFORM
	private String platformOmschrijving;
	private Integer platformId;
	
	//NUM_BESTEMMING
	private String bstId;
	private String bstBestemmingSoort;
	
	//NUM_NETWERK_OPERATOR
	private String nopInterneOperatorId;
	
	//NUM_NETNUMMERGEBIED
	private String naamVerkort;
	
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
	public String getMoederHstSpcId() {
		return moederHstSpcId;
	}
	public void setMoederHstSpcId(String moederHstSpcId) {
		this.moederHstSpcId = moederHstSpcId;
	}
	
	public String getFkexploitOperId() {
		return fkexploitOperId;
	}
	public void setFkexploitOperId(String fkexploitOperId) {
		this.fkexploitOperId = fkexploitOperId;
	}
	public String getHstSpcId() {
		return hstSpcId;
	}
	public void setHstSpcId(String hstSpcId) {
		this.hstSpcId = hstSpcId;
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
	public String getAnrHeeftCviZmDienstYn() {
		return anrHeeftCviZmDienstYn;
	}
	public void setAnrHeeftCviZmDienstYn(String anrHeeftCviZmDienstYn) {
		this.anrHeeftCviZmDienstYn = anrHeeftCviZmDienstYn;
	}
	public String getAnrCviTelco() {
		return anrCviTelco;
	}
	public void setAnrCviTelco(String anrCviTelco) {
		this.anrCviTelco = anrCviTelco;
	}
	
	public String getFkStaId() {
		return fkStaId;
	}
	public void setFkStaId(String fkStaId) {
		this.fkStaId = fkStaId;
	}
	public Integer getFkPlatformId() {
		return fkPlatformId;
	}
	public void setFkPlatformId(Integer fkPlatformId) {
		this.fkPlatformId = fkPlatformId;
	}
	public String getDienstHstSpcId() {
		return dienstHstSpcId;
	}
	public void setDienstHstSpcId(String dienstHstSpcId) {
		this.dienstHstSpcId = dienstHstSpcId;
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
	public Integer getBdoNummer() {
		return bdoNummer;
	}
	public void setBdoNummer(Integer bdoNummer) {
		this.bdoNummer = bdoNummer;
	}
	public Integer getBdoTcdNummer() {
		return bdoTcdNummer;
	}
	public void setBdoTcdNummer(Integer bdoTcdNummer) {
		this.bdoTcdNummer = bdoTcdNummer;
	}
	public String getTokTypeToekenning() {
		return tokTypeToekenning;
	}
	public void setTokTypeToekenning(String tokTypeToekenning) {
		this.tokTypeToekenning = tokTypeToekenning;
	}
	public String getTokStatusToekenning() {
		return tokStatusToekenning;
	}
	public void setTokStatusToekenning(String tokStatusToekenning) {
		this.tokStatusToekenning = tokStatusToekenning;
	}
	public String getFkHstSpcId() {
		return fkHstSpcId;
	}
	public void setFkHstSpcId(String fkHstSpcId) {
		this.fkHstSpcId = fkHstSpcId;
	}
	public String getHstCentraleEenhNaam() {
		return hstCentraleEenhNaam;
	}
	public void setHstCentraleEenhNaam(String hstCentraleEenhNaam) {
		this.hstCentraleEenhNaam = hstCentraleEenhNaam;
	}
	public String getStaOmschrijving() {
		return staOmschrijving;
	}
	public void setStaOmschrijving(String staOmschrijving) {
		this.staOmschrijving = staOmschrijving;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPlatformOmschrijving() {
		return platformOmschrijving;
	}
	public void setPlatformOmschrijving(String platformOmschrijving) {
		this.platformOmschrijving = platformOmschrijving;
	}
	
	public String getFkSacId() {
		return fkSacId;
	}
	public void setFkSacId(String fkSacId) {
		this.fkSacId = fkSacId;
	}
	public Date getAnrLogischMutatiemoment() {
		return anrLogischMutatiemoment;
	}
	public void setAnrLogischMutatiemoment(Date anrLogischMutatiemoment) {
		this.anrLogischMutatiemoment = anrLogischMutatiemoment;
	}
	
	
	public String getAnrHeeftCviDienstJn() {
		return anrHeeftCviDienstJn;
	}
	
	public void setAnrHeeftCviDienstJn(String anrHeeftCviDienstJn) {
		this.anrHeeftCviDienstJn = anrHeeftCviDienstJn;
	}
	public String getNopInterneOperatorId() {
		return nopInterneOperatorId;
	}
	public void setNopInterneOperatorId(String nopInterneOperatorId) {
		this.nopInterneOperatorId = nopInterneOperatorId;
	}
	public Integer getPlatformId() {
		return platformId;
	}
	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}
	public String getBstId() {
		return bstId;
	}
	public void setBstId(String bstId) {
		this.bstId = bstId;
	}
	public String getBstBestemmingSoort() {
		return bstBestemmingSoort;
	}
	public void setBstBestemmingSoort(String bstBestemmingSoort) {
		this.bstBestemmingSoort = bstBestemmingSoort;
	}
	public String getDienstHstCentraleEenhNaam() {
		return dienstHstCentraleEenhNaam;
	}
	public void setDienstHstCentraleEenhNaam(String dienstHstCentraleEenhNaam) {
		this.dienstHstCentraleEenhNaam = dienstHstCentraleEenhNaam;
	}
	public String getNaamVerkort() {
		return naamVerkort;
	}
	public void setNaamVerkort(String naamVerkort) {
		this.naamVerkort = naamVerkort;
	}
	
	public String getDienstcgbNaamVerkort() {
		return dienstcgbNaamVerkort;
	}
	public void setDienstcgbNaamVerkort(String dienstcgbNaamVerkort) {
		this.dienstcgbNaamVerkort = dienstcgbNaamVerkort;
	}
	public String getFkdienstHstSpcId() {
		return fkdienstHstSpcId;
	}
	public void setFkdienstHstSpcId(String fkdienstHstSpcId) {
		this.fkdienstHstSpcId = fkdienstHstSpcId;
	}
	public Integer getFkdienstCgbCode() {
		return fkdienstCgbCode;
	}
	public void setFkdienstCgbCode(Integer fkdienstCgbCode) {
		this.fkdienstCgbCode = fkdienstCgbCode;
	}
	public String getToegewezenhstSpcId() {
		return toegewezenhstSpcId;
	}
	public void setToegewezenhstSpcId(String toegewezenhstSpcId) {
		this.toegewezenhstSpcId = toegewezenhstSpcId;
	}
	public Integer getDienstCgbCode() {
		return dienstCgbCode;
	}
	public void setDienstCgbCode(Integer dienstCgbCode) {
		this.dienstCgbCode = dienstCgbCode;
	}
	
	
	
}
