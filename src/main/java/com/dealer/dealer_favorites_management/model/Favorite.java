package com.dealer.dealer_favorites_management.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Favorite")
public class Favorite {
	//primary key
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int dealerId;
 
	 @Column(name = "dealer_name")
	 private String dealerName;

 
	 @Column(name = "reason")
	 private String reason;
	 
	 public Favorite() {
			super();
		}
 
 public Favorite(int dealerId, String dealerName, int customerId, String dealerLocation, String reason) {
 		super();
 		this.dealerId = dealerId;
 		this.reason = reason;
 	}

 public int getDealerId() {
 	return dealerId;
 }

 public void setDealerId(int dealerId) {
 	this.dealerId = dealerId;
 }

 public String getReason() {
 	return reason;
 }

 public void setReason(String reason) {
 	this.reason = reason;
 }
 
 public String getDealerName() {
	 return dealerName;
 }

 public void setDealerName(String dealerName) {
	 this.dealerName = dealerName;
 }

 @Override
 public String toString() {
 	return "Favorite [dealerId=" + dealerId + ", dealerName=" + dealerName + ", reason=" + reason + "]";
 }
 	
}
