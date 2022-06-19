package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface ICredentialsService {
	
	String generatePassword();
	String getEmailAddress(String firstName, String lastName, String department);
	String showCredentials(Employee employee, String email, String[] generatePassword);
	String showCredentials(Employee employee, String email, String generatedPassword);
}
