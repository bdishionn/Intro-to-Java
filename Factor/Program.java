package edu.sbcc.cs105;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// create Factor Object
		int n;
		System.out.print("Enter the number you want to factor ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		Factors factor = new Factors(n);

		while((factor.hasMoreFactors())){
		System.out.print(factor.nextFactor()+" ");
		}
		System.out.println();

		// reset
		factor.reset();

		

	}

}
