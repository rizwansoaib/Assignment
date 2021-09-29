
/***********************************************************************
Altran Technologies Proprietary
This source code is the sole property of Altran Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Altran Technologies
File Name	          : Main.java
Principal Author      : Rizwan Ahmad
Subsystem Name        : Capgemini Java Assessment
Module Name           : capgemini.assesment
Date of First Release : 29-Sep-2021
Author				  : Rizwan Ahmad
Description           : This file contains abstraction, encapsulation, inheritance, polymorphism Demo.

Change History
Version      		:1.0
Date(DD/MM/YYYY) 	: 29-Sep-2021
Modified by		:
Description of change :
***********************************************************************/







package capgemini.assesment;

import java.util.Scanner;

/**
 * @author RIZWAN AHMAD
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("Please enter Student Name: ");

		
		Scanner input=new Scanner(System.in);
		
		
		String name=input.next();
		
		System.out.println("Please enter Student Age: ");
		int age=input.nextInt();
		
		Student s1=new Student(name, age);
		
		
		
		System.out.println("Please enter student roll number: ");
		int roll=input.nextInt();
		s1.setRollNUmber(roll);
		
		
		s1.getInfo();
		
		
		System.out.println("Please enter number of subjects minimum=1 and maximum=3: ");
		
		int totalSubjects=input.nextInt();
		
		int[] subjectMarks=new int[5];
		
		for (int i = 0; i < totalSubjects; i++) {
			
			System.out.println("Please enter "+(i+1)+" subject marks: ");
			
			subjectMarks[i]=input.nextInt();
			
		}
		
		String response;
		
		
		/**
		 * Calling Compile time polymorphism
		 */
		
		switch (totalSubjects) {
		case 1:
			
			response=s1.getResults(subjectMarks[0]);
			
			System.out.println(response);
			
			break;
			
        case 2:
            response=s1.getResults(subjectMarks[0],subjectMarks[1]);
        	System.out.println(response);
			
			break;
        case 3:
        	
        	response=s1.getResults(subjectMarks[0],subjectMarks[1],subjectMarks[3]);
        	
        	System.out.println(response);

        	
        	break;

		default:
			break;
		}
		
		
		
		
		
		
		
				
		
		

	}

}
