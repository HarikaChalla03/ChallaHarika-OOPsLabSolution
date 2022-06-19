package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class DriverClass {
 private static final CredentialsService credentialsService=new CredentialsService();
 private static final Scanner sc = new Scanner(System.in);
 private static String firstName;
private static String lastName;
 
public static void main(String[] args) {
	Employee employee = new Employee(firstName="Sophia", lastName="francis");
	String generatedEmail;
	String generatedPassword;
	
	System.out.println("Please enter the department from the following");
	System.out.println("1. Technical");
	System.out.println("2. HR");
	System.out.println("3. Admin");
	System.out.println("4. Legal");
	
	int option = sc.nextInt();
	

	switch(option)
	{
		case 1: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail= credentialsService.getEmailAddress(firstName,lastName, "Technical");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			
		}
		break;
		
		case 2: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail= credentialsService.getEmailAddress(firstName,lastName, "Hr");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		  }
		break;
		case 3: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail= credentialsService.getEmailAddress(firstName,lastName, "Admin");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 4: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail= credentialsService.getEmailAddress(firstName,lastName, "legal");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
	}
	
}}
