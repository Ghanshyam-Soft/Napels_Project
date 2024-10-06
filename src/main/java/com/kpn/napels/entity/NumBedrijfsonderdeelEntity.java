package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the NUM_BEDRIJFSONDERDEEL database table.
 * 
 */
@Entity
@Table(name="NUM_BEDRIJFSONDERDEEL")
public class NumBedrijfsonderdeelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BDO_NUMMER")
	private Integer bdoNummer;

	@Column(name="BDO_KORTE_NAAM", nullable = false)
	private String bdoKorteNaam;

	@Column(name="BDO_TYPE", nullable = false)
	private String bdoType;

	@Column(name="BDO_VOLLEDIGE_NAAM", nullable = false)
	private String bdoVolledigeNaam;
	
	@Column(name="BDO_TCD_NUMMER")
	private Integer bdoTcdNummer;

	public NumBedrijfsonderdeelEntity() {
	}

	public Integer getBdoNummer() {
		return bdoNummer;
	}

	public void setBdoNummer(Integer bdoNummer) {
		this.bdoNummer = bdoNummer;
	}

	public String getBdoKorteNaam() {
		return bdoKorteNaam;
	}

	public void setBdoKorteNaam(String bdoKorteNaam) {
		this.bdoKorteNaam = bdoKorteNaam;
	}

	public String getBdoType() {
		return bdoType;
	}

	public void setBdoType(String bdoType) {
		this.bdoType = bdoType;
	}

	public String getBdoVolledigeNaam() {
		return bdoVolledigeNaam;
	}

	public void setBdoVolledigeNaam(String bdoVolledigeNaam) {
		this.bdoVolledigeNaam = bdoVolledigeNaam;
	}

	public Integer getBdoTcdNummer() {
		return bdoTcdNummer;
	}

	public void setBdoTcdNummer(Integer bdoTcdNummer) {
		this.bdoTcdNummer = bdoTcdNummer;
	}

	@Override
	public String toString() {
		return "NumBedrijfsonderdeelEntity [bdoNummer=" + bdoNummer + ", bdoKorteNaam=" + bdoKorteNaam + ", bdoType="
				+ bdoType + ", bdoVolledigeNaam=" + bdoVolledigeNaam + ", bdoTcdNummer=" + bdoTcdNummer + "]";
	}
	

}