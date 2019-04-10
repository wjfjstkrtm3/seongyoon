package kr.or.bit;


public class Quiz{
	private String[] 배열 = new String[5];
	private String 장르;
	private String 배우이름;
	private String 감독이름;
	private String 영화제목;
	private String 개봉년도;

	public Quiz(String 영화제목, String 장르, String 배우이름, String 감독이름, String 개봉년도){
		this.영화제목 = 영화제목;
		this.장르 = 장르;
		this.배우이름 = 배우이름;
		this.감독이름 = 감독이름;
		this.개봉년도 = 개봉년도;
		
		배열[0] = 영화제목;
		배열[1] = 장르;
		배열[2] = 배우이름;
		배열[3] = 감독이름;
		배열[4] = 개봉년도;
	}
	public String[] get배열() {
		return 배열;
	}
	public String get장르() {
		return 장르;
	}
	public String get배우이름() {
		return 배우이름;
	}
	public String get감독이름() {
		return 감독이름;
	}
	public String get영화제목() {
		return 영화제목;
	}
	public String get개봉년도() {
		return 개봉년도;
	}
	public void 배열() {

	}
	public void 영화_정보_출력(){
		for(int i = 0 ; i < 배열.length ; i++){
			
		 System.out.println(배열[i]);
		}
	}
}  
 