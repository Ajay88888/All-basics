package com.rays.exception;

public class DoubleTry {

	public static void main(String[] args) {
	try{
		String s ="ajay";
System.out.println(s.charAt(3));
try{
	String s1 = "ajayone";
 System.out.println(s1.charAt(7));
}catch(StringIndexOutOfBoundsException e){
System.out.println("out");
}
finally{
	System.out.println("456");
}
	}
	finally{
		System.out.println("123");
		}
	}
}