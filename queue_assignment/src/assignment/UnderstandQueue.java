package assignment;

import java.util.LinkedList;
import java.util.Queue;
public class UnderstandQueue {
	  // Crud means to create read update delete
	// queue can only delete from the head of the doc and add to the back
	  public static void main(String[] args) 
	   { 
	       Queue<Integer>q = new LinkedList<>(); 
	            q.add(15);
	            q.add(25);
	            q.add(105);
	            q.add(200);
	        // Display contents of the queue. 
	        System.out.println("This is in queue: " + q);  // reading
	        // To remove the head of queue. 
	        	 q.add(600);
	        	 System.out.println("This is in queue: " + q);
	        int dele = q.remove(); 
	        System.out.println("deleted first in queue: " + dele); 
	        System.out.println(q); 
	       
	  
	       
	    } 
	
		
		
	}

