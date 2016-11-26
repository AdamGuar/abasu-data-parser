package controller;
import java.util.ArrayList;

import model.Value;

public class Spliter {
	
	public static void pupulateValuesList(ArrayList<Value> valuesList,String[] lines){
		for(int i=0;i<lines.length;i++){
			String temp[] = lines[i].split("\t");
			Value element = new Value(Double.parseDouble(temp[0]), Double.parseDouble(temp[1]));
			valuesList.add(element);
		}
	}

}
