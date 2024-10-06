package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NUM_POINT_OF_PRESENCE database table.
 * 
 */
@Entity
@Table(name="NUM_POINT_OF_PRESENCE")
//@NamedQuery(name="NumPointOfPresence.findAll", query="SELECT n FROM NumPointOfPresence n")
public class NumPointOfPresenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="POP_ACCESS_AREA_CODE")
	private String popAccessAreaCode;

	@Column(name="FK_NNG_NETNUMMER")
	private String fkNngNetnummer;

	@Column(name="POP_NAAM_VOLUIT")
	private String popNaamVoluit;

	

	public NumPointOfPresenceEntity() {
	}

	public String getPopAccessAreaCode() {
		return this.popAccessAreaCode;
	}

	public void setPopAccessAreaCode(String popAccessAreaCode) {
		this.popAccessAreaCode = popAccessAreaCode;
	}

	public String getFkNngNetnummer() {
		return this.fkNngNetnummer;
	}

	public void setFkNngNetnummer(String fkNngNetnummer) {
		this.fkNngNetnummer = fkNngNetnummer;
	}

	public String getPopNaamVoluit() {
		return this.popNaamVoluit;
	}

	public void setPopNaamVoluit(String popNaamVoluit) {
		this.popNaamVoluit = popNaamVoluit;
	}

	
	
}
