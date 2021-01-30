package com.takeit.ecommerce.dto;



public class PurchaseResponse {

	private String purchaseTrackingNumber;

	public PurchaseResponse(String purchaseTrackingNumber) {
		super();
		this.purchaseTrackingNumber = purchaseTrackingNumber;
	}

	public String getPurchaseTrackingNumber() {
		return purchaseTrackingNumber;
	}

	public void setPurchaseTrackingNumber(String purchaseTrackingNumber) {
		this.purchaseTrackingNumber = purchaseTrackingNumber;
	}
	
	
}
