package com.kpn.napels.entity;

import java.io.Serializable;


import javax.persistence.*;
@Entity
@Table(name="NUM_VOIP_PLATFORM")
public class NumVoipPlatformEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PLATFORM_ID")
	private Integer platformId;
	
	@Column(name="PLATFORMOMSCHRIJVING")
	private String platformOmschrijving;
	
	@Column(name="VOIP_IN_BIJWERKEN_JN")
	private String voipInBijwerkenJn;

	

	public Integer getPlatformId() {
		return platformId;
	}

	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}

	public String getPlatformOmschrijving() {
		return platformOmschrijving;
	}

	public void setPlatformOmschrijving(String platformOmschrijving) {
		this.platformOmschrijving = platformOmschrijving;
	}

	public String getVoipInBijwerkenJn() {
		return voipInBijwerkenJn;
	}

	public void setVoipInBijwerkenJn(String voipInBijwerkenJn) {
		this.voipInBijwerkenJn = voipInBijwerkenJn;
	}

	@Override
	public String toString() {
		return "NumVoipPlatformEntity [platformId=" + platformId + ", platformOmschrijving=" + platformOmschrijving
				+ ", voipInBijwerkenJn=" + voipInBijwerkenJn + "]";
	}
	
		
	

}
