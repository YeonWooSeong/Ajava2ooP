package encapsule;


public class Cardsub {
	private String kind; // 카드무늬
	private int number; // 카드의 넘버 (1~13)
	private String name;

	public Cardsub() {
		this.kind = "하트";
		this.number = (int) (Math.random() * 13) + 1;

	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setKind(String kind) {
		this.kind = "하트";
	}

	public void setNumber(int number) {
		this.number = (int) (Math.random() * 13) + 1;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}