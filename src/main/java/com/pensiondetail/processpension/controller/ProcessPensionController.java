package com.pensiondetail.processpension.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pensiondetail.processpension.model.PensionerDetailModel;
import com.pensiondetail.processpension.service.ProccessPensionService;

@RestController
@RequestMapping(value = "v1/processPensionService")
public class ProcessPensionController{
	
	@Autowired
	ProccessPensionService pps;
	
	@GetMapping(value = "/")
	public ResponseEntity<String> gethola() {
		System.out.println("hola");
		return ResponseEntity.ok("hola");
	}
	
	@GetMapping(value = "/get/{panId}")
	public ResponseEntity<String> getpensiondetails(@PathVariable("panId") String PanID) {
		PensionerDetailModel pmd = pps.GetPensionerDetailsfromFeign(PanID);
		return ResponseEntity.ok(pmd.toString());
	}
	

}