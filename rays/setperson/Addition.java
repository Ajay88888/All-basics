package com.rays.setperson;

public class Addition {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
}
	public void add(float a, int b) {
		System.out.println(a+b);
}
	public void add(int a, double b) {
		System.out.println(a+b);
}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Addition x = new Addition();
	x.add(5, 8);
	x.add(2.5f, 2.0f);
	x.add(5, 8, 10);
}
}