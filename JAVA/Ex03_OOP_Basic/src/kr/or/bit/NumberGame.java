package kr.or.bit;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 맞추기(기회는 5번)");

		int r = ((int) (Math.random() * 50)) + 1;
		int b = 0;
		int count=1;
		do {
			if (count==6) {
				break;
			}
			System.out.printf("%d번째 기회",count);
			System.out.println();
			System.out.print("숫자 입력(1~50): ");
			b = Integer.parseInt(sc.nextLine());
			
			if (b > r) {
				System.out.println("틀렸다. 더 작은 수다.");
			} else if (b < r) {
				System.out.println("틀렸다. 더 큰 수다.");
			}
			

			count += 1;

		} while (b != r);
		if (count == 6) {
			System.out.println("기회는 끝났다.");
		} else if (b == r) {
			System.out.printf("%d !! 정답이다.", r);
		}
	}
}