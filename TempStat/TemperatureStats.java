package unittest.cs105;
import java.util.ArrayList;
public class TemperatureStats {
	


		//arraylist to hold temperature
		  private ArrayList<Double> arr;
		  //constructor
		  TemperatureStats()
		  {
		    arr= new ArrayList<Double>();
		  }
		  //method to add temperature
		  public void addTemperature(double t)
		  {
		    this.arr.add(t);
		  }
		  //method to clear the arraylst
		  public void clearTemperatures()
		  {
		    this.arr.clear();
		  }
		  //method to get the Maximum temperature
		  public double getMaximumTemperature()
		  {
		    if(this.arr.size()>0)
		    {
		      double t = arr.get(0);
		      for (int i = 0; i < arr.size(); i++)
		      {
		        if(t< this.arr.get(i))
		        {
		          t = this.arr.get(i);
		        }
		      }
		      return t;
		    }
		    else
		    {
		      return -1;
		    }
		  }
		//method to get the Minimum temperature
		  public double getMinimumTemperature()
		  {
		    if(this.arr.size()>0)
		    {
		      double t = arr.get(0);
		      for (int i = 0; i < arr.size(); i++)
		      {
		        if(t > this.arr.get(i))
		        {
		          t = this.arr.get(i);
		        }
		      }
		      return t;
		    }
		    else
		    {
		      return -1;
		    }
		  }
		//method to get the Average temperature
		  public double getAverageTemperature()
		  {
		    if(this.arr.size()>0)
		    {
		      double t = 0;
		      for (int i = 0; i < arr.size(); i++)
		      {
		        t = t + this.arr.get(i);
		      }
		      return (t/this.arr.size());
		    }
		    else
		    {
		      return 0;
		    }
		  }

	}	
		


