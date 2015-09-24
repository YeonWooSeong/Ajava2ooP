package bank;

import java.util.Scanner;

public class BankService implements Bank{
	Scanner scanner = new Scanner(System.in);
	Accountsub owNo = new Accountsub();
	@Override
	public String open(String name2,int pW) {
		
		owNo.setOwnerName(name2);
		owNo.setPassword(pW);
		System.out.print(owNo.toString());
		
	}

	@Override
	public void deposit() { //입금.
		System.out.println("입글할 돈 입력");
		int inputMoney = scanner.nextInt();
		owNo.deposit(inputMoney);
		System.out.println("입금된 금액 :" + owNo.getRestMoney());
		
	}

	@Override
	public void widthdraw() {
		System.out.println("출금할 돈 입력");
		int outputMoney = scanner.nextInt();
		owNo.withdraw(outputMoney);
		
	}

	@Override
	public void search() {
		System.out.println("현재 남은계좌"+owNo.getRestMoney());
		
	}

}
