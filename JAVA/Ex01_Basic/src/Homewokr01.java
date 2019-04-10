
public class Homewokr01 {

	public static void main(String[] args) {
		
		int gg = 0;
		
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(i+j==6) {
					System.out.printf("[%d] [%d] ", i, j);
					System.out.println("");
					gg++;
				}
				
			}
		}
		System.out.println("°æÀÇ¼ö´Â ÃÑ : " + gg);
	}
}
