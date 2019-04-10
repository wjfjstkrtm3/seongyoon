import javax.swing.JOptionPane;

class WordTime extends Thread {
	
	@Override
	public void run() { // main() 과 같은
		for(int i = 10; i > 0; i--) {
			System.out.println("남은 시간은 : " + i);
			try {
				Thread.sleep(1000); // CPU를 점유하는 너는 잠깐 쉬어
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}


public class Ex04_Multi_Word_Game {

	public static void main(String[] args) {
		
		WordTime time = new WordTime();
		time.start(); // 스택을 만들고 run()함수를 생성한다
		
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값 : " + inputdata);
	

	}

}
