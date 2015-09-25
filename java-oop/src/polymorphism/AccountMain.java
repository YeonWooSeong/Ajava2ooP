package polymorphism;

import java.util.Scanner;

/**
 * 생성자를 만드시오
 * 단 통장을 만듦과 동시에
 * 은행 이름이 통장 바깥에 새겨지며(상수)
 * 계좌번호는 랜덤숫자로 만들어지며 (총 6자리로 합니다)
 * 계좌주인의 이름은 새겨지며
 * 비번도 설정합니다.
 * 다만 잔액은 통장이 만들어진 이후에 입금이 되겠지요
 * 
 *입금메소드 +=
 *유효성체크
 *임금액이 혹시 0이나 0보다 작은 금액을
 *파라미터로 던질경우 에러가 발생하는 것을
 *막기위한 방어코딩
 *
 *출금메소드 -=
 *
 * "입출금계좌\n"
 * [bank name]\n
 * 계좌번호
 * 계좌명
 * 비번
 * 잔액  string 값 return
 * 으로 통장이 개설되었습니다.
 *
 */
public class AccountMain {
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
				p1.deposit();
				break;
			case 2:
				p1.withdraw();
				break;
			case 3:
				System.out.println(p1.toString());
				break;
			case 4:
				return;
			}
		}
		
	
	
	
	}
}
