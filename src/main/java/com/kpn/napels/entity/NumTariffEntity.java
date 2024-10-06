package com.kpn.napels.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NUM_TARIFF")
public class NumTariffEntity {

	@Id
	@Column(name="TRF_TECHINCAL_ID",columnDefinition="NUMBER")
	private int trfTechnicalId;   
	
	@Column(name="TRF_AMOUNT_LOW",columnDefinition="CHAR")
	private String trfAmountLow;
	
	@Column(name="TRF_AMOUNT_HIGH",columnDefinition="CHAR")
	private String trfAmountHigh;
	
	@Column(name="TRF_CURRENCY",columnDefinition="CHAR")
	private String trfCurrency;	
	
	@Column(name="TRF_CALL_TYPE",columnDefinition="CHAR")
	private String trfCallType;	
	
	@Column(name="TRF_PULS_CODE",columnDefinition="CHAR")
	private String trfPlusCode;	
	
	@Column(name="TRF_TARIFF_CODE",columnDefinition="CHAR")
	private String trfTarrifCode;

	public int getTrfTechnicalId() {
		return trfTechnicalId;
	}

	public void setTrfTechnicalId(int trfTechnicalId) {
		this.trfTechnicalId = trfTechnicalId;
	}

	public String getTrfAmountLow() {
		return trfAmountLow;
	}

	public void setTrfAmountLow(String trfAmountLow) {
		this.trfAmountLow = trfAmountLow;
	}

	public String getTrfAmountHigh() {
		return trfAmountHigh;
	}

	public void setTrfAmountHigh(String trfAmountHigh) {
		this.trfAmountHigh = trfAmountHigh;
	}

	public String getTrfCurrency() {
		return trfCurrency;
	}

	public void setTrfCurrency(String trfCurrency) {
		this.trfCurrency = trfCurrency;
	}

	public String getTrfCallType() {
		return trfCallType;
	}

	public void setTrfCallType(String trfCallType) {
		this.trfCallType = trfCallType;
	}

	public String getTrfPlusCode() {
		return trfPlusCode;
	}

	public void setTrfPlusCode(String trfPlusCode) {
		this.trfPlusCode = trfPlusCode;
	}

	public String getTrfTarrifCode() {
		return trfTarrifCode;
	}

	public void setTrfTarrifCode(String trfTarrifCode) {
		this.trfTarrifCode = trfTarrifCode;
	}

	@Override
	public String toString() {
		return "NumTariffEntity [trfTechnicalId=" + trfTechnicalId + ", trfAmountLow=" + trfAmountLow
				+ ", trfAmountHigh=" + trfAmountHigh + ", trfCurrency=" + trfCurrency + ", trfCallType=" + trfCallType
				+ ", trfPlusCode=" + trfPlusCode + ", trfTarrifCode=" + trfTarrifCode + "]";
	}	
	
	
}
