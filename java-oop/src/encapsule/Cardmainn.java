package encapsule;

import java.sql.ResultSet;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Cardmainn {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("두명의 플레이어 입력");
	String name1 = scanner.next();
	String name2 = scanner.next();
	Cardsub player1 = new Cardsub();
	Cardsub player2 = new Cardsub();
	player1.setName(name1);
	player2.setName(name1);
	System.out.println("승자");
}

	
	
}
