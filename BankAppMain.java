import java.util.Scanner;

class Bank {
	float amount, damount, wamount;

	void deposit(float depositamount) {
		amount = amount + depositamount;
		System.out.println("Balance is the Bank after deposit :" + amount);
	}

	void withdraw(float withdrawamount) {
		if (withdrawamount > amount) {
			System.out.println("Insufficiant Balance!!!!");
			System.out.println("Available Balance  " + amount);
		} else {
			amount = amount - withdrawamount;
			System.out.println("Afteramount withdraw available balance: " + amount);
		}
	}

}

public class BankAppMain {

	public static void main(String[] args) {
		float damount;
		float wamount;
		Bank bank = new Bank();

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("****Menu For My Bank *****");
			System.out.println("1.To Deposit");
			System.out.println("2.To Withdraw");
			System.out.println("Enter Your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to deposit:");
				damount = scan.nextFloat();
				bank.deposit(damount);
				break;

			case 2:
				System.out.println("Enter withdraw amount:");
				wamount = scan.nextFloat();
				bank.withdraw(wamount);
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Do you want to continue(y/n)");
			char ch = scan.next().charAt(0);
			if (ch == 'n') {
				break;
			}

		}
		System.out.println("Exit");
	}

}
