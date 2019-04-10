import java.util.Scanner;

public class coofe{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Button button = new Button();
		InputMoney inputmoney = new InputMoney();
		Material material = new Material();
		int b;
		boolean c;
		while (true) {
			System.out.println("현금을 입력하세요.");
			int money = sc.nextInt();
			inputmoney.InputAmount(money);

			do {
				System.out.println("뽑을 커피의 번호를 입력하세요.");

				b = sc.nextInt();

				c = button.selectCoffee(b);
			
			} while (!(b >= 1 && b <= 3) ||  c ==false);
		}
	}
}

class Button {

	Material m = new Material();
	InputMoney i = new InputMoney();
	private final int AMERICANO_BUTTON = 1;
	private final int HAZELNUT_BUTTON = 2;
	private final int MILKCOFFEE_BUTTON = 3;
	private static int change;
	
	// 잔돈반환버튼 삭제

	boolean selectCoffee(int button) {

		switch (button) {
		
		case AMERICANO_BUTTON:
			if(m.americanoQ()<=0) {
				System.out.println("재고가 없습니다.");
				return false;
			}
			m.makeAmericano();
			change = InputMoney.amount - i.AMERICANO;
			InputMoney.amount = 0;
			System.out.println("잔돈 : " + change);
			break;
		case HAZELNUT_BUTTON:
			if(m.HazelnutQ()<=0) {
				System.out.println("재고가 없습니다.");
				return false;
			}
			m.makeHzn();
			change = InputMoney.amount - i.HAZELNUT;
			InputMoney.amount = 0;
			System.out.println("잔돈 : " + change);
			break;
		case MILKCOFFEE_BUTTON:
			if(m.milkCoffeeQ()<=0) {
				System.out.println("재고가 없습니다.");
				return false;
			}
			m.makeMilkCoffee();
			change = InputMoney.amount - i.MILKCOFFEE;
			InputMoney.amount = 0;
			System.out.println("잔돈 : " + change);
			break;
		default:
			System.out.println("없는 번호입니다.");
		}
		return true;
	}
}

class InputMoney {
	Scanner sc = new Scanner(System.in);
	Material m = new Material();
	public static int amount = 0; // 수정
	public final int AMERICANO = 1000;
	public final int HAZELNUT = 2000;
	public final int MILKCOFFEE = 3000;

	public int InputAmount(int money) { // 수정
		amount += money;
		System.out.println("현재금액 : " + amount);
		while (amount < this.AMERICANO) {
			if (amount < this.AMERICANO) {
				System.out.println("뽑을 수 있는 커피가 없습니다. 돈을 더 넣으세요.");
			}
			amount += sc.nextInt();
			System.out.println("현재금액 : " + amount);
		}
		if (amount >= this.AMERICANO) {
			System.out.println("1. 아메리카노((뽑을 수 있음)) -1000원 -" + m.americanoQ() + "잔 남음");
		}
		if (amount >= this.HAZELNUT) {
			System.out.println("2. 헤이즐넛((뽑을 수 있음)) - 2000원 -" + m.HazelnutQ() + "잔 남음");
		}
		if (amount >= this.MILKCOFFEE) {
			System.out.println("3. 밀크커피((뽑을 수 있음)) - 3000원 -" + m.milkCoffeeQ() + "잔 남음");
		}
		return amount;
	}

}

class Material { // 1당 1인분으로 가정..
	private static int hotWater = 300;
	private static int hznSyrup = 100;
	private static int coffeePowder = 300;
	private static int milk = 100;
	private static int paperCup = 300;

	public int americanoQ() { 
		int[] material = { hotWater, coffeePowder, paperCup };
		swap(material);
		return material[0];
	}

	public int HazelnutQ() {
		int[] material = { hotWater, hznSyrup, paperCup };
		swap(material);
		return material[0];
	}

	public int milkCoffeeQ() {
		int[] material = { hotWater, milk, coffeePowder, paperCup };
		swap(material);
		return material[0];
	}

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

	public int swap(int[] material) {
		for (int i = 0; i < material.length; i++) {
			for (int j = i + 1; j < material.length; j++) {
				if (material[i] > material[j]) {
					int swap = material[j];
					material[j] = material[i];
					material[i] = swap;
				}
			}

		}
		return material[0];
	}
}