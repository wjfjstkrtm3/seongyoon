// Thread : 프로세스에서 하나의 최소 실행단위(method)

// Thread 생성방법 = 여러개의 stack을 어떻게 만듭니까?
// 1. Thread 클래스를 상속해서 만든다 -> class Test extends Thread()
// 반드시 Thread 클래스를 상속할 경우에는 run() 함수 재정의 해야한다 (반드시) >> run()은 다른 stack의 main() 역할

// 2. implements Runnable 구현하는 방법 -> class Test implements Runnable
// 반드시 run() 추상함수를 재정의 해야한다 (어차피 인터페이스는 추상함수를 가지고 있기때문에 재정의 해야한다)

// why 2가지나 제공할까? ....
// class Test extends Car {  // Thread를 못만들어 단일상속밖에안되니까
//}
// class Test extends Car implements Runnalbe{
//}
// 다른 자원을 이미 상속하고 있는 클래스에 대해서 Thread 만들기 위한 방법
// 다중상속이 안되니까 ..

// Thread 추상클래스가 아닌 일반클래스 
// Thread 독자적으로 객체를 만들수있다

class Thread_1 extends Thread { // 별도의 stack 에서 운영가능하다 // Thread_1는 상속받았으니까 Thread 클래스다
	
	@Override 
	public void run() { // main 함수 역할 >> 별도의 stack에 run()함수가 제일먼저 올라간다
		// main() 함수를 하나를 더만든다고 생각하면 편한다
		for(int i =0; i < 1000; i++) {
			System.out.println("Thread_1 " + i + this.getName());
		}
		
		System.out.println("Thread_1 run() END");
	}
	
}

class Thread_2 implements Runnable { // Thread_2는 일반 클래스임 -> 인터페이스를 구현한

	@Override
	public void run() { 
		
		for(int i =0; i < 1000; i++) {
			System.out.println("Thread_2 " + i);
		}
		
		System.out.println("Thread_2 run() END");
	}
	
	
	
	}
	
	
	





public class Ex02_Multi_Thread {

	public static void main(String[] args) { // main() 함수도 하나의 쓰레드
		
		System.out.println("Main Start");
		
		// 1. Thread_1 객체 생성
		Thread_1 th = new Thread_1();
		th.start(); // main() 함수에 올라가지만, stack이라는 메모리를 만들고(생성하고) stack에 run() 까지 올려놓고 .. 소멸..
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main : " + i);
		}
		
		// 2번
		 Thread_2 th2 = new Thread_2(); // 일반 객체
		 Thread thread = new Thread(th2);
		 thread.start();
		
		
		System.out.println("Main END");
		
		
		
		
		
		
		
		
		
	}

}
