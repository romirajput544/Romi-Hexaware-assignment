package com.hexaware.carconnect.service;
/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Vehicle Service)
 * 
 * Date :- 21/10/2024
 */



import com.hexaware.carconnect.exceptions.*;
import java.util.List;

import com.hexaware.carconnect.dao.IVehicleDao;
import com.hexaware.carconnect.dao.VehicleDao;
import com.hexaware.carconnect.entity.Vehicle;

public class VehicleService  implements  IVehicleService{

	 private IVehicleDao vehicleDao;
	 
	 public VehicleService() {
	        this.vehicleDao = new VehicleDao(); 
	    }
	
	
	@Override
	public Vehicle getVehicleById(int vehicleId) throws VehicleNotFoundException {
		return vehicleDao.getVehicleById(vehicleId);
	}

	@Override
	public List<Vehicle> getAvailableVehicles() {
		 return vehicleDao.getAvailableVehicles();
	}

	@Override
	public void addVehicle(Vehicle vehicleData) {
		 vehicleDao.addVehicle(vehicleData);
	     System.out.println("Vehicle added successfully.");
		
	}

	@Override
	public void updateVehicle(Vehicle vehicleData) throws VehicleNotFoundException{
		 vehicleDao.updateVehicle(vehicleData);
	     System.out.println("Vehicle updated successfully.");
		
	}

	@Override
	public void removeVehicle(int vehicleId) throws VehicleNotFoundException {
		vehicleDao.removeVehicle(vehicleId);
        System.out.println("Vehicle removed successfully.");
		
	}

}