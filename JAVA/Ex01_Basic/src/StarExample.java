import java.util.Scanner;

public class StarExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 값을 입력받기위해서 Scanner객체 사용

		System.out.println("수를 입력하세요"); 
		int aa = sc.nextInt(); // aa변수에 정수값을 입력받겠다

		for (int i = 1; i <= aa; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 조건이 만족하면 별을 찍는다
				}
			System.out.println(); 
		}

		System.out.println("-------------------------------------------------");

		for (int i = aa; i >= 1; i--) { // 값을 입력받은 만큼 줄을 만든다
										
			for (int j = 1; j <= i; j++) { // 맨 윗줄에 별을 입력받은 숫자만큼 찍기위해서
				System.out.print("*");
			}
			System.out.println(); // 한줄을 띄어준다
		} 
		System.out.println("------------------------------------------------");

		for (int i = 1; i <= aa; i++) {

			for (int j = 1; j <= aa - i; j++) { // 10을 입력받으면 첫줄은 9칸을 공백을 주고
												// 두번째 줄은 8칸의 공백을 준다
				System.out.print(" "); // 한 줄에 별을 오른쪽으로 밀기 위해 빈칸
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 조건이 만족하면 별을 찍는다
			}

			System.out.println(); // 한줄을 띄어준다
		}

	

	}

}
