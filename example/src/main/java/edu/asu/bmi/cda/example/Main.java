package edu.asu.bmi.cda.example;

import java.io.IOException;

import edu.asu.bmi.cda.data.Patient;

public class Main {
	
	/**
	 * This is the main method which implements the class Patient located in the datamodel module.
	 * @param args
	 * @throws IOException
	 */
	public static void main (String[] args) throws IOException{
		//creating a new patient
		Patient newPatient = new Patient();
		
		//assigning the patient's age, name and id
		newPatient.setAge(34);
		newPatient.setName("Amol Bhalla");
		newPatient.setId(1000554418);
		
		//outputting the patients information.
		newPatient.printPatient();
	}

}
