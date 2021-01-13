package com.rays.setgetperson;

public class TestPerson {
public static void main(String[] args) {
	Person P = new Person ();
	P.setName("ram");
	P.setAddress("212bhawarkuwa");
	P.set$AVG_AGE(28);
	P.getName();
	P.getAddress();
	P.get$AVG_AGE();
	System.out.println(P.getName());
	System.out.println(P.getAddress());
	System.out.println(P.get$AVG_AGE());
}
}
