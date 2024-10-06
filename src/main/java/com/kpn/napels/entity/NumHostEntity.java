package com.kpn.napels.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NUM_HOST database table.
 * 
 */
@Entity
@Table(name="NUM_HOST")
public class NumHostEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HST_SPC_ID")
	private String hstSpcId;

	@Column(name="HST_CENTRALE_EENH_NAAM")
	private String hstCentraleEenhNaam;

	@Column(name="HST_HOST_ACCESS_POINT_ID")
	private String hstHostAccessPointId;

	@Column(name="HST_LRI")
	private String hstLri;

	/*@JoinColumn(name="FK_CTT_NAAM")
	private String fkcttname;*/

	public String getHstSpcId() {
		return hstSpcId;
	}

	public void setHstSpcId(String hstSpcId) {
		this.hstSpcId = hstSpcId;
	}

	public String getHstCentraleEenhNaam() {
		return hstCentraleEenhNaam;
	}

	public void setHstCentraleEenhNaam(String hstCentraleEenhNaam) {
		this.hstCentraleEenhNaam = hstCentraleEenhNaam;
	}

	public String getHstHostAccessPointId() {
		return hstHostAccessPointId;
	}

	public void setHstHostAccessPointId(String hstHostAccessPointId) {
		this.hstHostAccessPointId = hstHostAccessPointId;
	}

	public String getHstLri() {
		return hstLri;
	}

	public void setHstLri(String hstLri) {
		this.hstLri = hstLri;
	}

	@Override
	public String toString() {
		return "NumHost [hstSpcId=" + hstSpcId + ", hstCentraleEenhNaam=" + hstCentraleEenhNaam
				+ ", hstHostAccessPointId=" + hstHostAccessPointId + ", hstLri=" + hstLri + "]";
	}

	/*public String getFkcttname() {
		return fkcttname;
	}

	public void setFkcttname(String fkcttname) {
		this.fkcttname = fkcttname;
	}*/

	/*@Override
	public String toString() {
		return "NumHost [hstSpcId=" + hstSpcId + ", hstCentraleEenhNaam=" + hstCentraleEenhNaam
				+ ", hstHostAccessPointId=" + hstHostAccessPointId + ", hstLri=" + hstLri + ", fkcttname=" + fkcttname
				+ "]";
	}*/
}