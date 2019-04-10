
public class Ex02_Exception {

	public static void main(String[] args) {
			int num = 100;
			int result = 0;
			
			// 예외 처리 ...
			
			
			
			

			try {
				for(int i = 0; i<10; i++) {
					result = num / (int)(Math.random() *10); // 0 ~ 9
					System.out.println("result : " + result + " i : " + i);
				}
				
			}catch(ArithmeticException e) {
				System.out.println("연산예외 : " + e.getMessage());
				
			}
			
			catch(Exception e) { // 이것만 쓰면 가독성 별로야...
				System.out.println("나머지 예외는 내가 처리 ...-");
			}
			
			// 여러개의 catch block 생성 가능
			// 하위 예외가 항상 위에(부모)
			
			// 부모클래스가 앞단에있으면 뒤에있는 catch문이 의미가 없기때문에
			// 하위 예외가 항상 위에 존재해야한다
			System.out.println("MainEnd");
			
			
			
			
			
			
	}

}
