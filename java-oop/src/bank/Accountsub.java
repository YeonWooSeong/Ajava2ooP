package bank;

import java.util.Scanner;

public class Accountsub {

	private int accountNo; // 계좌번호
	private String ownerName; // 이름
	private int password; // 통장 비밀번호
	private int restMoney; // 잔액
	public static final String BANK_NAME = "한빛뱅크";
	Scanner scanner = new Scanner(System.in);

	public Accountsub() {

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
		String result = null;
		if (money < 0) {
			result = "다시 입력하세요";
		} else {
			this.restMoney += money; // this.restmoney = this.restmoney + money
		}

	}

	public void withdraw(int money) {
		// String result2 = null;
		if ((this.restMoney - money) < 0) {
			System.out.println("다시 입력해 주세요");
		} else {
			this.restMoney -= money;
			System.out.println("잔액 :" + this.restMoney);
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
}/*//*	// while (true)
	syso ("동작선택)
int key = scanner.nextInt();
switch(key)
case1 
service.opem break
case2 service.deposit();
case3 service.withdraw(money);
case service.serch 
case return*/
