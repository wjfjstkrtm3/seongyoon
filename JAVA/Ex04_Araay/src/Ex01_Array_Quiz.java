
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		
		// 수학과 학생들의 기말고사 시험 점수
	
		/*
		 제어문을 사용해서 max 변수에 최대값(최고점수) min 변수에 최소값(최하점수)
		결과) max > 97, min > 54
		 */
		
		
		
			int[] score = new int[] {79,88,97,54,56,95,100, 200, 300};
	        
	        int max = score[0];
	        int min = score[0];
	        
	        
	        for(int i = 1; i < score.length; i++) {
//				
//				if(score[i] >max) max = score[i];
//				if(score[i] <min) min = score[i];
	        	
	        	
//	        max = (score[i] >max) ? score[i]:max;
//			min = (score[i] <min) ? score[i]:min;
	        }
			System.out.println("max : " + max);
			System.out.println("min : " + min);
//	        
//	         for(int i=0; i<score.length; i++) {
//	             if(max<score[i]) {
//	                 max = score[i];
//	             }
//	             if(min>score[i]) {
//	                 min = score[i];
//	             }
//	             //System.out.println("score["+ i +"] : "+score[i]);
//	         }
//	         
//	         
//	         System.out.println("max: "+max);
//	         System.out.println("min: "+min);
//		

		
		int[] number = new int[10];
		
		// 10개 방에 값을 1부터 10까지 초기화한다
		// number[0]
		for(int i = 0; i<number.length; i++) {
			number[i] = i+1;
			System.out.println(number[i]);
		}
		
		
		// 어느 학생의 기말고사 시험 점수입니다 (5과목)
		
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100, 55, 90, 60, 78};
		
//		for(int i = 0; i<jumsu.length; i++) {
//			sum = sum + jumsu[i];
//
//		}
//		average = (float)sum/jumsu.length;
		
		for(int i = 0; i<jumsu.length; i++) {
		sum = sum + jumsu[i];
		if(i == jumsu.length-1) {
			average = sum / (float)jumsu.length;
		}
		}

		System.out.printf("총과목수 : [%d], 총점 : [%d], 평균 : [%f]", jumsu.length, sum, average);
		
		/*
		
		
		
		1. 총 과목수
		2. 과목의 합
		3. 과목의 평균
		단) 2, 3 문제는 하나의 for문만을 사용해라
		 */
		
		
	
		

	}
	
}
