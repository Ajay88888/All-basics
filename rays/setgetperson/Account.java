package com.rays.setgetperson;

public class Account {
	private String name;
	private String accounttype;
	private String address;

	public Account() {
		System.out.println("default constructor");
	}

public Account(String name,String accounttype){
	this();
	this.name=name;
	this.accounttype=accounttype;
System.out.println("counstructor is called"+name+accounttype);
}

	public Account(String name, String accounttype, String address) {
		this(name, accounttype);
		address=address;
		System.out.println("constructor1 is called" +name + accounttype + address);
	}

public static void main(String[] args) {
Account a = new Account(" ajay " ,  " saving "  , " 270bhawarkuwa ");
	}
}