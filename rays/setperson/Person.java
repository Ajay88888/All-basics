package com.rays.setperson;

import java.util.Date;
public class Person 
{
	private String name = "";
	private String address = "";
	public int $AVG_AGE = 0;
	private Date dob;
	
public String getName() {
		return name;
}
public Date getDob() {
		return dob;
}
public void setDob(Date dob) {
		this.dob = dob;
}
public void setName(String name) {
		this.name = name;
}
public String getAddress() {
		return address;
}
public void setAddress(String address) {
		this.address = address;
}
public int get$AVG_AGE() {
		return $AVG_AGE;
}
public void set$AVG_AGE(int $avg_AGE) {
		$AVG_AGE = $avg_AGE;
}
}
