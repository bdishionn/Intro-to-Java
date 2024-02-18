/**
 * CS 105 Theory and Practice I
 * CRN: [43128]
 * Assignment: Employee
 *
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

/**
 * This class tests the Employee object.
 *
 */
public class Program {

	
	/**
	 * Create an employee and test that the proper name has been created. Test
	 * the initial salary amount and then give the employee a raise. Then check
	 * to make sure the salary matches the raised salary.
	 * 
	 * 
	 * @param args
	 *            command line values. Not used in this example.
	 */
	public static void main(final String[] args) {

		Employee jose = new Employee("Jose Martinez", 10000.0);

		jose.raiseSalary(10); // Jose gets a 10% raise.

		double josesSalary = jose.getSalary();
		
		System.out.println(jose.getSalary());
	}
	
}