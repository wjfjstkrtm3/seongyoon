import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Collection Framework
// 나열된 자원에 대해 [순차적]으로 접근해서 [값]을 리턴하는 표준을 정의
// Iterator 인터페이스 설계


// 예를 들어 A 클래스 Iterator 구현
//        B 클래스 Iterator 구현
// 내가 보장받는 것은 : hasNext() 구현되어 있다, Next() 구현되어 있다

// ArrayList >> Iterator 구현 하고 있다
// for문을 쓰면 안되요 ... 써되 되요
// 우리가 원하는 것은 표준화된 접근

// Iterator : 순방향 데이터 read 표준
// ListIterator : 양방향 데이터 read 표준



public class Ex09_Collection_Iterator {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); // 제너럴은 원시타입을 쓰지못해서 int를 클래스로 만든것 ? 
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 표준화된 인터페이스를 사용해서 출력한다면
		// Iterator
		// Collection { Iterator iterator() } // 추상 자원
		// List extends Collection
		// ArrayList implements List
		// ArrayList >> iterater() 함수의 { 실행블록을 만들었을 것이다 }
		// Iterator (부모 타입) 접근 ....
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // next()는 값을 끄집어내면서 다음을 가르킴
		}
		
		// 표준화된 iterator 사옹한것
		
		
		// generic
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		intlist.add(44);
		intlist.add(55);
		intlist.add(66);
		
		
		Iterator<Integer> list2 = intlist.iterator(); // 주소값을 리턴하는데 그 주소값을 Iterator 인터페이스가 받는다
		
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
		
		// 역방향
		
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		
		// 역방향도 표준화된 인터페이스를 만들었다
		// ListIterator (순방향, 역방향) // 역방향을 가려면 순방향을 먼저 만들어야한다
		
		ListIterator<Integer> li2 = intlist.listIterator();
		while(li2.hasNext()) {
			System.out.println(li2.next());
		}
		
		// 역방향
		while(li2.hasPrevious()) {
			System.out.println(li2.previous());
		}
		
		
	}
}
