package edu.sbcc.cs105;
import java.util.Scanner;
public class Program {

	public static void main(final String[] args) {
		// TODO: create a IntegerSign object for several different numbers
        // and test out its methods, print out the results
       System.out.printf("Enter an integer: ");
       Scanner consoleReader = new Scanner(System.in); 
       int n = consoleReader.nextInt();
       IntegerSign myIS = new IntegerSign(n);
       if (myIS.isZero()) {
          System.out.printf("%d is zero", n);
       } else if (myIS.isPositive()) {
         System.out.printf("%d is positive.", n);
       } else {
           System.out.printf("%d is negative", n);
       }
       consoleReader.close();
   }       

}


