package com.fcolnoz.rest.webservices.restwebservices.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fcolnoz.rest.webservices.restwebservices.model.ComprobanteConsultaRemanente;
import com.fcolnoz.rest.webservices.restwebservices.service.ExcelOutputService;

@RestController
@RequestMapping("/descargas")
public class ExcelOutputServiceController {
	
	@Autowired
	@Qualifier("excelOutputService")
	private ExcelOutputService excelOutputService;

	@RequestMapping(value = { "/comprobante/remanentes/{tipo}"}, 
				 	method = RequestMethod.POST)
	public void descargarRemanentes(HttpServletRequest request,HttpServletResponse response,
		@RequestBody ComprobanteConsultaRemanente datosComprobante,
		@PathVariable(value = "tipo") String tipo) {
		//,PerfilKey perfilKey)
	
			excelOutputService.createExcelOutputExcel(response, datosComprobante);
		
		
	}
	
}
