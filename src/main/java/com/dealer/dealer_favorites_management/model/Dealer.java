package com.dealer.dealer_favorites_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dealer")
public class Dealer {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int dealerId;
	
	@Column(name ="dealerName")
	private String dealerName;
	
	@Column(name="address")
	private String address;
	
	public Dealer() {
		super();
	}

	public Dealer(int dealerId, String dealerName, String address) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.address = address;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", address=" + address + "]";
	}
	
	
	
}
