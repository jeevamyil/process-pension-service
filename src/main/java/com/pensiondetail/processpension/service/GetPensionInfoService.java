package com.pensiondetail.processpension.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pensiondetail.processpension.model.PensionerDetailModel;

@FeignClient("pension-detail-service")
public interface GetPensionInfoService {
	
	@RequestMapping( 
			method = RequestMethod.GET,
			value = "/v1/pensionDetailService/get/{panid}",
			consumes ="application/json")
	PensionerDetailModel getpensionerDetail(@PathVariable("panid") String PanId);

}
