package com.rays.setgetautomobile;

public class Automobile {
	private String color = null;
	private int speed = 0;
	private String make = null;
	public static final int NO_of_GEARS = 0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
}