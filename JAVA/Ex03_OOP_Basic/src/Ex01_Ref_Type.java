import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		

		Person person; // STACK 영역에 4Byte 빈 공간(person) null
		// 값을 가지기를 원하면 메모리에 올려줌 -> new 연산자를 통해
		
		person = new Person(); 
		// HEAP 메모리에 Person 객체 만들고 person 변수에 주소값을 할당한다
		System.out.println("person : " + person);
		
		person.name = "홍길동";
		person.age = 100;
		person.print();
		
		Person person2 = new Person(); // 선언과 할당을 동시에
		person.name = "김유신";
		person.age = 120;
		person.print();
		
		// person, person2 (참조 타입 : Reference type)
		
		int num = 100; // main 함수 안에있는 local variable (반드시 초기화)
		System.out.println("값 : " + num); // (value Type) (값 타입)
		
		Person you; // The local variable you may not have been initialized
		// 초기화를 하지 않아서 오류
		// 참조 타입에서 초기화는 주소 값을 갖는 것 -> new연산자로
		// 1. 참조 변수의 초기화 (new)
		// you = new Person();
		
		you = person; // person의 주소 값을 you에 넣는다 = 동거가 시작
		// 2. 다른 참조 변수가 가지는 값을 할당
		System.out.println("you : " + you);
		System.out.println("person : " + person);
		
		System.out.println(you == person); // == 값 비교 (같은 주소)
		
		Tv tv = new Tv();
		
		tv.brandName = "삼성";
		
		System.out.println("기본채널 : " + tv.ch); // 초기화 하지않으면 0
		System.out.println("브랜드명 : " + tv.brandName); // 초기화 하지않으면 null
		System.out.println("전원정보 : " + tv.power);
		tv.power_on(); // 호출한다( 함수는 이름을 불러주었을때 실행)
		
		
		tv.ch_up();
		tv.ch_up();
		tv.ch_up();
		System.out.println("변경된 채널 : " + tv.ch);
		
		tv.ch_down();
		System.out.println("변경된 채널 : " + tv.ch);
		
		
		
		
	}

}
