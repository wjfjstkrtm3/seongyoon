/*
 사원은 사번 , 이름 , 직종(job)을 가지고 있다 => 원칙 (캡슐화) => read , write 지원 setter , getter
 사원 생성시 default 로 사번 =9999 , 이름=아무개 , 직종=인턴 
 Employee e = new Employee() 
  별도의 함수를 사용(단 사원생성시) 사번,이름,직종 을 입력하여 사원 생성 가능하며 
 사원을 생성한 후 사원이 가지는 사번 , 이름 , 직종  생성 후 각각 수정할 수 있다
 사원정보는  사번 ,이름 ,직종을 한번에 확인 할 수 있고 
(각각의 정보는 확인 불가 하다) 예외적으로 사원의 이름정보는 조회가능하다. 출력되는 형식은 반드시 "님"이라는 글자가 .....  
*/


package kr.or.bit;

public class Employee2 {
	private int empno;
	private String ename;
	private String job;
	
	public Employee2() {
		empno = 9999;
		ename = "아무개";
		job = "인턴";
	}
	
	public Employee2(int empno, String ename, String job) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	
	}
	public String getEename() {
		return ename + "님";
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public void setename(String ename) {
		this.ename = ename;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void employee2InfoPrint() {
		System.out.println("사원 : " + empno + ", " + "이름 : " + ename + ", " + "직종 : " + job);
		
	}
	
	
	
	
}
