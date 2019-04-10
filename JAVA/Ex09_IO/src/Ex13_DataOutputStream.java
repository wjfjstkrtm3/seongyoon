import java.io.DataOutputStream;
import java.io.FileOutputStream;

// 보조 스트림
// JAVA API가 제공하는 8가지 기본(타입별로 read write) 클래스
// DataOutputStream, DataInputStream // 채팅같은거
public class Ex13_DataOutputStream {

	public static void main(String[] args) {
		int[] score = {100, 60, 55, 97, 30};
		// 쓸때 DataOutput, 읽을때 DataIntput
		// 타입을 인정하면서 write
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			
			// helper 
			DataOutputStream dos = new DataOutputStream(fos);
			// DataOutputStream를 통해서 score.txt에 write하겠다
			for(int i = 0; i< score.length; i++) {
				dos.writeInt(score[i]); // 정수값을 write .... 반드시 read는 DataInputStream 끼리끼리논다
				// dos.writeUTF(score[i]); // 웹 . 채팅할때 주로사용
				
				// writeInt를 해도 int형의 암호화 한 값을 쓴거고, 실질적으로는 0과 1로 조합한 이상한값이 나온다
				// 그래서 write한 값을 DataInput으로 읽어들이는데 같은 int타입으로 읽어야 한다
			}
			
			dos.close();
			fos.close(); // 자원 해제...
		}catch(Exception e) {
			
		}

	}

}
