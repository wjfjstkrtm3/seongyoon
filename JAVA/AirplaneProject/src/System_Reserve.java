import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System_Reserve {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean check = false;
		String path = "";
		FlightInfo fi = new FlightInfo();
		List<Member> member = null;
		List<Airplane> airplane = new ArrayList<Airplane>();
		String toDate;
		member = new ArrayList();
		FlightInfo flightInfo = new FlightInfo();
		flightInfo.setSchedule();
		while (true) {
			Print_Util.clearScreen();
			Print_Util.showMenu();

			String select = sc.nextLine();
			switch (select) {
			case Constants.SIGN_IN:
				Print_Util.clearScreen();
				member.add(Print_Util.signIn());
				break;
			case Constants.LOG_IN:
				Print_Util.clearScreen();
				Print_Util.logIn();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�α��� ����!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				A: while (true) { // �α��� ȭ������ ���ɴϴ�!
					Print_Util.clearScreen();
					Print_Util.logInMenu();
					select = sc.nextLine();
					switch (select) {
					case Constants.RESERVATION:
						Print_Util.clearScreen();

						System.out.println("���");
						while (true) {
							Print_Util.showCal();
							toDate = Print_Util.checkDate();
							System.out.println(toDate);
							if (!toDate.equals("�����̳� ���� ���ĳ�¥�� �������ּ���.")) {
								Print_Util.clearScreen();
								Print_Util.showRoute();
								select = sc.nextLine();
								switch (select) {
								case Constants.INCHEON_TOKYO:
									System.out.println("�ҿ�ð� : 1�ð�");
									Print_Util.toPath(toDate, "��õ-����");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.INCHEON_PARIS:
									System.out.println("�ҿ�ð� : 9�ð�");
									Print_Util.toPath(toDate, "��õ-�ĸ�");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.INCHEON_TORONTO:
									System.out.println("�ҿ�ð� : 13�ð�");
									Print_Util.toPath(toDate, "��õ-�����");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.INCHEON_LONDON:
									System.out.println("�ҿ�ð� : 11�ð�");
									Print_Util.toPath(toDate, "��õ-����");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.TOKYO_INCHEON:
									System.out.println("�ҿ�ð� : 1�ð�");
									Print_Util.toPath(toDate, "����-��õ");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.PARIS_INCHEON:
									System.out.println("�ҿ�ð� : 9�ð�");
									Print_Util.toPath(toDate, "�ĸ�-��õ");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.TORONTO_INCHEON:
									System.out.println("�ҿ�ð� : 13�ð�");
									Print_Util.toPath(toDate, "�����-��õ");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.LONDON_INCHEON:
									System.out.println("�ҿ�ð� : 11�ð�");
									Print_Util.toPath(toDate, "����-��õ");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								default:
									System.out.println("�ùٸ� ���� �Է��ϼ���.");
								}
								break;
							}
						}
						break;

					case Constants.RESERVATION_CHECK:
						Print_Util.clearScreen();
						Print_Util.transactionList();
						Print_Util.enter();
						break;
					case Constants.RESERVATION_CANCLE:
						Print_Util.clearScreen();
						Print_Util.transactionListCancle();
						System.out.println("��ҵǾ����ϴ�.");
						Print_Util.enter();
						break;
					case Constants.LOG_OUT: // �α׾ƿ��� �ϸ� ����ȭ������ !
						System.out.println("�α׾ƿ� ��.");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break A;
					case Constants.EXIT2:
						return;
					case Constants.ADD_BALANCE:
						Print_Util.addBalance();
						Print_Util.enter();
						break;
					case Constants.CHECK_BALANCE:
						Print_Util.checkBalance();
						Print_Util.enter();
						break;
					default:
						System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");

					}
				}
				break;
			case Constants.EXIT:
				return;
			case Constants.MANAGER_MODE:
				if (!Print_Util.ManagerMenuPassword()) {
					System.out.println("�н����尡 Ʋ���ϴ�");
					Print_Util.enter();
					continue;
				}
				System.out.println("������ ���� �Ϸ�.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				escape: while (true) {
					Print_Util.clearScreen();
					Print_Util.showManagerMenu();
					select = sc.nextLine();
					switch (select) {
					case Constants.SCHEDULE:
						Print_Util.clearScreen();
						Print_Util.routeList();
						Print_Util.enter();
						break;
					case Constants.MEMBER_LIST:
						Print_Util.clearScreen();
						Print_Util.MemberList();
						Print_Util.enter();
						break;

					case Constants.RETURN:
						break escape;

					default:
						System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");
					}
				}
			default:
				System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");
			}
		}
	}
}