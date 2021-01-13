package com.rays.setgetautomobile;

public class TestAutomobile {
	
//	private static final int NO_OF_GEARS = 5;

	public static void main(String[] args) {
	Automobile a = new Automobile();
	a.setColor("black");
	a.setMake("2011");
	String s = a.getColor();
	String s1 = a.getMake();
	int i2 = a.getSpeed();
}
}