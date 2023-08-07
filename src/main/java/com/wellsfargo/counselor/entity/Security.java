package com.wellsfargo.counselor.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Security {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long s_id;
	private long p_id;
	private String name;
	private String category;
	private String purchased_date;
	private String purchased_price;
	private String quantity;
	
	public Security(long s_id, long p_id, String name, String category, String purchased_date, String purchased_price,
			String quantity) {
		super();
		this.s_id = s_id;
		this.p_id = p_id;
		this.name = name;
		this.category = category;
		this.purchased_date = purchased_date;
		this.purchased_price = purchased_price;
		this.quantity = quantity;
	}

	public long getS_id() {
		return s_id;
	}

	public void setS_id(long s_id) {
		this.s_id = s_id;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPurchased_date() {
		return purchased_date;
	}

	public void setPurchased_date(String purchased_date) {
		this.purchased_date = purchased_date;
	}

	public String getPurchased_price() {
		return purchased_price;
	}

	public void setPurchased_price(String purchased_price) {
		this.purchased_price = purchased_price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	

}
