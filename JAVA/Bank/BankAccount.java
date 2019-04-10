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
	public void deposit(long amount) { //입금
		balance += amount;
		System.out.println(amount+"원을 입금했습니다."+"\n현재잔액 : "+ balance +"원");
		transactions.add(new BankTransaction(format_time1,format_time2,"입금",amount,balance));
	}
	
	public void withdraw(long amount) { //출금
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println(amount+"원을 출금했습니다.\n현재 잔액 : "+balance+"원");
			transactions.add(new BankTransaction(format_time1,format_time2,"출금",amount,balance));
		}
		else {
			System.out.println("잔액이 충분하지 않습니다.");
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