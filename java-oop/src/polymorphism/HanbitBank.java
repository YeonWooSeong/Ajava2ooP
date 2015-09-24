package polymorphism;

import java.util.Scanner;

public class HanbitBank {
public static void main(String[] args) {
	BankService service = new BankService();
	Scanner scanner = new Scanner(System.in);
	System.out.println("입금액을 입력해 주세요");
	int money = scanner.nextInt();
switch (key) {


case 1:service.open(); break;
	case 2:service.deposit();break;
	case 3:service.withdraw();break;
	case 4:service.serch(); break;
	case 5:return;
	break;

default:
	break;
	
}
}
}