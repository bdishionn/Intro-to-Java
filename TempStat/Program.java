package unittest.cs105;

public class Program {

	public static void main(String[] args) {
		TemperatureStats obj = new TemperatureStats();
	    //adding temperatures
	    obj.addTemperature(1);
	    obj.addTemperature(2);
	    obj.addTemperature(3);
	    obj.addTemperature(4);
	    obj.addTemperature(5);
	    //testing functions
	    System.out.println("Maximum Temperature: " + obj.getMaximumTemperature());
	    System.out.println("Minimum Temperature: " + obj.getMinimumTemperature());
	    System.out.println("Average Temperature: " + obj.getAverageTemperature());
	  }
	

	

	


	}


