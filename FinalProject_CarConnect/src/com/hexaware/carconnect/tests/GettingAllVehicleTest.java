/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Getting all Vehicles)
 * 
 * Date :- 21/10/2024
 */




package com.hexaware.carconnect.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hexaware.carconnect.entity.Vehicle;
import com.hexaware.carconnect.service.VehicleService;

class GettingAllVehicleTest {

	   private VehicleService vehicleService;

	    @BeforeEach
	 void setUp() {
	    vehicleService = new VehicleService();
	    }
	
	
	@Test
	void test() {
		 List<Vehicle> allVehicles = vehicleService.getAvailableVehicles();

	        assertTrue( allVehicles.size() > 0); 
	}

}
