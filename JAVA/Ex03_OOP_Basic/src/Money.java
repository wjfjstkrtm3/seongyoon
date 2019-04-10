import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

		int NUM = 0;
		int SW = 0;
		int UNIT = 10000;
		System.out.println("Money ют╥б : ");
		Scanner sc = new Scanner(System.in);
		int MONEY = Integer.parseInt(sc.nextLine());
		while (UNIT >= 1) {
			NUM = (MONEY / UNIT);
			System.out.printf("UNIT : %d\nNUM : %d\n", UNIT, NUM);
			
			MONEY-=(UNIT*NUM);

			if (SW == 0) {
				UNIT /= 2;
				SW = 1;
			} else {
				UNIT /= 5;
				SW = 0;
			}

		}
	}

}