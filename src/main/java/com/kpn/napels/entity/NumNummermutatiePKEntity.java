package com.kpn.napels.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The primary key class for the NUM_NUMMERMUTATIE database table.
 * 
 */
@Embeddable
public class NumNummermutatiePKEntity implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NMT_NUMMER_LAAG", nullable = false)
	private String nmtNummerLaag;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="NMT_LOGISCH_MUTATIEMOMENT", nullable = false)
	private Date nmtLogischMutatiemoment;

	public NumNummermutatiePKEntity() {
	}
	public String getNmtNummerLaag() {
		return this.nmtNummerLaag;
	}
	public void setNmtNummerLaag(String nmtNummerLaag) {
		this.nmtNummerLaag = nmtNummerLaag;
	}
	public java.util.Date getNmtLogischMutatiemoment() {
		return this.nmtLogischMutatiemoment;
	}
	public void setNmtLogischMutatiemoment(java.util.Date nmtLogischMutatiemoment) {
		this.nmtLogischMutatiemoment = nmtLogischMutatiemoment;
	}

	public NumNummermutatiePKEntity(String nmtNummerLaag, Date nmtLogischMutatiemoment) {
		super();
		this.nmtNummerLaag = nmtNummerLaag;
		this.nmtLogischMutatiemoment = nmtLogischMutatiemoment;
	}
	
	
}