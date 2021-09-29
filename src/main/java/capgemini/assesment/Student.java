
/***********************************************************************
Altran Technologies Proprietary
This source code is the sole property of Altran Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Altran Technologies
File Name	          : Student.java
Principal Author      : Rizwan Ahmad
Subsystem Name        : Capgemini Java Assessment
Module Name           : capgemini.assesment
Date of First Release : 29-Sep-2021
Author				  : Rizwan Ahmad
Description           : This file contains Student.java class

Change History
Version      		:1.0
Date(DD/MM/YYYY) 	: 29-Sep-2021
Modified by		:
Description of change :
***********************************************************************/







package capgemini.assesment;

/**
 * @author RIZWAN AHMAD
 *
 */
public class Student extends Person {
	
	
	/**
	 * Super Class constructor
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	
	
	
	/**
	 * Data Members;
	 */
	private int rollNumber;
	
	
	
	
	
	
    /**
     * 
     * Getter and Setter Method;
     */
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNUmber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [Roll Number=" + rollNumber  + ", Name =" + getName()
				+ ", Age=" + getAge() +  "]";
	}
	
	
	/**
	 * Display Student object Details and runtime polymorphism
	 */ 
	

	public void getInfo()
	{
		
		System.out.println("This is runtime polymorhism");
		System.out.println(this);
	}
	
	/**
	 * 
	 * @param marks
	 * @return Pass or Fail if Average marks>50 pass else Fail
	 */
	
	
	public String getResults(int marks) {
		
		if(marks>50) {
			
			
			return this.getName()+" is passed";
		}
		return this.getName()+" is fail";
		
	}
	
	
	/**
	 * 
	 * Compile Time Polymorphism Example 
	 * 
	 * @param marks1
	 * @param marks2
	 * @return Pass or Fail if Average marks>50 pass else Fail
	 */
	
	
    public String getResults(int marks1,int marks2) {
    	
    	
    	int avgMarks=(marks1+marks2)/2;
		
		if(avgMarks>50) {
			
			
			return this.getName()+" is passed";
		}
		return this.getName()+" is fail";
		
	}
    
    public String getResults(int marks1,int marks2,int marks3) {
    	
    	
    	int avgMarks=(marks1+marks2+marks3)/3;
		
		if(avgMarks>50) {
			
			
			return this.getName()+" is passed";
		}
		return this.getName()+" is fail";
		
	}

	
	
	
	
	
	
	

}
