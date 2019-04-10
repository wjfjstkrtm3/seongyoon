package VendingMachine;

import java.util.Scanner;

public class Coffe {
	
	
	
	public static void main(String[] args) {
		InputMoney2 inputMoney = new InputMoney2();
		Button button = new Button();
		Material material = new Material();
		
		
		System.out.print("돈을 넣어주세요> ");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		
		
		
		
	}
}

class InputMoney2{
	private Long paper=0L;
	private int coin=0;
	private Long amount=0L;
	
	
		
		
	
}




class Button2 extends Material {
	private int americanoButton=1;
	private int hazelnutButton=2;
	private int milkCoffeeButton=3;
	private int changeButton=4;
	private boolean iceHotButton;
	
	
}



class Material2{
	private int hotWater=100;
	private int hznSyrup=100;
	private int coffeePowder=100;
	private int milk=100;
	private int ice=100;
	private int paperCup=100;
	
	public void makeAmericano() {
		paperCup--;
		coffeePowder--;
		hotWater--;
		System.out.println("아메리카노");
	}
	public void makeHzn() {
		hznSyrup--;
		paperCup--;
		coffeePowder--;
		hotWater--;
		System.out.println("헤이즐넛");
	}
	public void makeMilkCoffee() {
		milk--;
		paperCup--;
		coffeePowder--;
		hotWater--;
		System.out.println("밀크커피");
	}
	
	public void IceHot(boolean iceHotButton) {
		
	}
}