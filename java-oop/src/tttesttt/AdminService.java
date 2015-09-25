package tttesttt;

import polymorphism.Account;
import polymorphism.Accountsub;
import polymorphism.Admin;

public class AdminService implements Admin{
private Account[] accountList;
private int count;
public AdminService(){
	this(0);
	
}
	
public AdminService(int count){
	accountList = new Account[1000];
	
}
	
	@Override
	public Accountsub searchAccountbyAccountNo() { // 계좌 찾는데 번호로 찾음.
		Account seAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (true) {
		searchAccount = accountList[i];	// 계좌번호 일치 불일치
			}
		}
		return null;
	}

	@Override
	public Accountsub[] searchAccountsByName() {
		int tempCount = searchCountByName(name);
		if (tempCount == 0) {
			return null;
		}
		Account[] tempList = new Account[tempCount];
		tempCount = 0;
		for (int i = 0; i < tempList.length; i++) {
			//  ?
			tempCount++;
		}
		
		return tempList;
	}

	
	

	private int searchCountByName(Object name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String opnAccount(int accountNo, String name, int restMoney) {
		String msg = "";
		Account account = new Account();
		account.setAccountNo();
		account.setOwnerName(name);
		account.setRestMoney(restMoney);
		accountList[count] = account;
		count++;
		msg = account.toString();
		return msg;
		
		
	}

	@Override
	public int countAll() {
		return 0; //계좌번호를 검색해서 맞으면 올리고 아니면 x
	}

	@Override
	public boolean closeAccount() {
		// TODO Auto-generated method stub
		return false;
	}

}
