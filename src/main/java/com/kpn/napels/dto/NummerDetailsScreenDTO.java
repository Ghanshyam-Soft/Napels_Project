package com.kpn.napels.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NummerDetailsScreenDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	private NummerDetailResponseDTO nummerDetailResponseDTO;
	private List<NumberDetailHistoryDTO> nummerHistoryDTO;
	private List<CPSSettingsDTO> cpsSettingsDTO;
	
	
	public NummerDetailResponseDTO getNummerDetailResponseDTO() {
		return nummerDetailResponseDTO;
	}
	public void setNummerDetailResponseDTO(NummerDetailResponseDTO nummerDetailResponseDTO) {
		this.nummerDetailResponseDTO = nummerDetailResponseDTO;
	}
	
	public List<NumberDetailHistoryDTO> getNummerHistoryDTO() {
		return nummerHistoryDTO;
	}
	public void setNummerHistoryDTO(List<NumberDetailHistoryDTO> nummerHistoryDTO) {
		this.nummerHistoryDTO = nummerHistoryDTO;
	}
	public List<CPSSettingsDTO> getCpsSettingsDTO() {
		return cpsSettingsDTO;
	}
	public void setCpsSettingsDTO(List<CPSSettingsDTO> cpsSettingsDTO) {
		this.cpsSettingsDTO = cpsSettingsDTO;
	}
	@Override
	public String toString() {
		return "NummerDetailsScreenDTO [nummerDetailResponseDTO=" + nummerDetailResponseDTO + ", cpsSettingsDTO="
				+ cpsSettingsDTO + "]";
	}
	
	
		
	

}
