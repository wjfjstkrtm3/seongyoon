import java.io.File;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {

	public static void main(String[] args) {
		// Format 클래스 (형식)
		// 일정한 형식을 갖는 곳에 끼워넣는다
		// 일정한 형식대로 보이게하겠다 , 일정한 형식은 자바 API가 약속한 관계이다
		
		/*
		 
		// 화폐 단위 처리
		DecimalFormat df = new DecimalFormat("#, ###.0"); // 형식을 이걸로 하겠다 "#, ###.0" 별도의 표로 제공
		String result = df.format(1234567.89);
		System.out.println(result);
		
		
		// 날짜 형식 처리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sdf.format(new Date());
		System.out.println(strDate);
		
		// 문자열 형식 처리
		String message = "회원ID:{0} \n회원이름:{1} \n회원전화:{2}";
		String result2 = MessageFormat.format(message, "kglim", "홍길동", "010...");
		System.out.println(result2);
		
		*/

		
		File dir = new File("C:\\windows");
		File[] files = dir.listFiles(); // 주소값을 배열 files에 전달 // files배열에는 폴더와 파일 모두 ...
		
		for(int i = 0; i < files.length; i++) {
			File file = files[i];
			
			String name = file.getName(); // name >> a.txt, name >> NEW(폴더) 
											// 즉 getName()은 폴더와 파일 이름을 가져 온다
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "<DIR>";
				
			} else { // 나머지는 파일 (a.txt, copy.jpg ...)
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			
			System.out.printf("%s	%3s	  %10s   %s  \n",
					df.format(new Date(file.lastModified()))
							,attribute
							,size
							,name); // 3은 영역확보 : 3칸을 잡고가겠다
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
