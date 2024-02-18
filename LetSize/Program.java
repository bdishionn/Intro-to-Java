/**
 * CS 105 Theory and Practice I
 * CRN: [43128]
 * Assignment: LetterSize
 *
 *
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class Program {

	/**
	 * Test this code by creating an 8.5 x 11 inch letter and getting the size
	 * in millimeters.
	 *
	 * @param args
	 *            command line values. Not used in this example.
	 */
	public static void main(final String[] args) {
		
		 // create a LetterSize object
        LetterSize letter = new LetterSize(8.5,11);

        // display the width and height in mms
        System.out.println("Width = "+ letter.getWidthInMillimeters()+" mm.");
        System.out.println("Height = "+ letter.getHeightInMillimeters()+" mm.");

	}
}