/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (AdminService Interface)
 * 
 * Date :- 21/10/2024
 */

package com.hexaware.carconnect.service;

import com.hexaware.carconnect.entity.Admin;
import com.hexaware.carconnect.exceptions.AdminNotFoundException;
import com.hexaware.carconnect.exceptions.InputMismatchCustomException;
import com.hexaware.carconnect.exceptions.InvalidInputException;


public interface IAdminService {

    Admin getAdminById(int adminId) throws AdminNotFoundException , InputMismatchCustomException;

    
    Admin getAdminByUsername(String username) throws AdminNotFoundException;

 
    void registerAdmin(Admin adminData) throws InvalidInputException;

   
    void updateAdmin(Admin adminData) throws AdminNotFoundException, InvalidInputException;


    void deleteAdmin(int adminId) throws AdminNotFoundException;

}