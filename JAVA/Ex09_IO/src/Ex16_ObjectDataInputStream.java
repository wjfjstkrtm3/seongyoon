import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

// userData.txt에 직렬화된 내용을 read 해서 >> 역직렬화 >> 다시 조립 >> 제품 확인
public class Ex16_ObjectDataInputStream {

	public static void main(String[] args) {
		
		String filename = "UserData.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis); // 역직렬화 ...
			
			// UserInfo r1 = (UserInfo)in.readObject(); // object니까 다운캐스팅 한거임
			// UserInfo r2 = (UserInfo)in.readObject(); // 역직렬화 (복원) - 탱크 보낸걸 여자친구가 재조립한거임
			
			
			// System.out.println(r1.toString());
			// System.out.println(r2.toString());
			
			// 근데 위에꺼는 몇개의 객체가 있는지 모르니까
			// 저렇게 쓰면 안되고 while문을 통해서 출력한다
			
			// 객체 단위 read ... 객체가 없다면 null 값 반환
			Object users = null;
			while((users = in.readObject()) != null)  {
				System.out.println(users.toString());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				
			}
		}
			
		

	}

}
