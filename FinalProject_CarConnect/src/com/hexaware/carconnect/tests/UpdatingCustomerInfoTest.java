/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Update Customer Info)
 * 
 * Date :- 21/10/2024
 */





package com.hexaware.carconnect.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hexaware.carconnect.entity.Customer;
import com.hexaware.carconnect.service.CustomerService;

class UpdatingCustomerInfoTest {

	
	 private CustomerService customerService;

	    @BeforeEach
	    void setUp() {
	        customerService = new CustomerService();
	    }

	
	@Test
	void test() {
		 Customer updatedCustomer = new Customer(1, "Romi", "Singh", "rr@gmail.com", "9876543210", "New Address", "romi_singh", "password123", "2024-01-01");

	        
	        customerService.updateCustomer(updatedCustomer);

	       
	        Customer result = customerService.getCustomerById(1);
	        
	        assertEquals("rr@gmail.com", result.getEmail()); 
	}

}
