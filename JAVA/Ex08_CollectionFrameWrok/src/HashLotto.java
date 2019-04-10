import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class HashLotto {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		// SEt set = new HashSet();
		
		System.out.println(hs.size());
		
		
		for(int i = 0; hs.size()<6; i++) { // hs.size() << POINT
			int result = (int)(Math.random() * 45) +1;
			hs.add(result);

		}
		
		System.out.println(hs.toString());
		// while 횟수
		
		//for(int i = 0 ; set.size() < 6 ; i++ ) >> while 전환하세요
				Set set2 = new HashSet(); //다형성 부모타입
				System.out.println(set2.size());
				//while 횟수 
				int index =0;
				while(set2.size() < 6) {   //set2.size() < 6
					System.out.println("index:" + (++index));
					int num = (int)(Math.random()*45) +1; 
					set2.add(num);
				}
				System.out.println(set2.toString());
				
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		
		System.out.println(set3.toString());
		
		Iterator<String> s = set3.iterator(); // 객체를 만들고 주소값을 전달
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		// Collections.sort(List<T> list);  List 인터페이스를 구현하는 모든 객체가 parameter로 올 수 있다
		
		// Set 인터페이스를 구현하는 HashSet을 가지고 놀다가 ... 데이터 정렬 .. 안되나?.. 응 안되..
		// HashSet >> sort 제공 (X)
	
		List list = new ArrayList(set3);
		
		System.out.println("Before 무작위 : " + list.toString());
		Collections.sort(list);
		System.out.println("After 무작위 : " + list.toString());
		
		
		
		
		// add 된 순서를 보장하지 않아요 (HashSet은 배열이 아니기때문에)
				
		/*
		for (int i = 0; i < 6; i++) {
	           numbers[i] = r.nextInt(45)+1; //난수 추출
	          for (int j = 0; j < i; j++) {
	              if (numbers[i] == numbers[j]) {
	                  i--; //point
	                  break;
	              }
	           }
	        }
		
		 */
	}

}
