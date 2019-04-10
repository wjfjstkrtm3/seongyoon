import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts = new ArrayList();
	private int totalAccount;

	public void addAccount(String accountNo, String name) { // ���� ����
		if (accounts.size() == 0) {
			accounts.add(new BankAccount(accountNo, name));
			
			System.out.println("���°� �����Ǿ����ϴ�.");
			return;
		} else {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getName().equals(name) || accounts.get(i).getAccountNo().equals(accountNo)) {
					System.out.println("�ߺ��Ǵ� �����Դϴ�. �ٽ� �õ����ּ���.");
					return;
				} else {
					accounts.add(new BankAccount(accountNo, name));
					System.out.println("���°� �����Ǿ����ϴ�.");
					return;
				}
			}
		}
	}

	public BankAccount getAccount(String accountNo) {// ���¹�ȣ�� ã��
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

	public ArrayList<BankAccount> findAccount(String name) { // �̸����� ã��
		ArrayList<BankAccount> al = new ArrayList();
		BankAccount ba;

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getName().equals(name)) {
				ba = accounts.get(i);
				al.add(ba);
				System.out.println("���¹�ȣ : " + accounts.get(i).getAccountNo() + 
										  " / �̸� : " + accounts.get(i).getName()
									   + " / ���� �ܰ� : " + accounts.get(i).getBalance());
				return al;
			}
			
		}
		ba = new BankAccount("X", "X");
		System.out.println("�˼��մϴ�. ���¸� ã�� �� �����ϴ�.");
		al.add(ba);
		return al;
	}

	public ArrayList<BankAccount> getAccount() { // ���� ��� ��������
		return accounts;
	}

	public int getTotalAccount() { // �� ���� �� ��������
		return accounts.size();
	}
}