package edu.sbcc.cs105;

public class Program {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		Grade g = new Grade("A+");
		double y = g.getNumericGrade();
		System.out.println(y);
		
		Grade g1 = new Grade("B+");
		String a = g1.getLetterGrade();
		System.out.println(a);
		
		
	}
	

}