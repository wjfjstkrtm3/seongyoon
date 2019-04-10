import java.util.ArrayList;
import java.util.List;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		
		// 1. 사원 1명의 정보를 담으세요
		Emp e = new Emp(100, "김유신", "군인");
		System.out.println(e.toString());
		
		// 2. 사원 2명의 정보를 담으세요 (정적배열)
		Emp[] emplist = {new Emp(10, "김씨", "IT"), new Emp(20, "박씨", "SALES")};
		
		for(Emp emp : emplist) {
			System.out.println(emp.toString());
		}
		// 향상된 for문을 사용하면 바로 찍을 수 있지만

		System.out.println("********");
		for(int i = 0; i < emplist.length; i++) {
		System.out.println(emplist[i].toString());
			
		}
		// emplist에는 emp객체 2개의 주소가 들어가있고
		// emplist[0], emplist[1]째 주소에 접근해서 toString으로 출력한것
		// 그냥 for문을 사용할 경우에는 좀 번거롭다
		
		// 실수 했어요 .. 한명이 입사를 더 했어요 ...
		// 위 정적 배열에 추가하는건 불가하다(x) -> 새로 new ... (x)
		
		// 동적(ArrayList)
		
		ArrayList alist = new ArrayList();
		alist.add(new Emp(1, "김씨", "IT"));
		alist.add(new Emp(2, "이씨", "IT"));
		alist.add(new Emp(3, "박씨", "영업부"));
		
		System.out.println(alist.toString());
		
		// 일반 for문을 사용해서 사원정보를 출력하세요 (down casting)
		
		for(int i = 0; i < alist.size(); i++) {
			// System.out.println(alist.get(i).toString());
			Emp emp = (Emp)alist.get(i); // get함수는 return이 object다    자식타입 = (자식타입)부모타입
										// 각각의 주소를 가지고 출력한다
			System.out.println(emp.getEmpno() + "/" + emp.getEname() + "/" + emp.getJob());
		}
		// 개선된 for문
		
		for(Object obj : alist) {
			Emp emp = (Emp)obj;
			System.out.println(emp.getEmpno() + "/" + emp.getEname() + "/" + emp.getJob());
		}
		
		// 사실은 .... 위 코드가 불편해요 (Object)
		// generic (현대적인 ...99%)
		
		ArrayList<Emp> alist2 = new ArrayList<Emp>();
		
		alist2.add(new Emp(1, "A", "IT"));
		alist2.add(new Emp(2, "B", "IT"));
		
		for(Emp obj : alist2) {
			System.out.println(obj.getEmpno() + "/" + obj.getEname() + "/" + obj.getJob());
		}

	}

}
