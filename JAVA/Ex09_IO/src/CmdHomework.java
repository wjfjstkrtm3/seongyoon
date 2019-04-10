import java.beans.FeatureDescriptor;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CmdHomework {

	public static void main(String[] args) throws Exception {
//		FileWriter fw = null;
		FileReader fr = null;
//		BufferedWriter bw = null;
//		FileOutputStream fo = null;
//		BufferedOutputStream bo = null;
//		BufferedReader br = null;
		
		// args.length != 1 은  args의 길이가 1이아니면 출력을한다 
		// 즉 길이 1만 사용가능하고 2, 3개 써도 출력된다
		if (args.length != 3 && args.length !=4 && args.length !=2 ) {
			System.out.println("사용법 : java [파일명] [경로명] [rmdir] [대상 디렉토리] 을 쳐라 ㅡㅡ");
			System.out.println("사용법 : java [파일명] [경로명] [rename] [대상 파일,디렉토리] [대상파일, 디렉토리] 을 쳐라 ㅡㅡ");
			System.out.println("사용법 : java [파일명] [type] [경로명\\파일이름]");
			System.exit(0); // 프로세스 종료
		}
		
		File f = new File(args[0]);
		File f2 = new File(args[1]);
//		if (!  f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아니라면
//			System.out.println("유효하지 않은 디렉토리입니다");
//			System.exit(0);
//		}

		if (args[1].equals("rmdir")) {
			String path = "";
			path = f + "\\" + args[2];
			File newfile = new File(path);
			if (!newfile.isDirectory()) {
				System.out.println("디렉터리가 아닙니다");
			} else {
				newfile.delete();
			}

		}

		else if (args[1].equals("rename")) {
			String path = "";
			String path2 = "";

			path = f + "\\" + args[2];
			path2 = f + "\\" + args[3];
			File newfile = new File(path);
			File newfile2 = new File(path2);
			if (!newfile.isFile()) {
				System.out.println("파일이 아닙니다");
			} else {
				newfile.renameTo(newfile2);

			}

		} else if (args[0].equals("type")) {
			// TYPE [드라이브:][경로]파일이름
			String path = "";
			path = f2 + "";
			
			File file = new File(path);
			
			fr = new FileReader(path);
			//br = new BufferedReader(fr);
			
			
		//	fos = new FileOutputStream("data.txt"); // 파일 생성 기능
		//	bos = new BufferedOutputStream(fos);
			if (!file.isFile()) {
				System.out.println("파일 형식이 아닙니다");
			} else {
				int data = 0;
				while((data = fr.read()) != -1 ) {
					System.out.print((char)data);
					
				}
			//br.close();
			//fr.close();
				
			}

		}

	}

}
