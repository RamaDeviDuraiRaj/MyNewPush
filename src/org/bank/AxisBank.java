package org.bank;

public class AxisBank extends BankInfo {
@Override
public void deposit() {
	System.out.println("Axis Deposite");
	super.deposit();
}

public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.deposit();
	
}
}
