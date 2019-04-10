package kr.or.bit;
/*
모든 소프트웨어는 변화한다
요구사항은 항상 변한다 ......... 대응하는 프로그램을 짜야한다
우리 회사는 카드를 만들어서 판매하는 회사입니다
고객의 요쳥에 따라 카드 53장을 제작 하게되었습니다

요구사항
카드는 각각 카드번호를 가지고있고, 그리고 모양도 가지고 있습니다
카드는 크기를 가지고 있다, 크기의 정의는 높이와 너비를 가지고 있다
카드의 정보를 확인하는 기능을 가지고 있다


 */


public class Card {

//	public int number; // 카드번호
//	public String kind; // 모양
//	
//	
//	// 모든카드의 크기는 고정
//	//public int h = 50; // 높이
//	//public int w = 20; // 너비
//	public static int h = 50;
//	public static int w = 20;
//	
//	// 기능(정보)
//	public void cardInfo() {
//		System.out.printf("번호: %d, 모양: %s, 높이: %d, 너비: %d\n", number, kind, h, w);
//	}
	
	public int number;
	public String kind;

	
	public static int h;
	public static int w;

	
	
	public void cardInfo() {
		System.out.printf("번호: %d, 모양: %s, 높이: %d, 너비: %d\n", number, kind, h, w);
	
	
	
	
	
	}
	
}
