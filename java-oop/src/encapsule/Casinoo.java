package encapsule;

public class Casinoo {
private Cardsub player1;
private Cardsub player2;
private String resultWin;
private String resultLose;

public Casinoo(Cardsub player1,Cardsub player2) {
	this.player1 = player1;
	this.player2 = player2;
	
	if (player1.getNumber() > player2.getNumber()) {
		this.resultWin = player1.getName();
		this.resultLose =  player2.getName();
	}else {
		this.resultWin = player2.getName();
	}	this.resultLose = player1.getName();
	
}

public Cardsub getPlayer1() {
	return player1;
}
public Cardsub getPlayer2() {
	return player2;
}
public String getResultWin() {
	return resultWin;
}
public String getResultLose() {
	return resultLose;
}
public void setPlayer1(Cardsub player1) {
	this.player1 = player1;
}
public void setPlayer2(Cardsub player2) {
	this.player2 = player2;
}
public void setResultWin(String resultWin) {
	this.resultWin = resultWin;
}
public void setResultLose(String resultLose) {
	this.resultLose = resultLose;
}
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return resultWin+"가"+resultLose+"를"+"   이겼습니다";
	}
}