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
public class Accountmain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Accountsub owNo  = new Accountsub();
		System.out.println("이름입력");
		String name2 = scanner.next();
		System.out.println("비밀번호 입력");
		int pW = scanner.nextInt();
		owNo.setOwnerName(name2);
		owNo.setPassword(pW);
		System.out.print(owNo.toString());
	}
	
}