package com.rays.setperson;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson {
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	public static void main(String[] args) throws ParseException 
	{
		Person P = new Person ();
		P.setName("Ajay");
		P.setAddress("240vishnupuri");
		P.set$AVG_AGE(22);
		P.setDob(sdf.parse("05/08/2000"));
		P.getName();
		P.getAddress();
		P.get$AVG_AGE();
		P.getDob();
		System.out.println(P.getName());
		System.out.println(P.getAddress());
		System.out.println(P.get$AVG_AGE());
		System.out.println(P.getDob());
	}
}
