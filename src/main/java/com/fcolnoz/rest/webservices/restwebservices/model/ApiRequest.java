package com.fcolnoz.rest.webservices.restwebservices.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="api_request")
public class ApiRequest {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(name="request_time")
	private Date request;

	public ApiRequest() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRequest() {
		return request;
	}

	public void setRequest(Date request) {
		this.request = request;
	}

}
