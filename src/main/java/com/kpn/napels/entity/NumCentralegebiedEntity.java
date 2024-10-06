package com.kpn.napels.entity;



import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


/**
 * The persistent class for the NUM_CENTRALEGEBIED database table.
 * 
 */
@Entity
@Table(name="NUM_CENTRALEGEBIED")

public class NumCentralegebiedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CGB_CODE")
	private Integer cgbCode;

	@Column(name="CGB_NAAM_VERKORT")
	private String cgbNaamVerkort;

	@Column(name="CGB_NAAM_VOLUIT")
	private String cgbNaamVoluit;

	@Column(name="FK_NNG_NETNUMMER")
	private String fkNngNetnummer;

	@Column(name="FK_BDO_NUMMER")
	private Integer fkBdoNummer;



	public NumCentralegebiedEntity() {
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


	public String getCgbNaamVoluit() {
		return cgbNaamVoluit;
	}


	public void setCgbNaamVoluit(String cgbNaamVoluit) {
		this.cgbNaamVoluit = cgbNaamVoluit;
	}


	public String getFkNngNetnummer() {
		return fkNngNetnummer;
	}


	public void setFkNngNetnummer(String fkNngNetnummer) {
		this.fkNngNetnummer = fkNngNetnummer;
	}


	public Integer getFkBdoNummer() {
		return fkBdoNummer;
	}


	public void setFkBdoNummer(Integer fkBdoNummer) {
		this.fkBdoNummer = fkBdoNummer;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "NumCentralegebied [cgbCode=" + cgbCode + ", cgbNaamVerkort=" + cgbNaamVerkort + ", cgbNaamVoluit="
				+ cgbNaamVoluit + ", fkNngNetnummer=" + fkNngNetnummer + ", fkBdoNummer=" + fkBdoNummer + "]";
	}



}