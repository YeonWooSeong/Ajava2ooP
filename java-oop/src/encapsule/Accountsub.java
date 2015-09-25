package encapsule;

import java.util.Scanner;

public class Accountsub {

	private int accountNo; // 계좌번호
	private String ownerName; // 계좌주민번호
	private int password; // 통장 비밀번호
	private int restMoney; // 잔액
	public static final String BANK_NAME = "한빛뱅크";
	Scanner scanner = new Scanner(System.in);

	public Accountsub() {
		this(0);
		
	}
	public Accountsub(int accountNo){
	accountNo = (int) (Math.random() * 999999) + 1000000;
}
	public int getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {

		return ownerName;
	}

	public int getPassword() {
		return password;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	public void deposit(int money) {
		System.out.println("입금할 돈 입력");
		int input = scanner.nextInt();
		String result = null;
		if (input <= 0) {
			result = "다시 입력하세요";
		} else {
			this.restMoney += input; // this.restmoney = this.restmoney + money
		}
		System.out.println();
	}

	public void withdraw(int money) {
		System.out.println("출금할 돈 입력");
		int output = scanner.nextInt();
		String result2 = null;
		if (output <= 0) {
			result2 = "다시 입력하세요";
		} else {
			this.restMoney = this.restMoney - money;
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + BANK_NAME + "]\n" + "입출금계좌번호 :" + accountNo + "" + "\n계좌명" + this.ownerName + "\n비밀번호"
				+ this.password + "\n잔액" + "0원 으로 \n통장이 개설되었습니다";
	}

	/*
	 * return"입출금계좌\n"+"["bank name"]"\n"+계좌번호 계좌명 비번 잔액 으로 통장이 개설되었습니다;
	 */
}
