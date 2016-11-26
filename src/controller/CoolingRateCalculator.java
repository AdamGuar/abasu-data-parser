package controller;
import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.Other;

import model.OutputTypeField;
import model.Value;

public class CoolingRateCalculator {
	
	
	public static ArrayList<OutputTypeField> CalculateRates(ArrayList<Value> valuesList){
		
		ArrayList<OutputTypeField> intervals = new ArrayList<OutputTypeField>();
		
		boolean direction = true;
		
		Value firstOfInterval = valuesList.get(0);
		
		for(int i=0;i<valuesList.size()-1;i++){
			boolean temporary_direction;
			if((valuesList.get(i).getTemp()-valuesList.get(i+1).getTemp())>0) temporary_direction=true;
			else
				temporary_direction = false;
			
			if(temporary_direction!=direction){
				
				double coolingRate = (firstOfInterval.getTemp() - valuesList.get(i).getTemp())/(valuesList.get(i).getTime()-firstOfInterval.getTime());
				double interval = valuesList.get(i).getTime()-firstOfInterval.getTime();
				
				
				
				OutputTypeField element = new OutputTypeField(String.valueOf(coolingRate), String.valueOf(interval));
				
				intervals.add(element);
				
				direction = temporary_direction;
				firstOfInterval = valuesList.get(i+1);
				
				
				
			}	
		}
	double coolingRate = (firstOfInterval.getTemp() - valuesList.get(valuesList.size()-1).getTemp())/(valuesList.get(valuesList.size()-1).getTime()-firstOfInterval.getTime());
	double interval = valuesList.get(valuesList.size()-1).getTime()-firstOfInterval.getTime();	
	OutputTypeField element = new OutputTypeField(String.valueOf(coolingRate), String.valueOf(interval));
	intervals.add(element);
		
	System.out.println("end of calculating");
	return intervals;
	}
	
}
		

	


