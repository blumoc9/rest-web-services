package com.fcolnoz.rest.webservices.restwebservices.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fcolnoz.rest.webservices.restwebservices.RestWebServicesApplication;
import com.fcolnoz.rest.webservices.restwebservices.service.ExcelOutputService;

import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.transformer.Sheet;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




@Service("excelOutputService")
public class ExcelOutputServiceImpl implements ExcelOutputService {

    private static final Logger LOGGER = Logger.getLogger(ExcelOutputServiceImpl.class);

	private static final String EXCEL_OUTPUT = "Excel Output";
	private static final String APPLICATION_VND_MS_EXCEL = "application/vnd.ms-excel";
	

	@SuppressWarnings("unchecked")
	@Override
	public org.apache.poi.ss.usermodel.Workbook createExcelOutputExcel(HttpServletResponse response,Object clazz) {
		// TODO Auto-generated method stub
		String fileName = "excelDocument.xls";
		Workbook wb = null;
		try {

			LOGGER.info("*******SERVICE createExcelOutputExcel()*****");
			
//		    //https://www.mkyong.com/java/java-convert-object-to-map-example/
		    ObjectMapper oMapper = new ObjectMapper();
//		    // object -> Map
		    Map<String, Object> templateParams = new HashMap<String,Object>();
			Map<String, Object> map = oMapper.convertValue(clazz, Map.class);
			
			XLSTransformer transformer = new XLSTransformer();	
			wb = (Workbook) transformer.transformXLS(RestWebServicesApplication.class.getResourceAsStream("/xls/excel.xlsx"), templateParams);
			
  
			
			
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error("Error occured while creating Excel file", e);
		}
		return null;
		
		
	//	return writableWorkbook;
	}
	


}
