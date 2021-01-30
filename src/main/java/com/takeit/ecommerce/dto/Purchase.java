package com.takeit.ecommerce.dto;

import java.util.Set;

import com.takeit.ecommerce.entity.Address;
import com.takeit.ecommerce.entity.Customer;
import com.takeit.ecommerce.entity.Order;
import com.takeit.ecommerce.entity.OrderItem;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Purchase {
  
	
	private Customer customer;
	
	private Address shippingAddress;
	
	private Address billingAddress;
	
	private Order order;
	
	private Set<OrderItem> orderItems;
}
