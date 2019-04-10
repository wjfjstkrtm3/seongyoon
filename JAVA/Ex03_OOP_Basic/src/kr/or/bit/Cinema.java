package kr.or.bit;

import java.util.Scanner;

public class Cinema {

	Scanner sc = new Scanner(System.in);
	int column, row;
	private String[][] seat = new String[5][5];
	
	
	public void displayMenu() {
		System.out.println("영화관 예약 프로그램");
		System.out.println("1.예약하기");
		System.out.println("2.종료하기");
		System.out.println("번호를 입력하세요 : ");
		
		String num = sc.nextLine();
		booking(num);
		
	}
	
	
	public void booking(String num) {

	System.out.println("예약하기");
	
	for(int i=0; i<seat.length; i++) {
		for(int j=0 ; j<seat[0].length; j++) {
			
		seat[i][j] = "O\t";
		}
		
	}
	for(int i=0; i<seat.length; i++) {
		for(int j=0; j<seat.length; j++) {
			System.out.print(seat[i][j]);
		}
		System.out.println();
		
	}
	
	while(true) {
		
		System.out.println();
		System.out.println("행을 입력하세요");
		column = sc.nextInt();
		if(column >=6 || column <0) {
			
			System.out.println("다시입력하세요");
			column = sc.nextInt();
			
		} 
		
		System.out.println("열을 입력하세요");
		row = sc.nextInt();
		if(row >=6 || row <0) {
			System.out.println("다시입력하세요");
			row = sc.nextInt();
		}
		
		switch(seat[column-1][row-1]) {
		case "X\t":
			System.out.println("이미 예약 되었습니다");
			break;
			default :
				seat[column-1][row-1] = "X\t";
				break;
		}
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat.length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();
		
	}
		}
	
	}
	
}