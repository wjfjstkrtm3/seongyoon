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
			case "1": // ���»���
				clearScreen();
				System.out.println("�̸��� �Է��ϼ���.");
				name = sc.nextLine();
				System.out.println("����Ͻ� ���� ��ȣ�� �Է��ϼ���.");
				accountNo = sc.nextLine();
				bank.addAccount(accountNo, name);

				goMain();
				break;
			case "2":// �̸����� ã��
				clearScreen();
				System.out.println("������ �Է����ּ���.");
				name = sc.nextLine();
				bank.findAccount(name);

				goMain();
				break;
			case "3":// ���¹�ȣ��ã��
				clearScreen();
				System.out.println("���¹�ȣ�� �Է����ּ���.");
				accountNo = sc.nextLine();
				BankAccount ba = bank.getAccount(accountNo);
				System.out.printf("���� ��ȣ : %s / �̸� : %s / ���� �ܰ� : %d\n", ba.getAccountNo(), ba.getName(),
						ba.getBalance());

				goMain();
				break;
			case "4":// ���¸��
				clearScreen();
				System.out.println("------���� ���-------");
				for (int i = 0; i < bank.getAccount().size(); i++) {
					System.out.println((i + 1) + ". ���� ��ȣ : " + bank.getAccount().get(i).getAccountNo() + " / �̸� : "
							+ bank.getAccount().get(i).getName());
				}
				System.out.println("�� ������ ���� " + bank.getTotalAccount() + "�� �Դϴ�.");

				goMain();
				break;
			case "5":// �Ա�
				clearScreen();
				System.out.println("����� ������ ���¹�ȣ�� �Է��ϼ���.");
				accountNo = sc.nextLine();
				accountNoException(accountNo);

				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
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
			case "6":// ���
				clearScreen();
				System.out.println("����� ������ ���¹�ȣ�� �Է��ϼ���.");
				accountNo = sc.nextLine();
				accountNoException(accountNo);
				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					System.out.println("����� �ݾ��� �Է��ϼ���.");
					amount = Long.parseLong(sc.nextLine());
					if (amountException(amount)) {
						bank.getAccount(accountNo).withdraw(amount);
					}
				}
				goMain();
				break;
			case "7": // �ܾ���ȸ
				clearScreen();
				System.out.println("��ȸ�� ������ ���¹�ȣ�� �Է��ϼ���.");
				accountNo = sc.nextLine();
				accountNoException(accountNo);
				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					for (int i = 0; i < bank.getAccount().size(); i++) {
						if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
							System.out.println(bank.getAccount().get(i).getName() + "���� ���� �ܾ� : "
									+ bank.getAccount().get(i).getBalance() + "��");
						}
					}
				}
				goMain();
				break;
			case "8": // �ŷ����� ��ȸ
				clearScreen();
				System.out.println("��ȸ�� ������ ���¹�ȣ�� �Է��ϼ���.");
				accountNo = sc.nextLine();
				for (int i = 0; i < bank.getAccount().size(); i++) {
					if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
						System.out.println("��¥\t\t\t�ð�\t\t����\t�ݾ�\t\t�����ܰ�");
					} else {
						System.out.println("���¸� ã�� �� �����ϴ�.");
						continue;
					}
				}
				if (bank.getAccount(accountNo).getAccountNo().equals(accountNo)) {
					for (int i = 0; i < bank.getAccount().size(); i++) {
						if (bank.getAccount().get(i).getAccountNo().equals(accountNo)) {

							for (int j = 0; j < bank.getAccount(accountNo).getTransactions().size(); j++) {
								System.out.printf("%s\t%s\t%s\t%d��\t%d��\n",
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
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}

	public static boolean amountException(Long amount) {
		boolean exception = true;
		if (amount < 1) {
			exception = false;
			System.out.println("�ݾ��� �߸� �Է��ϼ̽��ϴ�.");
		}
		return exception;
	}

	public static void accountNoException(String accountNo) { // ���¹�ȣ ����ó��
		for (int i = 0; i < bank.getAccount().size(); i++) {
			if (!bank.getAccount().get(i).getAccountNo().equals(accountNo)) {
				System.out.println("���¸� ã�� �� �����ϴ�.");
			}
		}

	}

	public static void goMain() {
		System.out.println("�ƹ� Ű�� �����ø� ����ȭ������ ���ư��ϴ�.");
		String name = sc.nextLine();
	}

	public static void printMenu() {
		System.out.println("������� ���α׷�");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ã�� (�̸����� ã��)");
		System.out.println("3. ���� ã�� (���¹�ȣ�� ã��)");
		System.out.println("4. ���� ��� ����");
		System.out.println("5. �Ա�");
		System.out.println("6. ���");
		System.out.println("7. �ܰ�Ȯ��");
		System.out.println("8. �ŷ����� Ȯ��");
		System.out.println("0. ����");
	}

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
