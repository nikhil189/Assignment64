/**
 * 
 */
package acadglidAssignment;

import java.util.Scanner;

/**
 * @author nikhil
 *
 */
public class BinarySearch {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	 public static void main(String args[])
	  {
	    int  first, last, middle, size, search, array[]; 
	    Scanner objScanner = new Scanner(System.in); // scanner object to capture user input
	    
	    System.out.println("Enter number of elements"); // takes user input to initialize size of array
	    size = objScanner.nextInt();  // capture user input for size
	    array = new int[size]; // initlaizes array with size specified by user
	 
	    System.out.println("Enter " + size + " integers"); // notify user to enter number of integers as initilaly specified by user
	 
	 
	    for (int i = 0; i< size; i++) // iterate over array and insert element into array as per user input
	    {
	    	array[i] = objScanner.nextInt();
	    }
	      
	    System.out.println("Enter value to find"); // notify user to enter number user wants to search
	    
	    search = objScanner.nextInt(); // store value of input user wants to search in array
	 
	    first  = 0; // initialize first to 0
	    last   = size - 1; // initlaize last to last index of array
	    middle = (first + last)/2; // middle element
	 
	    while( first <= last ) // loop iteration till user has compared all elements
	    {
	      if ( array[middle] < search ) // if element at middle index is less than element to search
	      {
	        first = middle + 1; // increase index of first
	      }
	      else if ( array[middle] == search )  // if element is found
	      {
	        System.out.println(search + " found at location " + (middle + 1) + "."); // print elemet found with location i.e index
	        break; //break through loop
	      }
	      else
			{
				last = middle - 1; // change last index
			}
	 
	      middle = (first + last)/2; // change middle
	   }
	   if ( first > last ) // terminate if element is not found
	   {
		   System.out.println(search + " is not present in the list.\n");
	   }
			objScanner.close();
	}
	 
}
