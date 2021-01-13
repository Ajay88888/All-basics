package com.rays.exception;

public class Trydouble {

	public static void main(String[] args) {
		try{String s ="school";
		System.out.println(s.charAt(6));
		}
		catch
			(StringIndexOutOfBoundsException e) {
			System.out.println("string nhi hai");
		}
		}

}
