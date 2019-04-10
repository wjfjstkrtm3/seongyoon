import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		int su = 0;
		int su2 = 0;
		String opr = "";
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력값> " );
		su = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력값(기호)> ");
		opr = sc.nextLine();
		
		System.out.println("입력값> ");
		su2 = Integer.parseInt(sc.nextLine());
		
		
		if(opr.equals("+")) { //문자열을 비교하는 메소드 equals()
			result = su + su2;
		}
		else if(opr.equals("-")) {
			result = su - su2;
		}
		
		else if(opr.equals("*")) {
			result = su * su2;
		}
		
		else if(opr.equals("/")) {
			result = su / su2;
		}
		
		else {
			System.out.println("기호가 잘못되었습니다");
			return; // 메소드의 실행을 종료 -> main 메소드를 종료 -> 프로그램 종료
		}
		
		
		System.out.printf("[%d] [%s] [%d] [%d]", su, opr, su2, result);
		//System.out.println("연산결과 : " + "[" + su + "]" + "["+ opr + "]" + "["+ su2 +"]" + "=" +  result);
	}

}
/*
간단한 사칙 연산기 (+ , - , * , /)
입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
목적 : Integer.parseInt() ,  equals() 활용
화면
>입력값:100
>입력값(기호): +
>입력값:600
>연산결과 :700

-------------
>입력값:100
>입력값(기호): -
>입력값:100
>연산결과 :0
*/