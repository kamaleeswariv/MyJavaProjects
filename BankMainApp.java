package com.expe;
class BankBalance extends Exception{
	public BankBalance(String s) {
		super(s);
	}
}
class Bank{
	float amount;
	public Bank() {
		amount =1000;
	}
	void withdraw (float wAmount) {
		try {
			if(wAmount>amount) {
				throw new BankBalance("Insufficient Balance Cannot withdraw")
			;}else {
				amount = amount-wAmount;
				System.out.println("Bank Balance ="+amount);
			}
		}catch(BankBalance e) {
			e.printStackTrace();
		}
	}
}
public class BankMainApp {

	public static void main(String[] args) {
Bank bank = new Bank();
bank.withdraw(500);
	}

}
