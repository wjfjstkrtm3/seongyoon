import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

// PrintWriter 클래스를 사용하면 [출력형식]
// 친척 : System.out.printf(), String.format

// FileOutputStrea, FileWriter, PrintWriter 파일이없다면 파일 생성기능이 있다
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		
		try {
			/*
			PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt");
			// 파일이 없다면 생성, 있다면 ... 덮어써버림
			pw.println("**********************************************");
			pw.println("****************HOMEWORK*******************");
			pw.println("**********************************************");
			pw.printf("%3s : %5d  %5d  %5d  %5.1f", "아무개", 10, 30, 90, (float)(10+90+88)/3);
			pw.println();
			
			pw.close();
			*/
			// read(Line단위) >> buffered....
			FileReader fr = new FileReader("C:\\Temp\\homework.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String s = "";
			
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		

	}

}
