package com.pensiondetail.processpension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pensiondetail.processpension.model.PensionerDetailModel;

@Service
public class ProccessPensionService {

	@Autowired
	GetPensionInfoService  GPS;
	
	public PensionerDetailModel GetPensionerDetailsfromFeign(String PanId) {
		PensionerDetailModel pdm = null;
		pdm=GPS.getpensionerDetail(PanId);
		return pdm;
	}

	
}
