import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts = new ArrayList();
	private int totalAccount;

	public void addAccount(String accountNo, String name) { // 계좌 생성
		if (accounts.size() == 0) {
			accounts.add(new BankAccount(accountNo, name));
			
			System.out.println("계좌가 생성되었습니다.");
			return;
		} else {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getName().equals(name) || accounts.get(i).getAccountNo().equals(accountNo)) {
					System.out.println("중복되는 계좌입니다. 다시 시도해주세요.");
					return;
				} else {
					accounts.add(new BankAccount(accountNo, name));
					System.out.println("계좌가 생성되었습니다.");
					return;
				}
			}
		}
	}

	public BankAccount getAccount(String accountNo) {// 계좌번호로 찾기
		BankAccount ba = null;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNo().equals(accountNo)) {
				ba = accounts.get(i);
			
				return ba;
			} 
		}
		ba = findAccount("A").get(0);
		return ba;
	}

	public ArrayList<BankAccount> findAccount(String name) { // 이름으로 찾기
		ArrayList<BankAccount> al = new ArrayList();
		BankAccount ba;

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getName().equals(name)) {
				ba = accounts.get(i);
				al.add(ba);
				System.out.println("계좌번호 : " + accounts.get(i).getAccountNo() + 
										  " / 이름 : " + accounts.get(i).getName()
									   + " / 현재 잔고 : " + accounts.get(i).getBalance());
				return al;
			}
			
		}
		ba = new BankAccount("X", "X");
		System.out.println("죄송합니다. 계좌를 찾을 수 없습니다.");
		al.add(ba);
		return al;
	}

	public ArrayList<BankAccount> getAccount() { // 계좌 목록 가져오기
		return accounts;
	}

	public int getTotalAccount() { // 총 계좌 수 가져오기
		return accounts.size();
	}
}