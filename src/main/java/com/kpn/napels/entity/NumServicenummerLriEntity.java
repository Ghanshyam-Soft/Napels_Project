package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NUM_SERVICENUMMER_LRI database table.
 * 
 */
@Entity
@Table(name="NUM_SERVICENUMMER_LRI")
//@NamedQuery(name="NumServicenummerLri.findAll", query="SELECT n FROM NumServicenummerLri n")
public class NumServicenummerLriEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NumServicenummerLriPKEntity numServicenummerLriPKEntity;

	@Column(name="SLI_LRI")
	private String sliLri;

	//bi-directional many-to-one association to NumBestemming
	@ManyToOne
	@JoinColumn(name="FK_BST_ID",insertable=false, updatable = false)
	private NumBestemmingEntity numBestemming;

	//bi-directional many-to-one association to NumNetwerkOperator
	@ManyToOne
	@JoinColumn(name="FK_NOP_INT_OPER_ID",insertable=false, updatable = false)
	private NumNetwerkOperatorEntity numNetwerkOperator;

	//bi-directional many-to-one association to NumPointOfPresence
	@ManyToOne
	@JoinColumn(name="FK_POP_ACCESS_AREA",insertable=false, updatable = false)
	private NumPointOfPresenceEntity numPointOfPresence;

	//bi-directional many-to-one association to NumVoipPlatform
	@ManyToOne
	@JoinColumn(name="FK_VOIP_PLATFORM_ID",insertable=false, updatable = false)
	private NumVoipPlatformEntity numVoipPlatform;

	public NumServicenummerLriEntity() {
	}


	public String getSliLri() {
		return this.sliLri;
	}

	public void setSliLri(String sliLri) {
		this.sliLri = sliLri;
	}

	public NumBestemmingEntity getNumBestemming() {
		return this.numBestemming;
	}

	public void setNumBestemming(NumBestemmingEntity numBestemming) {
		this.numBestemming = numBestemming;
	}

	public NumNetwerkOperatorEntity getNumNetwerkOperator() {
		return this.numNetwerkOperator;
	}

	public void setNumNetwerkOperator(NumNetwerkOperatorEntity numNetwerkOperator) {
		this.numNetwerkOperator = numNetwerkOperator;
	}

	public NumPointOfPresenceEntity getNumPointOfPresence() {
		return this.numPointOfPresence;
	}

	public void setNumPointOfPresence(NumPointOfPresenceEntity numPointOfPresence) {
		this.numPointOfPresence = numPointOfPresence;
	}

	public NumVoipPlatformEntity getNumVoipPlatform() {
		return this.numVoipPlatform;
	}

	public void setNumVoipPlatform(NumVoipPlatformEntity numVoipPlatform) {
		this.numVoipPlatform = numVoipPlatform;
	}


	public NumServicenummerLriPKEntity getNumServicenummerLriPKEntity() {
		return numServicenummerLriPKEntity;
	}


	public void setNumServicenummerLriPKEntity(NumServicenummerLriPKEntity numServicenummerLriPKEntity) {
		this.numServicenummerLriPKEntity = numServicenummerLriPKEntity;
	}

}