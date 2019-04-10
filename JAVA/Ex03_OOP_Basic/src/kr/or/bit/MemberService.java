package kr.or.bit;

public class MemberService {

	public String id;
	public String password;
	public boolean result;
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.contentEquals("12345")) {
			return true;
		} else 
			return false;
		
	}
	
	void logout() {
		System.out.println("로그아웃 되었습니다");
	}
	
}
