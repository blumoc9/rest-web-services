package com.fcolnoz.rest.webservices.restwebservices.model;

import java.math.BigDecimal;
import java.util.Date;

public class Factura {

	private int factura;
	private String rutDeudor;
	private Date fechaCurse;
	private Date fechaVcto;
	private Date fechaProrroga;
	private Date fechaRecaudacion;
	private int  diasRecaudacion;
	private BigDecimal remanente;
	private BigDecimal monto;
	private String moneda;
	private String idOperacion;
	private String tipoDocto;
	public int getFactura() {
		return factura;
	}
	public void setFactura(int factura) {
		this.factura = factura;
	}
	public String getRutDeudor() {
		return rutDeudor;
	}
	public void setRutDeudor(String rutDeudor) {
		this.rutDeudor = rutDeudor;
	}
	public Date getFechaCurse() {
		return fechaCurse;
	}
	public void setFechaCurse(Date fechaCurse) {
		this.fechaCurse = fechaCurse;
	}
	public Date getFechaVcto() {
		return fechaVcto;
	}
	public void setFechaVcto(Date fechaVcto) {
		this.fechaVcto = fechaVcto;
	}
	public Date getFechaProrroga() {
		return fechaProrroga;
	}
	public void setFechaProrroga(Date fechaProrroga) {
		this.fechaProrroga = fechaProrroga;
	}
	public Date getFechaRecaudacion() {
		return fechaRecaudacion;
	}
	public void setFechaRecaudacion(Date fechaRecaudacion) {
		this.fechaRecaudacion = fechaRecaudacion;
	}
	public int getDiasRecaudacion() {
		return diasRecaudacion;
	}
	public void setDiasRecaudacion(int diasRecaudacion) {
		this.diasRecaudacion = diasRecaudacion;
	}
	public BigDecimal getRemanente() {
		return remanente;
	}
	public void setRemanente(BigDecimal remanente) {
		this.remanente = remanente;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getTipoDocto() {
		return tipoDocto;
	}
	public void setTipoDocto(String tipoDocto) {
		this.tipoDocto = tipoDocto;
	}
	
	
	
	@Override
	public String toString() {
		return "Factura [factura=" + factura + ", rutDeudor=" + rutDeudor
				+ ", fechaCurse=" + fechaCurse + ", fechaVcto=" + fechaVcto
				+ ", fechaProrroga=" + fechaProrroga + ", fechaRecaudacion="
				+ fechaRecaudacion + ", diasRecaudacion=" + diasRecaudacion
				+ ", remanente=" + remanente + ", monto=" + monto + ", moneda="
				+ moneda + ", idOperacion=" + idOperacion + ", tipoDocto="
				+ tipoDocto + "]";
	}
	
}
