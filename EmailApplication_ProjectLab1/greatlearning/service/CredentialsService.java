package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public  class CredentialsService implements ICredentialsService{
	
	public String generatePassword() {
		String uppercaseLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercaseLetters="abcdefghijklmnopqrstuvwxyz";
	    String numbers="0123456789";
	    String specialCharacters="!@#$%<>^&*(){[]}?";
	    String combination = uppercaseLetters+lowercaseLetters+numbers+specialCharacters;
	    StringBuffer strBuffer =new StringBuffer("");
	    Random random=new Random();
	   // random combination of generating passwords
	    for(int index=0;index<10;index++) {
	    	int randomCharater = random.nextInt(combination.length());
	    	strBuffer.append(combination.charAt(randomCharater));
	    }
		return  strBuffer.toString();
	    
	    }

	@Override
	public String getEmailAddress(String firstName,String lastName, String department) {
		
		return firstName+lastName+"@"+department+".com";
		
	}

	public String showCredentials(Employee employee, String email, String generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+" "+"your generated credentials are as follows ");
		System.out.println("Email --->" +email);
		System.out.println("Password -->" +generatedPassword);
		return null ;
		
	}

	@Override
	public String showCredentials(Employee employee, String email, String[] generatePassword) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
