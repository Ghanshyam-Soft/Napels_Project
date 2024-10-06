package com.kpn.napels.dto;

import org.springframework.stereotype.Component;

@Component
public class ServiceNummerDetailResponseDTO {

	private String nummerLaag;
	private String nummerHoog;
	private String operatorId;
	private String pulsCode;
	private String platform;
	private String laatsteMutatie;
	private String laatsteSoortActie;
	private String lri;
	private String accessAreaCode;
	private String tariefCode;
	private String gebruikerId;
	private String bestemming;
	private String btwCode;
	
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
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getPulsCode() {
		return pulsCode;
	}
	public void setPulsCode(String pulsCode) {
		this.pulsCode = pulsCode;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getLaatsteMutatie() {
		return laatsteMutatie;
	}
	public void setLaatsteMutatie(String laatsteMutatie) {
		this.laatsteMutatie = laatsteMutatie;
	}
	public String getLaatsteSoortActie() {
		return laatsteSoortActie;
	}
	public void setLaatsteSoortActie(String laatsteSoortActie) {
		this.laatsteSoortActie = laatsteSoortActie;
	}
	public String getLri() {
		return lri;
	}
	public void setLri(String lri) {
		this.lri = lri;
	}
	public String getAccessAreaCode() {
		return accessAreaCode;
	}
	public void setAccessAreaCode(String accessAreaCode) {
		this.accessAreaCode = accessAreaCode;
	}
	public String getTariefCode() {
		return tariefCode;
	}
	public void setTariefCode(String tariefCode) {
		this.tariefCode = tariefCode;
	}
	public String getGebruikerId() {
		return gebruikerId;
	}
	public void setGebruikerId(String gebruikerId) {
		this.gebruikerId = gebruikerId;
	}
	public String getBestemming() {
		return bestemming;
	}
	public void setBestemming(String bestemming) {
		this.bestemming = bestemming;
	}
	public String getBtwCode() {
		return btwCode;
	}
	public void setBtwCode(String btwCode) {
		this.btwCode = btwCode;
	}
	@Override
	public String toString() {
		return "ServiceNummerDetailResponseDTO [nummerLaag=" + nummerLaag + ", nummerHoog=" + nummerHoog
				+ ", operatorId=" + operatorId + ", pulsCode=" + pulsCode + ", platform=" + platform
				+ ", laatsteMutatie=" + laatsteMutatie + ", laatsteSoortActie=" + laatsteSoortActie + ", lri=" + lri
				+ ", accessAreaCode=" + accessAreaCode + ", tariefCode=" + tariefCode + ", gebruikerId=" + gebruikerId
				+ ", bestemming=" + bestemming + ", btwCode=" + btwCode + "]";
	}
	
}
