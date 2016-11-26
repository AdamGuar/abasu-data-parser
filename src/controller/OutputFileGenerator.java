package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.OutputTypeField;

public class OutputFileGenerator {
	
	public static void generateTextFile(ArrayList<OutputTypeField> intervals){
		
		try{
		    PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		    for(int i=0;i<intervals.size();i++){
			    writer.print(intervals.get(i).getInterval());
			    writer.print("\t");
			    writer.print(intervals.get(i).getCoolingRate());
			    writer.print("\n");
		    }
		    writer.close();    
		} catch (IOException e) {
		   e.printStackTrace();
		}
		
		
	}

}
