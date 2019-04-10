import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Print_Util {
	private static Scanner sc = new Scanner(System.in);
	private static int day = 0;
	private static int day1 = 0;
	private static int day2 = 0;
	private static Calendar firstDate = null;
	public static List<Airplane> airplane= new ArrayList<Airplane>();
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
	public static Airplane selectInfo(String select) {
		System.out.println("[�¼�����]");
		System.out.println("1.����Ͻ��� ���� : "+
				Print_Util.airplane.get(Integer.parseInt(select)-1).getBusinessPrice() +"����\n2.���ڳ�̼� ���� : "
			+  Print_Util.airplane.get(Integer.parseInt(select)-1).getEconomyPrice()+"����");
		return Print_Util.airplane.get(Integer.parseInt(select)-1);
	}
	public static void routeList() {
		FlightInfo flightInfo = new FlightInfo();
		System.out.println();
		for(int i = 0 ; i < flightInfo.ar.size() ; i++) {
			System.out.println(flightInfo.ar.get(i));
		}
	}
	public static void toPath(String toDate, String path) {
		FlightInfo fi= new FlightInfo();
		int count = 0;
		for(int i = 0 ; i < fi.ar.size() ; i++) {
			
			if(fi.ar.get(i).getDate().equals(toDate) && fi.ar.get(i).getPath().equals(path)) {
				System.out.printf("%d.[��߳�¥ : %s],[��߽ð� : %s][����Ͻ��� ���� : %d][���ڳ�̼� ���� : %d]\n" 
						,count+1,fi.ar.get(i).getDate(),
						fi.ar.get(i).getTime(),
						fi.ar.get(i).getBusinessPrice(),
						fi.ar.get(i).getEconomyPrice());
				airplane.add(fi.ar.get(i));
				count++;
			}
		}
		System.out.println("�����Ͻ� �������� �������ּ���.");
	}
	public static boolean seatGrade() {
		while(true) {
			String select = sc.nextLine();
			Airplane air = Print_Util.selectInfo(select);
			int sselect = Integer.parseInt(sc.nextLine());
			if( sselect == 1) {
				if(Member.balance > air.getBusinessPrice()) {
					air.business();
					return true;
				}else{
					System.out.println("�ܾ��� �����մϴ�.");
					return false;
				}
			}else if (sselect == 2) {
				if(Member.balance > air.getBusinessPrice()) {
					air.economy();
					return true;
					}else{
					System.out.println("�ܾ��� �����մϴ�.");
					return false;
				}
			}
			else {
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				}
			}
	
	}
	public static boolean ManagerMenuPassword() {
		System.out.println("��ȣ�� �Է��ϼ���.");
		String managerPwd = sc.nextLine();
		return managerPwd.equals("0000");
	}
	public static void showRoute() {
		System.out.println("1. ��õ - ����");
		System.out.println("2. ��õ - �ĸ�");
		System.out.println("3. ��õ - �����");
		System.out.println("4. ��õ - ����");
	}
	public static void showManagerMenu() {
		System.out.println("������ �޴�");
		System.out.println("1.��ü����Ȯ��");
		System.out.println("2.ȸ����Ϻ���");
		System.out.println("0.���θ޴��� ���ư���");
	}
	public static void showMenu() {
		System.out.println("�������� �¼� ���� ���α׷�");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
	}
	public static void logIn() {
		File f = null;
		FileInputStream fr = null;
		BufferedInputStream br = null;
		ObjectInputStream ois = null;
		System.out.println("**�α���**");
		System.out.println("���ǹ�ȣ : ");
		String passportNum = sc.nextLine();
		System.out.println("��й�ȣ : ");
		String pwd = sc.nextLine();

		Member users = null;

		try {
			f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");

			if (f.exists()) { // ������ ���࿡ ������ ���
				fr = new FileInputStream("C:\\Temp\\Members\\" + passportNum + ".txt");
				br = new BufferedInputStream(fr);
				ois = new ObjectInputStream(br);
				users = (Member) ois.readObject();
				if (users.getPwd().equals(pwd)) {
					System.out.println("�α��� ���Դϴ�.");
				} else {
					System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
					logIn();
				}
			} else {
				System.out.println("���ǹ�ȣ�� ��ġ���� �ʽ��ϴ�.");
				logIn();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				br.close();
				fr.close();
			} catch (Exception e) {

			}
		}
	}
	public static void transactionList() {
		System.out.println("������\t\t������¥\t\t�����ð�\t  ��߳�¥\t ��߽ð�\t    Ƽ�ϰ���\t    �����ܾ�");
		for(int i = 0 ; i < Airplane.transaction.size() ; i++) {
			System.out.println(Airplane.transaction.get(i).routeinfo+"\t   "
									+Airplane.transaction.get(i).payDate+"      \t"
									+Airplane.transaction.get(i).payTime+"     \t"
									+Airplane.transaction.get(i).flightDate+"  \t"
									+Airplane.transaction.get(i).flightTime+" \t  "
									+Airplane.transaction.get(i).amount+" \t"
									+(Airplane.transaction.get(i).balance-Airplane.transaction.get(i).amount));
		}
		
	}
	public static void transactionListCancle() {
		int count = 0;
		int select = 0;
		System.out.println(Airplane.transaction.get(select));

		System.out.println("  ������\t������¥\t�����ð�\t   ��߳�¥\t    ��߽ð�\t  Ƽ�ϰ���\t�����ܾ�");
		for(int i = 0 ; i < Airplane.transaction.size() ; i++) {
			System.out.println((count+1)+". "+Airplane.transaction.get(i).routeinfo+"\t   "
									+Airplane.transaction.get(i).payDate+"\t"
									+Airplane.transaction.get(i).payTime+"\t\t"
									+Airplane.transaction.get(i).flightDate+"\t\t"
									+Airplane.transaction.get(i).flightTime+"\t  "
									+Airplane.transaction.get(i).amount+"\t"
									+(Airplane.transaction.get(i).balance-Airplane.transaction.get(i).amount));
			count++;
		}
		System.out.println("\n����� ��ȣ�� �Է��ϼ���.");
		select = Integer.parseInt(sc.nextLine());
		long amount = Airplane.transaction.get(select-1).amount;
		Member.balance += amount; 
		Airplane.transaction.remove(select-1);
	}
	public static void logInMenu() {
		System.out.println("1. �����ϱ�");
		System.out.println("2. ����Ȯ��");
		System.out.println("3. �������");
		System.out.println("4. �������");
		System.out.println("5. ���Ȯ��");
		System.out.println("6. �α׾ƿ�");
		System.out.println("7. ����");
	}
	public static void checkBalance() {
		System.out.println("���� �ܾ� : "+Member.balance);
	}
	public static void addBalance() {
		System.out.println("�߰��� �ݾ��� �Է��ϼ���.");
		Member.balance += Long.parseLong(sc.nextLine());
		System.out.println("����� �����Ǿ����ϴ�.");
	}
	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("ȸ������ *********");
		while (true) {
			System.out.println("�̸�	      : ");
			name = sc.nextLine();
			form = "^[��-�R]{2,4}+$";
			if (!Pattern.matches(form, name)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		while (true) {
		System.out.println("���ǹ�ȣ\t: ");
		passportNum = sc.nextLine();
		form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";

		while (true) {
			File f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");
			if (f.exists()) {
				System.out.println("�����ϴ� ���ǹ�ȣ�Դϴ�. �ٽ� �Է����ּ���");
				System.out.println("���ǹ�ȣ\t: ");
				passportNum = sc.nextLine();
				form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
			} else {
				break;
			}
		}
		if (!Pattern.matches(form, passportNum)) {
			System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		} else {
			break;
		}

	}

		
		while (true) {
			System.out.println("�ڵ�����ȣ(ex.010-0000-0000) : ");
			phoneNum = sc.nextLine();
			form = "^(010)-\\d{4}-\\d{4}$";
			if (!Pattern.matches(form, phoneNum)) {
				if (!phoneNum.contains("-")) {
					System.out.println("�������� �־� �ٽ� �Է��ϼ���.");
				} else {
					System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("ī���ȣ(ex.0000-1111-2222-3333)\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				if (!cardInfo.contains("-")) {
					System.out.println("�������� �־� �ٽ� �Է��ϼ���.");
				} else {
					System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("��й�ȣ\t : (ex. ����+���� 8~16����)");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		String pathDirectory = "C:\\Temp\\Members";
		File Folder = new File(pathDirectory);
		if (!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("Members ������ �����Ǿ����ϴ�.");
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

		Member m = new Member(name, phoneNum, cardInfo, passportNum, pwd, 100000000);

		try {
			String pathFile = "C:\\Temp\\Members\\" + passportNum + ".txt";
			File file = new File(pathFile);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			oos.close();
			fos.close();
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");

		} catch (Exception e) {
			System.out.println("�����߻�!!!");
			e.printStackTrace();
		}

		enter();
		return m;

	}
	public static void enter() {
		System.out.println("�ƹ�Ű�� �Է��Ͻø� ����ȭ������ ���ư��ϴ�.");
		sc.nextLine();
	}

	public static String checkDate() {
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(today.YEAR);
		int month = today.get(today.MONTH) + 1;
		int day = today.get(today.DAY_OF_MONTH);
		
		Calendar toDay = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		toDay.set(Calendar2.year, Calendar2.month, Print_Util.day1);
		today2.set(year, month, day);
		firstDate = toDay;

		
		return today2.compareTo(toDay) == -1 || today2.compareTo(toDay )==0 ? Calendar2.year+"/"+Calendar2.month+"/"+Print_Util.day1 : "�����̳� ���� ���ĳ�¥�� �������ּ���.";
	}
	public static String checkDate2(String toDate) {
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(today.YEAR);
		int month = today.get(today.MONTH) + 1;
		int day = today.get(today.DAY_OF_MONTH);
		
		Calendar toDay = Calendar.getInstance();
		Calendar fromDay = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		toDay.set(Calendar2.year, Calendar2.month, Print_Util.day1);
		today2.set(year, month, day);
		System.out.println("[��߳�¥ : " + toDate + "] ,"
				+                "[������¥ : " + Calendar2.year +"/"+Calendar2.month+"/"+ Print_Util.day2 + "]");
		return toDay.compareTo(firstDate) == 1 || toDay.compareTo(firstDate) == 0  ? Calendar2.year+"/"+Calendar2.month+"/"+Print_Util.day2: "��߳�¥�� ��߳�¥ ���ĳ�¥�� �������ּ���.";
	}
	public static void showCal() {
		Calendar2.input();
    	Calendar2.output(Calendar2.year, Calendar2.month);
    	while(true) {
    		System.out.println("������ ��¥�� ���� �Է��ϼ���.");
    		day1 = Integer.parseInt(sc.nextLine());
    		if(day1 >= 1 && day1 <= 31) {
    			break;
    		}else {
    			System.out.println("�߸��� ��¥�Դϴ�.");
    		}
    	}	
	}
	public static int inputDay() {
		int day = Integer.parseInt(sc.nextLine());
		return day;
	}
	public static void showCal2() {
		Calendar2.input();
    	Calendar2.output(Calendar2.year, Calendar2.month);
    	while(true) {
    		System.out.println("������ ��¥�� ���� �Է��ϼ���.");
    		while(true) {
    			day2 = inputDay();
    			if(day2 >= day1) {
    				break;
    			}
    			System.out.println("��߳�¥ Ȥ�� ��߳�¥ ���� ��¥�� �������ּ���.");
    		}
    		if(day2 >= 1 && day2 <= 31) {
    			break;
    		}else {
    			System.out.println("�߸��� ��¥�Դϴ�.");
    		}
    	}	
	}
	
	public static void MemberList() {
		File f = null;
		String name = null;
		int count = 0;


		FileInputStream fs = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		String path = "C:\\Temp\\Members\\";
		String line = "";
		Member users = null;
		try {
			f = new File(path);
			File[] files = f.listFiles(); // files���� ���ϰ� ���͸��� �������
			System.out.println("   ȸ���̸�");
			
			for (int i = 0; i < files.length; i++) {

				String name2 = files[i].getName();
				fs = new FileInputStream(path + name2);
				bis = new BufferedInputStream(fs);
				ois = new ObjectInputStream(bis);
				count++;
				users = (Member) ois.readObject();
				System.out.println(count+". ["+users.getName()+"]");
			}
			System.out.printf("�� ȸ�� ���� %d���Դϴ�.\n",count);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				ois.close();
				bis.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}