package encapsule;

import java.util.Scanner;

public class WhileLoopten {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, sum = 0 , key = 0;
		while(true) {
			//i <= 10
			System.out.println("원하는 업무를 선택해주세요.  \n  1 : 계속 , 2: 잔액조회 , 3:입금  , 4 : 출금 , 5 : 정지");
			key = scanner.nextInt();
			System.out.print("\t"+i);	
			i++; 
		                              //i = 0; // 이 부분을 생략하면 i에 이미 10이 할당된 상태로  아래 for문을 돌기 때문에 1부터 증가하는 컨디션을 벗어난다
		
				switch (key) {
				case 1: i++;break;  
				case 2: 
					return;
				default:
					break;
				}
		}
		
	}
}
