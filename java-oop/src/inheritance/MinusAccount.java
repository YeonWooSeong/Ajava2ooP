package inheritance;

import encapsule.Kaup;

public class MinusAccount extends Accountsub {
	private int money;
	private int restMoney;
	
	
	public static final String BANK_NAME = "러시앤캐시.";
	// 오버라이딩.
	public void loan() {
		System.out.println(BANK_NAME);
	}
	@Override
	public void withdraw(int money) {
		if (money > restMoney -300) {
			System.out.println("출금가능");
		}
		
		}
	}

	

//public class MinusAccount extends Accountsub = extends 가 연결.