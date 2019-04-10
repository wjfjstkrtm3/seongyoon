import java.util.ArrayList;

// Today Point
// generic
// JDK 1.5 부터 지원
// C#, JAVA 필수 기능

// 1. Object 타입 저항 -> Object 타입 탈피
// 2. 타입을 강제하는 방법(타입 안정성)
// 3. 형변환 (casting) 문제 해결 : (Car)obj downcasting 하지 않겠다 ...

class Person {
	int age = 100;
}

class MyGen<T> { // Type parameter MyGen<E>
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}
/*
 
MyGen<String> mygen = new MyGen<String>();

heap 메모리에 로드 될때 

class MyGen { // Type parameter MyGen<E>
	String obj;
	
	void add(String obj) {
		this.obj = obj;
	}
	
	String get() {
		return this.obj;
	}
}


*/
public class Ex06_Generic {

	public static void main(String[] args) {
		
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("AAA");
		System.out.println(mygen.get());
		
		MyGen<Person> mygen2 = new MyGen<Person>();
		mygen2.add(new Person());
		Person p = mygen2.get();
		System.out.println(p.age);
		
		
		ArrayList<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		
		for(String str : li) {
			System.out.println(str);
		}

		////////////////////////////////////////////////
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");
		
		// 개선된 for문을 사용해서 >> 500, 100, 홍길동 출력
		
		for(Object obj : list) {
			if(obj instanceof Person) {
				Person person = (Person)obj;
				System.out.println(person.age);
			} else {
				System.out.println(obj);
			}

		}
		
		ArrayList<Person> alist = new ArrayList<Person>();
		
		alist.add(new Person());
		
		System.out.println(alist.get(0).age);
		
		
	}

}
