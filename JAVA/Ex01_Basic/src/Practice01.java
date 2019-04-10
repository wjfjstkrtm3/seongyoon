
public class Practice01 {

	public static void main(String[] args) {
		
		int jumsu = (int)((Math.random()*10)+1)*100;    
		String object = "";        
		switch(jumsu) {            
		case 1000: object += "Tv, ";            
		case 900: object += "NoteBook, ";            
		case 800: object += "냉장고, ";            
		case 700: object += "한우세트, ";            
		case 600: object += "휴지";            
		break;            
		default : object = "칫솔";        }        
		System.out.println("점수는 "+jumsu+"점 입니다.");        
		System.out.println("당신은 " + object + " 에 당첨 되셨습니다.");
		/*
		만들려고 하는 시스템은 백화점 경품 추첨 시스템입니다
		경품 추천시 1000점수가 나오면
		경품으로 Tv, NoteBook, 냉장고, 한우세트, 휴지
		경품 추천시 900점수가 나오면
		경품으로 NoteBook, 냉장고, 한우세트, 휴지
		경품 추천시 800점수가 나오면
		경품으로 냉장고, 한우세트, 휴지
		경품 추천시 700점수가 나오면
		경품으로 한우세트, 휴지
		경품 추천시 600점수가 나오면
		경품으로 휴지
		그외는 100 ~ 500 까지는 칫솔
		
		사용자가 와서 경품시스템 사용하게 되면 랜덤하게 100 ~ 1000까지의 점수가 나오게
		
		 */

	}

}
