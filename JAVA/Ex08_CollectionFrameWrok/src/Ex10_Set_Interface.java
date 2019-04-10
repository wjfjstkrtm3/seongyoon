import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Set 인터페이스를 구현하고 있는 클래스
// Set 순서가 (X) -> 중복값이 허용 (X) 데이터 집합을 다룰때 ...
// 구현하는 클래스 : HashSet, TreeSet
// 순서 보장하지 않아요 (내부적으로 배열에 저장되는게 아니라, 넣은 순서를 보장하지 않는다)
	

public class Ex10_Set_Interface {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		
		System.out.println(hs.toString());
		// 1. 중복 데이터 처리(POINT)
		boolean bo = hs.add(1); // 정상적으로 값이 들어가면 true값 리턴
		System.out.println(bo); // 기존에 같은 데이터가 있기때문에 추가가 되지않고, false값을 리턴한다

		
		hs.add(2);
		System.out.println(hs.toString()); // 출력하면 순서를 유지하지 않는다
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		
		System.out.println(hs2.toString()); // 순서를 유지하지 않는다 (순차적으로)
		
		// 1. 중복 데이터 허락하지 않아요 (일상 생활에서 중복데이터 안되요)
		String[] obj = {"A", "B", "A", "C", "D", "B", "A"};
		
		HashSet<String> hs3 = new HashSet<String>();
		
		for(int i = 0; i < obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());

		// Quiz
		// HashSet을 사용해서 1 ~ 45까지 난수 6개를 넣으세요 (add)
		// (int)(Math.random() *45 ) +1
		
		
	}

}
