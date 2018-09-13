package com.fcolnoz.rest.webservices.restwebservices.serviceImpl;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fcolnoz.rest.webservices.restwebservices.RestWebServicesApplication;
import com.fcolnoz.rest.webservices.restwebservices.model.ComprobanteConsultaRemanente;
import com.fcolnoz.rest.webservices.restwebservices.model.Factura;
import com.fcolnoz.rest.webservices.restwebservices.service.ExcelOutputService;

import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.transformer.Sheet;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;


import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




@Service("excelOutputService")
public class ExcelOutputServiceImpl implements ExcelOutputService {

    private static final Logger LOGGER = Logger.getLogger(ExcelOutputServiceImpl.class);

	private static final String EXCEL_OUTPUT = "Excel Output";
	private static final String APPLICATION_VND_MS_EXCEL = "application/vnd.ms-excel";
	
	//prueba
	@Value("classpath:xls/comprobante-remanente.xls")
	private Resource templateConsultaRemanentes;

	@SuppressWarnings("unchecked")
	@Override
	public org.apache.poi.ss.usermodel.Workbook createExcelOutputExcel(HttpServletResponse response,ComprobanteConsultaRemanente clazz) {
		// TODO Auto-generated method stub
//		String fileName = "excelDocument.xls";
		Workbook wb = null;
		
		ClassPathResource cpr = new ClassPathResource("xls/comprobante-remanente.xls");
		
		Map<String, Object> mapEntrada = new HashMap();
		mapEntrada.put("data", this.emulateData());
		mapEntrada.put("noData", "No existen registros por mostrar");
		try {

			LOGGER.info("*******SERVICE createExcelOutputExcel()*****");
			
//		    //https://www.mkyong.com/java/java-convert-object-to-map-example/
		    //ObjectMapper oMapper = new ObjectMapper();
//		    // object -> Map
//		    Map<String, Object> templateParams = new HashMap<String,Object>();
//			Map<String, Object> map = oMapper.convertValue(clazz, Map.class);
			OutputStream out = response.getOutputStream();
			XLSTransformer transformer = new XLSTransformer();	
			wb = (Workbook) transformer.transformXLS(cpr.getInputStream(), mapEntrada);
			wb.write(out);
  
			
			
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error("Error occured while creating Excel file", e);
		}
		return null;
		
		
	//	return writableWorkbook;
	}
	
	
	public ComprobanteConsultaRemanente emulateData() {
		
		ComprobanteConsultaRemanente comprobanteConsultaRemanente = new ComprobanteConsultaRemanente();
		
		comprobanteConsultaRemanente.setCantidadDocumentos(2);
		comprobanteConsultaRemanente.setMontoTotal(new BigDecimal(9903));
		comprobanteConsultaRemanente.setNombreUsuario("FERNANDO");
		comprobanteConsultaRemanente.setRemanenteALiberar(new BigDecimal(10));
		comprobanteConsultaRemanente.setRemanentePosterior(new BigDecimal(50));
		comprobanteConsultaRemanente.setRutUsuario("54564-46464645");
		
		List<Factura> listarRemanente = new ArrayList<Factura>();
		
		Factura fact1 = new Factura();
		Factura fact2 = new Factura();
		Factura fact3 = new Factura();
		Factura fact4 = new Factura();
		Factura fact5 = new Factura();

		
		fact1.setDiasRecaudacion(1);
		fact1.setFactura(899);
		fact1.setFechaCurse(new Date());
		fact1.setFechaProrroga(new Date());
		fact1.setFechaRecaudacion(new Date());
		fact1.setFechaVcto(new Date());
		fact1.setIdOperacion("64654");
		fact1.setMoneda("PESO CHILENOS");
		fact1.setMonto(new BigDecimal("20000"));
		fact1.setRemanente(new BigDecimal("100"));
		fact1.setRutDeudor("654654-565464");
		fact1.setTipoDocto("INDIVIDUO");
		
		
		fact2.setDiasRecaudacion(1);
		fact2.setFactura(899);
		fact2.setFechaCurse(new Date());
		fact2.setFechaProrroga(new Date());
		fact2.setFechaRecaudacion(new Date());
		fact2.setFechaVcto(new Date());
		fact2.setIdOperacion("64654");
		fact2.setMoneda("PESO CHILENOS");
		fact2.setMonto(new BigDecimal("20000"));
		fact2.setRemanente(new BigDecimal("100"));
		fact2.setRutDeudor("654654-565464");
		fact2.setTipoDocto("INDIVIDUO");
		
		fact3.setDiasRecaudacion(1);
		fact3.setFactura(899);
		fact3.setFechaCurse(new Date());
		fact3.setFechaProrroga(new Date());
		fact3.setFechaRecaudacion(new Date());
		fact3.setFechaVcto(new Date());
		fact3.setIdOperacion("64654");
		fact3.setMoneda("PESO CHILENOS");
		fact3.setMonto(new BigDecimal("20000"));
		fact3.setRemanente(new BigDecimal("100"));
		fact3.setRutDeudor("654654-565464");
		fact3.setTipoDocto("INDIVIDUO");
		
		fact4.setDiasRecaudacion(1);
		fact4.setFactura(899);
		fact4.setFechaCurse(new Date());
		fact4.setFechaProrroga(new Date());
		fact4.setFechaRecaudacion(new Date());
		fact4.setFechaVcto(new Date());
		fact4.setIdOperacion("64654");
		fact4.setMoneda("PESO CHILENOS");
		fact4.setMonto(new BigDecimal("20000"));
		fact4.setRemanente(new BigDecimal("100"));
		fact4.setRutDeudor("654654-565464");
		fact4.setTipoDocto("INDIVIDUO");
		
		
		fact5.setDiasRecaudacion(1);
		fact5.setFactura(899);
		fact5.setFechaCurse(new Date());
		fact5.setFechaProrroga(new Date());
		fact5.setFechaRecaudacion(new Date());
		fact5.setFechaVcto(new Date());
		fact5.setIdOperacion("64654");
		fact5.setMoneda("PESO CHILENOS");
		fact5.setMonto(new BigDecimal("20000"));
		fact5.setRemanente(new BigDecimal("100"));
		fact5.setRutDeudor("654654-565464");
		fact5.setTipoDocto("INDIVIDUO");
	
		
		
		listarRemanente.add(fact1);
		listarRemanente.add(fact2);
		listarRemanente.add(fact3);
		listarRemanente.add(fact4);
		listarRemanente.add(fact5);
		
		comprobanteConsultaRemanente.setListarRemanente(listarRemanente);

		
		
		return comprobanteConsultaRemanente;
		
	}
	


}
