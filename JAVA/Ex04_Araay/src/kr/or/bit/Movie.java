package kr.or.bit;

import java.util.*;

public class Movie {

	Scanner sc = new Scanner(System.in);
	int[][] number = new int[5][5];
	int num = 1;

	private void movieMenu() {

		System.out.println("***************************");
		System.out.println("1. 영화예매");
		System.out.println("2. 프로그램 종료");
		System.out.println("***************************");
	}

	public void movieView() {

		while (true) {

			movieMenu();
			int result = Integer.parseInt(sc.nextLine());

			switch (result) {

			case 1:
				movieConservation();

				break;

			case 2:
				System.out.println("프로그램 종료");
				System.exit(0); // return

			default:
				System.out.println("1~2까지의 숫자를 입력하세요");
				break;
			}
		}

	}

	private void movieConservation() {
		if (num == 26) {
			num = 1;
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				number[i][j] = num;
				System.out.printf("[%d]\t", number[i][j]);
				num++;
			}
			System.out.println();
		}

		while (true) {

			System.out.println("예약할 자리 번호를 입력하세요(1~25)");
			int result = Integer.parseInt(sc.nextLine());
			if (result > 25 || result < 1) {
				System.out.println("없는 자리다.");
				continue;

			}

			 for (int i = 0; i < number.length; i++) {
				for (int j = 0; j < number[i].length; j++) {
					
						
					  if (result == number[i][j]) {
						number[i][j] = 0;

						for (int k = 0; k < number.length; k++) {
							for (int l = 0; l < number[i].length; l++) {

								System.out.printf("[%d]\t", number[k][l]);
							}
							System.out.println();

						}

					}

				}
			}

		}

	}

}
