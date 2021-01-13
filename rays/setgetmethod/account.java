package com.rays.setgetmethod;

public class account {
	private String accountnumber ;
	private String accounttype ;
	private double accountbalance ;
	public double deposite;
	public double withdrawl;
	public double fundtransfer;
	public double paybill;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	public double getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	public double getFundtransfer() {
		return fundtransfer;
	}
	public void setFundtransfer(double fundtransfer) {
		this.fundtransfer = fundtransfer;
	}
	public double getPaybill() {
		return paybill;
	}
	public void setPaybill(double paybill) {
		this.paybill = paybill;
	}
}