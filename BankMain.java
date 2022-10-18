package com.inherit;
class Bank{
	float rateOFInterest() {
		return 0;
}
}
	class SBI extends Bank{
		float rateOFInterest() {
			return 7.5f;
	}
	}
class HDFC extends Bank{
	float rateOFInterest() {
		return 8f;
	}
}
class IOB extends Bank{
	float rateOFInterest() {
		return 8.5f;  
}
}
public class BankMain {

	public static void main(String[] args) {
Bank b = new Bank();

	}
}

