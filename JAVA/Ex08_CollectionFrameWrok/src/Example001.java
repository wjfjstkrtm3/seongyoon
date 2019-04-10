import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import kr.or.bit.Coin;
import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

class Student2 {
	int kor = 100;
	int math = 80;
	int eng = 20;
	String name;
	
	Student2(String name) {
		this.name = name;
	}
	
}

public class Example001 {

	public static void main(String[] args) {

	
		HashMap<String, Student2> students = new HashMap<String, Student2>();
		
		students.put("hong", new Student2("È«±æµ¿"));
		students.put("±è", new Student2("±èÀ¯½Å"));
			
		
		Student2 result = students.get("±è");
		System.out.println(result.eng);
		System.out.println(result.kor);
		System.out.println(result.math);
		System.out.println(result.name);
		
		Set result2 = students.keySet();
		Set result3 = students.entrySet();
		Iterator aa = result3.iterator();
		
		while(aa.hasNext()) {
			System.out.println(aa.next());
		}
		
	}

}
