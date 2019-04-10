/*
 1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요
 -- 넣기전에 비교하는게 제일 쉬운방법
 3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요
 4. 위 결과를 담고 있는 배열을 출력하세요
 */
public class Example01 {

	public static void main(String[] args) {
		
		int[] toto = new int[6];
		
	
		
		for(int i = 0; i<toto.length; i++) {
			toto[i] = (int)(Math.random() *45) +1;
			
			for(int z = 0; z<i; z++) {
				
				if(toto[z] == toto[i]) {
					toto[i] = (int)(Math.random() *45) +1;
//					i--;
//					break;
					
				}
			}
		}
		for(int i = 0; i<toto.length; i++)  {
			
			for(int j = i+1; j<toto.length; j++) {
				
				if(toto[i] > toto[j]) {
					int temp = toto[i];
					toto[i] = toto[j];
					toto[j] = temp;
					
				}
			}
		}
		for(int i = 0; i<toto.length; i++) {
			System.out.println(toto[i]);
		}

	}

}
