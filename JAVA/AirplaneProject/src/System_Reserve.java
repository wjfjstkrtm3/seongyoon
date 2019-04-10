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
				System.out.println("로그인 성공!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				A: while (true) { // 로그인 화면으로 들어옵니다!
					Print_Util.clearScreen();
					Print_Util.logInMenu();
					select = sc.nextLine();
					switch (select) {
					case Constants.RESERVATION:
						Print_Util.clearScreen();

						System.out.println("출발");
						while (true) {
							Print_Util.showCal();
							toDate = Print_Util.checkDate();
							System.out.println(toDate);
							if (!toDate.equals("오늘이나 오늘 이후날짜를 선택해주세요.")) {
								Print_Util.clearScreen();
								Print_Util.showRoute();
								select = sc.nextLine();
								switch (select) {
								case Constants.INCHEON_TOKYO:
									System.out.println("소요시간 : 1시간");
									Print_Util.toPath(toDate, "인천-도쿄");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.INCHEON_PARIS:
									System.out.println("소요시간 : 9시간");
									Print_Util.toPath(toDate, "인천-파리");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.INCHEON_TORONTO:
									System.out.println("소요시간 : 13시간");
									Print_Util.toPath(toDate, "인천-토론토");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.INCHEON_LONDON:
									System.out.println("소요시간 : 11시간");
									Print_Util.toPath(toDate, "인천-런던");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.TOKYO_INCHEON:
									System.out.println("소요시간 : 1시간");
									Print_Util.toPath(toDate, "도쿄-인천");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.PARIS_INCHEON:
									System.out.println("소요시간 : 9시간");
									Print_Util.toPath(toDate, "파리-인천");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.TORONTO_INCHEON:
									System.out.println("소요시간 : 13시간");
									Print_Util.toPath(toDate, "토론토-인천");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								case Constants.LONDON_INCHEON:
									System.out.println("소요시간 : 11시간");
									Print_Util.toPath(toDate, "런던-인천");
									Print_Util.seatGrade();
									Print_Util.enter();
									break;
								default:
									System.out.println("올바른 값을 입력하세요.");
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
						System.out.println("취소되었습니다.");
						Print_Util.enter();
						break;
					case Constants.LOG_OUT: // 로그아웃을 하면 메인화면으로 !
						System.out.println("로그아웃 중.");
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
						System.out.println("올바른 숫자를 다시 입력하세요.");

					}
				}
				break;
			case Constants.EXIT:
				return;
			case Constants.MANAGER_MODE:
				if (!Print_Util.ManagerMenuPassword()) {
					System.out.println("패스워드가 틀립니다");
					Print_Util.enter();
					continue;
				}
				System.out.println("관리자 인증 완료.");
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
						System.out.println("올바른 숫자를 다시 입력하세요.");
					}
				}
			default:
				System.out.println("올바른 숫자를 다시 입력하세요.");
			}
		}
	}
}