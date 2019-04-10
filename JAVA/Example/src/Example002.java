import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Example002 {

	public static void main(String[] args) throws Exception {

		FileReader fr =null;
		if (args.length != 3 && args.length != 4 && args.length != 2) {
			System.out.println("사용법 : java [파일명] [경로명] [rmdir] [지울 디렉터리");
			System.out.println("사용법 : java [파일명] [경로명] [rename] [대상 파일,디렉토리] [대상파일, 디렉토리] 을 쳐라 ㅡㅡ");
			System.out.println("사용법 : java [파일명] [type] [경로명\\파일이름]");
			System.exit(0);
		}

		File f = new File(args[0]);
		File f2 = new File(args[1]);
		

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
		
		if(args[1].equals("rename")) {
			
			String path = "";
			String path2 = "";
			
			path = f + "\\" + args[2];
			path2 = f + "\\" + args[3];
			
			File newfile = new File(path);
			File newfile2 = new File(path2);
			
			if(!newfile.isFile() || !newfile.isDirectory() || !newfile2.isFile()|| !newfile2 .isDirectory()) {
				System.out.println("파일또는 디렉토리가 아닙니다");
			} else {
				newfile.renameTo(newfile2);
			}
		}
		
		if(args[0].equals("type")) {
			String path = "";
			path = f2 + "";
			
			File file = new File(path);
			
			fr = new FileReader(file);
			
			if(!file.isFile()) {
				System.out.println("파일이 아닙니다");
			} else {
				int data = 0;
				while((data = fr.read()) != -1) {
					System.out.println((char)data);
					
				}
			}
			
			
			
		}

		
		
		
		
	}

}