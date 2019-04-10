
public class BankTransaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	public String getTransactionDate() {
		return transactionDate;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public String getKind() {
		return kind;
	}

	public long getAmount() {
		return amount;
	}

	public long getBalance() {
		return balance;
	}

	BankTransaction(String transactionDate, String transactionTime, String kind, long amount, long balance){
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
}
