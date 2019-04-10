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
		System.out.println("[ÁÂ¼®¼±ÅÃ]");
		System.out.println("1.ºñÁî´Ï½º¼® °¡°İ : "+
				Print_Util.airplane.get(Integer.parseInt(select)-1).getBusinessPrice() +"¸¸¿ø\n2.ÀÌÄÚ³ë¹Ì¼® °¡°İ : "
			+  Print_Util.airplane.get(Integer.parseInt(select)-1).getEconomyPrice()+"¸¸¿ø");
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
				System.out.printf("%d.[Ãâ¹ß³¯Â¥ : %s],[Ãâ¹ß½Ã°£ : %s][ºñÁî´Ï½º¼® °¡°İ : %d][ÀÌÄÚ³ë¹Ì¼® °¡°İ : %d]\n" 
						,count+1,fi.ar.get(i).getDate(),
						fi.ar.get(i).getTime(),
						fi.ar.get(i).getBusinessPrice(),
						fi.ar.get(i).getEconomyPrice());
				airplane.add(fi.ar.get(i));
				count++;
			}
		}
		System.out.println("¿¹¸ÅÇÏ½Ç ºñÇàÆíÀ» ¼±ÅÃÇØÁÖ¼¼¿ä.");
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
					System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
					return false;
				}
			}else if (sselect == 2) {
				if(Member.balance > air.getBusinessPrice()) {
					air.economy();
					return true;
					}else{
					System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
					return false;
				}
			}
			else {
				System.out.println("Àß¸øµÈ ¹øÈ£ÀÔ´Ï´Ù.");
				}
			}
	
	}
	public static boolean ManagerMenuPassword() {
		System.out.println("¾ÏÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		String managerPwd = sc.nextLine();
		return managerPwd.equals("0000");
	}
	public static void showRoute() {
		System.out.println("1. ÀÎÃµ - µµÄì");
		System.out.println("2. ÀÎÃµ - ÆÄ¸®");
		System.out.println("3. ÀÎÃµ - Åä·ĞÅä");
		System.out.println("4. ÀÎÃµ - ·±´ø");
	}
	public static void showManagerMenu() {
		System.out.println("°ü¸®ÀÚ ¸Ş´º");
		System.out.println("1.ÀüÃ¼ÀÏÁ¤È®ÀÎ");
		System.out.println("2.È¸¿ø¸ñ·Ïº¸±â");
		System.out.println("0.¸ŞÀÎ¸Ş´º·Î µ¹¾Æ°¡±â");
	}
	public static void showMenu() {
		System.out.println("³ëÁø¿¡¾î ÁÂ¼® ¿¹¾à ÇÁ·Î±×·¥");
		System.out.println("1. È¸¿ø°¡ÀÔ");
		System.out.println("2. ·Î±×ÀÎ");
		System.out.println("3. Á¾·á");
	}
	public static void logIn() {
		File f = null;
		FileInputStream fr = null;
		BufferedInputStream br = null;
		ObjectInputStream ois = null;
		System.out.println("**·Î±×ÀÎ**");
		System.out.println("¿©±Ç¹øÈ£ : ");
		String passportNum = sc.nextLine();
		System.out.println("ºñ¹Ğ¹øÈ£ : ");
		String pwd = sc.nextLine();

		Member users = null;

		try {
			f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");

			if (f.exists()) { // ÆÄÀÏÀÌ ¸¸¾à¿¡ Á¸ÀçÇÒ °æ¿ì
				fr = new FileInputStream("C:\\Temp\\Members\\" + passportNum + ".txt");
				br = new BufferedInputStream(fr);
				ois = new ObjectInputStream(br);
				users = (Member) ois.readObject();
				if (users.getPwd().equals(pwd)) {
					System.out.println("·Î±×ÀÎ ÁßÀÔ´Ï´Ù.");
				} else {
					System.out.println("ºñ¹Ğ¹øÈ£¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
					logIn();
				}
			} else {
				System.out.println("¿©±Ç¹øÈ£°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.");
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
		System.out.println("¸ñÀûÁö\t\t°áÁ¦³¯Â¥\t\t°áÁ¦½Ã°£\t  Ãâ¹ß³¯Â¥\t Ãâ¹ß½Ã°£\t    Æ¼ÄÏ°¡°İ\t    ³²ÀºÀÜ¾×");
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

		System.out.println("  ¸ñÀûÁö\t°áÁ¦³¯Â¥\t°áÁ¦½Ã°£\t   Ãâ¹ß³¯Â¥\t    Ãâ¹ß½Ã°£\t  Æ¼ÄÏ°¡°İ\t³²ÀºÀÜ¾×");
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
		System.out.println("\nÃë¼ÒÇÒ ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		select = Integer.parseInt(sc.nextLine());
		long amount = Airplane.transaction.get(select-1).amount;
		Member.balance += amount; 
		Airplane.transaction.remove(select-1);
	}
	public static void logInMenu() {
		System.out.println("1. ¿¹¸ÅÇÏ±â");
		System.out.println("2. ¿¹¸ÅÈ®ÀÎ");
		System.out.println("3. ¿¹¸ÅÃë¼Ò");
		System.out.println("4. ¿ä±İÃæÀü");
		System.out.println("5. ¿ä±İÈ®ÀÎ");
		System.out.println("6. ·Î±×¾Æ¿ô");
		System.out.println("7. Á¾·á");
	}
	public static void checkBalance() {
		System.out.println("ÇöÀç ÀÜ¾× : "+Member.balance);
	}
	public static void addBalance() {
		System.out.println("Ãß°¡ÇÒ ±İ¾×À» ÀÔ·ÂÇÏ¼¼¿ä.");
		Member.balance += Long.parseLong(sc.nextLine());
		System.out.println("¿ä±İÀÌ ÃæÀüµÇ¾ú½À´Ï´Ù.");
	}
	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("È¸¿ø°¡ÀÔ *********");
		while (true) {
			System.out.println("ÀÌ¸§	      : ");
			name = sc.nextLine();
			form = "^[°¡-ÆR]{2,4}+$";
			if (!Pattern.matches(form, name)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		while (true) {
		System.out.println("¿©±Ç¹øÈ£\t: ");
		passportNum = sc.nextLine();
		form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";

		while (true) {
			File f = new File("C:\\Temp\\Members\\" + passportNum + ".txt");
			if (f.exists()) {
				System.out.println("Á¸ÀçÇÏ´Â ¿©±Ç¹øÈ£ÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä");
				System.out.println("¿©±Ç¹øÈ£\t: ");
				passportNum = sc.nextLine();
				form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
			} else {
				break;
			}
		}
		if (!Pattern.matches(form, passportNum)) {
			System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
		} else {
			break;
		}

	}

		
		while (true) {
			System.out.println("ÇÚµåÆù¹øÈ£(ex.010-0000-0000) : ");
			phoneNum = sc.nextLine();
			form = "^(010)-\\d{4}-\\d{4}$";
			if (!Pattern.matches(form, phoneNum)) {
				if (!phoneNum.contains("-")) {
					System.out.println("ÇÏÀÌÇÂÀ» ³Ö¾î ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				} else {
					System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("Ä«µå¹øÈ£(ex.0000-1111-2222-3333)\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				if (!cardInfo.contains("-")) {
					System.out.println("ÇÏÀÌÇÂÀ» ³Ö¾î ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				} else {
					System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
				}
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("ºñ¹Ğ¹øÈ£\t : (ex. ¿µ¾î+¼ıÀÚ 8~16±ÛÀÚ)");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}

		String pathDirectory = "C:\\Temp\\Members";
		File Folder = new File(pathDirectory);
		if (!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("Members Æú´õ°¡ »ı¼ºµÇ¾ú½À´Ï´Ù.");
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
			System.out.println("È¸¿ø°¡ÀÔÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");

		} catch (Exception e) {
			System.out.println("¿¡·¯¹ß»ı!!!");
			e.printStackTrace();
		}

		enter();
		return m;

	}
	public static void enter() {
		System.out.println("¾Æ¹«Å°³ª ÀÔ·ÂÇÏ½Ã¸é ¸ŞÀÎÈ­¸éÀ¸·Î µ¹¾Æ°©´Ï´Ù.");
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

		
		return today2.compareTo(toDay) == -1 || today2.compareTo(toDay )==0 ? Calendar2.year+"/"+Calendar2.month+"/"+Print_Util.day1 : "¿À´ÃÀÌ³ª ¿À´Ã ÀÌÈÄ³¯Â¥¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä.";
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
		System.out.println("[Ãâ¹ß³¯Â¥ : " + toDate + "] ,"
				+                "[µµÂø³¯Â¥ : " + Calendar2.year +"/"+Calendar2.month+"/"+ Print_Util.day2 + "]");
		return toDay.compareTo(firstDate) == 1 || toDay.compareTo(firstDate) == 0  ? Calendar2.year+"/"+Calendar2.month+"/"+Print_Util.day2: "Ãâ¹ß³¯Â¥³ª Ãâ¹ß³¯Â¥ ÀÌÈÄ³¯Â¥¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä.";
	}
	public static void showCal() {
		Calendar2.input();
    	Calendar2.output(Calendar2.year, Calendar2.month);
    	while(true) {
    		System.out.println("¿¹¸ÅÇÒ ³¯Â¥ÀÇ ÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
    		day1 = Integer.parseInt(sc.nextLine());
    		if(day1 >= 1 && day1 <= 31) {
    			break;
    		}else {
    			System.out.println("Àß¸øµÈ ³¯Â¥ÀÔ´Ï´Ù.");
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
    		System.out.println("¿¹¸ÅÇÒ ³¯Â¥ÀÇ ÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
    		while(true) {
    			day2 = inputDay();
    			if(day2 >= day1) {
    				break;
    			}
    			System.out.println("Ãâ¹ß³¯Â¥ È¤Àº Ãâ¹ß³¯Â¥ ÀÌÈÄ ³¯Â¥¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä.");
    		}
    		if(day2 >= 1 && day2 <= 31) {
    			break;
    		}else {
    			System.out.println("Àß¸øµÈ ³¯Â¥ÀÔ´Ï´Ù.");
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
			File[] files = f.listFiles(); // files¿¡´Â ÆÄÀÏ°ú µğ·ºÅÍ¸®°¡ µé¾îÀÖÀ½
			System.out.println("   È¸¿øÀÌ¸§");
			
			for (int i = 0; i < files.length; i++) {

				String name2 = files[i].getName();
				fs = new FileInputStream(path + name2);
				bis = new BufferedInputStream(fs);
				ois = new ObjectInputStream(bis);
				count++;
				users = (Member) ois.readObject();
				System.out.println(count+". ["+users.getName()+"]");
			}
			System.out.printf("ÃÑ È¸¿ø ¼ö´Â %d¸íÀÔ´Ï´Ù.\n",count);
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