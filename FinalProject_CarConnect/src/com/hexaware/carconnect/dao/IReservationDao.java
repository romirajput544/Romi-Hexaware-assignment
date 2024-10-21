/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Reservation Interface)
 * 
 * Date :- 21/10/2024
 */



package com.hexaware.carconnect.dao;

import java.util.List;

import com.hexaware.carconnect.entity.Reservation;

public interface IReservationDao {

	  
 Reservation getReservationById(int reservationId);

 
 List<Reservation> getReservationsByCustomerId(int customerId);

 
 void createReservation(Reservation reservationData);

 
 void updateReservation(Reservation reservationData);

 
 void cancelReservation(int reservationId);
	
}
