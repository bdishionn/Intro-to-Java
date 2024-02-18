package edu.sbcc.cs105;

public class IntegerSign {

	private int signedInteger;
	
	int n;
	
	public IntegerSign(final int numberToStore) {
	n = numberToStore;
	}
	
	public boolean isZero() {
		return n==0;
	}
	
	public boolean isPositive() {
		return n>=0;
	
	}
	public boolean isNegative() {
		return n<0;
}
}
