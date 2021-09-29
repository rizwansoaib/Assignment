
/***********************************************************************
Altran Technologies Proprietary
This source code is the sole property of Altran Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Altran Technologies
File Name	          : LinkedList.java
Principal Author      : Rizwan Ahmad
Subsystem Name        : Capgemini Java Assessment
Module Name           : capgemini.ass2
Date of First Release : 29-Sep-2021
Author				  : Rizwan Ahmad
Description           : This file contains LinkedList implementation

Change History
Version      		:1.0
Date(DD/MM/YYYY) 	: 29-Sep-2021
Modified by		:
Description of change :
***********************************************************************/







package capgemini.ass2;

/**
 * @author RIZWAN AHMAD
 *
 */
public class LinkedList {
	
	
	/**
	 * Two pointer for insert tail and head pointer for reference
	 */
	
	 public Node head = null;    
	 public Node tail = null;    
	
	class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    } 
	
	
	
	
	
	public void add(int data) {   
		
        Node newNode = new Node(data);    
            
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }
	
	
	 public void print() {    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Elements in linked list: ");    
	        while(current != null) {    
	            System.out.print(current.data + " -> ");    
	            current = current.next;    
	        }
	        System.out.println("NULL");    
	    }  
	 
	 
	 public void reverse() {
		  if(head == null) {  
	            System.out.println("List is empty");  
	             
	        } 
		  
		  else {
			    Node prev = null;
		        Node current = head;
		        Node next = null;
		        
		        
		        while(current!=null) {
		        	next=current.next;
		        	current.next=prev;
		        	prev=current;
		        	current=next;
		        }
		        
		        head=prev;
		  }
		  
		  
		  
		  
		  
	 }
	
	
	
	
	
	

}
