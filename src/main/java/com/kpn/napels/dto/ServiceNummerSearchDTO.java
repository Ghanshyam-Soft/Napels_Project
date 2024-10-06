package com.kpn.napels.dto;

import org.springframework.stereotype.Component;

@Component
public class ServiceNummerSearchDTO {

	
	private String serviceNumLow;
	private String serviceNumHigh;
	private String mutatieVan;
	private String mutatieTm;
	
	public String getServiceNumLow() {
		return serviceNumLow;
	}
	public void setServiceNumLow(String serviceNumLow) {
		this.serviceNumLow = serviceNumLow;
	}
	public String getServiceNumHigh() {
		return serviceNumHigh;
	}
	public void setServiceNumHigh(String serviceNumHigh) {
		this.serviceNumHigh = serviceNumHigh;
	}
	public String getMutatieVan() {
		return mutatieVan;
	}
	public void setMutatieVan(String mutatieVan) {
		this.mutatieVan = mutatieVan;
	}
	public String getMutatieTm() {
		return mutatieTm;
	}
	public void setMutatieTm(String mutatieTm) {
		this.mutatieTm = mutatieTm;
	}
	@Override
	public String toString() {
		return "ServiceNummerSearchDTO [serviceNumLow=" + serviceNumLow + ", serviceNumHigh=" + serviceNumHigh
				+ ", mutatieVan=" + mutatieVan + ", mutatieTm=" + mutatieTm + "]";
	}
}
