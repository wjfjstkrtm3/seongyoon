import java.io.File;
import java.util.ArrayList;
import java.util.List;

// 폴더안에있는것만 볼수있는데
// 폴더의 폴더안을 볼수 있게 만드는게 이 예제래
public class Ex10_File_Sublist {
	
	static int totalFiles = 0; // 객체간 공유자원 이 아니고 static 변수
	static int totaldirs = 0;
	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("사용법 : java [파일명] [경로명] 을 쳐라 ㅡㅡ");
			System.out.println("예시 : java Ex10_File_Sublist C:\\Temp");
			System.exit(0); // 프로세스 종료
		}
		
		File f = new File(args[0]); //  C:\\Temp를 가져와서 분석한다
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
			
		}
		// 이 시점 (폴더라고 판단되는 시점에 파일정보를 넘기겠다)
		printFileList(f);
		System.out.println("총 파일수 : " + totalFiles);
		System.out.println("총 폴더수 : " + totaldirs);

	}
	
	static void printFileList(File dir) {
		
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");
		
		// 질문 1 Collection 사용 이유
		List<Integer> subDir = new ArrayList<Integer>();
		// for문에서 디렉터리면 files의 인덱스값만 저장한거임 일단
		
		File[] files = dir.listFiles(); // C:Temp 입력했다면 하위 자원을 배열로 만든거
		
		// C:\\Temp [0] : a.txt
		// C:\\Temp [1] : file.txt
		// C:\\Temp [2] : c.jpg 이런 정보를 File[] 담아서 관리
		
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName(); // 폴더명 또는 파일명이 넘어옴
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename + "]";
				//POINT
				// 질문 (add) 의미
				subDir.add(i);
			
			} else {
				filename = filename + " / " + files[i].length() + "Byte";
			}
			
			System.out.println("	" + filename);
			
		}
		
		// 질문
		
		int dirnum = subDir.size();
		int filenum = files.length - dirnum;
		
		// 누적 값
		totaldirs += dirnum; // 폴더에 대한 누적 갯수
		totalFiles += filenum; // 파일에 대한 누적 갯수
		
		System.out.println("[Current dirnum] : " + dirnum);
		System.out.println("[Current filenum] : " + filenum);
		System.out.println("*******************************************");
		
		// 질문 for 문 해석 // 재귀호출
		for(int j = 0; j < subDir.size(); j++) { 
			int index = subDir.get(j); // ArrayList의 방에 각각 저장되어있는 디렉터리의 주소를 index에 넣고
			printFileList(files[index]);
			// files
			
		}
		
		
		
	}
	

}

