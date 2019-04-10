// 개념  : Damon Thread (보조) : 한글 작업시 3초 마다 자동저장 (라이프 사이클이 main()과 동일하다) = (같이 죽는다)

public class Ex07_Damon_Thread implements Runnable {
	static boolean autosave = false;

	

	@Override
	public void run() { // Damon Thread
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {

			}

			if (autosave) {
				autoSaveFunction();
			}
		}

	}
	
	
	public void autoSaveFunction() {
		System.out.println("문서가 3초 간격으로 자동 저장 됩니다");
	}






public static void main(String[] args) { // 일반 Thread ... (non-damon)

	Thread th = new Thread(new Ex07_Damon_Thread()); // Runnable 인터페이스를 구현하고 있는 객체의 주소를 넣겠습니다
	th.setDaemon(true); // 너는 보조 쓰레드야 // Daemon 쓰레드는 start()하기전에 해줘야한다
	th.start(); 
	
	// main 함수가(Ex07_Damon_Thread 보조)
	// main 함수 (글쓰기)
	for(int i = 0; i <= 30; i++) {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		System.out.println("Main Thread : " + i);
		if(i ==5) { // i가 5가 되는 시점부터
			System.out.println(i);
			autosave = true;
		}
	}
	
	
	
	
}

}
