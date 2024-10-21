/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Updating Vehicle Detail)
 * 
 * Date :- 21/10/2024
 */



package com.hexaware.carconnect.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.hexaware.carconnect.entity.Vehicle;
import com.hexaware.carconnect.exceptions.VehicleNotFoundException;
import com.hexaware.carconnect.service.VehicleService;

class UpdatingVehicleDetailTest {

    private VehicleService vehicleService;

    @BeforeEach
    void setUp() {
        vehicleService = new VehicleService();
    }

    @Test
    void testUpdateVehicle() throws VehicleNotFoundException {
      
        

        //Update the vehicle details
        Vehicle updatedVehicle = new Vehicle(1, "Model S", "Tesla", 2022, "green", "MHYS111", true, 120.0);
        vehicleService.updateVehicle(updatedVehicle); 

     
        Vehicle result = vehicleService.getVehicleById(1); 
        
        
        assertEquals("green", result.getColor());
    }
}
