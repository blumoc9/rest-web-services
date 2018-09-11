package com.fcolnoz.rest.webservices.restwebservices.model;

import java.math.BigDecimal;
import java.util.List;

public class ComprobanteConsultaRemanente {


	private String nombreUsuario;
	private String rutUsuario;
	private List<Factura> listarRemanente;
	private BigDecimal remanenteALiberar;
	private BigDecimal remanentePosterior;
	private BigDecimal montoTotal;
	private int cantidadDocumentos;
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getRutUsuario() {
		return rutUsuario;
	}
	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}
	public List<Factura> getListarRemanente() {
		return listarRemanente;
	}
	public void setListarRemanente(List<Factura> listarRemanente) {
		this.listarRemanente = listarRemanente;
	}
	public BigDecimal getRemanenteALiberar() {
		return remanenteALiberar;
	}
	public void setRemanenteALiberar(BigDecimal remanenteALiberar) {
		this.remanenteALiberar = remanenteALiberar;
	}
	public BigDecimal getRemanentePosterior() {
		return remanentePosterior;
	}
	public void setRemanentePosterior(BigDecimal remanentePosterior) {
		this.remanentePosterior = remanentePosterior;
	}
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}
	public int getCantidadDocumentos() {
		return cantidadDocumentos;
	}
	public void setCantidadDocumentos(int cantidadDocumentos) {
		this.cantidadDocumentos = cantidadDocumentos;
	}
	
	
}
