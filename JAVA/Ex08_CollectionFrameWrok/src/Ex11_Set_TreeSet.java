import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet 추가적으로 .. 알고 있으면 좋을 것 같아요




public class Ex11_Set_TreeSet {
	
	public static void main(String[] args) {
		// 순서(X), 중복(X)
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		
		System.out.println(hs.toString());
		
		
		// HashSet 확장 > LinkedHashSet (순서유지) : > Linked(주소값) > node 개념
		// add 한 순서지 데이터 정렬되는 것은 아니다 // 번지값을 연결만 하는거임
		
		Set<String> hs2 = new LinkedHashSet<String>();
		
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		
		System.out.println(hs2.toString());
		
		// 순서(X), 중복(X), 정렬(sort) : 오름차순 기본적으로 제공
		// Set인터페이스의 기본적인 개념을 가져가면서 정렬이 되는 얘
		// TreeSet : 검색과 정렬 두 가지 요소를 필요로 하는 구조에서 사용
		// 이진트리 : 정렬되고 많은 양의 데이터를 저장할때 효율적이다
		
		// Lotto : 1 ~ 45 난수 > 6개 >> 중복(X) >> 정렬(O)
		
		Set<Integer> lotto = new TreeSet<Integer>();
	
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random() *45 +1) );
			
		}
		System.out.println(lotto.toString());
		
		
		Iterator<Integer> it = lotto.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			// System.out.print(it.next() + " ");
			sum += it.next();
			
		}
	
		System.out.println("sum : " + sum);
		
		
	}
}
