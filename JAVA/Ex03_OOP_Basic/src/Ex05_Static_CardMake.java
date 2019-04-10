import kr.or.bit.Card;

public class Ex05_Static_CardMake {

	public static void main(String[] args) {
		
		// 53 카드 생성
		
//		Card c = new Card();
//		c.number = 1;
//		c.kind = "heart";
//		c.h= 500;
//		c.w = 200;
//		c.cardInfo();
//		
//
//		Card c2 = new Card();
//		c2.number = 10;
//		c2.kind = "heart";
//		c2.cardInfo();
		//  ........
		// 이때 고객이 카드가 ...
		// 카드 크기를 늘려주세요 h = 500, w = 200
		// 설계도를 바꾸면 안되므로, 여기서 53번의 각각의 카드를 수정하는 작업을 해야한다
		// 카드 한장의 변경을 통해서 53장 모든 카드 변경		
		
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		Card.h = 10;
		Card.w = 20;
		c.cardInfo();
		

		Card c2 = new Card();
		c2.number = 1;
		c2.kind = "heart";
		c.cardInfo();

		Card c3 = new Card();
		c3.number = 1;
		c3.kind = "heart";
		c.cardInfo();
	}

}
