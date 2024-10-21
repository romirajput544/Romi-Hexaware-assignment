package com.hexaware.carconnect.entity;

public class Vehicle {

	private int vehicleId;
    private String model;
    private String make;
    private int year;
    private String color;
    private String registrationNumber;
    private boolean availability;
    private double dailyRate;
	private Object password;
    
    
	public Vehicle(int vehicleId, String model, String make, int year, String color, String registrationNumber,
			boolean availability, double dailyRate) {
		super();
		this.vehicleId = vehicleId;
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.availability = availability;
		this.dailyRate = dailyRate;
	}


	

	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public double getDailyRate() {
		return dailyRate;
	}


	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}


	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", year=" + year + ", registrationNumber=" + registrationNumber + "]";
	}
	
    // Method to authenticate admin by password
    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    
    
}
