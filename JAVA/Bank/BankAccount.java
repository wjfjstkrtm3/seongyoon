import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class BankAccount {
	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd ");
	SimpleDateFormat format2 = new SimpleDateFormat ( "HH:mm:ss");
	private String accountNo;
	private String name;
	private long balance = 0;
	private ArrayList<BankTransaction> transactions = new ArrayList();
	String format_time1 = format1.format(System.currentTimeMillis());
	String format_time2 = format2.format(System.currentTimeMillis());
	        
	
	BankAccount(String accountNo, String name){
		this.accountNo=accountNo;
		this.name = name;
	}
	public void deposit(long amount) { //�Ա�
		balance += amount;
		System.out.println(amount+"���� �Ա��߽��ϴ�."+"\n�����ܾ� : "+ balance +"��");
		transactions.add(new BankTransaction(format_time1,format_time2,"�Ա�",amount,balance));
	}
	
	public void withdraw(long amount) { //���
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println(amount+"���� ����߽��ϴ�.\n���� �ܾ� : "+balance+"��");
			transactions.add(new BankTransaction(format_time1,format_time2,"���",amount,balance));
		}
		else {
			System.out.println("�ܾ��� ������� �ʽ��ϴ�.");
		}
	}
	public long getBalance() {
		return this.balance;
	}
	public ArrayList<BankTransaction> getTransactions(){
		return transactions;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
}