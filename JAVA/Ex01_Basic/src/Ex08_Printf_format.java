import java.util.Scanner;


public class Ex08_Printf_format {

	public static void main(String[] args) {
		// java.lang package 아래 있는 자원 (import) 선언 구문 없이 사용 가능
		// default로 open 되어 있어서
		// C# : console.WriteLine()
		// C# : console.ReadLine()
		// java : System.out.println
		
		System.out.println("A"); // 줄바꿈
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("S");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num : " + num + " 입니다");
		
		// 형식 (format) 문자 (약속)
		// %d (10진수 형식의 정수)
		// %f (실수)
		// %s (문자열)
		// %c (문자)
		// 특수문자 : \t (탭키), \n엔터)
		System.out.printf("num 값은 : %d 입니다\n" , num);
		System.out.printf("num의 값은 [%d] 입니다, 그리고 [%d] 도 있어요\n", num, 1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f의 변수 값은 : %f 입니다\n", f);
		
		System.out.printf("문자열 값은 %s로 출력하고, %d 다음 숫자 출력\n", "안녕", 200);
		
		// cmd (console) 에서 사용자가 입력한 값을 read 오기
		
		
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// 위 코드처럼 클래스를 사용하려면 폴더(package)를 열어 놓아야 합니다
		// 자바파일 페이지 상단에 : import java.util;
		
		// Scanner 클래스는 입력 값을 받을 수 있다
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		String value = sc.nextLine(); // 사용자가 입력한 (문자)값을 read 한다
		System.out.println("입력값 : " + value);
		
		// System.out.println("숫자 값을 입력하세요");
		// int number = sc.nextInt(); // 숫자 값으로 read
		// System.out.println("number : " + number);
		
		
		// sc.hasNextFloat() 타입별로 읽어들이는 함수가 따로있다
		// 하지만 우리는 nextLine()만 사용하겠다
		// 권장사항 : 그냥 문자로 읽어들여서, 필요하다면 변환해서 사용한다
		// Today Point
		// [[[문자를 -> 숫자로]]]
		// Integer.parseInt(s) 문자를 정수로 바꿔줌
		// Integer클래스안에 있는 parseInt함수를 사용
		// Float.parseFloat(s) 문자를 실수로
		// Double.parseDouble(s) 문자를 실수로
		
		System.out.println("숫자를 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		// 입력받은 문자를 정수로 바꿔서 오류를 없애줌
		number += 100;
		System.out.println("숫자 : " + number);
		
		// 숫자를 문자로 (아주 가끔)
		String data = String.valueOf(1000);
		data += 100;
		System.out.println(data);
		
		
	
		// Integer.parseInt 문자를 정수로
		// double.
	
		
		
		
	}

}
