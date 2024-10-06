package com.kpn.napels.dto;

import java.io.Serializable;
import java.util.List;

public class ServiceNummerScreenDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ServiceNummerDetailResponseDTO serviceNumDetailRespDTO;
	private List<ServiceNumHistResponseDTO> serviceNumHistRespDTO;

	public ServiceNummerDetailResponseDTO getServiceNumDetailRespDTO() {
		return serviceNumDetailRespDTO;
	}

	public void setServiceNumDetailRespDTO(ServiceNummerDetailResponseDTO serviceNumDetailRespDTO) {
		this.serviceNumDetailRespDTO = serviceNumDetailRespDTO;
	}

	public List<ServiceNumHistResponseDTO> getServiceNumHistRespDTO() {
		return serviceNumHistRespDTO;
	}

	public void setServiceNumHistRespDTO(List<ServiceNumHistResponseDTO> serviceNumHistRespDTO) {
		this.serviceNumHistRespDTO = serviceNumHistRespDTO;
	}
}
