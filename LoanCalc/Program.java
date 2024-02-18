package edu.sbcc.cs105;

public class Program {

	public static void main(final String[] args) {
		boolean result1 = isEligible(15000,10000,2000,705,true);
		boolean result2 = isEligible(50000,30000,8000,650,true);
		boolean result3 = isEligible(50000,10000,7800,650,false);
		boolean result4 = isEligible(100000,50000,5000,500,false);
		
		System.out.println("Result 1 = " + result1 + "\nResult 2 = "+ result2 + "\nResult3 = "+ result3+ "\nResult4 = "+ result4);
	}

	private static boolean isEligible(int i, int j, int k, int l, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

}
