/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Multiply
 *
 *
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class implements various multiplication types using a variety of
 * methods.
 *
 */
public class Multiply {

	/**
	 * Multiplies an integer input by two.
	 * 
	 * @param multiplicand
	 *            number to be multiplied by two.
	 * @return the multiplicand multiplied by two.
	 */
	public int byTwo(final int multiplicand) {
		return multiplicand * 2;
	}

	/**
	 * Calculates and returns product of two integers.
	 * 
	 * @param operand1
	 *            first operand.
	 * @param operand2
	 *            second operand.
	 * @return the product of the two passed operands.
	 */
	public int getProduct(final int operand1, final int operand2) {

		
		final int result = operand1 * operand2;
		
		return result;
	}

}
