package com.rays.exception;

public class TestException {

	public static void main(String[] args) {
		
		try {

			String s = "ajay";
			System.out.println(s.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("no");
		}
	}
}