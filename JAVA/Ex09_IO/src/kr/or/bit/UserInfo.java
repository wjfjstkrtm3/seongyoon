package kr.or.bit;

import java.io.Serializable;

/*
객체를 주고 받는 방법 (객체통신)
네트워크 .... (프로세스)
파일간에 ....(파일에다 객체를 write, 그 파일을 read)

직렬화 : (객체를 분해해서 줄을 세워 보내는 과정)
역직렬화 : (객체를 조립해서 만드는 행위)

실습)
대상 파일(txt)

객체를 파일에 write (직렬화)
그 파일을 read(역직렬화)

 
 
 */



// 조건 (객체 통신을 하려면) 설계도는 반드시 implements Serialiszble을 구현하고 있어야한다
public class UserInfo implements Serializable{ // 탈부착이 가능한 제품입니다 = Serializble 구현하지않으면 객체 통신이 불가능
	
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo() {
	
	}
	
	public UserInfo(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
	
	
	
}
