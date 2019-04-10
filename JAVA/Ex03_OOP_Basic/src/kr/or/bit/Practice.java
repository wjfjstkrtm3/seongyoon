package kr.or.bit;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = (int)((Math.random()*3) +1);
		
		System.out.println("가위->1, 바위->2, 보->3");
		System.out.println("숫자를 입력하세요");
		a = Integer.parseInt(sc.nextLine());
		
		
		if(a==1) {
			System.out.println("난 가위");
		}
		 else if(a==2) {
			System.out.println("난 바위");
		} else if(a==3) {
			System.out.println("난 보");
		}
		
		if(b==1) {
			System.out.println("컴퓨터는 가위");
			System.out.println();
		
			if(a==1) {
				System.out.println("비겼습니다");
			} else if(a==2) {
				System.out.println("이겼습니다");
			} else if(a==3) {
				System.out.println("졌습니다");
			} else {
				System.out.println("제대로해라");
			}
			
			
		} 
		
		if(b==2) {
			System.out.println("컴퓨터는 바위");
			System.out.println();
		
			if(a==1) {
				System.out.println("졌습니다");
			} else if(a==2) {
				System.out.println("비겼습니다");
			} else if(a==3) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("제대로해라");
			}
			
			
		} 
		
		
		if(b==3) {
			System.out.println("컴퓨터는 보");
			System.out.println();
		
			if(a==1) {
				System.out.println("이겼습니다");
			} else if(a==2) {
				System.out.println("졌습니다");
			} else if(a==3) {
				System.out.println("비겼습니다");
			}  else {
				System.out.println("제대로해라");
			}
			
			
		}
		
		
		 else {
			System.out.println("1,2,3중에 하나만입력해라");
		}
		
		
	
		
		
		
	}
}
