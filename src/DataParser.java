import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import controller.CoolingRateCalculator;
import controller.OutputFileGenerator;
import controller.ReadFile;
import controller.Spliter;
import model.OutputTypeField;
import model.Value;

public class DataParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file path:");
		
		String file_name;
		
		String[] lines=null;
		
		String[] properties;
		
		try {
			file_name = br.readLine();
		} catch (IOException e1) {
			file_name=null;
			e1.printStackTrace();
		}
		ReadFile file;
		
		try {
			file = new ReadFile(file_name);
			lines = file.OpenFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<Value> valuesList = new ArrayList<Value>();
		ArrayList<OutputTypeField> intervals;
		Spliter.pupulateValuesList(valuesList, lines);
		intervals = CoolingRateCalculator.CalculateRates(valuesList);
		OutputFileGenerator.generateTextFile(intervals);
		properties = lines[0].split("\t");
		
		System.out.println("End");
		
	}

}
