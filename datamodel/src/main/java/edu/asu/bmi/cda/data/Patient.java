package edu.asu.bmi.cda.data;

import java.io.IOException;

public class Patient {

	private int age = -1;
	private String name = null;
	private long id = -1;
	
	/**
	 * This method is sets the patient's name.
	 * @param name
	 */
	public void setName (String name){
		this.name = name;
	}
	/**
	 * This method sets the patient's age. 
	 * @param age
	 */
	public void setAge (int age){
		 this.age = age;
	}
	
	/**
	 * This method sets the patient's id.
	 * @param id
	 */
	public void setId (long id){
		this.id = id;
	}
	
	/**
	 * This method prints the patient's information. 
	 */
	public void printPatient(){
		//Validation to ensure that all values have been assigned to the patient
		if((age != -1) && (name != null) && (id != -1)){
			System.out.println("The patient's name is: " + name + ". The patient's id is: " + id + ". The patients age is: " + age + '.');
		}
		else
		{
			System.out.println("ERROR: Patient data was not assigned correctly");
		}
	}

	/*
	public static void main (String[] args) throws IOException{
		Patient newPatient = new Patient();
		newPatient.setAge(34);
		newPatient.setName("Amol Bhalla");
		newPatient.setId(1000554418);
		newPatient.printPatient();
	}
	*/
}
