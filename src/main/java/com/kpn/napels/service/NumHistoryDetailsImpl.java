package com.kpn.napels.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.NumberDetailHistoryDTO;
import com.kpn.napels.dto.NummerHistoryResponseDTO;
import com.kpn.napels.entity.NumBestemmingEntity;
import com.kpn.napels.entity.NumCentralegebiedEntity;
import com.kpn.napels.entity.NumHostEntity;
import com.kpn.napels.entity.NumNetNummergebiedEntity;
import com.kpn.napels.entity.NumVoipPlatformEntity;
import com.kpn.napels.repository.NumAangeslotenNumRepo;
import com.kpn.napels.repository.NumBestemmingRepo;
import com.kpn.napels.repository.NumCentralegebiedRepo;
import com.kpn.napels.repository.NumHostRepo;
import com.kpn.napels.repository.NumNetNummergebiedRepo;
import com.kpn.napels.repository.NumNummermutatieRepo;
import com.kpn.napels.repository.NumSoortActieRepo;
import com.kpn.napels.repository.NumStatusRepo;
import com.kpn.napels.repository.NumToekenningRepo;
import com.kpn.napels.repository.NumVoipPlatformRepo;

@Service
public class NumHistoryDetailsImpl implements NumHistoryDetails{
	
private static final String SINGLE_SPACE = " ";

private static final String LARGE_SPACE = "   ";

private static final String BLANK = "";

private static final Logger LOG = LoggerFactory.getLogger(NumHistoryDetailsImpl.class);
	
	@Autowired
	NumAangeslotenNumRepo numAangeslotenNrRepo;
	@Autowired
	NumCentralegebiedRepo numCentralegebiedRepo;
	@Autowired
	NumNetNummergebiedRepo numNetNummergebiedRepo;
	@Autowired
	NumStatusRepo numStatusRepo;
	@Autowired
	NumNummermutatieRepo numNummermutatieRepo;
	@Autowired
	NumToekenningRepo numToekenningRepo;
	@Autowired
	NumVoipPlatformRepo numVoipPlatformRepo;
	@Autowired
	NumSoortActieRepo numSoortActieRepo;
	@Autowired
	NumBestemmingRepo numBestemmingRepo;
	@Autowired
	NumHostRepo numHostRepo;
	
	
	
	NummerHistoryResponseDTO nummerHistoryResponseDTO=new NummerHistoryResponseDTO();
	   

	@Override
	public NummerHistoryResponseDTO serachHistoryByNumLow(NumberDetailHistoryDTO numberDetailHistoryDTO) throws Exception {
		NummerHistoryResponseDTO nummerHistoryResponseDTO = new NummerHistoryResponseDTO();
		try {

			/**GET DATA FROM BESTEMMING ENTITY*/

		

			/**GET DIENEST DATA FROM HOST ENTITY AND CENTRALGEBID ENTITY*/
			NumHostEntity numHostEntityDinest = new NumHostEntity();
			numHostEntityDinest = numHostRepo.getOne(numberDetailHistoryDTO.getNmtInDienstSpcId());

			NumCentralegebiedEntity numCentralegebiedEntityDinest = new NumCentralegebiedEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtInDienstCgbCode())) {
				numCentralegebiedEntityDinest = numCentralegebiedRepo.getOne(Integer.parseInt(numberDetailHistoryDTO.getNmtInDienstCgbCode()));
			}

			/**GET VOORKEURSCENTRALE DATA FROM HOST ENTITY AND CENTRALGEBID ENTITY*/
			NumHostEntity numHostEntityVookers = new NumHostEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursSpcId()) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtVoorkeursSpcId())) {
				numHostEntityVookers = numHostRepo.getOne(numberDetailHistoryDTO.getNmtVoorkeursSpcId());
			}

			NumCentralegebiedEntity numCentralegebiedEntityVookers = new NumCentralegebiedEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursCgbCode()) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtVoorkeursCgbCode())) {
				numCentralegebiedEntityVookers = numCentralegebiedRepo.getOne(Integer.parseInt(numberDetailHistoryDTO.getNmtVoorkeursCgbCode()));
			}

			/**GET DATA FROM NumNetNummergebiedRepo*/
			NumNetNummergebiedEntity numNetNummergebiedEntity = new NumNetNummergebiedEntity(); 
			numNetNummergebiedEntity = numNetNummergebiedRepo.getOne(numberDetailHistoryDTO.getNmtNetnummer());

			/**GET VORIGE DATA FROM HOST ENTITY AND CENTRALGEBID ENTITY*/
			NumHostEntity numHostEntityVorige = new NumHostEntity(); 
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursSpcIdVorig()) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtVoorkeursSpcIdVorig())) {
				numHostEntityVorige = numHostRepo.getOne(numberDetailHistoryDTO.getNmtVoorkeursSpcIdVorig());
			}

			NumCentralegebiedEntity numCentralegebiedEntityVorige = new NumCentralegebiedEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig()) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig())) {
				numCentralegebiedEntityVorige = numCentralegebiedRepo.getOne(Integer.parseInt(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig()));
			}

			/**GET VORIGE DIENEST DATA FROM HOST ENTITY AND CENTRALGEBID ENTITY*/
			NumHostEntity numHostEntityDinestVorige = new NumHostEntity(); 
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig()) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig())) {
				numHostEntityDinestVorige = numHostRepo.getOne(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig());
			}

			NumCentralegebiedEntity numCentralegebiedEntityDinestVorige = new NumCentralegebiedEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtInDienstCgbCodeVorig()) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtInDienstCgbCodeVorig())) {
				numCentralegebiedEntityDinestVorige = numCentralegebiedRepo.getOne(Integer.parseInt(numberDetailHistoryDTO.getNmtInDienstCgbCodeVorig()));
			}

			/**GET VOOR HUIDIG AND VORIGE PLATFORM ENTITY*/
			NumVoipPlatformEntity numVoipPlatformEntityHudig = new NumVoipPlatformEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtPlatformIdNieuw()+BLANK) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtPlatformIdNieuw()+BLANK)) {
				numVoipPlatformEntityHudig = numVoipPlatformRepo.getOne(Integer.parseInt(numberDetailHistoryDTO.getNmtPlatformIdNieuw()+BLANK));
			}

			NumVoipPlatformEntity numVoipPlatformEntityVorige = new NumVoipPlatformEntity();
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtPlatformIdVorig()+BLANK) && !SINGLE_SPACE.equalsIgnoreCase(numberDetailHistoryDTO.getNmtPlatformIdVorig()+BLANK)) {
				numVoipPlatformEntityVorige = numVoipPlatformRepo.getOne(Integer.parseInt(numberDetailHistoryDTO.getNmtPlatformIdVorig()+BLANK));
			}

			nummerHistoryResponseDTO.setMutatiedatum(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getMutaieDate()));

			nummerHistoryResponseDTO.setSoortAktie(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getSoortAktie()));


			nummerHistoryResponseDTO.setNummerLaag(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtNummerLaag()));


			nummerHistoryResponseDTO.setNummerHoog(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtNummerHoog()));


			nummerHistoryResponseDTO.setBestemming(Utils.checkNullOrReturnBalnk(NumBestemmingEntity.getBstBestemmingSoort()));


			nummerHistoryResponseDTO.setOorsproperator(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtOperatorEigenaar()));


			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtNetnummer())) {
				if(!Utils.isNullOrEmpty(numNetNummergebiedEntity.getNaamVerkort())) {
					nummerHistoryResponseDTO.setNetnummergebied(numberDetailHistoryDTO.getNmtNetnummer()+LARGE_SPACE+numNetNummergebiedEntity.getNaamVerkort());
				}else {
					nummerHistoryResponseDTO.setNetnummergebied(numberDetailHistoryDTO.getNmtNetnummer());
				}

			}else {
				nummerHistoryResponseDTO.setNetnummergebied(BLANK);
			}


			nummerHistoryResponseDTO.setHuidigeOperator(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtOperatorExploitant()));


			nummerHistoryResponseDTO.setTypeToekenning(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtTypeToekenning()));
			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursSpcId())) {
				if(!Utils.isNullOrEmpty(numHostEntityVookers.getHstCentraleEenhNaam())) {
					nummerHistoryResponseDTO.setOorspronkelijkeSpcld(numberDetailHistoryDTO.getNmtVoorkeursSpcId()+LARGE_SPACE+numHostEntityVookers.getHstCentraleEenhNaam());
				}else {
					nummerHistoryResponseDTO.setOorspronkelijkeSpcld(numberDetailHistoryDTO.getNmtVoorkeursSpcId());
				}

			}else {
				nummerHistoryResponseDTO.setOorspronkelijkeSpcld(BLANK);
			}

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursCgbCode())) {
				if(!Utils.isNullOrEmpty(numCentralegebiedEntityVookers.getCgbNaamVerkort())) {
					nummerHistoryResponseDTO.setOorspronkelijkeCGB(numberDetailHistoryDTO.getNmtVoorkeursCgbCode()+LARGE_SPACE+numCentralegebiedEntityVookers.getCgbNaamVerkort());
				}else {
					nummerHistoryResponseDTO.setOorspronkelijkeCGB(numberDetailHistoryDTO.getNmtVoorkeursCgbCode());
				}

			}else {
				nummerHistoryResponseDTO.setOorspronkelijkeCGB(BLANK);
			}

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtInDienstSpcId())) {
				if(!Utils.isNullOrEmpty(numHostEntityDinest.getHstCentraleEenhNaam())) {
					nummerHistoryResponseDTO.setHuidigeSpcld(numberDetailHistoryDTO.getNmtInDienstSpcId()+LARGE_SPACE+numHostEntityDinest.getHstCentraleEenhNaam());
				}else {
					nummerHistoryResponseDTO.setHuidigeSpcld(numberDetailHistoryDTO.getNmtInDienstSpcId());
				}

			}else {
				nummerHistoryResponseDTO.setHuidigeSpcld(BLANK);
			}

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtInDienstCgbCode())) {
				if(!Utils.isNullOrEmpty(numCentralegebiedEntityDinest.getCgbNaamVerkort())) {
					nummerHistoryResponseDTO.setHuidigeCGB(numberDetailHistoryDTO.getNmtInDienstCgbCode()+LARGE_SPACE+numCentralegebiedEntityDinest.getCgbNaamVerkort());
				}else {
					nummerHistoryResponseDTO.setHuidigeCGB(numberDetailHistoryDTO.getNmtInDienstCgbCode());
				}

			}else {
				nummerHistoryResponseDTO.setHuidigeCGB(BLANK);
			}


			nummerHistoryResponseDTO.setSoortDienst(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtSoortDienst()));

			nummerHistoryResponseDTO.setRoepNummer(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtRoepnummer()));


			nummerHistoryResponseDTO.setLRI(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtLri()));
			if(!Utils.isEmptyOrNull(numberDetailHistoryDTO.getNmtHeeftCviDienst())){
				nummerHistoryResponseDTO.setHeeftCVI("N");
			}else {
				nummerHistoryResponseDTO.setHeeftCVI(numberDetailHistoryDTO.getNmtHeeftCviDienst());
			}


			nummerHistoryResponseDTO.setCVITelco(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtCviTelco()));

			nummerHistoryResponseDTO.setInidentificatie(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtMutatielabel()));

			nummerHistoryResponseDTO.setStatus(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getStatus()));

			nummerHistoryResponseDTO.setPlatform(Utils.checkNullOrReturnBalnk(numVoipPlatformEntityHudig.getPlatformOmschrijving()));

			nummerHistoryResponseDTO.setVorigehuidigeOp(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtOperatorExploitantVorig()));

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursSpcIdVorig())) {
				if(!Utils.isNullOrEmpty(numHostEntityVorige.getHstCentraleEenhNaam())) {
					nummerHistoryResponseDTO.setVorigeOorsprSpcld(numberDetailHistoryDTO.getNmtVoorkeursSpcIdVorig()+LARGE_SPACE+numHostEntityVorige.getHstCentraleEenhNaam());
				}else {
					nummerHistoryResponseDTO.setVorigeOorsprSpcld(BLANK);
				}

			}else {
				nummerHistoryResponseDTO.setVorigeOorsprSpcld(BLANK);
			}

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig())) {
				if(!Utils.isNullOrEmpty(numCentralegebiedEntityVorige.getCgbNaamVerkort())) {
					nummerHistoryResponseDTO.setVorigeoorsprCGB(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig()+LARGE_SPACE+numCentralegebiedEntityVorige.getCgbNaamVerkort());
				}else {
					nummerHistoryResponseDTO.setVorigeoorsprCGB(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig());
				}

			}else {
				nummerHistoryResponseDTO.setVorigeoorsprCGB(BLANK);
			}

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig())) {
				if(!Utils.isNullOrEmpty(numHostEntityDinestVorige.getHstCentraleEenhNaam())) {
					nummerHistoryResponseDTO.setVorigehuidigeSpcId(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig()+LARGE_SPACE+numHostEntityDinestVorige.getHstCentraleEenhNaam());
				}else {
					nummerHistoryResponseDTO.setVorigehuidigeSpcId(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig());
				}

			}else {
				nummerHistoryResponseDTO.setVorigehuidigeSpcId(BLANK);
			}

			if(!Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig())) {
				if(!Utils.isNullOrEmpty(numCentralegebiedEntityDinestVorige.getCgbNaamVerkort())) {
					nummerHistoryResponseDTO.setVorigehuidigeCGB(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig()+LARGE_SPACE+numCentralegebiedEntityDinestVorige.getCgbNaamVerkort());
				}else {
					nummerHistoryResponseDTO.setVorigehuidigeCGB(numberDetailHistoryDTO.getNmtVoorkeursCgbCodeVorig());
				}

			}else {
				nummerHistoryResponseDTO.setVorigehuidigeCGB(BLANK);
			}

			nummerHistoryResponseDTO.setVorigeSoortDienst(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtSoortDienstVorig()));
			nummerHistoryResponseDTO.setVorigroepnummer(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtRoepnummerVorig()));
			nummerHistoryResponseDTO.setVorigeLRI(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtLriVorig()));
			if(Utils.isNullOrEmpty(numberDetailHistoryDTO.getNmtHeeftCviDienstJnVorig())) {
				nummerHistoryResponseDTO.setHadCVI("N");
			}else {
				nummerHistoryResponseDTO.setHadCVI(numberDetailHistoryDTO.getNmtHeeftCviDienstJnVorig());
			}
			nummerHistoryResponseDTO.setHadCVITelco(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtHeeftCviTelcoVorig()));
			nummerHistoryResponseDTO.setVorigPlatform(Utils.checkNullOrReturnBalnk(numVoipPlatformEntityVorige.getPlatformOmschrijving()));





		}catch (Exception e) {
			LOG.info("EXception ="+e.getMessage());
			throw new Exception("\"Exception while fetching the data for numberlow "+e);
		}
		return nummerHistoryResponseDTO;
	}
	
		
}	
	
	

