import java.util.ArrayList;
import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {

	public static void main(String[] args) {
		// LIFO : Last In First Out
		// Stack : Collection Framework 제공하는 클래스
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// java.util.EmptyStackException 발생
		System.out.println(stack.isEmpty()); // true 아무것도 없어
		
		
		// 동전 케이스
		// Stack 자료구조 원하는 형태 ...
//		Stack coinbox = new Stack();
//		coinbox.push(item) // 재너릭을 안쓰면 동전만 들어가야되는데 Object라서 껌도넣고, 담배꽁초도 넣을 수 있다
							// 그래서 동전만 넣도록 제너릭으로 강제한다
		
		Stack<Coin> coinbox = new Stack<Coin>();

		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		
//		System.out.println(coinbox.pop()); // coin 객체를 끄집어낸거임 그래서 주소값이 나온거
//		System.out.println(coinbox.pop().getValue());
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue());
			
		}
		
		
		
		
		MyStack my = new MyStack(3);
		//System.out.println(my.pop());
		my.push("A");
		my.push("B");
		my.push("C");
		
		 my.push("D"); //스택이 가득차 있어요
		
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
	
		
		
		
		
		
	
	}

}

