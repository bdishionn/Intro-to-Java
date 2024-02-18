/**
 * CS 105 Theory and Practice I
 * CRN: [43128]
 * Assignment: LetterSize
 *
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

/**
 * This class converts the size of letters.
 *
 */
public class LetterSize {
	
	private double widthInInches;
	private double heightInInches;
		
	
	
	public LetterSize(final double widthInInches, final double heightInInches) {
		 this.widthInInches = widthInInches;
	     this.heightInInches = heightInInches;
	}
		
		
	     public double getHeightInMillimeters() {
	         final double MILLIMETERS_IN_INCH = 25.4;
	         return heightInInches * MILLIMETERS_IN_INCH;
	     }

	     public double getWidthInMillimeters() {
	         final double MILLIMETERS_IN_INCH = 25.4;
	         return widthInInches * MILLIMETERS_IN_INCH;
	     }
	 }
