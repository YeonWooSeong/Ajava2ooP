package bank;
/*
 * 
 * 사용자 은행업무 프로그램
 */
import java.util.Scanner;

public class BankService implements Bank{
	Scanner scanner = new Scanner(System.in);
	Accountsub owNo = new Accountsub();
	@Override
	public String open(String name2,String pW) {
		System.out.println("이름입력");
		String name2 = scanner.next();
		System.out.println("비밀번호 입력");
		int pW = scanner.nextInt();
		owNo.setOwnerName(name2);
		owNo.setPassword(pW);
		System.out.print(owNo.toString());
		
	}

	@Override
	public int deposit() { /*//입금.
		String inputMoney = scanner.next();
		System.out.println(owNo.deposit(inputMoney););*/
		System.out.println("입금된 금액 :" + owNo.getRestMoney());
		return inputMoney;
		
	}

	
	public int widthdraw() {
		System.out.println("출금할 돈 입력");
		String outputMoney = scanner.next();
		owNo.withdraw(outputMoney);
		return outputMoney;
		
	}

	
	public String search() {
		System.out.println("현재 남은계좌"+owNo.getRestMoney());
		return null;
		
	}

}
