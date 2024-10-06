package com.kpn.napels.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



import org.springframework.stereotype.Component;



@Component
public class NumberDetailHistoryDTO implements Serializable{

	private static final long serialVersionUID = 1L;	
	private String soortAktie;
	private String status;
	private String nmtNummerLaag;
	private String mutaieDate;
	private String nmtNummerHoog;
	private String nmtBestemmingId;
	private String nmtCviKenmerk;
	private String nmtCviKenmerkVorig;
	private String nmtCviTelco;
	private String nmtHeeftCviDienst;
	private String nmtHeeftCviDienstJnVorig;
	private String nmtHeeftCviTelcoVorig;
	private String nmtHeeftCviZmDienstYn;
	private String nmtHeeftCviZmYnVorig;
	private String nmtInDienstCgbCode;
	private String nmtInDienstCgbCodeVorig;
	private String nmtInDienstSpcId;
	private String nmtInDienstSpcIdVorig;
	private String nmtLaagIsHoogJn;
	private String nmtLaatsteSoortActieCode;
	private String nmtLri;
	private String nmtLriVorig;
	private String nmtMutatieGebruikerId;
	private String nmtMutatielabel;
	private String nmtNetnummer;
	private String nmtOperatorEigenaar;
	private String nmtOperatorExploitant;
	private String nmtOperatorExploitantVorig;
	private BigDecimal nmtPlatformIdNieuw;
	private BigDecimal nmtPlatformIdVorig;
	private String nmtRoepnummer;
	private String nmtRoepnummerVorig;
	private String nmtSoortDienst;
	private String nmtSoortDienstVorig;
	private String nmtStatusCode;
	private String nmtStatusToekenning;
	private String nmtStatusToekenningVorig;
	private Date nmtTechnischMutatiemoment;
	private String nmtToekOfDienstTd;
	private String nmtTypeToekenning;
	private String nmtVoorkeursCgbCode;
	private String nmtVoorkeursCgbCodeVorig;
	private String nmtVoorkeursSpcId;
	private String nmtVoorkeursSpcIdVorig;



	public String getNmtNummerLaag() {
		return nmtNummerLaag;
	}
	public void setNmtNummerLaag(String nmtNummerLaag) {
		this.nmtNummerLaag = nmtNummerLaag;
	}


	public String getMutaieDate() {
		return mutaieDate;
	}

	public void setMutaieDate(String mutaieDate) {
		this.mutaieDate = mutaieDate;
	}
	public String getNmtNummerHoog() {
		return nmtNummerHoog;
	}
	public void setNmtNummerHoog(String nmtNummerHoog) {
		this.nmtNummerHoog = nmtNummerHoog;
	}

	public String getSoortAktie() {
		return soortAktie;
	}
	public void setSoortAktie(String soortAktie) {
		this.soortAktie = soortAktie;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getNmtBestemmingId() {
		return nmtBestemmingId;
	}
	public void setNmtBestemmingId(String nmtBestemmingId) {
		this.nmtBestemmingId = nmtBestemmingId;
	}
	public String getNmtCviKenmerk() {
		return nmtCviKenmerk;
	}
	public void setNmtCviKenmerk(String nmtCviKenmerk) {
		this.nmtCviKenmerk = nmtCviKenmerk;
	}
	public String getNmtCviKenmerkVorig() {
		return nmtCviKenmerkVorig;
	}
	public void setNmtCviKenmerkVorig(String nmtCviKenmerkVorig) {
		this.nmtCviKenmerkVorig = nmtCviKenmerkVorig;
	}
	public String getNmtCviTelco() {
		return nmtCviTelco;
	}
	public void setNmtCviTelco(String nmtCviTelco) {
		this.nmtCviTelco = nmtCviTelco;
	}
	public String getNmtHeeftCviDienst() {
		return nmtHeeftCviDienst;
	}
	public void setNmtHeeftCviDienst(String nmtHeeftCviDienst) {
		this.nmtHeeftCviDienst = nmtHeeftCviDienst;
	}
	public String getNmtHeeftCviDienstJnVorig() {
		return nmtHeeftCviDienstJnVorig;
	}
	public void setNmtHeeftCviDienstJnVorig(String nmtHeeftCviDienstJnVorig) {
		this.nmtHeeftCviDienstJnVorig = nmtHeeftCviDienstJnVorig;
	}
	public String getNmtHeeftCviTelcoVorig() {
		return nmtHeeftCviTelcoVorig;
	}
	public void setNmtHeeftCviTelcoVorig(String nmtHeeftCviTelcoVorig) {
		this.nmtHeeftCviTelcoVorig = nmtHeeftCviTelcoVorig;
	}
	public String getNmtHeeftCviZmDienstYn() {
		return nmtHeeftCviZmDienstYn;
	}
	public void setNmtHeeftCviZmDienstYn(String nmtHeeftCviZmDienstYn) {
		this.nmtHeeftCviZmDienstYn = nmtHeeftCviZmDienstYn;
	}
	public String getNmtHeeftCviZmYnVorig() {
		return nmtHeeftCviZmYnVorig;
	}
	public void setNmtHeeftCviZmYnVorig(String nmtHeeftCviZmYnVorig) {
		this.nmtHeeftCviZmYnVorig = nmtHeeftCviZmYnVorig;
	}
	public String getNmtInDienstCgbCode() {
		return nmtInDienstCgbCode;
	}
	public void setNmtInDienstCgbCode(String nmtInDienstCgbCode) {
		this.nmtInDienstCgbCode = nmtInDienstCgbCode;
	}
	public String getNmtInDienstCgbCodeVorig() {
		return nmtInDienstCgbCodeVorig;
	}
	public void setNmtInDienstCgbCodeVorig(String nmtInDienstCgbCodeVorig) {
		this.nmtInDienstCgbCodeVorig = nmtInDienstCgbCodeVorig;
	}
	public String getNmtInDienstSpcId() {
		return nmtInDienstSpcId;
	}
	public void setNmtInDienstSpcId(String nmtInDienstSpcId) {
		this.nmtInDienstSpcId = nmtInDienstSpcId;
	}
	public String getNmtInDienstSpcIdVorig() {
		return nmtInDienstSpcIdVorig;
	}
	public void setNmtInDienstSpcIdVorig(String nmtInDienstSpcIdVorig) {
		this.nmtInDienstSpcIdVorig = nmtInDienstSpcIdVorig;
	}
	public String getNmtLaagIsHoogJn() {
		return nmtLaagIsHoogJn;
	}
	public void setNmtLaagIsHoogJn(String nmtLaagIsHoogJn) {
		this.nmtLaagIsHoogJn = nmtLaagIsHoogJn;
	}
	public String getNmtLaatsteSoortActieCode() {
		return nmtLaatsteSoortActieCode;
	}
	public void setNmtLaatsteSoortActieCode(String nmtLaatsteSoortActieCode) {
		this.nmtLaatsteSoortActieCode = nmtLaatsteSoortActieCode;
	}
	public String getNmtLri() {
		return nmtLri;
	}
	public void setNmtLri(String nmtLri) {
		this.nmtLri = nmtLri;
	}
	public String getNmtLriVorig() {
		return nmtLriVorig;
	}
	public void setNmtLriVorig(String nmtLriVorig) {
		this.nmtLriVorig = nmtLriVorig;
	}
	public String getNmtMutatieGebruikerId() {
		return nmtMutatieGebruikerId;
	}
	public void setNmtMutatieGebruikerId(String nmtMutatieGebruikerId) {
		this.nmtMutatieGebruikerId = nmtMutatieGebruikerId;
	}
	public String getNmtMutatielabel() {
		return nmtMutatielabel;
	}
	public void setNmtMutatielabel(String nmtMutatielabel) {
		this.nmtMutatielabel = nmtMutatielabel;
	}
	public String getNmtNetnummer() {
		return nmtNetnummer;
	}
	public void setNmtNetnummer(String nmtNetnummer) {
		this.nmtNetnummer = nmtNetnummer;
	}
	public String getNmtOperatorEigenaar() {
		return nmtOperatorEigenaar;
	}
	public void setNmtOperatorEigenaar(String nmtOperatorEigenaar) {
		this.nmtOperatorEigenaar = nmtOperatorEigenaar;
	}
	public String getNmtOperatorExploitant() {
		return nmtOperatorExploitant;
	}
	public void setNmtOperatorExploitant(String nmtOperatorExploitant) {
		this.nmtOperatorExploitant = nmtOperatorExploitant;
	}
	public String getNmtOperatorExploitantVorig() {
		return nmtOperatorExploitantVorig;
	}
	public void setNmtOperatorExploitantVorig(String nmtOperatorExploitantVorig) {
		this.nmtOperatorExploitantVorig = nmtOperatorExploitantVorig;
	}
	public BigDecimal getNmtPlatformIdNieuw() {
		return nmtPlatformIdNieuw;
	}
	public void setNmtPlatformIdNieuw(BigDecimal nmtPlatformIdNieuw) {
		this.nmtPlatformIdNieuw = nmtPlatformIdNieuw;
	}
	public BigDecimal getNmtPlatformIdVorig() {
		return nmtPlatformIdVorig;
	}
	public void setNmtPlatformIdVorig(BigDecimal nmtPlatformIdVorig) {
		this.nmtPlatformIdVorig = nmtPlatformIdVorig;
	}
	public String getNmtRoepnummer() {
		return nmtRoepnummer;
	}
	public void setNmtRoepnummer(String nmtRoepnummer) {
		this.nmtRoepnummer = nmtRoepnummer;
	}
	public String getNmtRoepnummerVorig() {
		return nmtRoepnummerVorig;
	}
	public void setNmtRoepnummerVorig(String nmtRoepnummerVorig) {
		this.nmtRoepnummerVorig = nmtRoepnummerVorig;
	}
	public String getNmtSoortDienst() {
		return nmtSoortDienst;
	}
	public void setNmtSoortDienst(String nmtSoortDienst) {
		this.nmtSoortDienst = nmtSoortDienst;
	}
	public String getNmtSoortDienstVorig() {
		return nmtSoortDienstVorig;
	}
	public void setNmtSoortDienstVorig(String nmtSoortDienstVorig) {
		this.nmtSoortDienstVorig = nmtSoortDienstVorig;
	}
	public String getNmtStatusCode() {
		return nmtStatusCode;
	}
	public void setNmtStatusCode(String nmtStatusCode) {
		this.nmtStatusCode = nmtStatusCode;
	}
	public String getNmtStatusToekenning() {
		return nmtStatusToekenning;
	}
	public void setNmtStatusToekenning(String nmtStatusToekenning) {
		this.nmtStatusToekenning = nmtStatusToekenning;
	}
	public String getNmtStatusToekenningVorig() {
		return nmtStatusToekenningVorig;
	}
	public void setNmtStatusToekenningVorig(String nmtStatusToekenningVorig) {
		this.nmtStatusToekenningVorig = nmtStatusToekenningVorig;
	}
	public Date getNmtTechnischMutatiemoment() {
		return nmtTechnischMutatiemoment;
	}
	public void setNmtTechnischMutatiemoment(Date nmtTechnischMutatiemoment) {
		this.nmtTechnischMutatiemoment = nmtTechnischMutatiemoment;
	}
	public String getNmtToekOfDienstTd() {
		return nmtToekOfDienstTd;
	}
	public void setNmtToekOfDienstTd(String nmtToekOfDienstTd) {
		this.nmtToekOfDienstTd = nmtToekOfDienstTd;
	}
	public String getNmtTypeToekenning() {
		return nmtTypeToekenning;
	}
	public void setNmtTypeToekenning(String nmtTypeToekenning) {
		this.nmtTypeToekenning = nmtTypeToekenning;
	}
	public String getNmtVoorkeursCgbCode() {
		return nmtVoorkeursCgbCode;
	}
	public void setNmtVoorkeursCgbCode(String nmtVoorkeursCgbCode) {
		this.nmtVoorkeursCgbCode = nmtVoorkeursCgbCode;
	}
	public String getNmtVoorkeursCgbCodeVorig() {
		return nmtVoorkeursCgbCodeVorig;
	}
	public void setNmtVoorkeursCgbCodeVorig(String nmtVoorkeursCgbCodeVorig) {
		this.nmtVoorkeursCgbCodeVorig = nmtVoorkeursCgbCodeVorig;
	}
	public String getNmtVoorkeursSpcId() {
		return nmtVoorkeursSpcId;
	}
	public void setNmtVoorkeursSpcId(String nmtVoorkeursSpcId) {
		this.nmtVoorkeursSpcId = nmtVoorkeursSpcId;
	}
	public String getNmtVoorkeursSpcIdVorig() {
		return nmtVoorkeursSpcIdVorig;
	}
	public void setNmtVoorkeursSpcIdVorig(String nmtVoorkeursSpcIdVorig) {
		this.nmtVoorkeursSpcIdVorig = nmtVoorkeursSpcIdVorig;
	}




}
