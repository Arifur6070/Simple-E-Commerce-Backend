package com.takeit.ecommerce.service;

import java.util.Set;
import java.util.UUID;

import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import com.takeit.ecommerce.dao.CustomerRepository;
import com.takeit.ecommerce.dto.Purchase;
import com.takeit.ecommerce.dto.PurchaseResponse;
import com.takeit.ecommerce.entity.Customer;
import com.takeit.ecommerce.entity.Order;
import com.takeit.ecommerce.entity.OrderItem;

@Service
public class CheckOutService implements ICheckOutService{
	
	private CustomerRepository customerRepo;
	
	public CheckOutService(CustomerRepository customerRepo){
		this.customerRepo=customerRepo;
	}
	
	
	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
	  //retrieve the order from dto
		
		Order order = purchase.getOrder();
		
	  //generate tracking Number
		String orderTrackingNumber = generateOrderTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
      //populate order with order items
		Set<OrderItem> orders = purchase.getOrderItems();
		for(OrderItem item: orders) {
			order.add(item);
		}
	  //populate order with billing Address and shipping Address
		
		order.setBillingAddress(purchase.getBillingAddress());
		order.setShippingAddress(purchase.getShippingAddress());
		
	  //Saving the order against the customer
		Customer customer = purchase.getCustomer();
		customer.add(order);
		
	  // Save the order to db
		
		customerRepo.save(customer);
		
		return new PurchaseResponse(orderTrackingNumber);
	}



	private String generateOrderTrackingNumber() {
		// Generating a random UUID
		return UUID.randomUUID().toString();
	}

}
