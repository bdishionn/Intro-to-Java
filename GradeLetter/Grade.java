package edu.sbcc.cs105;

public class Grade {
	private String grade;

	public Grade(String grade) {
		this.grade = grade;
	}
	public String getLetterGrade() {
		return grade;
}
	public double getNumericGrade() {
		double points = 0.0;
		char minus = '-';
		char plus = '+';
		char a = 'A';
		char b = 'B';
		char c ='C';
		char d = 'D';
		char f ='F';
		
		char letter = grade.charAt(0);
		
		if(letter == a) {
			points = points + 4.0;
			}
		if(letter == b) {
			points = points + 3.0;
			
		}
		if(letter == c) {
			points = points + 2.0;
		}
		if(letter == d) {
			points = points + 1.0;
		}
		if(letter == f) {
			points = points + 0.0;
		}
		if (points != 0.0 && points != 4.0) {
			if(grade.length()>0) {
				char plusOrMinus = grade.charAt(1);
				if(plusOrMinus == minus) {
					points = points - 0.3;
				}
				if(plusOrMinus == plus) {
					points = points + 0.3;
				}
			}
		}
		return points;
}
}

