package models;

public class TrafficLight {
private String color;
public TrafficLight() {
	this.color="RED";}

public TrafficLight(String color) {
	this.color=color;
}
public String getColor() {
	return this.color;
}
public void setColor(String color){
	if(color.equals("RED") || color.equals("GREEN")|| color.equals("YELLOW")) {
		this.color=color;}
	else {
		throw new IllegalArgumentException("Invalid color: "+color);
	}
	}
public void cycleLight() {
	switch(color) {
	case "RED":
		color="GREEN";
		break;
	case "GREEN":
		color="YELLOW";
		break;
	case "YELLOW":
		color="RED";
		break;
		
	}
}
}
