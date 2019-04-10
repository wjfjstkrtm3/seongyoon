import java.util.ArrayList;
import java.util.Iterator;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
	
		
		// 1번
		ArrayList<Emp> li = new ArrayList<Emp>();

		li.add(new Emp(10, "동동주", "백수"));
		li.add(new Emp(20, "소주", "백수"));
		li.add(new Emp(30, "맥주", "백수"));
		
		// 2번
		
		for(Emp result : li) {
			System.out.println("사원번호 : " + result.getEmpno() + " / " + "이름 : " + result.getEname() + " / " + "직업 : " + result.getJob());
			
		}
		
		// 3번
		
		for(int i = 0; i< li.size(); i++) {
			Emp result = li.get(i);
			System.out.println("사원번호 : " + result.getEmpno() + " / " + "이름 : " + result.getEname() + " / " + "직업 : " + result.getJob());
		}
		
		
		// 4번
		
		ArrayList<CopyEmp> li2 = new ArrayList<CopyEmp>();
		
		
		
		li2.add(new CopyEmp(100, "김", 1000));
		li2.add(new CopyEmp(200, "이", 2000));
		li2.add(new CopyEmp(300, "박", 3000));
		
		for(CopyEmp result : li2) {
			System.out.println("사원번호 : " + result.getEmpno() + " / " + "이름 : " + result.getEname() + " / " + "돈 : " + result.getSal());
		}
		
		for(int i = 0; i< li2.size(); i++) {
			CopyEmp result = li2.get(i);
			if(li2.get(1).getSal() == 2000) {
				li2.get(1).setSal(5000);
			}
				System.out.println("사원번호 : " + result.getEmpno() + " / " + "이름 : " + result.getEname() + " / " + "돈 : " + result.getSal());
			
		}
		
		// 6번.  300번 사원의 이름을 "궁금해"로 수정해서 출력하세요 (개선된 for문 안에서)
		
		for(CopyEmp result : li2) {
			if(result.getEmpno() ==300) {
				result.setEname("궁금해");
			}
			System.out.println("사원번호 : " + result.getEmpno() + " / " + "이름 : " + result.getEname() + " / " + "돈 : " + result.getSal());
		}
		
		 // 7. 사원정보를 Iterator 인터페이스를 사용해서 출력하세요
		
		Iterator it = li2.iterator(); // li2.iterator() 함수는 hasNext(), next()를 사용할수있는 기능을 가지고있음
		
		while(it.hasNext()) {
			CopyEmp e = (CopyEmp) it.next(); // 제너럴을 쓰지않았기때문에 object방안에 값이 저장되어있는걸 다운캐스팅써서 접근가능하게한다
												// it.next()는 주소값을 가져온다
			System.out.println(e.getEmpno() + "," + e.getEname() + "," + e.getSal());
		}
		
		
		// 1. Emp 클래스를 사용해서 사원 3명을 생성하세요
		// 단 ArrayList 제너릭을 사용하세요
		
		// 2. 3명의 사원 정보(사번, 이름, 직종) 개선된 for문을 사용해서 출력하세요
		// 단 toString()은 사용 금지
		
		// 3. 3명의 사원 정보(사번, 이름, 직종) 일반 for문을 사용해서 출력하세요
		// 단 toString()은 사용 금지
		
		// 4. CopyEmp 라는 클래스를 만드세요 (구조는 Emp와 같은데)
		// job member filed 대신에
		// private int sal 추가하고 (getter, setter 구현)
		// ArrayList 제너릭 사용해서 사원 3명 만드세요
		// 아래 데이터
		// 100, "김", 1000
		// 200, "이", 2000
		// 300, "박", 3000
		
		// 5 . 200번 사원의 급여를 5000으로 수정해서 출력하세요
		// 일반 for문 사용하기
		
		// 6번.  300번 사원의 이름을 "궁금해"로 수정해서 출력하세요 (개선된 for문 안에서)
		
		 // 7. 사원정보를 Iterator 인터페이스를 사용해서 출력하세요
		
		
	}

}

/*
import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Emp 클래스를 사용해서 사원 3명을 생성하세요
		//단 ArrayList 제너릭을 사용하세요
		//데이터는 편하신 데로 ....
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1000,"김씨","IT"));
		emplist.add(new Emp(2000,"박씨","SALES"));
		emplist.add(new Emp(3000,"이씨","MANAGER"));
		
		//2. 3명의 사원 정보(사번 , 이름 , 직종)을 개선된  for문을 사용해서 출력하세요
		//단 toString() 사용금지
		 for(Emp emp : emplist) {
			 System.out.println(emp.getEmpno()+"/"+
		                        emp.getEname()+"/"+
					 			emp.getJob());
		 }
		
		//3. 3명의 사원 정보(사번 , 이름 , 직종)을 개선된  일반for문을 사용해서 출력하세요
		//단 toString() 사용금지
		 for(int i = 0 ; i < emplist.size() ; i++) {
				System.out.println(emplist.get(i).getEmpno() +"/"+
								   emplist.get(i).getEname() +"/"+
						           emplist.get(i).getJob());
			}
		
		//4. CopyEmp 라는 클래스를 만드세요 (구조는 Emp 와 같은데)
		//job member field 대신에 
		//private int sal 추가하고  (getter , setter 구현)
		//ArrayList 제너릭 사용해서 사원 3명 만드세요
		//아래 데이터
		//100 , "김" , 1000
		//200 , "이" , 2000
		//300 , "박" , 3000
		 ArrayList<CopyEmp> clist = new ArrayList<CopyEmp>();
		 	clist.add(new CopyEmp(100,"김",1000));
			clist.add(new CopyEmp(200,"이",2000));
			clist.add(new CopyEmp(300,"박",3000));
		//5.200번 사원의 급여를 5000으로 수정해서 출력하세요 (일반 for문 사용하세요)
		for(int i = 0 ; i < clist.size() ; i++) {
			if(clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
				System.out.println(clist.get(i).toString());
			}
		}
		
		//6.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(개선된 for문 안에서 ....)
		 for(CopyEmp emp : clist) {
			 if(emp.getEmpno() == 300) {
				 emp.setEname("궁금해");
				 System.out.println(emp.toString());
			 }
		 }
		 
		
		  
		  
	}

}
*/
