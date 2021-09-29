
/***********************************************************************
Altran Technologies Proprietary
This source code is the sole property of Altran Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Altran Technologies
File Name	          : Person.java
Principal Author      : Rizwan Ahmad
Subsystem Name        : Capgemini Java Assessment
Module Name           : capgemini.assesment
Date of First Release : 29-Sep-2021
Author				  : Rizwan Ahmad
Description           : This file contains Person.java class

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
public class Person {
	
	private String name;
	private int age;
	
	
	
	
	 /**
	  * Person Class Constructor
	  * @param name
	  * @param age
	  */
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		
		this.name=name;
		this.age=age;
	}
	
	/**
	 * Getter and Setter Method
	 * 
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	/**
	 * Super Class Method 
	 */
	
	
	public void getInfo()
	{
		System.out.println(this.getName()+" is Student");
	}
	
	
	

}
