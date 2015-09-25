package polymorphism;

import java.util.Scanner;

public class HanbitOffice {
public static void main(String[] args) {
	
	AdminService adminService = new AdminService();
	Account account = new Account(1000);
	Scanner scanner = new Scanner(System.in);
	
	/*
	 * 
	 */

	while(true){
		System.out.println("관리자 화면 : 0.계좌개설    1.검색(께좌번호)  2.검색(이름)   3.계좌해지   4.총 계좌수량   5. 종료");
		public static void main(String[] args) {
			
			//Scanner scan = new Scanner(System.in);
			//String ps = scan.nextLine();
			
			Scanner scan = new Scanner(System.in);
			Account p1 = new Account(); //통장 정보.
			
			System.out.println("이름  : ");
			String name = scan.next();
			System.out.println("비번  : ");
			String password = scan.next();
			
			p1.setAccountNo();
			p1.setOwnerName(name);
			System.out.println(p1.toString());
			
			
			for( ; ;){
				System.out.println("1.입금 2. 출금 3. 잔액조회 4. 종료");
				int key = scan.nextInt();
				switch(key){
				case 1: 
					System.out.println("계좌번호 입력");
					int accountno = scanner.nextInt();
					System.out.println("이름 입력");
					String name = scanner.next();
					System.out.println("입금액 입력");
					int restMoney = scanner.nextInt();
					
					
					service.openAccount(accountNo, name , restMoney)
					break;
				case 2:
					
					break;
				case 3:
					;
					break;
				case 4:
				case 5:
					break;
					return;
				}
			}
			
		
		
		
		}
	}

		
	}
	 	
}

