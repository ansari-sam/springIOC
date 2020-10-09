package com.spring.p2;

public class Account {
	private int AccN0;
	private String AccType;
	private double Balance;
	
	public Account() {
		System.out.println("defaul Const for Account");
	}

	public int getAccN0() {
		return AccN0;
	}

	public void setAccN0(int accN0) {
		AccN0 = accN0;
	}

	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		AccType = accType;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	public String toString(){
		return ""+ AccN0 +"\t"+AccType + "\t"+Balance;
		}
}
