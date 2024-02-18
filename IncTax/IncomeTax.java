package edu.sbcc.cs105;

public class IncomeTax {
	  
	private double income;
	
	public IncomeTax(final double income) {
		this.income = income;
	}
	public double getIncomeTax() {
		double taxOnFirst50 = 50000 * 0.01;
		double remainingIncome = income-50000;
		double IncomeTax = 0;
		
		if(income<50000) {
			IncomeTax=income*0.01;
		}
		else if(income>500000) {
			IncomeTax = taxOnFirst50+(25000*0.02)+(25000*0.03)+(150000*0.04)+(250000*0.05)+(remainingIncome - 450000)*0.06;
			
		}
		else if(income>250000) {
			IncomeTax = taxOnFirst50 + (25000*0.02)+(25000*0.03)+(150000*0.04)+(remainingIncome-200000)*0.05;
			
		}
		else if(income>100000) {
			IncomeTax = taxOnFirst50 + (25000*0.02)+(25000*0.03)+(remainingIncome-50000)*0.04;
		}
		else if(income>75000) {
			IncomeTax = taxOnFirst50 + (25000*0.02)+(remainingIncome -25000)*0.03;
			
		}
	
		else if(income>50000) {
			IncomeTax = taxOnFirst50+remainingIncome*0.02;
		}
		return IncomeTax;
		
	}
}




	     

