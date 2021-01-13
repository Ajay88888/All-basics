package com.rays.setgetperson;

public class Person11 {
	private String firstname;
	private String lastname;
	private String address;
	public Person11(){
	System.out.println("default constructor");
}
public Person11(String firstname,String lastname){
	this.firstname=firstname;
	this.lastname=lastname;
	System.out.println("2 param is called=     "     + firstname+"    "  +lastname);
}
public Person11(String firstname,String lastname,String address){
	this(firstname,lastname);
	this.address=address;
	System.out.println("3 param is called = firstname +  lastname + address");
		}
public static void main(String[] args) {
	Person11 p=new Person11("ajay","farkya","270vishnupuri");
}
}
