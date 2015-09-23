package encapsule;

public class Accountsub {
	private String name;
private int accountNo; //계좌번호
private String ownerName; // 계좌주민번호
private String password; // 통장 비밀번호
private int restMoney;   // 잔액
public static final String BANK_NAME = "한빛뱅크";
	

public Accountsub() {
	
	this.accountNo =(int)( Math.random()*6)+1;
	String BANK_NAME;
	
}
public int getAccountNo() {
	return accountNo;
}
public String getOwnerName() {
	return ownerName;
}
public String getPassword() {
	return password;
}
public int getRestMoney() {
	return restMoney;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public void setPassword(String password) {
	this.password = password;
}
public void setRestMoney(int restMoney) {
	this.restMoney = restMoney;
}
public void deposit(int money){
	
	/*입금메소드 +=
			 *유효성체크
			 *임금액이 혹시 0이나 0보다 작은 금액을
			 *파라미터로 던질경우 에러가 발생하는 것을
			 *막기위한 방어코딩*/
	
	
}public void withdraw(int money){
	/**
	 * 출금 메소드 -=
	 */
	
	

	
}@Override
	public String toString() {
		return  ();
}
}