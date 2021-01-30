package com.takeit.ecommerce.service;

import com.takeit.ecommerce.dto.Purchase;
import com.takeit.ecommerce.dto.PurchaseResponse;

public interface ICheckOutService {
	
	PurchaseResponse placeOrder(Purchase purchase);

}
