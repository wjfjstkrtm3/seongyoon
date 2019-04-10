import java.util.StringTokenizer;

/*
// String 클래스 (다양한 함수)
// 개발에서 많이 사용 (우리가 사용한 데이터는 대부분 문자열 데이터)
 */
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str =""; // 문자열 초기화
		
		String[] strarr = {"aaa", "bbb", "ccc"};
		for(String s : strarr) {
			System.out.println(s);
		}
		
		// String 클래스 (함수)
		String ss = "hello";
		String concatstr = ss.concat("world");
		System.out.println(concatstr);
		
		boolean bo = ss.contains("ele");
		System.out.println(bo);
		
		String ss2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length());
		
		String filename = "hello java, world";
		System.out.println(filename.indexOf(",")); // 문자가 몇번째 방에있는지 확인
		System.out.println(filename.indexOf("java"));
		
		// 활용 : 문장내에서 내가 원하는 단어가 포함 되어있는지를 검증
		// 0보다 큰 값을 반환 한다면 최소한 하나의 단어 포함
		
		System.out.println(filename.lastIndexOf("a"));
		System.out.println(filename.lastIndexOf("kglim"));
		
		// 배열에 값이 없다 >> -1
		// return -1;
		
		// 주로 많이 쓰는 함수
		// length(), indexof(), substring(), replace()(치환 함수), ... split()
		
		String result = "superman";
		System.out.println(result.substring(5)); // 5번째부터 잘라줘
		System.out.println(result.substring(0));
		System.out.println(result.substring(0, 0));
		System.out.println(result.substring(0, 1));
		System.out.println(result.substring(1, 1));
		System.out.println(result.substring(2, 3)); // index endIndex - 1 // 2, 2 이기때문에 자기자신을 가르킴
		
		// at index endIndex -1
		// Quiz
		String filename2 = "aaaa.mpeg"; // 파일명은 바꿔질 수 있다
		// aaaa.mpeg or ab.hwp
		// 파일명 >> 홍길동
		// 확장자 >> jpg
		// 분리해서 화면에 출력해보세요
		// 위에서 배운 함수로 활용하세요
		int a = filename2.indexOf(".");
	
		System.out.println(filename2.substring(0, a));
		System.out.println(filename2.substring(a+1, filename2.length()));
		
		// replace
		String s2 = "ABCD";
		String result4 = s2.replace("A", "안녕");
		System.out.println(result4);
		
		System.out.println(s2.charAt(0)); // index를 주면 문자값을 리턴해준다
		System.out.println(s2.charAt(3)); // return char
		System.out.println(s2.endsWith("CD")); // 끝에서 CD라는 문자 가지고있니?
		System.out.println(s2.equalsIgnoreCase("aBcD")); // 대소문자 상관없이 비교
		
		// Point
		// split
		
		String s6 = "슈퍼맨, 팬티, 노랑색, 우하하, 우하하"; // 구분자를 기준으로 슈퍼맨을 0번째방에 팬티를 1번째방에 ...
		String[] namearry = s6.split(",");
		
		for(String s : namearry) {
			System.out.println(s);
		}
		
		String filename3 = "bit.hwp";
		String[] arry = filename3.split("\\."); // 정규 표현 문자열
		System.out.println(arry.length);
		
		for(String s : arry) {
			System.out.println(s);
		}
		
		// java, javascript, DB >> 정규 표현식
		// 000-{\d4}-0000
		// 000-1111-0000 제공 : true
		// 000-11-0000 제공 : false
		
		// 과제 (정규 표현식 5개 만들어오기) 조당
		// 주로 많이 쓰이는 것
		// 주민번호, 우편번호, 전화번호, 이메일, .....
		// 추후 과제 다음주 월..
		
		String s7 = "a/b,c.d-f"; // 규칙이없넹
		StringTokenizer sto = new StringTokenizer(s7, "/,.-");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
		
		// 넌센스 Quiz
		String s8 = "홍                길               동";
		// 저장 "홍길동"
		System.out.println(s8.replace(" ", ""));
		
		String s9 = "          홍길동                  ";
		System.out.println(">" + s9.trim() + "<");
		
		String s10 = "          홍                 길                     동";
		
		// 바보
//		String re = s10.trim();
//		String re2 = re.replace(" ", "");
//		System.out.println(re2);
		
		// 여러개의 함수를 적용 할 경우 (method chain)
		String re = s10.trim().replace(" ", "");
		System.out.println(re);
		
		// Quiz-1
		int sum = 0;
		String[] numarr = {"1","2","3","4","5"};
		// 문제 : 배열에 있는 문자값들의 합을 sum변수에 담아서 출력하세요
		
		for(String s : numarr) {
			sum +=Integer.parseInt(s); // 문자열을 정수로 바꿔준다
		}
		System.out.println(sum);
		
		
		// Quiz-2
		String jumin = "123456-1234567";
		// 위 주민번호의 합을 구하세요
		 int sum2 = 0;
	        int num2 = jumin.indexOf("-");
	        String jumin2 = jumin.substring(0, num2);
	        String jumin3 = jumin.substring(num2+1, jumin.length());
	        String jumin4 = jumin2 + jumin3;
	        System.out.println(jumin4);
	        for(int i = 0 ; i < jumin4.length() ; i++) {
	                sum2+=Integer.parseInt(jumin4.substring(i, i+1));
	                
	            }
	        System.out.println(sum2);


		
		
	}
	
}


