import kr.or.bit.AirPlane;

/*
우리 회사는 비행기를 주문 제작 판매하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 작성하려고 합니다

사장님의 요구사항
1. 비행기를 생산하면 비행기의 이름과 번호를 부여해야 합니다
2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여됬는지 확인 기능 정보출력
3. 비행기가 출고 될때마다 비행기의 누적대수를 확인 할 수 있습니다

비행기를 만든다 (AirPlane air = new AirPlane())

설계도는 지금까지 배운 코드로 작성 .... (최소한 3대...)만드세요
kr.or.bit.AriPlane 이름으로 작성
 */




public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
//		
//		AirPlane ar = new AirPlane();
//		
//		ar.AirPlaneInfo("대한항공", 1);
////		ar.name = "대한항공";
////		ar.number = 1;
////		ar.AirPlaneInfo();
////		ar.AirPlaneCount();
//		
//		AirPlane ar2 = new AirPlane();
//		ar2.AirPlaneInfo("제주에어", 2);
////		ar2.name = "제주에어";
////		ar2.number = 2;
////		ar2.AirPlaneInfo();
////		ar2.AirPlaneCount();
//		
//		AirPlane ar3 = new AirPlane();
//		ar3.AirPlaneInfo("아시아나항공", 3);
////		ar3.name = "아시아나항공";
////		ar3.number = 3;
////		ar3.AirPlaneInfo();
////		ar3.AirPlaneCount();
//		
		AirPlane air = new AirPlane(707, "대한항공");
		air.airPlaneInfo();
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(808, "아시아나");
		air2.airPlaneInfo();
		air2.airPlaneTotalCount();
		
		
	}

}
