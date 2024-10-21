/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (ReservationService Interface)
 * 
 * Date :- 21/10/2024
 */



package com.hexaware.carconnect.service;

import java.util.List;
import com.hexaware.carconnect.entity.Reservation;
import com.hexaware.carconnect.exceptions.ReservationException;
import com.hexaware.carconnect.exceptions.InvalidInputException;

public interface IReservationService {

	   
    Reservation getReservationById(int reservationId) throws ReservationException;

    
    List<Reservation> getReservationsByCustomerId(int customerId) throws InvalidInputException;

    
    void createReservation(Reservation reservationData) throws ReservationException, InvalidInputException;

  
    void updateReservation(Reservation reservationData) throws ReservationException, InvalidInputException;

   
    void cancelReservation(int reservationId) throws ReservationException;
}