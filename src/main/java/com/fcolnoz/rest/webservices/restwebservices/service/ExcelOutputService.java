package com.fcolnoz.rest.webservices.restwebservices.service;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;

//import jxl.write.WritableWorkbook;

/**
 * 
 * @author fcolmenarez
 *
 */
public interface ExcelOutputService {
	
	public abstract Workbook createExcelOutputExcel(HttpServletResponse response,Object clazz);

}
