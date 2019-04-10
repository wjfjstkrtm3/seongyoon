import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_FileReader_FileWriter_Buffer {
	public static void main(String[] args) {
		/*
		try {
			 FileWriter fw = new FileWriter("today.txt");
			 BufferedWriter bw = new BufferedWriter(fw); // writer 추상 클래스를 상속받는 자식클래스는 다 올수 있다
			 bw.write("로또");
			 bw.newLine(); // 버퍼는 개행을 할 수 있음 \n/r (엔터)
			 bw.write("1,2,3,4,5");
			 bw.flush(); // bw.close()
		} catch (Exception e) { // 올래는 catch문을 여러개 써야한다 (그래야 가독성이 높아진다)
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		FileReader fr = null;
		BufferedReader br = null; // scope이 제한되서 여기서 선언한거고, finally블록에서 선언하기위함
		
		try {
			 fr = new FileReader("Ex01_Stream.java");
			 br = new BufferedReader(fr); // 라인 단위로 읽을 수 있다
			
			 String line="";
			 //br.readLine(); 엔터를 기준으로 한줄씩 read POINT
			 for(int i = 0 ; (line = br.readLine()) != null ; i++) { // 문자열값을 line에 넣는다
				 System.out.println(line);					// String은 클래스니까 값이없으면 null값을 반환한다
				
//				 if(line.indexOf(";") != -1) { //[ ; ]포함된 문장만 read 하고 싶어요
//					 System.out.println(line);
//					 System.out.println("******" + line.indexOf(";"));
//				 }
			 }
			 
		} catch (Exception e) {
			
		}
		
	}

}






