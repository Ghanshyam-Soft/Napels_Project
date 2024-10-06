package com.kpn.napels.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpn.napels.common.Constants;
import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.CPSSettingsDTO;
import com.kpn.napels.dto.NumberDetailDTO;
import com.kpn.napels.dto.NumberDetailHistoryDTO;
import com.kpn.napels.dto.NummerDetailResponseDTO;
import com.kpn.napels.dto.NummerDetailsScreenDTO;
import com.kpn.napels.entity.NumAangeslotenEntity;
import com.kpn.napels.entity.NumBedrijfsonderdeelEntity;
import com.kpn.napels.entity.NumBeschikkingEntity;
import com.kpn.napels.entity.NumBestemmingEntity;
import com.kpn.napels.entity.NumCpsInstellingEntity;
import com.kpn.napels.entity.NumHostEntity;
import com.kpn.napels.entity.NumNetNummergebiedEntity;
import com.kpn.napels.entity.NumNetwerkOperatorEntity;
import com.kpn.napels.entity.NumNummermutatieEntity;
import com.kpn.napels.entity.NumOptaReeksEntity;
import com.kpn.napels.entity.NumSoortActieEntity;
import com.kpn.napels.entity.NumStatusEntity;
import com.kpn.napels.entity.NumVoipPlatformEntity;
import com.kpn.napels.exceptions.DAOException;
import com.kpn.napels.repository.NumAangeslotenNumRepo;
import com.kpn.napels.repository.NumBedrijfsonderdeelRepo;
import com.kpn.napels.repository.NumBeschikkingRepo;
import com.kpn.napels.repository.NumBestemmingRepo;
import com.kpn.napels.repository.NumCpsInstellingRepository;
import com.kpn.napels.repository.NumHostRepo;
import com.kpn.napels.repository.NumNetNummergebiedRepo;
import com.kpn.napels.repository.NumNetwerkOperatorRepo;
import com.kpn.napels.repository.NumNummermutatieRepo;
import com.kpn.napels.repository.NumOptaReeksRepo;
import com.kpn.napels.repository.NumSoortActieRepo;
import com.kpn.napels.repository.NumStatusRepo;
import com.kpn.napels.repository.NumToekenningRepo;
import com.kpn.napels.repository.NumVoipPlatformRepo;

@Service
public class NumberDetailServiceImpl implements NumberDetailService {

	private static final String N = "N";

	private static final String ZERO = "0";
	private static final String SINGLE_SPACE = " ";
	private static final Logger LOG = LoggerFactory.getLogger(NumberDetailServiceImpl.class);
	private static final String BLANK = "";

	@Autowired
	private NumAangeslotenNumRepo numAangeslotenNrRepo;
	@Autowired
	private NumCpsInstellingRepository numCpsInstellingRepository;
	@Autowired
	private NumNetNummergebiedRepo numNetNummergebiedRepo;
	@Autowired
	private NumBedrijfsonderdeelRepo numBedrijfsonderdeelRepo;
	@Autowired
	private NumToekenningRepo numToekenningRepo;
	@Autowired
	private NumHostRepo numHostRepo;
	@Autowired
	private NumStatusRepo numStatusRepo;
	@Autowired
	private NumVoipPlatformRepo numVoipPlatformRepo;
	@Autowired
	private NumSoortActieRepo numSoortActieRepo;
	@Autowired
	private NumNummermutatieRepo numNummermutatieRepo;
	@Autowired
	private NumNetwerkOperatorRepo numNetwerkOperatorRepo;
	@Autowired
	private NumOptaReeksRepo numOptaReeksRepo;
	@Autowired
	private NumBeschikkingRepo numBeschikkingRepo;
	@Autowired
	private NumBestemmingRepo numBestemmingRepo;

	String LogMessage = "";

	List<NumberDetailHistoryDTO> numberDetailHistoryDTOList = null;

	/**
	 * 
	 */
	public NummerDetailsScreenDTO searchByNumLow(String numberLow) throws DAOException {

		NummerDetailsScreenDTO nummerDetailsScreenDTO = new NummerDetailsScreenDTO();

		try {

			/* Get data from NumAangesloten table find by numberLow */
			NumberDetailDTO numberDetailDTO = getAangeslotenDataByNumlow(numberLow);

			/* Get data from NumStatus table find by fkStaId of numAangeslotenNr */
			setStatusDescField(numberDetailDTO);

			/*
			 * Get data from NumNetwerkOperator table find by operator id of
			 * numAangeslotenNr and Set Oorsproperator response field
			 */
			setOorsprOperatorField(numberDetailDTO);

			/*
			 * Get data from NumNetwerkOperator table find by FkexploitOperId of
			 * numAangeslotenNr and Set HuidigeOperator response field
			 */
			setHuidigeOperatorField(numberDetailDTO);

			/*
			 * This block of code is to Read data from NumHost,NumCentraleEenheid and
			 * NumCentralegebied tables and set OorsprCentrEenhNaam
			 */
			setOorsprCentrEenhNaamField(numberLow, numberDetailDTO);
			/* This block of code is to set HuidigecentrEenhNaam */
			setHuidigeCentrEenhNaamField(numberLow, numberDetailDTO);

			/* This Block of code is to set naam verkort field */
			setNaamverkortField(numberDetailDTO);

			/* This Block of code is to set platform description */
			setPlatformDescription(numberDetailDTO);

			/* This Block of code is to set Bestemming soort field */
			setBestemmingSoortField(numberLow, numberDetailDTO);

			/* This block of code is to set typetokenning, status tokenning fields */
			List<String> numToekenningEntity = numToekenningRepo.getRecordBynumLag(numberLow);
			LOG.info("NumToekenningEntity object data find by input number low=" + numToekenningEntity);

			if (!numToekenningEntity.isEmpty()) {
				String numtoklaag = numToekenningEntity.get(0);

				if (!Utils.isEmptyOrNull(numtoklaag)) {

					List<Object[]> numToekEntityList = numToekenningRepo.getRecordByfields(numtoklaag);
					if (!numToekEntityList.isEmpty()) {
						Object[] numToekObj = numToekEntityList.get(0);

						LOG.info("numToekEntity:" + numToekObj);
						if (!Utils.isEmptyOrNull(numToekObj)) {

							String hoog = numToekObj[2].toString();
							Long numhoog = Long.parseLong(hoog);
							Long numlaag = Long.parseLong(numberLow);

							if (numhoog >= numlaag) {
								numberDetailDTO.setTokTypeToekenning(numToekObj[0].toString());
								numberDetailDTO.setTokStatusToekenning(numToekObj[1].toString());
								numberDetailDTO.setCgbCode(Integer.parseInt(numToekObj[4].toString()));
								numberDetailDTO.setHstSpcId(numToekObj[3].toString());

								if (numberDetailDTO.getCgbCode() == 0) {
									return null;
								}

								NumBedrijfsonderdeelEntity numBedriEntityforTcr = numBedrijfsonderdeelRepo
										.getRecordBycgbcode(numberDetailDTO.getCgbCode());
								LOG.info("numBedriEntity" + numBedriEntityforTcr);

								if (!Utils.isEmptyOrNull(numBedriEntityforTcr)) {
									if (!Utils.isEmptyOrNull(numBedriEntityforTcr.getBdoNummer())) {
										numberDetailDTO.setBdoNummer(numBedriEntityforTcr.getBdoNummer());
									}
								}
								NumBedrijfsonderdeelEntity numBedriEntityforTcd = numBedrijfsonderdeelRepo
										.getRecordBybdonum(numBedriEntityforTcr.getBdoNummer(), "TCD");

								if (!Utils.isEmptyOrNull(numBedriEntityforTcd)) {
									if (!Utils.isEmptyOrNull(numBedriEntityforTcd.getBdoTcdNummer())) {
										numberDetailDTO.setBdoTcdNummer(numBedriEntityforTcd.getBdoTcdNummer());
									}
								}

								NumHostEntity numHostEntity = numHostRepo.findByhstSpcId(numberDetailDTO.getHstSpcId());
								if (!Utils.isEmptyOrNull(numHostEntity)) {

									if (!Utils.isEmptyOrNull(numHostEntity.getHstSpcId())) {
										numberDetailDTO.setHstSpcId(numHostEntity.getHstSpcId());
									}
									if (!Utils.isEmptyOrNull(numHostEntity.getHstCentraleEenhNaam())) {
										numberDetailDTO.setHstCentraleEenhNaam(numHostEntity.getHstCentraleEenhNaam());
									}
								}

							}

						}

					}

				}
			}
			/**
			 * This block of code is to set bdo tcd nummer and bdo nummer
			 */
			setBdoTcdNummerAndBdoNummer(numberDetailDTO);

			// Response tags for number detail data block
			NummerDetailResponseDTO nummerDetailResponseDTO = new NummerDetailResponseDTO();

			nummerDetailResponseDTO.setNummerLaag(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrNummerLow()));
			LOG.info("Set NummerLaag=" + numberDetailDTO.getAnrNummerLow());

			nummerDetailResponseDTO.setNummerHoog(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrNummerHoog()));
			LOG.info("Set NummerHoog=" + numberDetailDTO.getAnrNummerHoog());

			nummerDetailResponseDTO.setNetnummergebied(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrNetnummer())
					+ " " + Utils.checkNullOrReturnBalnk(numberDetailDTO.getNaamVerkort()));
			LOG.info("Set Netnummergebied=" + numberDetailDTO.getAnrNetnummer() + SINGLE_SPACE
					+ numberDetailDTO.getNaamVerkort());

			nummerDetailResponseDTO.setSoortDienst(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrSoortDienst()));
			LOG.info("Set SoortDienst=" + numberDetailDTO.getAnrSoortDienst());

			nummerDetailResponseDTO.setRoepnummer(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrRoepnummer()));
			LOG.info("Set Roepnummer=" + numberDetailDTO.getAnrRoepnummer());

			nummerDetailResponseDTO.setLRI(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrLri()));
			LOG.info("Set LRI=" + numberDetailDTO.getAnrLri());

			nummerDetailResponseDTO
					.setBestemming(Utils.checkNullOrReturnBalnk(numberDetailDTO.getBstBestemmingSoort()));

			nummerDetailResponseDTO
					.setOorsproperator(Utils.checkNullOrReturnBalnk(numberDetailDTO.getNopInterneOperatorId()));
			LOG.info("Set Oorsproperator=" + numberDetailDTO.getNopInterneOperatorId());

			nummerDetailResponseDTO
					.setTypeToekenning(Utils.checkNullOrReturnBalnk(numberDetailDTO.getTokTypeToekenning()));
			LOG.info("Set Typetoekenning=" + numberDetailDTO.getTokTypeToekenning());

			nummerDetailResponseDTO
					.setOorspronkelijkeSpcId(Utils.checkNullOrReturnBalnk(numberDetailDTO.getHstSpcId()));
			LOG.info("Set OorspronkelijkeSpcId=" + numberDetailDTO.getHstSpcId());

			nummerDetailResponseDTO
					.setOorsprCentrEenhNaam(Utils.checkNullOrReturnBalnk(numberDetailDTO.getHstCentraleEenhNaam()));
			LOG.info("Set OorsprCentrEenhNaam=" + numberDetailDTO.getHstCentraleEenhNaam());

			nummerDetailResponseDTO
					.setOorspronkelijkeCGB(Utils.checkNullOrReturnBalnk(numberDetailDTO.getCgbCode().toString()) + SINGLE_SPACE
							+ Utils.checkNullOrReturnBalnk(numberDetailDTO.getCgbNaamVerkort()));
			LOG.info("Set OorspronkelijkeCGB=" + numberDetailDTO.getCgbCode() + SINGLE_SPACE
					+ numberDetailDTO.getCgbNaamVerkort());

			nummerDetailResponseDTO.setStatusCentraleNummerserie(
					Utils.checkNullOrReturnBalnk(numberDetailDTO.getTokStatusToekenning()));
			LOG.info("Set StatusCentraleNummerserie=" + numberDetailDTO.getTokStatusToekenning());

			nummerDetailResponseDTO
					.setInitieleTCRCode(Utils.checkNullOrReturnBalnk(numberDetailDTO.getBdoNummer().toString()));
			LOG.info("Set InitieleTCRCode=" + numberDetailDTO.getBdoNummer());

			if (!Utils.isEmptyOrNull(numberDetailDTO.getAnrLogischMutatiemoment())) {
				Date date = numberDetailDTO.getAnrLogischMutatiemoment();
				nummerDetailResponseDTO.setMutatiedatumtijd(Utils.getDateInStringFormat(date, "dd-MM-yyyy HH:mm"));
			} else {
				nummerDetailResponseDTO.setMutatiedatumtijd("");
			}

			nummerDetailResponseDTO.setStatus(Utils.checkNullOrReturnBalnk(setStatusDescription(numberDetailDTO.getStaOmschrijving())));
			LOG.info("Set Status=" + numberDetailDTO.getStaOmschrijving());

			nummerDetailResponseDTO
					.setPlatform(Utils.checkNullOrReturnBalnk(numberDetailDTO.getPlatformOmschrijving()));
			LOG.info("Set Platform=" + numberDetailDTO.getPlatformOmschrijving());

			nummerDetailResponseDTO
					.setHuidigeOperator(Utils.checkNullOrReturnBalnk(numberDetailDTO.getFkexploitOperId()));
			LOG.info("Set HuidigeOperator=" + numberDetailDTO.getFkexploitOperId());

			nummerDetailResponseDTO.setHuidigeSpcId(Utils.checkNullOrReturnBalnk(numberDetailDTO.getDienstHstSpcId()));
			LOG.info("Set HuidigeSpcId=" + numberDetailDTO.getDienstHstSpcId());

			nummerDetailResponseDTO.setHuidigeCentrEenhNaam(
					Utils.checkNullOrReturnBalnk(numberDetailDTO.getDienstHstCentraleEenhNaam()));
			LOG.info("Set HuidigeCentrEenhNaam=" + numberDetailDTO.getDienstHstCentraleEenhNaam());

			if (!Utils.isEmptyOrNull(numberDetailDTO.getDienstCgbCode())
					&& !Utils.isEmptyOrNull(numberDetailDTO.getDienstcgbNaamVerkort())) {
				nummerDetailResponseDTO
						.setHuidigeCGB(Utils.checkNullOrReturnBalnk(numberDetailDTO.getDienstCgbCode().toString()) + SINGLE_SPACE
								+ Utils.checkNullOrReturnBalnk(numberDetailDTO.getDienstcgbNaamVerkort()));
				LOG.info("Set HuidigeCGB=" + numberDetailDTO.getDienstCgbCode() + SINGLE_SPACE
						+ numberDetailDTO.getDienstcgbNaamVerkort());
			} else {
				nummerDetailResponseDTO.setHuidigeCGB("");
			}

			if (!Utils.isEmptyOrNull(numberDetailDTO.getBdoTcdNummer())) {
				nummerDetailResponseDTO.setHuidigeTCDcode(numberDetailDTO.getBdoTcdNummer().toString());
				LOG.info("Set HuidigeTCDcode" + numberDetailDTO.getBdoTcdNummer());
			} else {
				nummerDetailResponseDTO.setHuidigeTCDcode(ZERO);
			}
			if (!Utils.isEmptyOrNull(numberDetailDTO.getFkBdoNummer())) {
				nummerDetailResponseDTO.setHuidigeTCRcode(numberDetailDTO.getFkBdoNummer().toString());
				LOG.info("Set HuidigeTCRcode=" + numberDetailDTO.getFkBdoNummer());
			} else {
				nummerDetailResponseDTO.setHuidigeTCRcode(ZERO);
			}
			if (numberDetailDTO.getAnrHeeftCviDienstJn() == null) {
				nummerDetailResponseDTO.setHeeftCVI(N);
			} else {
				nummerDetailResponseDTO.setHeeftCVI(numberDetailDTO.getAnrHeeftCviDienstJn());
				LOG.info("Set HeeftCVI=" + numberDetailDTO.getAnrHeeftCviDienstJn());
			}

			nummerDetailResponseDTO.setCVITelco(Utils.checkNullOrReturnBalnk(numberDetailDTO.getAnrCviTelco()));
			LOG.info("Set CVITelco=" + numberDetailDTO.getAnrCviTelco());

			// Call History Detail Data block

			numberDetailHistoryDTOList = new ArrayList<NumberDetailHistoryDTO>();

			numberDetailHistoryDTOList = historyDataBlock(numberLow, nummerDetailResponseDTO.getNummerHoog());

			// Call CPS settings data block

			List<CPSSettingsDTO> cpsSettingsDTOList = new ArrayList<CPSSettingsDTO>();
			cpsSettingsDTOList = findByNumberlowAndNumberHigh(numberLow, nummerDetailResponseDTO.getNummerHoog());

			// set all three data blocks in nummerDetailsScreenDTO
			nummerDetailsScreenDTO.setNummerDetailResponseDTO(nummerDetailResponseDTO);
			nummerDetailsScreenDTO.setNummerHistoryDTO(numberDetailHistoryDTOList);
			nummerDetailsScreenDTO.setCpsSettingsDTO(cpsSettingsDTOList);
		} catch (Exception e) {
			throw new DAOException("Exception while fetching the data for numberlow " + e);
		}
		return nummerDetailsScreenDTO;
	}

	/**
	 * This block of code is to set HuidigecentrEenhNaam field
	 * @param numberLow
	 * @param numberDetailDTO
	 */
	private void setHuidigeCentrEenhNaamField(String numberLow, NumberDetailDTO numberDetailDTO) {
		List<Object[]> numHostCentralDienstList = numHostRepo.getRecordByDienst(numberLow);
		if (!numHostCentralDienstList.isEmpty()) {
			Object[] numHostCentralDienstObj = numHostCentralDienstList.get(0);
			if (!Utils.isEmptyOrNull(numHostCentralDienstObj)) {

				numberDetailDTO.setDienstHstSpcId(numHostCentralDienstObj[0].toString());
				numberDetailDTO.setDienstHstCentraleEenhNaam(numHostCentralDienstObj[1].toString());
				numberDetailDTO.setDienstCgbCode(Integer.parseInt(numHostCentralDienstObj[2].toString()));
				numberDetailDTO.setDienstcgbNaamVerkort(numHostCentralDienstObj[3].toString());
			}

		}
	}

	/**
	 * This block of code is to Read data from NumHost,NumCentraleEenheid 
	 * and NumCentralegebied tables and set OorsprCentrEenhNaam field
	 * @param numberLow
	 * @param numberDetailDTO
	 */
	private void setOorsprCentrEenhNaamField(String numberLow, NumberDetailDTO numberDetailDTO) {
		List<Object[]> numHostCentralModerList = numHostRepo.getRecordByModer(numberLow);
		if (!numHostCentralModerList.isEmpty()) {
			Object[] numHostCentralModerObj = numHostCentralModerList.get(0);
			if (!Utils.isEmptyOrNull(numHostCentralModerObj)) {

				numberDetailDTO.setHstSpcId(numHostCentralModerObj[0].toString());
				numberDetailDTO.setHstCentraleEenhNaam(numHostCentralModerObj[1].toString());
				numberDetailDTO.setCgbCode(Integer.parseInt(numHostCentralModerObj[2].toString()));
				numberDetailDTO.setCgbNaamVerkort(numHostCentralModerObj[3].toString());

			}
		}
	}
/**
 * Get data from NumAangesloten table find by numberLow
 * @param numberLow
 * @return
 */
	private NumberDetailDTO getAangeslotenDataByNumlow(String numberLow) {
		NumAangeslotenEntity numAangeslotenNrEntity = numAangeslotenNrRepo.findByanrNummerLow(numberLow);
		LOG.info(MDC.get("mdcData")+"NumAangeslotenEntity object data find by input number low=" + numAangeslotenNrEntity);
		NumberDetailDTO numberDetailDTO = new NumberDetailDTO();
		if (!Utils.isEmptyOrNull(numAangeslotenNrEntity)) {
			BeanUtils.copyProperties(numAangeslotenNrEntity, numberDetailDTO);
		}
		LOG.info(MDC.get("mdcData")+"NumberDetailDto"+numberDetailDTO);
		return numberDetailDTO;
	}
/**
 * Get data from NumNetwerkOperator table find by FkexploitOperId of
 *  numAangeslotenNr and Set HuidigeOperator response field
 * @param numberDetailDTO
 */
	private void setHuidigeOperatorField(NumberDetailDTO numberDetailDTO) {
		if (!Utils.isEmptyOrNull(numberDetailDTO.getFkexploitOperId())) {

			NumNetwerkOperatorEntity numNetwerkoperEntity = numNetwerkOperatorRepo
					.findBynopInterneOperatorId(numberDetailDTO.getFkexploitOperId());
			LOG.info("NumNetwerkOperatorEntity object data find by NopInterneOperatorId=" + numNetwerkoperEntity);
			if (!Utils.isEmptyOrNull(numNetwerkoperEntity.getNopInterneOperatorId())) {
				numberDetailDTO.setFkexploitOperId(numNetwerkoperEntity.getNopInterneOperatorId());
				LOG.info("Set FkexploitOperId=" + numberDetailDTO.getFkexploitOperId());
			}

		}
	}
/**
 * Get data from NumNetwerkOperator table find by operator id of numAangeslotenNr 
 * and Set Oorsproperator response field
 * @param numberDetailDTO
 */
	private void setOorsprOperatorField(NumberDetailDTO numberDetailDTO) {
		if (!Utils.isEmptyOrNull(numberDetailDTO.getOperatorId())) {

			NumNetwerkOperatorEntity numNetwerkopEntity = numNetwerkOperatorRepo
					.findBynopInterneOperatorId(numberDetailDTO.getOperatorId());
			LOG.info(MDC.get("mdcData")+"NumNetwerkOperatorEntity object data find by operator id of numAangeslotenNr="
					+ numNetwerkopEntity);
			if (!Utils.isEmptyOrNull(numNetwerkopEntity.getNopInterneOperatorId())) {
				numberDetailDTO.setNopInterneOperatorId(numNetwerkopEntity.getNopInterneOperatorId());
				LOG.info(MDC.get("mdcData")+"Set OperatorId = {}" + numberDetailDTO.getNopInterneOperatorId());
			}

		}
	}
/**
 * Get data from NumStatus table find by fkStaId of numAangeslotenNr and set status description
 * @param numberDetailDTO
 */
	private void setStatusDescField(NumberDetailDTO numberDetailDTO) {
		if (!Utils.isNullOrEmpty(numberDetailDTO.getFkStaId())) {
			NumStatusEntity numStatusEntity = numStatusRepo.findBystaId(numberDetailDTO.getFkStaId());
			LOG.info(MDC.get("mdcData")+"NumStatusEntity object data find by fkStaId of numAangeslotenNr=" + numStatusEntity);
			if (!Utils.isEmptyOrNull(numStatusEntity)) {
				numberDetailDTO.setStaOmschrijving(numStatusEntity.getStaOmschrijving());
				LOG.info(MDC.get("mdcData")+"Set StaOmschrijving = {}", numberDetailDTO.getStaOmschrijving());
			}
		}
	}
/**
 * Netnummergebied field consist of NNG_NETNUMMER and NNG_NAAM_VERKORT 
 * this block of code is to set Naamverkort Field 		
 * @param numberDetailDTO
 */
	private void setNaamverkortField(NumberDetailDTO numberDetailDTO) {
		if (!Utils.isNullOrEmpty(numberDetailDTO.getAnrNetnummer())) {
			NumNetNummergebiedEntity numNetNummergebiedEntity = numNetNummergebiedRepo
					.findBynetNummer(numberDetailDTO.getAnrNetnummer());
			LOG.info(MDC.get("mdcData")+"NumNetNummergebiedEntity object data find by anrnetnummer of numAangeslotenNr="
					+ numNetNummergebiedEntity);
			if (!Utils.isEmptyOrNull(numNetNummergebiedEntity)) {
				if (!Utils.isEmptyOrNull(numNetNummergebiedEntity.getNaamVerkort())) {
					numberDetailDTO.setNaamVerkort(numNetNummergebiedEntity.getNaamVerkort());
				    LOG.info(MDC.get("mdcData")+"Set NaamVerkort = {}", numberDetailDTO.getNaamVerkort());
				}
			}
		}
	}

	/**
	 * This Block of code is to set Platform Description
	 * 
	 * @param numberDetailDTO
	 */
	private void setPlatformDescription(NumberDetailDTO numberDetailDTO) {
		if (!Utils.isEmptyOrNull(numberDetailDTO.getFkPlatformId())) {
			NumVoipPlatformEntity numVoipPlatformEntity = numVoipPlatformRepo
					.findByplatformId(numberDetailDTO.getFkPlatformId());
			LOG.info(MDC.get("mdcData")+"NumVoipPlatformEntity object data find by fkplatformId of numAangeslotenNr = {}",
					numVoipPlatformEntity);
			if (!Utils.isEmptyOrNull(numVoipPlatformEntity)) {
				numberDetailDTO.setPlatformOmschrijving(numVoipPlatformEntity.getPlatformOmschrijving());
				LOG.info(MDC.get("mdcData")+"Set PlatformOmschrijving = {}", numberDetailDTO.getPlatformOmschrijving());
				numberDetailDTO.setPlatformId(numVoipPlatformEntity.getPlatformId());
			} else {
				NumVoipPlatformEntity numVoipEntity = numVoipPlatformRepo.getRecordWithpidZero();
				if (!Utils.isEmptyOrNull(numVoipEntity)) {
					numberDetailDTO.setPlatformOmschrijving(numVoipEntity.getPlatformOmschrijving());
					LOG.info(MDC.get("mdcData")+"Set PlatformOmschrijving = {}", numberDetailDTO.getPlatformOmschrijving());
					numberDetailDTO.setPlatformId(numVoipEntity.getPlatformId());
					
				}

			}

		}
	}

	/**
	 * This Block of code is to set Bestemming soort field.
	 * 
	 * @param numberLow
	 * @param numberDetailDTO
	 */
	private void setBestemmingSoortField(String numberLow, NumberDetailDTO numberDetailDTO) {
		int count = numberLow.trim().length() - 2;

		for (int i = 0; i < count; i++) {

			String lclTelNum = numberLow.substring(0, count - i);

			NumOptaReeksEntity numOptaEntity = numOptaReeksRepo.findByoprTeleNummerSter(lclTelNum);
			LOG.info(MDC.get("mdcData")+"NumOptaReeksEntity:" + numOptaEntity);

			if (!Utils.isEmptyOrNull(numOptaEntity)) {

				if (!Utils.isEmptyOrNull(numOptaEntity.getFkBskId())) {
					NumBeschikkingEntity numBeschEntity = numBeschikkingRepo.findBybskId(numOptaEntity.getFkBskId());

					if (!Utils.isEmptyOrNull(numBeschEntity.getBskBestemmingSoort())) {
						NumBestemmingEntity numBestemEntity = numBestemmingRepo
								.findBybstBestemmingSoort(numBeschEntity.getBskBestemmingSoort());

						if (!Utils.isEmptyOrNull(numBestemEntity)) {
							if (!Utils.isEmptyOrNull(numBestemEntity.getBstId())) {
								numberDetailDTO.setBstId(numBestemEntity.getBstId());

							}
							if (!Utils.isEmptyOrNull(numBestemEntity.getBstBestemmingSoort())) {
								numberDetailDTO.setBstBestemmingSoort(numBestemEntity.getBstBestemmingSoort());
								LOG.info(MDC.get("mdcData")+"Set BstBestemmingSoort = {}" + numberDetailDTO.getBstBestemmingSoort());
							}
						}

					}

				}

				break;
			}
		}
	}

	/**
	 * This block of code is to set bdo tcd nummer and bdo nummer
	 * 
	 * @param numberDetailDTO
	 */
	private void setBdoTcdNummerAndBdoNummer(NumberDetailDTO numberDetailDTO) {
		if (!Utils.isEmptyOrNull(numberDetailDTO.getCgbCode())) {
			if (numberDetailDTO.getCgbCode() != 0) {
				NumBedrijfsonderdeelEntity numBedriEntityforTcr = numBedrijfsonderdeelRepo
						.getRecordBycgbcode(numberDetailDTO.getCgbCode());
				LOG.info(MDC.get("mdcData")+"numBedriEntity" + numBedriEntityforTcr);

				if (!Utils.isEmptyOrNull(numBedriEntityforTcr)) {
					if (!Utils.isEmptyOrNull(numBedriEntityforTcr.getBdoNummer())) {
						numberDetailDTO.setBdoNummer(numBedriEntityforTcr.getBdoNummer());
						LOG.info(MDC.get("mdcData")+"Set Bdo Nummer = {}"+numberDetailDTO.getBdoNummer());
					}
				}
				NumBedrijfsonderdeelEntity numBedriEntityforTcd = numBedrijfsonderdeelRepo
						.getRecordBybdonum(numBedriEntityforTcr.getBdoNummer(), "TCD");

				if (!Utils.isEmptyOrNull(numBedriEntityforTcd)) {
					if (!Utils.isEmptyOrNull(numBedriEntityforTcd.getBdoTcdNummer())) {
						numberDetailDTO.setBdoTcdNummer(numBedriEntityforTcd.getBdoTcdNummer());
						LOG.info(MDC.get("mdcData")+"Set Bdo Tcd Nummer = {}"+numberDetailDTO.getBdoTcdNummer());
					}
				}
			}

		}
	}

	/**
	 * This method will return CPSsetting details
	 * 
	 * @param numberlow
	 * @param numberhigh
	 * @return
	 */
	private List<CPSSettingsDTO> findByNumberlowAndNumberHigh(String numberlow, String numberhigh) {
		if (Utils.isNullOrEmpty(numberlow)) {
			LogMessage = String.format(MDC.get("mdcData")+"NumberLow value is invalid {%s}", numberlow);
			LOG.info(LogMessage);
			return null;
		}
		if (Utils.isNullOrEmpty(numberhigh)) {
			LogMessage = String.format(MDC.get("mdcData")+"NumberHigh value is invalid {%s}", numberhigh);
			LOG.info(LogMessage);
			return null;
		}
		List<CPSSettingsDTO> cpsSettingsDTOList = new ArrayList<CPSSettingsDTO>();
		try {
			List<NumCpsInstellingEntity> numCpsInstellingEntityList = numCpsInstellingRepository.getCpsDetails(numberlow,
					numberhigh);
			for (NumCpsInstellingEntity numCpsInstellingEntity : numCpsInstellingEntityList) {
				if (!Utils.isEmptyOrNull(numCpsInstellingEntityList)) {
					CPSSettingsDTO cpsSettingsDTO = new CPSSettingsDTO();
					BeanUtils.copyProperties(numCpsInstellingEntity, cpsSettingsDTO);
					cpsSettingsDTOList.add(cpsSettingsDTO);

				}

			}
			LOG.info(MDC.get("mdcData")+"cpsSettingsDTOList=" + cpsSettingsDTOList.toString());
		} catch (Exception ex) {
			LOG.error("Exception:" + ex.getMessage());
		}
		return cpsSettingsDTOList;
	}

	/**
	 * This method will return History data block details
	 * 
	 * @param numberlow
	 * @param numberhigh
	 * @return
	 */
	private List<NumberDetailHistoryDTO> historyDataBlock(String numberlow, String numberhigh) {

		if (Utils.isNullOrEmpty(numberlow)) {
			LogMessage = String.format(MDC.get("mdcData")+"NumberLow value is invalid {%s}", numberlow);
			LOG.info(LogMessage);
			return null;
		}
		if (Utils.isNullOrEmpty(numberhigh)) {
			LogMessage = String.format(MDC.get("mdcData")+"NumberHigh value is invalid {%s}", numberhigh);
			LOG.info(LogMessage);
			return null;
		}
		numberDetailHistoryDTOList = new ArrayList<NumberDetailHistoryDTO>();
		try {

			/* Get Data From NumNummermutatie table */

			List<NumNummermutatieEntity> numNummermutatieEntityList = numNummermutatieRepo
					.getRecordByNumlowNumhigh(numberlow, numberhigh);

			for (NumNummermutatieEntity numNummermutatieEntity : numNummermutatieEntityList) {

				NumberDetailHistoryDTO numberDetailHistoryDTO = new NumberDetailHistoryDTO();

				if (!Utils.isEmptyOrNull(numNummermutatieEntity)) {

					BeanUtils.copyProperties(numNummermutatieEntity, numberDetailHistoryDTO);

					if (!Utils.isEmptyOrNull(
							numNummermutatieEntity.getNumNummermutatiePK().getNmtLogischMutatiemoment())) {
						Date date = numNummermutatieEntity.getNumNummermutatiePK().getNmtLogischMutatiemoment();
						numberDetailHistoryDTO.setMutaieDate(Utils.getDateInStringFormat(date, "dd-MM-yyyy HH:mm:ss"));
					}

					numberDetailHistoryDTO
							.setNmtNummerLaag(numNummermutatieEntity.getNumNummermutatiePK().getNmtNummerLaag());

					numberDetailHistoryDTO.setNmtBestemmingId(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtBestemmingId()));

					numberDetailHistoryDTO
							.setNmtCviKenmerk(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtCviKenmerk()));

					numberDetailHistoryDTO.setNmtCviKenmerkVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtCviKenmerkVorig()));

					numberDetailHistoryDTO
							.setNmtCviTelco(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtCviTelco()));

					numberDetailHistoryDTO.setNmtHeeftCviDienst(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtHeeftCviDienst()));

					numberDetailHistoryDTO.setNmtHeeftCviDienstJnVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtHeeftCviDienstJnVorig()));

					numberDetailHistoryDTO.setNmtHeeftCviTelcoVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtHeeftCviTelcoVorig()));

					numberDetailHistoryDTO.setNmtHeeftCviZmDienstYn(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtHeeftCviZmDienstYn()));

					numberDetailHistoryDTO.setNmtHeeftCviZmYnVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtHeeftCviZmYnVorig()));

					numberDetailHistoryDTO.setNmtInDienstCgbCode(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtInDienstCgbCode()));

					numberDetailHistoryDTO.setNmtInDienstCgbCodeVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtInDienstCgbCodeVorig()));

					numberDetailHistoryDTO.setNmtInDienstSpcId(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtInDienstSpcId()));

					numberDetailHistoryDTO.setNmtInDienstSpcIdVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtInDienstSpcIdVorig()));

					numberDetailHistoryDTO.setNmtLaagIsHoogJn(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtLaagIsHoogJn()));

					numberDetailHistoryDTO.setNmtLaatsteSoortActieCode(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtLaatsteSoortActieCode()));

					numberDetailHistoryDTO.setNmtLri(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtLri()));

					numberDetailHistoryDTO
							.setNmtLriVorig(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtLriVorig()));

					numberDetailHistoryDTO.setNmtMutatieGebruikerId(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtMutatieGebruikerId()));

					numberDetailHistoryDTO.setNmtMutatielabel(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtMutatielabel()));

					numberDetailHistoryDTO
							.setNmtNetnummer(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtNetnummer()));

					numberDetailHistoryDTO
							.setNmtNummerHoog(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtNummerHoog()));

					numberDetailHistoryDTO.setNmtOperatorEigenaar(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtOperatorEigenaar()));

					numberDetailHistoryDTO.setNmtOperatorExploitant(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtOperatorExploitant()));

					numberDetailHistoryDTO.setNmtOperatorExploitantVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtOperatorExploitantVorig()));

					if (!Utils.isEmptyOrNull(numberDetailHistoryDTO.getNmtPlatformIdNieuw())) {
						numberDetailHistoryDTO.setNmtPlatformIdNieuw(numberDetailHistoryDTO.getNmtPlatformIdNieuw());
					}

					if (!Utils.isEmptyOrNull(numberDetailHistoryDTO.getNmtPlatformIdVorig())) {
						numberDetailHistoryDTO.setNmtPlatformIdVorig(numberDetailHistoryDTO.getNmtPlatformIdVorig());
					}

					numberDetailHistoryDTO
							.setNmtRoepnummer(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtRoepnummer()));

					numberDetailHistoryDTO.setNmtRoepnummerVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtRoepnummerVorig()));

					numberDetailHistoryDTO.setNmtSoortDienst(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtSoortDienst()));

					numberDetailHistoryDTO.setNmtSoortDienstVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtSoortDienstVorig()));

					if (!Utils.isEmptyOrNull(numberDetailHistoryDTO.getNmtTechnischMutatiemoment())) {
						numberDetailHistoryDTO
								.setNmtTechnischMutatiemoment(numberDetailHistoryDTO.getNmtTechnischMutatiemoment());
					}

					numberDetailHistoryDTO
							.setNmtStatusCode(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtStatusCode()));

					numberDetailHistoryDTO.setNmtStatusToekenning(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtStatusToekenning()));

					numberDetailHistoryDTO.setNmtStatusToekenningVorig(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtStatusToekenningVorig()));

					numberDetailHistoryDTO.setNmtTypeToekenning(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtTypeToekenning()));

					numberDetailHistoryDTO.setNmtToekOfDienstTd(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtToekOfDienstTd()));

					numberDetailHistoryDTO.setNmtVoorkeursCgbCode(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtVoorkeursCgbCode()));

					numberDetailHistoryDTO.setNmtVoorkeursSpcId(
							Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getNmtVoorkeursSpcId()));

					numberDetailHistoryDTO
							.setSoortAktie(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getSoortAktie()));

					numberDetailHistoryDTO.setStatus(Utils.checkNullOrReturnBalnk(numberDetailHistoryDTO.getStatus()));

					/* Get SoortActie Description from NumSoortActie table */
					NumSoortActieEntity numSoortActieEntity = numSoortActieRepo
							.findBysacId(numberDetailHistoryDTO.getNmtLaatsteSoortActieCode());
					if (!Utils.isEmptyOrNull(numSoortActieEntity.getSacOmschrijving())) {

						numberDetailHistoryDTO.setSoortAktie(Utils.checkNullOrReturnBalnk(
								setSoortActieDescription(numSoortActieEntity.getSacOmschrijving())));

					}
					/* Get status Description from NumStatus table */
					NumStatusEntity numStatusEntity = numStatusRepo
							.findBystaId(numberDetailHistoryDTO.getNmtStatusCode());
					if (!Utils.isEmptyOrNull(numStatusEntity.getStaOmschrijving())) {

						numberDetailHistoryDTO.setStatus(Utils
								.checkNullOrReturnBalnk(setStatusDescription(numStatusEntity.getStaOmschrijving())));

					}

				}
				numberDetailHistoryDTOList.add(numberDetailHistoryDTO);
				LOG.info(MDC.get("mdcData")+"numberDetailHistoryDTOList:" + numberDetailHistoryDTOList);

			}

		} catch (Exception ex) {
			LOG.error("Exception:" + ex.getMessage());
		}
		return numberDetailHistoryDTOList;

	}

	private String setStatusDescription(String statusdesc) {

		if (statusdesc.equals(Constants.uitgegevenAanOlo)) {
			return "Uitgegeven aan OLO";
		} else if (statusdesc.equals(Constants.externGeporteerd)) {
			return "Extern geporteerd";
		} else if (statusdesc.equals(Constants.geinporteerd)) {
			return "Geinporteerd";
		} else if (statusdesc.equals(Constants.inDienstOpVoorkeursCe)) {
			return "In dienst op voorkeurscentrale-eenheid";
		} else if (statusdesc.equals(Constants.voorraadOpCe)) {
			return "Voorraad op centrale-eenheid";
		}

		else if (statusdesc.equals(Constants.inDienstOpNietVoorkeurs)) {
			return "In dienst op niet-voorkeurscentrale-eenheid";
		}

		else if (statusdesc.equals(Constants.geuitporteerd)) {
			return "Uit geporteerd";
		}

		else {
			return BLANK;
		}

	}

	private String setSoortActieDescription(String soortactieDesc) {
		if (soortactieDesc.equals(Constants.optaGifte)) {
			return "uitgifte door OPTA";
		} else if (soortactieDesc.equals(Constants.optaTervgname)) {
			return "Inname door OPTA";
		} else if (soortactieDesc.equals(Constants.kpnToekenning)) {
			return "Toekenning aan centrale";
		} else if (soortactieDesc.equals(Constants.kpnToekVerwijderen)) {
			return "Verwijdering van centrale";
		} else if (soortactieDesc.equals(Constants.kpnToekWijziging)) {
			return "Wijziging toekenningsgegevens";
		} else if (soortactieDesc.equals(Constants.nrAanleg)) {
			return "Aanleg";
		} else if (soortactieDesc.equals(Constants.nrOphef)) {
			return "Ophef";
		} else if (soortactieDesc.equals(Constants.nrExtrnportering)) {
			return "Externe portering";
		} else if (soortactieDesc.equals(Constants.nrInportering)) {
			return "Inportering";
		} else if (soortactieDesc.equals(Constants.nrUitportering)) {
			return "Uitportering";
		} else if (soortactieDesc.equals(Constants.nrLocatieportering)) {
			return "Locatieportering";
		} else if (soortactieDesc.equals(Constants.nrServiceportering)) {
			return "Serviceportering";
		} else if (soortactieDesc.equals(Constants.nrTechnPortering)) {
			return "Technische portering";
		} else if (soortactieDesc.equals(Constants.nrWijzigingCgb)) {
			return "Wijziging CGB	";
		} else if (soortactieDesc.equals(Constants.aanlegCvi)) {
			return "CVI dienst instellen";
		} else if (soortactieDesc.equals(Constants.ophefCvi)) {
			return "CVI dienst opheffen";
		} else if (soortactieDesc.equals(Constants.migratieCvi)) {
			return "CVI dienst migratie";
		} else if (soortactieDesc.equals(Constants.platformInstelling)) {
			return "Platform instellen";
		} else {
			return BLANK;
		}

	}

}