package com.fcolnoz.rest.webservices.restwebservices.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fcolnoz.rest.webservices.restwebservices.model.ComprobanteConsultaRemanente;

@RestController
@RequestMapping("/descargas")
public class ExcelOutputServiceController {

	@RequestMapping(value = { "/comprobante/remanentes/{tipo}"}, 
				 	method = RequestMethod.POST, 
				 	consumes = MediaType.APPLICATION_JSON_VALUE, 
				 	produces = MediaType.APPLICATION_JSON_VALUE)
	public void descargarRemanentes(HttpServletRequest request,HttpServletResponse response,
		@RequestBody ComprobanteConsultaRemanente datosComprobante,
		@PathVariable(value = "tipo") String tipo)
		//,PerfilKey perfilKey)
		{
		
	}
	
}
