package com.kpn.napels.dto;

import java.io.Serializable;

public class NummerDetailResponseDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nummerLaag;
	private String nummerHoog;
	private String bestemming;
	private String oorsproperator;
	private String netnummergebied;
	private String typeToekenning;
	private String oorspronkelijkeSpcId;
	private String oorsprCentrEenhNaam;
	private String oorspronkelijkeCGB;
	private String statusCentraleNummerserie;
	private String initieleTCRCode;
	private String mutatiedatumtijd;
	private String status;
	private String platform;
	private String huidigeOperator;
	private String huidigeSpcId;
	private String huidigeCentrEenhNaam;
	private String huidigeCGB;
	private String soortDienst;
	private String roepnummer;
	private String LRI;
	private String huidigeTCDcode;
	private String huidigeTCRcode;
	private String heeftCVI;
	private String CVITelco;
	
	public String getNummerLaag() {
		return nummerLaag;
	}
	public void setNummerLaag(String nummerLaag) {
		this.nummerLaag = nummerLaag;
	}
	public String getNummerHoog() {
		return nummerHoog;
	}
	public void setNummerHoog(String nummerHoog) {
		this.nummerHoog = nummerHoog;
	}
	public String getBestemming() {
		return bestemming;
	}
	public void setBestemming(String bestemming) {
		this.bestemming = bestemming;
	}
	public String getOorsproperator() {
		return oorsproperator;
	}
	public void setOorsproperator(String oorsproperator) {
		this.oorsproperator = oorsproperator;
	}
	public String getNetnummergebied() {
		return netnummergebied;
	}
	public void setNetnummergebied(String netnummergebied) {
		this.netnummergebied = netnummergebied;
	}
	public String getTypeToekenning() {
		return typeToekenning;
	}
	public void setTypeToekenning(String typeToekenning) {
		this.typeToekenning = typeToekenning;
	}
	public String getOorspronkelijkeSpcId() {
		return oorspronkelijkeSpcId;
	}
	public void setOorspronkelijkeSpcId(String oorspronkelijkeSpcId) {
		this.oorspronkelijkeSpcId = oorspronkelijkeSpcId;
	}
	public String getOorsprCentrEenhNaam() {
		return oorsprCentrEenhNaam;
	}
	public void setOorsprCentrEenhNaam(String oorsprCentrEenhNaam) {
		this.oorsprCentrEenhNaam = oorsprCentrEenhNaam;
	}
	public String getOorspronkelijkeCGB() {
		return oorspronkelijkeCGB;
	}
	public void setOorspronkelijkeCGB(String oorspronkelijkeCGB) {
		this.oorspronkelijkeCGB = oorspronkelijkeCGB;
	}
	public String getStatusCentraleNummerserie() {
		return statusCentraleNummerserie;
	}
	public void setStatusCentraleNummerserie(String statusCentraleNummerserie) {
		this.statusCentraleNummerserie = statusCentraleNummerserie;
	}
	public String getInitieleTCRCode() {
		return initieleTCRCode;
	}
	public void setInitieleTCRCode(String initieleTCRCode) {
		this.initieleTCRCode = initieleTCRCode;
	}
	public String getMutatiedatumtijd() {
		return mutatiedatumtijd;
	}
	public void setMutatiedatumtijd(String mutatiedatumtijd) {
		this.mutatiedatumtijd = mutatiedatumtijd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getHuidigeOperator() {
		return huidigeOperator;
	}
	public void setHuidigeOperator(String huidigeOperator) {
		this.huidigeOperator = huidigeOperator;
	}
	public String getHuidigeSpcId() {
		return huidigeSpcId;
	}
	public void setHuidigeSpcId(String huidigeSpcId) {
		this.huidigeSpcId = huidigeSpcId;
	}
	public String getHuidigeCentrEenhNaam() {
		return huidigeCentrEenhNaam;
	}
	public void setHuidigeCentrEenhNaam(String huidigeCentrEenhNaam) {
		this.huidigeCentrEenhNaam = huidigeCentrEenhNaam;
	}
	public String getHuidigeCGB() {
		return huidigeCGB;
	}
	public void setHuidigeCGB(String huidigeCGB) {
		this.huidigeCGB = huidigeCGB;
	}
	public String getSoortDienst() {
		return soortDienst;
	}
	public void setSoortDienst(String soortDienst) {
		this.soortDienst = soortDienst;
	}
	public String getRoepnummer() {
		return roepnummer;
	}
	public void setRoepnummer(String roepnummer) {
		this.roepnummer = roepnummer;
	}
	public String getLRI() {
		return LRI;
	}
	public void setLRI(String lRI) {
		LRI = lRI;
	}
	public String getHuidigeTCDcode() {
		return huidigeTCDcode;
	}
	public void setHuidigeTCDcode(String huidigeTCDcode) {
		this.huidigeTCDcode = huidigeTCDcode;
	}
	public String getHuidigeTCRcode() {
		return huidigeTCRcode;
	}
	public void setHuidigeTCRcode(String huidigeTCRcode) {
		this.huidigeTCRcode = huidigeTCRcode;
	}
	public String getHeeftCVI() {
		return heeftCVI;
	}
	public void setHeeftCVI(String heeftCVI) {
		this.heeftCVI = heeftCVI;
	}
	public String getCVITelco() {
		return CVITelco;
	}
	public void setCVITelco(String cVITelco) {
		CVITelco = cVITelco;
	}
	@Override
	public String toString() {
		return "NummerDetailResponseDTO [nummerLaag=" + nummerLaag + ", nummerHoog=" + nummerHoog + ", bestemming="
				+ bestemming + ", oorsproperator=" + oorsproperator + ", netnummergebied=" + netnummergebied
				+ ", typeToekenning=" + typeToekenning + ", oorspronkelijkeSpcId=" + oorspronkelijkeSpcId
				+ ", oorsprCentrEenhNaam=" + oorsprCentrEenhNaam + ", oorspronkelijkeCGB=" + oorspronkelijkeCGB
				+ ", statusCentraleNummerserie=" + statusCentraleNummerserie + ", initieleTCRCode=" + initieleTCRCode
				+ ", mutatiedatumtijd=" + mutatiedatumtijd + ", status=" + status + ", platform=" + platform
				+ ", huidigeOperator=" + huidigeOperator + ", huidigeSpcId=" + huidigeSpcId + ", huidigeCentrEenhNaam="
				+ huidigeCentrEenhNaam + ", huidigeCGB=" + huidigeCGB + ", soortDienst=" + soortDienst + ", roepnummer="
				+ roepnummer + ", LRI=" + LRI + ", huidigeTCDcode=" + huidigeTCDcode + ", huidigeTCRcode="
				+ huidigeTCRcode + ", heeftCVI=" + heeftCVI + ", CVITelco=" + CVITelco + "]";
	}

}
