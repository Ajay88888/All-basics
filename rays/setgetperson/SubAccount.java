package com.rays.setgetperson;

public class SubAccount extends Account {
	private String accountnumber = "sbi12345";
	public SubAccount () {
		System.out.println("default cons");
	}
  public SubAccount(String name,String address,String accounttype,String accountnumber) {
  super(name,address,accounttype);
  accountnumber=accountnumber;
  System.out.println(name,address,accounttype,accountnumber);
  }
		public static void main(String[] args) {
	SubAccount s = new SubAccount("ajay" , "23vishnupuri" , "saving" ,"sbi12345");

		}
}
