/**
 * CS 105 Theory and Practice I
 * CRN: [43128]
 * Assignment: Employee
 *
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

/**
 * This class implements an employee which is a person with a name and a salary.
 *
 */
public class Employee {
	
	private String employeeName; //instance variable that stores the name
	private double currentSalary; //instance variable 
	
	/**
	 * Constructor that creates a new Employee with an initial name and salary.
	 * 
	 */
	public Employee(String employeeName, double currentSalary) {
		
		this.employeeName = employeeName;
		this.currentSalary = currentSalary;
		
	}

	// Accessors that are obvious and have no side effects don't have to have
	// any documentation unless you are creating a library to be used by other
	// people.
	public String getName() {
		return employeeName;
	}

	public double getSalary() {
		return this.currentSalary; 
	}


	/**
	 * Raise the salary by the amount specified by the explicit argument.
	 * 
	 */
	public void raiseSalary(double byPercent) {
		this.currentSalary = this.currentSalary + (currentSalary * (byPercent/100));
		
	}
}
