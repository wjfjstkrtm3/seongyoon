package kr.or.bit;

/*
만든이 : 홍길동
날짜 : 2019-02-08
파일 : Emp.java(사원정보)

class 설계도이다
설계도의 기본적인 구성요소는 (상태,고유정보 + 행위정보)
					속성(변수)field + 기능(함수)method
 
 
 
 */
public class Emp {

	public int empno; // 사번(정보 > 변수 > member filed(instance variable)
	public String ename; // 이름
	public String job; // 직종

	private int sal; // 급여 (캡슐화, 은닉화 : 간접할당)
	// sal라고 하는 변수에 값을 read(get), write(set) 할 수 있어야한다

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) { // write (간접 할당)
		if (sal < 0) {
			this.sal = 0;
		} else {

			this.sal = sal;
		}
	}

	private int mgr; // 관리자 사번

	public int getMgr() { // read 기능을 하는 함수 (getter함수)
		return mgr;
	}

	public void setMgr(int mgr) { // write 기능을 하는 함수 (setter 함수)
		this.mgr = mgr;
	}
	 
	// 캡슐화된 멤버필드에 대해서 읽고, 쓰는 기능을 하는 함수를 
	// getter, setter함수라고 부른다
	
	
	
	// 기능(함수)
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job + "/" + sal;
	}
	
	
	
	
	
	
	
	
}
