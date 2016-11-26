package model;

public class OutputTypeField {
	
	private String coolingRate;
	private String interval;
	
	public String getCoolingRate() {
		return coolingRate;
	}
	public void setCoolingRate(String coolingRate) {
		this.coolingRate = coolingRate;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public OutputTypeField(String coolingRate, String interval) {
		super();
		this.coolingRate = coolingRate;
		this.interval = interval;
	}

}
