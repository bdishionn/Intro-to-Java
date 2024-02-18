package edu.sbcc.cs105;

public class WaterState {
	
	private double waterTemperature;
	private boolean isCelsius;
	
	
	public WaterState(String temperature) {
		int length = temperature.length();
		this.waterTemperature = Integer.parseInt(temperature.substring(0, length-1));
		if(temperature.charAt(length - 1) == 'C'){
		this.isCelsius = true;
		}
	}
		

	
	
	
	public MatterState getState() {
		MatterState state = null; // method to convert the string of numbers into integer
		if(isCelsius) {
		

			if(waterTemperature <= 0) {
				state = MatterState.SOLID;
			}
			
			else if(waterTemperature > 0 && waterTemperature < 100) {
				state = MatterState.LIQUID;
			}
			else {
				state = MatterState.GAS;
				
			
			}
				}
	if(!isCelsius) {
		if(waterTemperature > 212) {
			state = MatterState.GAS;
		}
		else if(waterTemperature > 32 && waterTemperature <=212) {
			state = MatterState.LIQUID;
		}
		else {
			state = MatterState.SOLID;
		}
	}
	
return state;}}


  
  
