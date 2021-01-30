package com.takeit.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takeit.ecommerce.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
