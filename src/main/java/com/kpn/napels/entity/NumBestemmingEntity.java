package com.kpn.napels.entity;

import javax.persistence.*;


@Entity
@Table(name="NUM_BESTEMMING")
public class NumBestemmingEntity {

	@Id
	@Column(name="BST_ID")
	private String bstId;
	
	@Column(name="BST_OMSCHRIJVING")
	private String bstOmschrijving;
	
	@Column(name="BST_BESTEMMING_SOORT")
	private static String bstBestemmingSoort;
	
	@Column(name="BST_CPS_TOEGESTAAN_JN",columnDefinition="CHAR")
	private String bstCpsToegestaan;

	public String getBstId() {
		return bstId;
	}

	public void setBstId(String bstId) {
		this.bstId = bstId;
	}

	public String getBstOmschrijving() {
		return bstOmschrijving;
	}

	public void setBstOmschrijving(String bstOmschrijving) {
		this.bstOmschrijving = bstOmschrijving;
	}

	public static String getBstBestemmingSoort() {
		return bstBestemmingSoort;
	}

	public void setBstBestemmingSoort(String bstBestemmingSoort) {
		this.bstBestemmingSoort = bstBestemmingSoort;
	}

	public String getBstCpsToegestaan() {
		return bstCpsToegestaan;
	}

	public void setBstCpsToegestaan(String bstCpsToegestaan) {
		this.bstCpsToegestaan = bstCpsToegestaan;
	}

	@Override
	public String toString() {
		return "NumBestemmingEntity [bstId=" + bstId + ", bstOmschrijving=" + bstOmschrijving + ", bstBestemmingSoort="
				+ bstBestemmingSoort + ", bstCpsToegestaan=" + bstCpsToegestaan + "]";
	}
	
	
	
}
