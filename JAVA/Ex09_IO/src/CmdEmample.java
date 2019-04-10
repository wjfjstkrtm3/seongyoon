import java.io.File;

public class CmdEmample {

	public static void main(String[] args) throws Exception {
		// java ExDos C:\Temp mkdir newDir
		// java ExDos C:\Temp rename file.txt file2.txt
		// java ExDos C:\Temp delete new.txt

		if (args.length != 3 && args.length != 4) {
			System.out.println("사용법 : [java파일명] [디렉토리경로] mkdir [생성디렉토리명]");
			
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아니라면
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}

		if (args[1].equals("mkdir")) {
			String path = "";
			path = f + "\\" + args[2];
			File newfile = new File(path);
			if (newfile.exists()) {
				System.out.println("이미 존재하는 디렉토리입니다");
			} else {
				newfile.mkdir();
			}
		}

	}

}
