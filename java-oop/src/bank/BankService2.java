package bank;

import java.util.Scanner;

public class BankService2 implements Bank2{

	public static void main(String[] args) {
		BankService service = new BankService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력해주세요");
		String name = "";
		int money = 0;
		for(;;){
			System.out.println("동작선택 : 1.계좌개설  2.입금   3.출금   4.조회    5.종료");
			int key = 0;
			
			switch (key) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				
				break;

			default:
				break;
			}
			
			
			
		}
		
		
	}

	@Override
	public String open() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String widthdraw() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String search() {
		// TODO Auto-generated method stub
		return null;
	}
}
