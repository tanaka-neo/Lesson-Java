package jp.co.aforce.sample;

public enum TrafficLight {
	赤("とまれ"), 
	青("進め"),
	黄("注意");
	
	private String message;
	TrafficLight(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
