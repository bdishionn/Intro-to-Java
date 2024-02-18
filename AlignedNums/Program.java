
/**
 * CS 105 Theory and Practice I
 * CRN: [43128]
 * Assignment: AlignedNumbers
 *
 *
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

import java.util.Scanner;

/**
 * This class tests the AlignedNumbers object.
 *
 */
public class Program {

	/**
	 * Test this code by asking for two numbers, computing the various stats,
	 * and then printing it out.
	 *
	 * @param args
	 *            command line values. Not used in this example.
	 */
	public static void main(final String[] args) {
		
           
	   
//        intialising the aligned number object using class
       final AlignedNumbers an1 = new AlignedNumbers();
       // using scanner class to read input
       Scanner s=new Scanner(System.in);
       // asking for first number
       System.out.println("Enter first number : ");
       int first=s.nextInt();
       // asking for second number
       System.out.println("Enter second number : ");
       int second=s.nextInt();
       
       // passing the number aligned number class
       an1.setFirstNumber(first);
       an1.setSecondNumber(second);
       an1.printStats();
       
      
	}
}
	   
	

