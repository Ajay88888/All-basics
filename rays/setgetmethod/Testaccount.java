package com.rays.setgetmethod;

public class Testaccount {
public static void main(String[] args) {
	account a = new account();
	a.setAccountnumber ("sbi" + 180023);
	a.setAccounttype("saving");
	a.setAccountbalance(50000.00);
	a.setDeposite(10000);
	a.setFundtransfer(26000);
	a.setPaybill(2000);
	a.setWithdrawl(3000);
    double d=a.getAccountbalance();
    String s =a.getAccounttype();
    String s1 =a.getAccountnumber();
    double d1 =a.getDeposite();
    double d2 =a.getFundtransfer();
    double d3 =a.getPaybill();
    double d4 =a.getWithdrawl();
    System.out.println(d);
    System.out.println(s);
    System.out.println(s1);
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
}
	
	

}
	
	

