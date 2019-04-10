import java.util.Scanner;
import java.lang.Integer;

public class BankMain {
	static Bank bank = new Bank();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		String selectNum;
		String name;
		String accountNo;
		long balance = 0;
		long amount = 0;
		while (true) {
			clearScreen();
			printMenu();
			selectNum = sc.nextLine();
			switch (selectNum) {
			case "1": // 계좌생성
				clearScreen();
				System.out.println("이름을 입력하세요.");
				name = sc.nextLine();
				System.out.println("사용하실 계좌 번호를 입력하세요.");
				accountNo = sc.nextLine();
				bank.addAccount(accountNo, name);

				goMain();
				break;
			case "2":// 이름으로 찾기
				clearScreen();
				System.out.println("성함을 입력해주세요.");
				name = sc.nextLine();
				bank.findAccount(name);

				goMain();
				break;
			case "3":// 계좌번호로찾기
				clearScreen();
				System.out.println("계좌번호를 입력해주세요.");
				accountNo = sc.nextLine();
				BankAccount ba = bank.getAccount(accountNo);
				System.out.printf("계좌 번호 : %s / 이름 : %s / 현재 잔고 : %d\n", ba.getAccountNo(), ba.getName(),
						ba.getBalance());

				goMain();
				break;
			case "4":// 계좌목록
				clearScreen();
				System.out.println("------계좌 목록-------");
				for (int i = 0; i < bank.getAccount().size(); i++) {
					System.out.println((i + 1) + ". 계좌 번호 : " + bank.getAccount().get(i).getAccountNo() + " / 이름 : "
							+ bank.getAccount().get(i).getName());
				}
				System.out.println("총 계좌의 수는 " + bank.getTotalAccount() + "개 입니다.");

				goMain();
				break;
			case "5":// 입금
				clearScreen();
				System.out.println("사용할 계좌의 계좌번호를 입력하세요.");
				accountNo = sc.nextLine();
				accountNoException(accountNo);

				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					System.out.println("입금할 금액을 입력하세요.");
					amount = Long.parseLong(sc.nextLine());
					if (amountException(amount)) {

						for (int i = 0; i < bank.getAccount().size(); i++) {
							if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
								bank.getAccount().get(i).deposit(amount);
							}
						}
					}
				}
				goMain();
				break;
			case "6":// 출금
				clearScreen();
				System.out.println("사용할 계좌의 계좌번호를 입력하세요.");
				accountNo = sc.nextLine();
				accountNoException(accountNo);
				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					System.out.println("출금할 금액을 입력하세요.");
					amount = Long.parseLong(sc.nextLine());
					if (amountException(amount)) {
						bank.getAccount(accountNo).withdraw(amount);
					}
				}
				goMain();
				break;
			case "7": // 잔액조회
				clearScreen();
				System.out.println("조회할 계좌의 계좌번호를 입력하세요.");
				accountNo = sc.nextLine();
				accountNoException(accountNo);
				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					for (int i = 0; i < bank.getAccount().size(); i++) {
						if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
							System.out.println(bank.getAccount().get(i).getName() + "님의 현재 잔액 : "
									+ bank.getAccount().get(i).getBalance() + "원");
						}
					}
				}
				goMain();
				break;
			case "8": // 거래내역 조회
				clearScreen();
				System.out.println("조회할 계좌의 계좌번호를 입력하세요.");
				accountNo = sc.nextLine();
				for (int i = 0; i < bank.getAccount().size(); i++) {
					if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
						System.out.println("날짜\t\t\t시간\t\t종류\t금액\t\t현재잔고");
					} else {
						System.out.println("계좌를 찾을 수 없습니다.");
						continue;
					}
				}
				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					for (int i = 0; i < bank.getAccount().size(); i++) {
						if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {

							for (int j = 0; j < bank.getAccount(accountNo).getTransactions().size(); j++) {
								System.out.printf("%s\t%s\t%s\t%d원\t%d원\n",
										bank.getAccount().get(i).getTransactions().get(j).getTransactionDate(),
										bank.getAccount().get(i).getTransactions().get(j).getTransactionTime(),
										bank.getAccount().get(i).getTransactions().get(j).getKind(),
										bank.getAccount().get(i).getTransactions().get(j).getAmount(),
										bank.getAccount().get(i).getTransactions().get(j).getBalance());
							}
						}
					}
				}
				goMain();
				break;
			case "0":
				return;
			default:
				System.out.println("잘못된 숫자입니다. 다시 입력하세요.");
			}
		}
	}

	public static boolean amountException(Long amount) {
		boolean exception = true;
		if (amount < 1) {
			exception = false;
			System.out.println("금액을 잘못 입력하셨습니다.");
		}
		return exception;
	}

	public static void accountNoException(String accountNo) { // 계좌번호 예외처리
		for (int i = 0; i < bank.getAccount().size(); i++) {
			if (!bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
				System.out.println("계좌를 찾을 수 없습니다.");
			}
		}

	}

	public static void goMain() {
		System.out.println("아무 키나 누르시면 메인화면으로 돌아갑니다.");
		String name = sc.nextLine();
	}

	public static void printMenu() {
		System.out.println("은행업무 프로그램");
		System.out.println("1. 계좌 생성");
		System.out.println("2. 계좌 찾기 (이름으로 찾기)");
		System.out.println("3. 계좌 찾기 (계좌번호로 찾기)");
		System.out.println("4. 계좌 목록 보기");
		System.out.println("5. 입금");
		System.out.println("6. 출금");
		System.out.println("7. 잔고확인");
		System.out.println("8. 거래내역 확인");
		System.out.println("0. 종료");
	}

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
