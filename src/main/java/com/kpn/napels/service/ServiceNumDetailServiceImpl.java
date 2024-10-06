package com.kpn.napels.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.ServiceNumHistResponseDTO;
import com.kpn.napels.dto.ServiceNummerDetailDTO;
import com.kpn.napels.dto.ServiceNummerDetailResponseDTO;
import com.kpn.napels.dto.ServiceNummerScreenDTO;
import com.kpn.napels.entity.NumNetwerkOperatorEntity;
import com.kpn.napels.entity.NumServiceHistoriePKEntity;
import com.kpn.napels.entity.NumServiceNummerEntity;
import com.kpn.napels.entity.NumServicenumHistorieEntity;
import com.kpn.napels.entity.NumServicenummerLriEntity;
import com.kpn.napels.entity.NumServicenummerLriPKEntity;
import com.kpn.napels.entity.NumSoortActieEntity;
import com.kpn.napels.entity.NumVoipPlatformEntity;
import com.kpn.napels.exceptions.DAOException;
import com.kpn.napels.repository.NumNetwerkOperatorRepo;
import com.kpn.napels.repository.NumServiceNummerRepo;
import com.kpn.napels.repository.NumServicenumHistorieRepo;
import com.kpn.napels.repository.NumServicenummerLriRepo;
import com.kpn.napels.repository.NumSoortActieRepo;
import com.kpn.napels.repository.NumVoipPlatformRepo;

@Service
public class ServiceNumDetailServiceImpl implements ServiceNumDetailService {

	private static final Logger LOG = LoggerFactory.getLogger(ServiceNumDetailServiceImpl.class);

	@Autowired
	NumServiceNummerRepo numServiceNummerRepo;
	@Autowired
	NumVoipPlatformRepo numVoipPlatformRepo;
	@Autowired
	NumSoortActieRepo numSoortActieRepo;
	@Autowired
	NumServicenummerLriRepo numServicenummerLriRepo;
	@Autowired
	NumServicenumHistorieRepo numServiceHistorieRepo;

	public ServiceNummerScreenDTO searchByNumLow(String numberLow) throws DAOException {
		ServiceNummerDetailResponseDTO serviceNumDetailRespDTO = new ServiceNummerDetailResponseDTO();
		ServiceNummerDetailDTO serviceNumDetailDTO = new ServiceNummerDetailDTO();

		NumServiceNummerEntity numServiceNummerEntity = numServiceNummerRepo.findBysnrNumberLow(numberLow);

		LOG.info("NumServiceNummerEntity object data find by numberLow:" + numServiceNummerEntity);
		if (!Utils.isEmptyOrNull(numServiceNummerEntity)) {

			BeanUtils.copyProperties(numServiceNummerEntity, serviceNumDetailDTO);
			LOG.info("serviceNummerDetailDTO after copying details from numServiceNummerEntity" + serviceNumDetailDTO);
		}

		serviceNumDetailRespDTO.setNummerLaag(numberLow);
		LOG.info("Set NummerLaag=" + numberLow);
		serviceNumDetailRespDTO.setNummerHoog(serviceNumDetailDTO.getSnrNumberHigh());
		LOG.info("Set NummerHoog=" + serviceNumDetailDTO.getSnrNumberHigh());

		if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrBestemmingId())) {
			serviceNumDetailRespDTO.setBestemming(serviceNumDetailDTO.getSnrBestemmingId());
			LOG.info("Set Bestemming=" + serviceNumDetailDTO.getSnrBestemmingId());
		} else {
			serviceNumDetailRespDTO.setBestemming("");
		}

		if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrLaatsteMut())) {
			Date date = serviceNumDetailDTO.getSnrLaatsteMut();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String strDate = formatter.format(date);
			serviceNumDetailRespDTO.setLaatsteMutatie(strDate);
			LOG.info("Set LaatsteMutatie=" + strDate);
		} else {
			serviceNumDetailRespDTO.setLaatsteMutatie("");
		}

		NumSoortActieEntity numSoortActieEntity = numSoortActieRepo.findBysacId(serviceNumDetailDTO.getFkScId());
		LOG.info("NumSoortActieEntity object data find by fkscId of NumServiceNummerEntity:" + numSoortActieEntity);
		if (!Utils.isEmptyOrNull(numSoortActieEntity)) {
			BeanUtils.copyProperties(numSoortActieEntity, serviceNumDetailDTO);

		}

		if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSacOmschrijving())) {
			serviceNumDetailRespDTO.setLaatsteSoortActie(serviceNumDetailDTO.getSacOmschrijving());
			LOG.info("Set LaatsteSoortActie:" + serviceNumDetailDTO.getSacOmschrijving());
		} else {
			serviceNumDetailRespDTO.setLaatsteSoortActie("");
		}

		if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrGebIdMut())) {
			serviceNumDetailRespDTO.setGebruikerId(serviceNumDetailDTO.getSnrGebIdMut());
			LOG.info("Set GebruikerId=" + serviceNumDetailDTO.getSnrGebIdMut());
		} else {
			serviceNumDetailRespDTO.setGebruikerId("");
		}

		serviceNumDetailRespDTO.setBtwCode("0");
		serviceNumDetailRespDTO.setOperatorId("");
		serviceNumDetailRespDTO.setAccessAreaCode("");
		serviceNumDetailRespDTO.setTariefCode("");
		serviceNumDetailRespDTO.setPulsCode("");
		serviceNumDetailRespDTO.setPlatform("");
		serviceNumDetailRespDTO.setLri("");

		if (!serviceNumDetailDTO.getSacId().equals("G")) {

			if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getFkNopInterneOpId())) {
				serviceNumDetailRespDTO.setOperatorId(serviceNumDetailDTO.getFkNopInterneOpId());
				LOG.info("Set OperatorId=" + serviceNumDetailDTO.getFkNopInterneOpId());
			} else {
				serviceNumDetailRespDTO.setOperatorId("");
			}

			if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrAccessCode())) {
				serviceNumDetailRespDTO.setAccessAreaCode(serviceNumDetailDTO.getSnrAccessCode());
				LOG.info("Set AccessAreaCode=" + serviceNumDetailDTO.getSnrAccessCode());
			} else {
				serviceNumDetailRespDTO.setAccessAreaCode("");
			}
			if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrBtwCode())) {
				serviceNumDetailRespDTO.setBtwCode(Integer.toString(serviceNumDetailDTO.getSnrBtwCode()));
				LOG.info("Set BtwCode=" + serviceNumDetailDTO.getSnrBtwCode());
			} else {
				serviceNumDetailRespDTO.setBtwCode("");
			}
			if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrTarrifCode())) {
				serviceNumDetailRespDTO.setTariefCode(serviceNumDetailDTO.getSnrTarrifCode());
				LOG.info("Set TarrifCode=" + serviceNumDetailDTO.getSnrBtwCode());
			} else {
				serviceNumDetailRespDTO.setTariefCode("");
			}
			if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrPulsCode())) {
				serviceNumDetailRespDTO.setPulsCode(serviceNumDetailDTO.getSnrPulsCode());
				LOG.info("Set PulsCode=" + serviceNumDetailDTO.getSnrPulsCode());
			} else {
				serviceNumDetailRespDTO.setPulsCode("");
			}

			if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getFkNumVoipPlatformId())) {

				NumVoipPlatformEntity numVoipPlatformEntity = numVoipPlatformRepo
						.findByplatformId(serviceNumDetailDTO.getFkNumVoipPlatformId());
				LOG.info("NumVoipPlatformEntity object data find by platformId of serviceNummerDetailDTO"
						+ numVoipPlatformEntity);
				if (!Utils.isEmptyOrNull(numVoipPlatformEntity.getPlatformOmschrijving())) {
					serviceNumDetailRespDTO.setPlatform(numVoipPlatformEntity.getPlatformOmschrijving());
					LOG.info("Set Platform:" + numVoipPlatformEntity.getPlatformOmschrijving());
				} else {
					serviceNumDetailRespDTO.setPlatform("");
					LOG.info("Set Platform:" + "");
				}
			}

			String nopIntopId = serviceNumDetailDTO.getFkNopInterneOpId();
			String areaCode = serviceNumDetailDTO.getSnrAccessCode();
			String fkBstId = serviceNumDetailDTO.getSnrBestemmingId();
			long platformId = serviceNumDetailDTO.getFkNumVoipPlatformId();

			NumServicenummerLriEntity numServicenummerLriEntity = numServicenummerLriRepo
					.findByNumServicenummerLriPKEntity(
							new NumServicenummerLriPKEntity(nopIntopId, areaCode, fkBstId, platformId));

			if (!Utils.isEmptyOrNull(numServicenummerLriEntity.getSliLri())) {
				serviceNumDetailRespDTO.setLri(numServicenummerLriEntity.getSliLri());
				LOG.info("Set Lri:" + numServicenummerLriEntity.getSliLri());
			} else {
				serviceNumDetailRespDTO.setLri("");
			}
		}

		// History Data block code

		String numHigh = null;
		Date mutDate = null;

		if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrNumberHigh())) {
			numHigh = serviceNumDetailDTO.getSnrNumberHigh();
		}

		if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnrLaatsteMut())) {
			mutDate = serviceNumDetailDTO.getSnrLaatsteMut();
		}
		// NumServicenumHistorieEntity
		// numServiceHistorieEntity=numServiceHistorieRepo.findByNumServiceHistoriePKEntity(new
		// NumServiceHistoriePKEntity(numberLow,latstemutDate));

		List<ServiceNumHistResponseDTO> serviceNumHistRespDTOList = new ArrayList<ServiceNumHistResponseDTO>();
		List<NumServicenumHistorieEntity> numServiceHistorieEntityList = numServiceHistorieRepo
				.getRecordByfields(numberLow, numHigh);

		LOG.info("NumServicenumHistorieEntity:" + numServiceHistorieEntityList);
		if (!Utils.isEmptyOrNull(numServiceHistorieEntityList)) {

			for (NumServicenumHistorieEntity numServiceHist : numServiceHistorieEntityList) {
				BeanUtils.copyProperties(numServiceHist, serviceNumDetailDTO);

				ServiceNumHistResponseDTO serviceNumHistRespDTO = new ServiceNumHistResponseDTO();
				switch (numServiceHist.getSnhSoortActie()) {

				case "F":
					serviceNumHistRespDTO.setSoortActie("Geactiveerd");
					break;
				case "G":
					serviceNumHistRespDTO.setSoortActie("Gedeactiveerd");
					break;
				case "H":
					serviceNumHistRespDTO.setSoortActie("Tariefswijziging");
					break;
				case "I":
					serviceNumHistRespDTO.setSoortActie("Portering");
					break;
				case "V":
					serviceNumHistRespDTO.setSoortActie("Platform inst.");
					break;
				default:
					serviceNumHistRespDTO.setSoortActie("HELP!!!!");
					break;

				}

				if (numServiceHist.getSnhSoortActie().equals("G")) {

					serviceNumHistRespDTO.setOperator("-");
					serviceNumHistRespDTO.setAccessAreaCode("-");
					serviceNumHistRespDTO.setBtwCode("0");
					serviceNumHistRespDTO.setPulseCode("-");
					serviceNumHistRespDTO.setTariefCode("-");
				}

				else {
					serviceNumHistRespDTO.setOperator(numServiceHist.getSnhOperatorExploitant());
					serviceNumHistRespDTO.setAccessAreaCode(numServiceHist.getSnhAccessAreaCode());
					serviceNumHistRespDTO.setBtwCode(numServiceHist.getSnhBtwCode().toString());
					serviceNumHistRespDTO.setPulseCode(numServiceHist.getSnhPulsCode());
					serviceNumHistRespDTO.setTariefCode(numServiceHist.getSnhTariefCode());

				}

				if (!Utils.isEmptyOrNull(
						serviceNumDetailDTO.getNumServiceHistoriePKEntity().getSnhLaatsteMutatieMoment())) {
					Date date = serviceNumDetailDTO.getNumServiceHistoriePKEntity().getSnhLaatsteMutatieMoment();
					SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					String strDate = formatter.format(date);

					serviceNumHistRespDTO.setDatum(strDate);
					LOG.info("Set Mutatie Date:" + strDate);
				} else {
					serviceNumHistRespDTO.setDatum("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhPlatformId().toString())) {
					serviceNumHistRespDTO.setPlatform(serviceNumDetailDTO.getSnhPlatformId().toString());
					LOG.info("Set Platform:" + serviceNumDetailDTO.getSnhPlatformId().toString());
				} else {
					serviceNumHistRespDTO.setPlatform("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhGebruikerIdMutatieMomen())) {
					serviceNumHistRespDTO.setGebruikerId(serviceNumDetailDTO.getSnhGebruikerIdMutatieMomen());
					LOG.info("Set GebruikerId:" + serviceNumDetailDTO.getSnhGebruikerIdMutatieMomen());
				} else {
					serviceNumHistRespDTO.setGebruikerId("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhBtwCode().toString())) {
					serviceNumHistRespDTO.setBtwCode(serviceNumDetailDTO.getSnhBtwCode().toString());
					LOG.info("Set Btw Code:" + serviceNumDetailDTO.getSnhBtwCode().toString());
				} else {
					serviceNumHistRespDTO.setBtwCode("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhOperatorExploitant())) {
					serviceNumHistRespDTO.setOperator(serviceNumDetailDTO.getSnhOperatorExploitant());
					LOG.info("Set Operator:" + serviceNumDetailDTO.getSnhOperatorExploitant());
				} else {
					serviceNumHistRespDTO.setOperator("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhPulsCode())) {
					serviceNumHistRespDTO.setPulseCode(serviceNumDetailDTO.getSnhPulsCode());
					LOG.info("Set Pulse Code:" + serviceNumDetailDTO.getSnhPulsCode());
				} else {
					serviceNumHistRespDTO.setPulseCode("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhTariefCode())) {
					serviceNumHistRespDTO.setTariefCode(serviceNumDetailDTO.getSnhTariefCode());
					LOG.info("Set Tarief Code:" + serviceNumDetailDTO.getSnhTariefCode());
				} else {
					serviceNumHistRespDTO.setTariefCode("");
				}
				if (!Utils.isEmptyOrNull(serviceNumDetailDTO.getSnhAccessAreaCode())) {
					serviceNumHistRespDTO.setAccessAreaCode(serviceNumDetailDTO.getSnhAccessAreaCode());
					LOG.info("Set Access area code:" + serviceNumDetailDTO.getSnhAccessAreaCode());
				} else {
					serviceNumHistRespDTO.setAccessAreaCode("");
				}
				serviceNumHistRespDTOList.add(serviceNumHistRespDTO);

			}

		}

		ServiceNummerScreenDTO serviceNumScreenDTO = new ServiceNummerScreenDTO();
		serviceNumScreenDTO.setServiceNumDetailRespDTO(serviceNumDetailRespDTO);
		serviceNumScreenDTO.setServiceNumHistRespDTO(serviceNumHistRespDTOList);

		return serviceNumScreenDTO;
	}

}
