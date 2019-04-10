import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		String boho = "";
		int result = 0;
		
		
		System.out.println("입력값> ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("부호> ");
		boho = sc.nextLine();
		
		System.out.println("입력값> ");
		num2 = Integer.parseInt(sc.nextLine());
		
		
		
		
		if(boho.equals("+")) {
			result = num + num2;
			
		} else if(boho.equals("-")) {
			result = num - num2;
			
		} else if(boho.equals("*")) {
			result = num * num2;
			
		} else if (boho.equals("/")) {
			result = num / num2;
		}
		else {
			System.out.println("부호가 아닙니다");
			return;
		}
		
	System.out.println(result
			);
	}
}

