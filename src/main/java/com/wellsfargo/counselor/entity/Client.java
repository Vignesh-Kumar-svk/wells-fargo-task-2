package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="C_ID")
	private long c_id;
	private long advisorId;
	@Column(name="Name")
	private String sname;
	@Column(name="Phone")
	private String phone;
	@Column(name="Email")
	private String email;
	
	public Client(long c_id, String sname, String phone, String email) {
		super();
		this.c_id = c_id;
		this.sname = sname;
		this.phone = phone;
		this.email = email;
	}

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
