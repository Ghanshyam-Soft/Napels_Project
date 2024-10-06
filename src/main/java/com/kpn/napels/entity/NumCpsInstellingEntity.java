package com.kpn.napels.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NUM_CPS_INSTELLING")
public class NumCpsInstellingEntity implements Serializable{  
	  
	    /**
	 * 
	 */
	    private static final long serialVersionUID = 7495345649598515031L;

		@Id
		@Column(name="TELEFOONNUMMER",columnDefinition="CHAR")
		private String telefoonNum;    

		@Column(name="MUTATIE_MOMENT")
		@Temporal(TemporalType.DATE)
		private  Date mutatieMoment;  
	  
	    @Column(name="CARRIER_PREFIX_1",columnDefinition="CHAR")
		private String prefix1;
		
		@Column(name="CARRIER_PREFIX_2",columnDefinition="CHAR")
		private String prefix2;
		
		@Column(name="CARRIER_PREFIX_3",columnDefinition="CHAR")
		private String prefix3;
		
		@Column(name="CARRIER_PREFIX_4",columnDefinition="CHAR")
		private String prefix4;
		
		@Column(name="CARRIER_PREFIX_5",columnDefinition="CHAR")
		private String prefix5;
		
		@Column(name="CARRIER_PREFIX_6",columnDefinition="CHAR")
		private String prefix6;
		
		@Column(name="CARRIER_PREFIX_7",columnDefinition="CHAR")
		private String prefix7;
		
		@Column(name="CARRIER_PREFIX_8",columnDefinition="CHAR")
		private String prefix8;
		
		@Column(name="CARRIER_PREFIX_9",columnDefinition="CHAR")
		private String prefix9;
		
		public String getTelefoonNum() {
			return telefoonNum;
		}

		public void setTelefoonNum(String telefoonNum) {
			this.telefoonNum = telefoonNum;
		}

		public Date getMutatieMoment() {
			return mutatieMoment;
		}

		public void setMutatieMoment(Date mutatieMoment) {
			this.mutatieMoment = mutatieMoment;
		}

		public String getPrefix1() {
			return prefix1;
		}

		public void setPrefix1(String prefix1) {
			this.prefix1 = prefix1;
		}

		public String getPrefix2() {
			return prefix2;
		}

		public void setPrefix2(String prefix2) {
			this.prefix2 = prefix2;
		}

		public String getPrefix3() {
			return prefix3;
		}

		public void setPrefix3(String prefix3) {
			this.prefix3 = prefix3;
		}

		public String getPrefix4() {
			return prefix4;
		}

		public void setPrefix4(String prefix4) {
			this.prefix4 = prefix4;
		}

		public String getPrefix5() {
			return prefix5;
		}

		public void setPrefix5(String prefix5) {
			this.prefix5 = prefix5;
		}

		public String getPrefix6() {
			return prefix6;
		}

		public void setPrefix6(String prefix6) {
			this.prefix6 = prefix6;
		}

		public String getPrefix7() {
			return prefix7;
		}

		public void setPrefix7(String prefix7) {
			this.prefix7 = prefix7;
		}

		public String getPrefix8() {
			return prefix8;
		}

		public void setPrefix8(String prefix8) {
			this.prefix8 = prefix8;
		}

		public String getPrefix9() {
			return prefix9;
		}

		public void setPrefix9(String prefix9) {
			this.prefix9 = prefix9;
		}

		@Override
		public String toString() {
			return "NumCpsInstelling [telefoonNum=" + telefoonNum + ", mutatieMoment=" + mutatieMoment + ", prefix1="
					+ prefix1 + ", prefix2=" + prefix2 + ", prefix3=" + prefix3 + ", prefix4=" + prefix4 + ", prefix5="
					+ prefix5 + ", prefix6=" + prefix6 + ", prefix7=" + prefix7 + ", prefix8=" + prefix8 + ", prefix9="
					+ prefix9 + "]";
		}

}
