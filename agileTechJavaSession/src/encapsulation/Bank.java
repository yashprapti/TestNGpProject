package encapsulation;

import java.util.Scanner;

public class Bank {
	
	private int accountNo = 123456;
	private int balance = 40000;
	
	/*
	 * public void setAccountNo(int accountNo) { this.accountNo=accountNo; }
	 */
	
	/*
	 * public void setBalance(int balance) { this.balance=balance; }
	 */
	
	public void getBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four digit pin");
		int pin = sc.nextInt();
		if(pin==1234) {
			System.out.println("Your Balance Is : "+balance);
		}else {
			System.out.println("Please Enter Correct Pin");
		}
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
