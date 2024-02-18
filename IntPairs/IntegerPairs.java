package edu.sbcc.cs105;


public class IntegerPairs {
	private String str;
	
	public String setPairString(final String str) {
		this.str = str;
		return str;
	}
	public boolean hasTwoPairs() {
		if(str != null) {
			char num1 = str.charAt(0);
			char num2 = str.charAt(2);
			char num3 = str.charAt(4);
			char num4 = str.charAt(6);
			
			boolean a = (num1 == num2);
			boolean b = (num2 == num3);
			boolean c = (num3 == num4);
			boolean f = (num4 == num2 && num2 == num3);
			boolean g = (num2 == num3 && num2 == num3);
			boolean h = (num1 == num2 && num3 == num4 && num1 == num4);
			
			if(a) {
				return true;
			}
			if(b) {
				return true;
			}
			if(c) {
				return true;
			}
			if(f) {
				return false;
			}
			if(h) {
				return true;
			}
			if(g) { 
				return false;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
			
		
	
		
	


		
		
		
		
	


	
