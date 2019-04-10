import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//DataOutputStream write 한 데이터는 반드시  DataInputStream으로 read 해야 한다

public class Ex14_DataInputStream {
	public static void main(String[] args) {
		int sum=0;
		int score=0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			  fis = new FileInputStream("score.txt");
			  dis = new DataInputStream(fis);
			  while(true) {
				  score = dis.readInt(); // 아까 writeInt()이기때문에 내가 쓴 그대로 읽어들어야한다
				  System.out.println("score int 타입 :" + score);
				  sum+=score;
			  }
		} catch (Exception e) { // 읽어올 값이 더 이상 있지않을경우 예외처리문이 출력된다
			System.out.println("예외발생 : " + e.getMessage());
			System.out.println("sum 결과 :" + sum);
		}finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}

	}

}







