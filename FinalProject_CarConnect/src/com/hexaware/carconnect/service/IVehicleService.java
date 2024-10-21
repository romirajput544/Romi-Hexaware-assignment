/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (VehicleService Interface)
 * 
 * Date :- 21/10/2024
 */


package com.hexaware.carconnect.service;
import com.hexaware.carconnect.exceptions.*;
import java.util.List;

import com.hexaware.carconnect.entity.Vehicle;

public interface IVehicleService {
	  
    Vehicle getVehicleById(int vehicleId) throws VehicleNotFoundException;

    
    List<Vehicle> getAvailableVehicles();

   
    void addVehicle(Vehicle vehicleData);

   
    void updateVehicle(Vehicle vehicleData) throws VehicleNotFoundException;

    
    void removeVehicle(int vehicleId) throws VehicleNotFoundException;

}