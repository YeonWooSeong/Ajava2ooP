package test;

public class Test_Acc_sub {
	private int accountNo; // 계좌번호
	private String ownerName; // 이름
	private int password; // 통장 비밀번호
	private int restMoney; // 잔액
	public static final String BANK_NAME = "한빛뱅크";
	
	
	public Test_Acc_sub() {
		accountNo = (int) ((Math.random() * 999999) + 1000000);
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public int getPassword() {
		return password;
	}
	public int getRestMoney() {
		return restMoney;
	}
	public static String getBankName() {
		return BANK_NAME;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}
	
	public void deposit(){
		/* 입금메소드 += 유효성체크 임금액이 혹시 0이나 0보다 작은 금액을 파라미터로 던질경우 에러가 발생하는 것을 막기위한 방어코딩
				 *
				 * 출금메소드 -=
				 *
				 * "입출금계좌\n" [bank name]\n 계좌번호 계좌명 비번 잔액 으로 통장이 개설되었습니다.
				 **/
		
		
	}
	public void withdraw(){
		
		
		
	}
	
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

}


