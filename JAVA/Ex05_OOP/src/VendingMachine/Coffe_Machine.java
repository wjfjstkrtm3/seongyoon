package VendingMachine;

import java.util.Scanner;

public class Coffe_Machine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Button button = new Button();
		InputMoney inputmoney = new InputMoney();
		Material material = new Material();
		int b;
		while (true) {
			System.out.println("현금을 입력하세요.");
			int money = sc.nextInt();
			inputmoney.InputAmount(money);
			
			do {
				System.out.println("뽑을 커피의 번호를 입력하세요.");

				b = sc.nextInt();

				button.selectCoffee(b);
			} while (!(b >= 1 && b <= 3));
		}
	}
}

class Button {

	Material m = new Material();
	InputMoney i = new InputMoney();
	private final int americanoButton = 1;
	private final int hazelnutButton = 2;
	private final int milkCoffeeButton = 3;
	private boolean iceHotButton; // 수정됐음
	private static int change;
	// 잔돈반환버튼 삭제

	void selectCoffee(int button) {

		switch (button) {

		case americanoButton:
			m.makeAmericano();
			change = InputMoney.amount - i.americano;
			InputMoney.amount = 0;
			System.out.println("잔돈 : " + change);
			break;
		case hazelnutButton:
			m.makeHzn();
			change = InputMoney.amount - i.hazelnut;
			InputMoney.amount = 0;
			System.out.println("잔돈 : " + change);
			break;
		case milkCoffeeButton:
			m.makeMilkCoffee();
			change = InputMoney.amount - i.milkCoffee;
			InputMoney.amount = 0;
			System.out.println("잔돈 : " + change);
			break;
		default:
			System.out.println("없는 번호입니다.");
		}
	}
}

class InputMoney {
	Scanner sc = new Scanner(System.in);
	public static int amount = 0; // 수정
	public final int americano = 1000;
	public final int hazelnut = 2000;
	public final int milkCoffee = 3000;

	public int InputAmount(int money) { // 수정
		amount += money;
		System.out.println("현재금액 : " + amount);
		while (amount < americano) {
			if (amount < americano) {
				System.out.println("뽑을 수 있는 커피가 없습니다. 돈을 더 넣으세요.");
			}
			amount += sc.nextInt();
			System.out.println("현재금액 : " + amount);
		}
		if (amount >= americano) {
			System.out.println("1. 아메리카노 (O) -뽑을 수 있음");
		}
		if (amount >= hazelnut) {
			System.out.println("2. 헤이즐넛 (O) -뽑을 수 있음");
		}
		if (amount >= milkCoffee) {
			System.out.println("3. 밀크커피 (O) -뽑을 수 있음");
		}
		return amount;
	}

}

class Material { // 1당 1인분..
	private int hotWater = 100;
	private int hznSyrup = 100;
	private int coffeePowder = 100;
	private int milk = 100;
	private int ice = 100;
	private int paperCup = 100;

	public void makeAmericano() {
		this.paperCup--;
		this.coffeePowder--;
		this.hotWater--;
		System.out.println("아메리카노");
	}

	public void makeHzn() {
		this.hznSyrup--;
		this.paperCup--;
		this.coffeePowder--;
		this.hotWater--;
		System.out.println("헤이즐넛");
	}

	public void makeMilkCoffee() {
		this.milk--;
		this.paperCup--;
		this.coffeePowder--;
		this.hotWater--;
		System.out.println("밀크커피");
	}

	public void IceHot(boolean iceHotButton) { // 추가됐음
		if (iceHotButton == true) {
			this.ice--;
		}
	}
}