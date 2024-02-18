package edu.sbcc.cs105;

public class LoanEligibilityCalculator {

	public static boolean isEligible(double amountRequested, double annualIncome, double downPayment, int ficoScore, boolean hasLatePayments){
		
		if(ficoScore >=700 && annualIncome >=0.15*amountRequested && downPayment > .10*amountRequested && hasLatePayments == true) {
			
			return true;
		}
		
		else if(ficoScore>=600 && annualIncome >= 0.20*amountRequested && downPayment>0.15*amountRequested && hasLatePayments == true) {
			
			return true;
		}
		
		else if(ficoScore>=600 && annualIncome >= 0.15*amountRequested && downPayment > 0.15*amountRequested && hasLatePayments == false) {
			
			return true;
		}
		
		else {
			
			return false;
			
		}
	}
}
			
			
			
			
			

