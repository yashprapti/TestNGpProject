package encapsulation;

import java.util.Scanner;

public class DenaBank {
	
	private int accountNo = 1234;
	private int balance = 20000;
	
	/*
	 * private void setAcccountNo(int accountNo) { this.accountNo=accountNo; }
	 */
	
	/*
	 * private void setBalance(int balance) { this.balance=balance; }
	 */
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void getbalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 digit Pin");
		int pin = sc.nextInt();
		if(pin==1234) {
			System.out.println(balance);
		}else {
			System.out.println("Enter the Correct pin");
			}
	}
	public static void main(String[] args) {
		
	}
	

}
