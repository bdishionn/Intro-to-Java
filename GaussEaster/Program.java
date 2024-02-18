/**
 * CS 105 Theory and Practice I
 * CRN: [43218]
 * Assignment: GaussianEaster
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class tests the GaussianEaster object.
 *
 */
public class Program {

    /**
     * Test this code by asking for a year and then having the GaussianEaster class compute the value.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(final String[] args) {
        //variable
        int year;
        //Scanner object to get input from user
        Scanner input = new Scanner(System.in);
        //prompt user to get year
        System.out.print("Input Easter year: ");
        // store input into year variable
        year = input.nextInt();
        //create object
        GaussianEaster easter = new GaussianEaster(year);
        //print info
        System.out.println("**Year: "+year+" Month: "+easter.getN()+" Day: "+easter.getP()+"**");
    }
   }
