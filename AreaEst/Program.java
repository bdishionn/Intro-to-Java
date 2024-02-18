package edu.sbcc.cs105;

public class Program {

	public static void main(final String[] args) {
		
		EstimationParameters estimationParameters = new EstimationParameters(10,0,100);
		
		Algorithm algorithm = new Algorithm();
		
		AreaEstimator areaEstimator = new AreaEstimator(algorithm);
		
		double area = areaEstimator.calculateArea(estimationParameters);
		
		System.out.println("Estimated area of curve:" +area);
	}

}
