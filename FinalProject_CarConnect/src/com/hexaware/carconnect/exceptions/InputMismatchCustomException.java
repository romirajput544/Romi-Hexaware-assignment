/*
 * Author :- Vinayak Soni & Romi Kumar Singh
 * 
 * Desc :-Carconnect  (Input Validator)
 * 
 * Date :- 21/10/2024
 */
package com.hexaware.carconnect.exceptions;

public class InputMismatchCustomException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public InputMismatchCustomException(String message) {
        System.out.println(message);  // Print user-friendly message
    }
}