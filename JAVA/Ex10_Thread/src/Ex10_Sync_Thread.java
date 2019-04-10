// 은행계좌 하나 (012-12323-1233) >> 1000 만원 입금
// 입출금처리

// 친구 5명 (똑같은 카드를 복제)
// 동시에 계좌에서 출금

// ATM 동시에 출금

// 누군가 (출금 행위) 행위에 대해서 LOCK 잠금 (다른 사람 대기)


class Account {
	int balance = 1000; // 잔액
	synchronized void withdraw(int money) { // 출금  // 잠금장치가 필요한 대상
		// 권한확인, 인증확인 ..... (호출)
		System.out.println("고객 : " + Thread.currentThread().getName()); // 현재 쓰레드의 이름을 확인
		System.out.println("현재 잔액 정보 : " + this.balance);
		if(this.balance >= money) {
			try {
				Thread.sleep(1000); // 은행업무 처리되는 과정(인증, 권한 , 등등...) : 다른 함수 호출      처리하는시간을 표현한 것
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			this.balance -= money;
			
		}
		System.out.println("인출금액 : " + money);
		System.out.println("인출후 잔액 : " + this.balance);
	}
}

class Bank implements Runnable {

	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance > 0) {
			int money = ((int)(Math.random() * 3)+1) *100;
			// 100, 200, 300
			// 실 출금 처리
			acc.withdraw(money);
		}
		
	}
	
	
}

public class Ex10_Sync_Thread {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		Thread thread = new Thread(bank, "Park");
		Thread thread2 = new Thread(bank, "kim");
		Thread thread3 = new Thread(bank, "Lee");
		
		thread.	start();
		thread2.start();
		thread3.start();
		
	}

}
