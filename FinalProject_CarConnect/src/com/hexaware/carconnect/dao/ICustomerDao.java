/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Customer Interface)
 * 
 * Date :- 21/10/2024
 */




package com.hexaware.carconnect.dao;

import com.hexaware.carconnect.entity.Customer;

public interface ICustomerDao {

    
    Customer getCustomerById(int customerId);

   
    Customer getCustomerByUsername(String username);

    
    void registerCustomer(Customer customerData);

    
    void updateCustomer(Customer customerData);

   
    void deleteCustomer(int customerId);
	
}
