
/**
 * CS 105 Theory and Practice I
 * CRN: [43128]
 * Assignment: AlignedNumbers
 * 
 * 
 * @author [Brendan Dishion]
 */
package edu.sbcc.cs105;

/**
 * This class computes the statistics of two integers and prints them out.
 *
 */
public class AlignedNumbers {
    private int firstNumber;
    private int secondNumber;
    
  
        // setter for first number
    public void setFirstNumber(int firstNumber) {
             this.firstNumber=firstNumber;
        }
        // getter for first number

    public int getFirstNumber(int firstNumber) {
         return firstNumber;
        }
        
        
        // setter for second number
    public void setSecondNumber(int SecondNumber) {
             this.secondNumber=SecondNumber;
    }
     // getter for second number
    public int getSecondNumber(int SecondNumber) {
         return SecondNumber;
        }
    
    public int getSum() {
    	return (firstNumber + secondNumber);
    }
    	
    public int getDistance() {
    	return (firstNumber - secondNumber);
    
    }
    
    public int getMaximum() {
    	return Math.max(firstNumber, secondNumber);
    }
    
    public int getMinimum() {
    	return Math.min(firstNumber, secondNumber);
    }
    
    public int getProduct() {
    	return(firstNumber*secondNumber);
    }

    public double getAverage() {
    	return(firstNumber+secondNumber)/(2.0);
    }

    
    
    
    public int getDifference() {
    	return(secondNumber- firstNumber);
    	}
    					
    

    public void printStats() {
    	System.out.printf("%s%26d%n", "Sum:", getSum());
    	System.out.printf("%s%25.2f%n", "Average:", getAverage());
    	System.out.printf("%s%19d%n", "Difference:", getDifference());
    	System.out.printf("%s%22d%n", "Product:", getProduct());
    	System.out.printf("%s%21d%n", "Distance:", getDistance());
    	System.out.printf("%s%22d%n", "Maximum:", getMaximum());
    	System.out.printf("%s%22d%n", "Minimum:", getMinimum());
		
		
	}
	
		
	}
    					
  

	
  
   


		
		
	
	
		
	


    
    

