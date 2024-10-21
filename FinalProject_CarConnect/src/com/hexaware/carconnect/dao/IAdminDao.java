/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Admin Interface)
 * 
 * Date :- 21/10/2024
 */



package com.hexaware.carconnect.dao;

import com.hexaware.carconnect.entity.Admin;

public interface IAdminDao {
	
	
    Admin getAdminById(int adminId);

 
    Admin getAdminByUsername(String username);

   
    void registerAdmin(Admin adminData);

   
    void updateAdmin(Admin adminData);

  
    void deleteAdmin(int adminId);
}
