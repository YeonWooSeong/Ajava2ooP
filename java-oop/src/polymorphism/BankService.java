package polymorphism;

import java.util.Scanner;

public class BankService implements Bank2{
Accountsub account = new Accountsub();
Scanner scanner = new Scanner(System.in);


public	void serch() {


		
	}

@Override
public String open() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deposit() {
	// TODO Auto-generated method stub
	account.deposit();
	
}

@Override
public void withdraw() {
	// TODO Auto-generated method stub
	account.withdraw();
}

}