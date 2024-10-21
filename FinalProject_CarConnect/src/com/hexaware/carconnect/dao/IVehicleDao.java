/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Vehicle Interface)
 * 
 * Date :- 21/10/2024
 */


package com.hexaware.carconnect.dao;

import java.util.List;

import com.hexaware.carconnect.entity.Vehicle;

public interface IVehicleDao {

	
    Vehicle getVehicleById(int vehicleId);

    
    List<Vehicle> getAvailableVehicles();

   
    void addVehicle(Vehicle vehicleData);

 
    void updateVehicle(Vehicle vehicleData);

   
    void removeVehicle(int vehicleId);
    
	
}
