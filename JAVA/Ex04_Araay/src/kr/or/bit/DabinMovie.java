package kr.or.bit;

import java.util.Scanner;

public class DabinMovie {
	private String[][] 좌석 = new String[10][20]; // String 타입으로 10행 20열 좌석을 만듬
	private int[] 좌석_열_번호 = new int[좌석[0].length]; // 1 ~ 20까지의 숫자를 찍기위한 변수
	private Scanner 숫자받기 = new Scanner(System.in);
	private static final int 좌석_예매 = 1;
	private static final int 프로그램_종료 = 2;

	private void 메뉴출력() {
		System.out.println("영화관 프로그램");
		System.out.println("1. 좌석 예매");
		System.out.println("2. 프로그램 종료");
		System.out.println("메뉴 번호 입력 : ");
	}
	private void 예매표시(int 입력_행,int 입력_열) {
		좌석[입력_행][입력_열] = "X";
	
	}
	
	private int 입력() {
		return 숫자받기.nextInt();//Integer.parseInt(숫자받기.nextLine());
	}
	private int 입력_알파벳() {
		return 숫자받기.next().charAt(0)-65;
	}
	
	private void 좌석현황출력() {
		int 번호=0;

		for(int 좌석_열 = 0 ; 좌석_열 < 좌석_열_번호.length ; 좌석_열++ ) {
			번호 += 1;
			System.out.print("\t"+번호);
		}
		System.out.println();
		for (int 행 = 0 ; 행 < 좌석.length ; 행++) {
			System.out.print((char)('A'+행)+"\t");
			for(int 열 = 0 ; 열 <좌석[0].length ; 열++) {
				if(좌석[행][열] != "X") {
				좌석[행][열] = "O";
				}
				System.out.print(좌석[행][열]+"\t");
				
			}
			System.out.println();
				
		}
	}
	private boolean 행_확인(int 입력값) {
		return 입력값 >= 0 && 입력값 <= 9;
	}
	private boolean 열_확인(int 입력값) {
		return (입력값>=1 && 입력값 <= 20);
	}
	private boolean 좌석_유효_확인(int 입력_행, int 입력_열) {
		return !행_확인(입력_행) || !열_확인(입력_열);
	}

	public void 실행메소드() {
		메뉴출력();
		
		int 받은숫자 = 입력();
		while (받은숫자 != 프로그램_종료) {
			
			switch (받은숫자) {
			case 좌석_예매:
				좌석현황출력();
				
				System.out.println("예매할 좌석의 행을 입력 : ");
				int 입력_행 = 입력_알파벳();
				
				System.out.println("예매할 좌석의 열을 입력 : ");
				int 입력_열 = 입력();
			
				if(좌석_유효_확인(입력_행, 입력_열)) {
					System.out.println("없는 좌석입니다.");
					continue;
				}
				
				if(좌석[입력_행][입력_열-1]=="X") {
					System.out.println("이미 예약된 좌석입니다.");
				}
				else 
					예매표시(입력_행, 입력_열-1);
				break;
//			case 프로그램_종료:
//				return;
			default :
				System.out.println("1 또는 2번을 입력하세요");
				System.out.println("다시 입력:");
				받은숫자 = 입력();	
				break ;
			}
		}
	}
}