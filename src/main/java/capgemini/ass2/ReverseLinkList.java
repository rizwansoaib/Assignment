
/***********************************************************************
Altran Technologies Proprietary
This source code is the sole property of Altran Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Altran Technologies
File Name	          : ReverseLinkList.java
Principal Author      : Rizwan Ahmad
Subsystem Name        : Capgemini Java Assessment
Module Name           : capgemini.ass2
Date of First Release : 29-Sep-2021
Author				  : Rizwan Ahmad
Description           : This file contains Reverse the Link List Programs

Change History
Version      		:1.0
Date(DD/MM/YYYY) 	: 29-Sep-2021
Modified by		:
Description of change :
***********************************************************************/







package capgemini.ass2;


import java.util.Scanner;;

/**
 * @author RIZWAN AHMAD
 *
 */
public class ReverseLinkList {

	/**
	 * @param args
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		LinkedList myList=new LinkedList();
		
		System.out.println("How many elements you want to enter: ");
		
		
		
		Scanner input=new Scanner(System.in);
		
		int total=input.nextInt();
		
		System.out.println("Please enter Elements with space: ");
		
		
		
		for (int i = 0; i < total; i++) {
			
			myList.add(input.nextInt());
			
		}
		
		myList.print();
		
		myList.reverse();
		
		System.out.println("After reversed Linked Lsit: ");
		
		myList.print();

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
