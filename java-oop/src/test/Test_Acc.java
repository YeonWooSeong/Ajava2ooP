package test;

import java.util.Scanner;

public class Test_Acc {

	/**
	 * 생성자를 만드시오 단 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 계좌번호는 랜덤숫자로 만들어지며 (총 6자리로
	 * 합니다) 계좌주인의 이름은 새겨지며 비번도 설정합니다. 다만 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 * 
	 * 입금메소드 += 유효성체크 임금액이 혹시 0이나 0보다 작은 금액을 파라미터로 던질경우 에러가 발생하는 것을 막기위한 방어코딩
	 *
	 * 출금메소드 -=
	 *
	 * "입출금계좌\n" [bank name]\n 계좌번호 계좌명 비번 잔액 으로 통장이 개설되었습니다.
	 *
	 */
	/**
	 * 생성자를 만드시오 단 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 계좌번호는 랜덤숫자로 만들어지며 (총 6자리로
	 * 합니다) 계좌주인의 이름은 새겨지며 비번도 설정합니다. 다만 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 * 
	 * 입금메소드 += 유효성체크 임금액이 혹시 0이나 0보다 작은 금액을 파라미터로 던질경우 에러가 발생하는 것을 막기위한 방어코딩
	 *
	 * 출금메소드 -=
	 *
	 * "입출금계좌\n" [bank name]\n 계좌번호 계좌명 비번 잔액 으로 통장이 개설되었습니다.
	 *
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test_Acc_sub acc = new Test_Acc_sub();
		System.out.println("이름");
		String name = scanner.next();
		System.out.println("pw");
		int pw = scanner.nextInt();
		while (true) {
			System.out.println("동작선택 : 1.계좌개설  2.입금   3.출금   4.조회    5.종료");
			int key = scanner.nextInt();
			switch (key) {
			case value:
				
				break;

			default:
				break;
			}
		}

	}

}
