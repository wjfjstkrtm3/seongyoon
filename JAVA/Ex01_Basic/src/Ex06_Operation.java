
public class Ex06_Operation {

	public static void main(String[] args) {
		// == 연산자 (값(value) 비교하는 연산자
		// javascript (==)
		if (10 == 10.0f) { // == 이 값으로 보는것이기때문에 같다
			System.out.println("True");

		} else {
			System.out.println("False");

		}

		// ! 부정연산자
		if ('A' != 65) { // 같지 않니
			System.out.println("어 같은 값이 아니야");

		} else {
			System.out.println("어 같은 값이야");
		}

		// 암기하자(POINT)
		// 제어문처럼 쓰는 연산자 (삼항 연산자)
		int p = 10;
		int k = -10;

		int result8 = (p == k) ? p : k;
		System.out.println("result8 : " + result8);

		// ? 앞에있는 조건식이 true 라면 : 앞에 있는 값을
		// ? 앞에있는 조건식이 flase 라면 : 뒤에 있는 값을

		if (p == k) {
			result8 = p;

		} else {
			result8 = k;
		}

		
		// 연산자 (| (or), & (and) )
		// 0과 1의 bit 연산
		int x = 3;
		int y = 5;
		
		System.out.println("x | y : " + (x|y)); // OR
		System.out.println("x & y : " + (x&y)); // AND
		// 십진수 3을 -> 내부적으로 2진수값으로 바꾼다
		// 128 64 32 16 8 4 2 1 
		//		  0 0 0 0 0 1 1 (2진수 : 3)
		//		  0 0 0 0 1 0 1 (2진수 : 5)
 		// OR	  0 0 0 0 1 1 1 -> 1+2+4 -> 7
		// AND    0 0 0 0 0 0 1 -> 1
		
		/*
		 진리표
		 0 : false 
		 1 : true
		 		OR		AND
		 0 0	0		 0
		 0 1	1		 0
		 1 0	1		 0
		 1 1	1		 1
		
		
		sql(oracle)
		
		select * from emp
		where job = 'sales' and saa > 2000;
		
		select * from emp
		where job = 'sales' or saa > 2000;
		
		 
		// POINT 논리연산 ( || (or), && (and)) 연산자 return boolean
		// 중요할까
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { 실행문 }
		// if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) { 실행문 }  
		 
		 
		 
		 
		 */
		
		
		
		
		
		
		
		
		
	}
}
