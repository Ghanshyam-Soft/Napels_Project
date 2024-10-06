package com.kpn.napels.dto;

import org.springframework.stereotype.Component;

@Component
public class ServiceNumHistResponseDTO {

	private String datum;
	private String soortActie;
	private String gebruikerId;
	private String accessAreaCode;
	private String operator;
	private String pulseCode;
	private String tariefCode;
	private String btwCode;
	private String platform;
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getSoortActie() {
		return soortActie;
	}
	public void setSoortActie(String soortActie) {
		this.soortActie = soortActie;
	}
	public String getGebruikerId() {
		return gebruikerId;
	}
	public void setGebruikerId(String gebruikerId) {
		this.gebruikerId = gebruikerId;
	}
	public String getAccessAreaCode() {
		return accessAreaCode;
	}
	public void setAccessAreaCode(String accessAreaCode) {
		this.accessAreaCode = accessAreaCode;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getPulseCode() {
		return pulseCode;
	}
	public void setPulseCode(String pulseCode) {
		this.pulseCode = pulseCode;
	}
	public String getTariefCode() {
		return tariefCode;
	}
	public void setTariefCode(String tariefCode) {
		this.tariefCode = tariefCode;
	}
	public String getBtwCode() {
		return btwCode;
	}
	public void setBtwCode(String btwCode) {
		this.btwCode = btwCode;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	@Override
	public String toString() {
		return "ServiceNumHistResponseDTO [datum=" + datum + ", soortActie=" + soortActie + ", gebruikerId="
				+ gebruikerId + ", accessAreaCode=" + accessAreaCode + ", operator=" + operator + ", pulseCode="
				+ pulseCode + ", tariefCode=" + tariefCode + ", btwCode=" + btwCode + ", platform=" + platform + "]";
	}
	
	
	
}
