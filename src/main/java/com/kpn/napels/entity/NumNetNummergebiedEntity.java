package com.kpn.napels.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NUM_NETNUMMERGEBIED")
public class NumNetNummergebiedEntity {

	@Id
	@Column(name="NNG_NETNUMMER",columnDefinition="CHAR")
	private String netNummer;
	
	@Column(name="NNG_NAAM_VERKORT",columnDefinition="CHAR")
	private String naamVerkort;
	
	@Column(name="NNG_NAAM_VOLUIT",columnDefinition="CHAR")
	private String naamVoluit;
	
	@Column(name="FK_BDO_NUMMER",columnDefinition="NUMBER")
	private Integer bdoNummer;
	
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
	public String getNaamVoluit() {
		return naamVoluit;
	}
	public void setNaamVoluit(String naamVoluit) {
		this.naamVoluit = naamVoluit;
	}
	public Integer getBdoNummer() {
		return bdoNummer;
	}
	public void setBdoNummer(Integer bdoNummer) {
		this.bdoNummer = bdoNummer;
	}
	@Override
	public String toString() {
		return "NumNetNummergebied [netNummer=" + netNummer + ", naamVerkort=" + naamVerkort + ", naamVoluit="
				+ naamVoluit + ", bdoNummer=" + bdoNummer + "]";
	}
	
	
}

