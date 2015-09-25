package tttesttt;

/**
 * @file_name : Account.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 24.
 * @Story	  : 통장 개설 프로그램
 */
public class Account {
	private int accountNo; // 계좌번호
	private String ownerName; // 계좌주인
	private String passsword; // 통장비번
	private int restMoney; 	  //잔액
	public static final String BANK_NAME = "한빛뱅크";
	
	
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듬과 동시에 은행이름이 통장바깥에 새겨지며 (상수)
	 * 계좌번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
	 * 계좌주인의 이름은 새겨지며 비번도 설정합니다.
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요.
	 */
	public void deposit(int money) {
		/**
		 * 입금 메소드 +=
		 * 유효성 체크
		 * 입금액이 혹시 0이나 0보다 작은 금액을 
		 * 파라미터로 던질 경우 에러가 발생하는 것을
		 * 막기 위한 방어코딩
		 */
		this.restMoney += money;
		if (money >= 0) {
			
			}
	}
	public void withdraw(int money) {
		/**
		 * 출금 메소드
		 */
		this.restMoney -= money;
		if (money == 0){
		}
		}

	
	public int getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;

	}
	public String getPasssword() {
		return passsword;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setAccountNo() {
		this.accountNo = (int)((Math.random()*999999)+100000);
	}

	public void setOwnerName(String name) {
		this.ownerName = name;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	public void setRestMoney(int number2) {
		this.restMoney = number2;
		
	}
@Override
public String toString() {
	return ownerName+"님\n 비밀번호:******\n계좌번호: "+accountNo+"\n은행 :" + BANK_NAME+"통장이 개설되었습니다.\n"
			+ "현재 통장의 잔액은 "+restMoney+"원 입니다.";
	}

}