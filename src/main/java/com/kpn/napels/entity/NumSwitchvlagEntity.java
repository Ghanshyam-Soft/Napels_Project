package com.kpn.napels.entity;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="NUM_SWITCHVLAG_INSTELLING")
//@NamedQuery(name="NumSwitchvlagInstelling.findAll", query="SELECT n FROM NumSwitchvlagInstelling n")
public class NumSwitchvlagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String telefoonnummer;

	@Column(name="BARRING_FLAG_41")
	private String barringFlag41;

	@Column(name="BARRING_FLAG_42")
	private String barringFlag42;

	@Column(name="BARRING_FLAG_43")
	private String barringFlag43;

	@Column(name="BARRING_FLAG_44")
	private String barringFlag44;

	@Column(name="BARRING_FLAG_45")
	private String barringFlag45;

	@Column(name="BARRING_FLAG_46")
	private String barringFlag46;

	@Column(name="BARRING_FLAG_47")
	private String barringFlag47;

	@Column(name="BARRING_FLAG_48")
	private String barringFlag48;

	@Column(name="BARRING_FLAG_49")
	private String barringFlag49;

	@Column(name="BARRING_FLAG_50")
	private String barringFlag50;

	@Column(name="BLOCKED_CS")
	private String blockedCs;

	@Column(name="BLOCKED_CS_WLR")
	private String blockedCsWlr;

	@Column(name="BLOCKED_KPN")
	private String blockedKpn;

	@Column(name="BLOCKED_KPN_WLR")
	private String blockedKpnWlr;

	@Temporal(TemporalType.DATE)
	@Column(name="MUTATIE_MOMENT")
	private Date mutatieMoment;

	@Column(name="WLR_CUSTOMER")
	private String wlrCustomer;

	public NumSwitchvlagEntity() {
	}

	public String getTelefoonnummer() {
		return this.telefoonnummer;
	}

	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}

	public String getBarringFlag41() {
		return this.barringFlag41;
	}

	public void setBarringFlag41(String barringFlag41) {
		this.barringFlag41 = barringFlag41;
	}

	public String getBarringFlag42() {
		return this.barringFlag42;
	}

	public void setBarringFlag42(String barringFlag42) {
		this.barringFlag42 = barringFlag42;
	}

	public String getBarringFlag43() {
		return this.barringFlag43;
	}

	public void setBarringFlag43(String barringFlag43) {
		this.barringFlag43 = barringFlag43;
	}

	public String getBarringFlag44() {
		return this.barringFlag44;
	}

	public void setBarringFlag44(String barringFlag44) {
		this.barringFlag44 = barringFlag44;
	}

	public String getBarringFlag45() {
		return this.barringFlag45;
	}

	public void setBarringFlag45(String barringFlag45) {
		this.barringFlag45 = barringFlag45;
	}

	public String getBarringFlag46() {
		return this.barringFlag46;
	}

	public void setBarringFlag46(String barringFlag46) {
		this.barringFlag46 = barringFlag46;
	}

	public String getBarringFlag47() {
		return this.barringFlag47;
	}

	public void setBarringFlag47(String barringFlag47) {
		this.barringFlag47 = barringFlag47;
	}

	public String getBarringFlag48() {
		return this.barringFlag48;
	}

	public void setBarringFlag48(String barringFlag48) {
		this.barringFlag48 = barringFlag48;
	}

	public String getBarringFlag49() {
		return this.barringFlag49;
	}

	public void setBarringFlag49(String barringFlag49) {
		this.barringFlag49 = barringFlag49;
	}

	public String getBarringFlag50() {
		return this.barringFlag50;
	}

	public void setBarringFlag50(String barringFlag50) {
		this.barringFlag50 = barringFlag50;
	}

	public String getBlockedCs() {
		return this.blockedCs;
	}

	public void setBlockedCs(String blockedCs) {
		this.blockedCs = blockedCs;
	}

	public String getBlockedCsWlr() {
		return this.blockedCsWlr;
	}

	public void setBlockedCsWlr(String blockedCsWlr) {
		this.blockedCsWlr = blockedCsWlr;
	}

	public String getBlockedKpn() {
		return this.blockedKpn;
	}

	public void setBlockedKpn(String blockedKpn) {
		this.blockedKpn = blockedKpn;
	}

	public String getBlockedKpnWlr() {
		return this.blockedKpnWlr;
	}

	public void setBlockedKpnWlr(String blockedKpnWlr) {
		this.blockedKpnWlr = blockedKpnWlr;
	}

	public Date getMutatieMoment() {
		return this.mutatieMoment;
	}

	public void setMutatieMoment(Date mutatieMoment) {
		this.mutatieMoment = mutatieMoment;
	}

	public String getWlrCustomer() {
		return this.wlrCustomer;
	}

	public void setWlrCustomer(String wlrCustomer) {
		this.wlrCustomer = wlrCustomer;
	}

}