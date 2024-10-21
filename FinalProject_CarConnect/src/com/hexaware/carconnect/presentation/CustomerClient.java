/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Customer presentation)
 * 
 * Date :- 21/10/2024
 */


package com.hexaware.carconnect.presentation;

import java.util.Scanner;

import com.hexaware.carconnect.entity.Customer;
import com.hexaware.carconnect.service.CustomerService;
import com.hexaware.carconnect.service.ICustomerService;

public class CustomerClient {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;

        ICustomerService service = new CustomerService(); 

        while (flag) {
            // Display menu options
            System.out.println("\n***** Customer Options *****");
            System.out.println("1. Get Customer By ID");
            System.out.println("2. Get Customer By Username");
            System.out.println("3. Register Customer");
            System.out.println("4. Update Customer");
            System.out.println("5. Delete Customer");
           

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer ID:");
                    int customerId = scanner.nextInt();
                    Customer foundCustomerById = service.getCustomerById(customerId);
                    
                    if (foundCustomerById != null) {
                        System.out.println(foundCustomerById);
                    } 
                    else 
                    {
                        System.err.println("Customer not found.");
                    }
                    break;

                case 2:
                    System.out.println("Enter Username:");
                    String username = scanner.next();
                    Customer foundCustomerByUsername = service.getCustomerByUsername(username);
                    
                    if (foundCustomerByUsername != null) {
                        System.out.println(foundCustomerByUsername);
                    }
                    else 
                    {
                        System.err.println("Customer not found.");
                    }
                    break;

                case 3:
                    Customer customerToRegister = readCustomerData();
                    service.registerCustomer(customerToRegister);
                    System.out.println("Customer registered successfully.");
                    break;

                case 4:
                    System.out.println("Enter Customer ID to update:");
                    int updateId = scanner.nextInt();
                    Customer customerToUpdate = readCustomerData();
                    customerToUpdate.setCustomerId(updateId);
                    System.out.println("Enter password:");
                    service.updateCustomer(customerToUpdate);
                    System.out.println("Customer updated successfully.");
                    break;

                case 5:
                    System.out.println("Enter Customer ID to delete:");
                    int deleteId = scanner.nextInt();
                    service.deleteCustomer(deleteId);
                    System.out.println("Customer deleted successfully.");
                    break;

               

                default:
                    System.err.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static Customer readCustomerData() {
        Customer customer = new Customer(); 
        System.out.println("Enter Customer ID:");
        customer.setCustomerId(scanner.nextInt());
        
        System.out.println("Enter First Name:");
        customer.setFirstName(scanner.next());
        
        System.out.println("Enter Last Name:");
        customer.setLastName(scanner.next());
        
        System.out.println("Enter Email:");
        customer.setEmail(scanner.next());
        
        System.out.println("Enter Phone Number:");
        customer.setPhoneNumber(scanner.next());
        
        System.out.println("Enter Username:");
        customer.setUsername(scanner.next());
        
        System.out.println("Enter Password:");
        customer.setPassword(scanner.next());
       
        return customer;
    }
}
