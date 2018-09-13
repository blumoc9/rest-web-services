package com.fcolnoz.rest.webservices.restwebservices.controller;

import java.awt.PageAttributes.MediaType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fcolnoz.rest.webservices.restwebservices.model.ComprobanteConsultaRemanente;
import com.fcolnoz.rest.webservices.restwebservices.service.ExcelOutputService;
import com.fcolnoz.rest.webservices.restwebservices.serviceImpl.ExcelOutputServiceImpl;

@RestController
@RequestMapping("/descargas")
public class ExcelOutputServiceController {
	
	@Autowired
	@Qualifier("excelOutputService")
	private ExcelOutputService excelOutputService;

	private static final Logger LOGGER = Logger.getLogger(ExcelOutputServiceController.class);
	
	@GetMapping(value="/comprobante/{tipo}")
	public void descargarRemanentes(HttpServletRequest request,HttpServletResponse response,
		@Valid @RequestBody(required= false) ComprobanteConsultaRemanente datosComprobante,
		@PathVariable(value = "tipo") String tipo) {
		//,PerfilKey perfilKey)
			LOGGER.info("ENTRANDO AL CONTROLLER : ExcelOutputServiceController ");
			excelOutputService.createExcelOutputExcel(response, datosComprobante);
		
		
	}
	
	@PostMapping(value="/comprobante2/{tipo}")
	public void descargarRemanentes2(HttpServletRequest request,HttpServletResponse response,
		@Valid @RequestBody(required= false) ComprobanteConsultaRemanente datosComprobante,
		@PathVariable(value = "tipo") String tipo) {
		//,PerfilKey perfilKey)
			LOGGER.info("ENTRANDO AL CONTROLLER : ExcelOutputServiceController ");
			excelOutputService.createExcelOutputExcel(response, datosComprobante);
		
		
	}
	
	
	
}
