package com.netas.netsm.model;

import javax.persistence.*;

@Entity
public class Stock {

	@Id
	@GeneratedValue
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "NAME")
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
