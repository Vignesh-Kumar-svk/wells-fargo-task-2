package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Portfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="P_ID")
	private long p_id;
	private long c_id;
	@Column(name="Name",nullable=false)
	private String name;
	
	
	public Portfolio(long p_id, String name) {
		super();
		this.p_id = p_id;
		this.name = name;
	}


	public long getP_id() {
		return p_id;
	}


	public void setP_id(long p_id) {
		this.p_id = p_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
