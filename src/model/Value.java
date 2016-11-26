package model;

public class Value {

	private double time;
	private double temp;
	
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public Value(double time, double temp) {
		super();
		this.time = time;
		this.temp = temp;
	}
	
	
	
	
}
