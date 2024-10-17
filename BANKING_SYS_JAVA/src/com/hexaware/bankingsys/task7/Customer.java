package com.hexaware.bankingsys.task7;

public class Customer {
	
    private String customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;


	
	
	public String getCustomerId() {
		return customerId;
	}




	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}

	  public void printCustomerDetails() {
	        System.out.println("Customer ID: " + customerId);
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Email Address: " + emailAddress);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	    }
	    



	public Customer(String customerId, String firstName, String lastName, String emailAddress, String phoneNumber,
			String address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}




	public static void main(String args[]) {
		 Customer customer = new Customer("01", "Nishant", "Pathak", "nishant@gmail.com", "123456789", "123 CP, Delhi, Inida");
		 
		 
		 System.out.println("\nCustomer 2 Details:");
	        customer.printCustomerDetails();
	}
}
