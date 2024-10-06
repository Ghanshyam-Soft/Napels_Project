package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the NUM_NETWERK_OPERATOR database table.
 * 
 */
@Entity
@Table(name="NUM_NETWERK_OPERATOR")
//@NamedQuery(name="NumNetwerkOperator.findAll", query="SELECT n FROM NumNetwerkOperator n")
public class NumNetwerkOperatorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOP_INTERNE_OPERATOR_ID")
	private String nopInterneOperatorId;

	@Column(name="NOP_EXTERNE_OPERATOR_ID")
	private String nopExterneOperatorId;

	@Column(name="NOP_M2M_PORTERINGSOVEREENKOMST")
	private String nopM2mPorteringsovereenkomst;

	@Column(name="NOP_OPERATOR_NAAM_VOLUIT")
	private String nopOperatorNaamVoluit;

	@Column(name="NOP_PORTERINGSOVEREENKOMST")
	private String nopPorteringsovereenkomst;

	

	public NumNetwerkOperatorEntity() {
	}

	public String getNopInterneOperatorId() {
		return this.nopInterneOperatorId;
	}

	public void setNopInterneOperatorId(String nopInterneOperatorId) {
		this.nopInterneOperatorId = nopInterneOperatorId;
	}

	public String getNopExterneOperatorId() {
		return this.nopExterneOperatorId;
	}

	public void setNopExterneOperatorId(String nopExterneOperatorId) {
		this.nopExterneOperatorId = nopExterneOperatorId;
	}

	public String getNopM2mPorteringsovereenkomst() {
		return this.nopM2mPorteringsovereenkomst;
	}

	public void setNopM2mPorteringsovereenkomst(String nopM2mPorteringsovereenkomst) {
		this.nopM2mPorteringsovereenkomst = nopM2mPorteringsovereenkomst;
	}

	public String getNopOperatorNaamVoluit() {
		return this.nopOperatorNaamVoluit;
	}

	public void setNopOperatorNaamVoluit(String nopOperatorNaamVoluit) {
		this.nopOperatorNaamVoluit = nopOperatorNaamVoluit;
	}

	public String getNopPorteringsovereenkomst() {
		return this.nopPorteringsovereenkomst;
	}

	public void setNopPorteringsovereenkomst(String nopPorteringsovereenkomst) {
		this.nopPorteringsovereenkomst = nopPorteringsovereenkomst;
	}

	

	

}
