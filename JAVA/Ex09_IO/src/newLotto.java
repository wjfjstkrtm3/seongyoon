import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

class lottoNumAuto extends Thread {

	static boolean stop = false;

	public void run() {
		int num = 0;
		int cnt = 0;
		a: for (int i = 10; i > 0; i--) {
			if (stop) {
				break a;
			}
			System.out.println("남은 시간: " + i);
			try {
				Thread.sleep(1000); // cpu를 점유하고 있는 너는 잠깐 쉬어

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		if (newLotto.lottoNum.size() < 6) {
			for (int j = 0; newLotto.lottoNum.size() < 6; j++) {
				newLotto.lottoNum.add((int) (Math.random() * 45) + 1);

			}
		}
		System.out.println("당신의 로또번호는 " + newLotto.lottoNum);
		newLotto.fileWrite();
	}
}

class lottoNumStick extends Thread {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int num = 0;
		System.out.println("로또번호를 수동으로 입력합니다. 1~45번까지 번호를 입력하세요: ");

		for (int i = 0; newLotto.lottoNum.size() < 6; i++) {
			System.out.printf("%d번째 숫자: \n", i + 1);
			num = Integer.parseInt(sc.nextLine());

			for (int j = 0; j < newLotto.lottoNum.size(); j++) {
				if (newLotto.lottoNum.contains(num)) {
					System.out.println("중복된 값입니다. 다시 입력하세요!");
					num = Integer.parseInt(sc.nextLine());

				}

			}
			newLotto.lottoNum.add(num);
			System.out.println("");

		}
		lottoNumAuto.stop = true;
	}

}

public class newLotto {
	static Set<Integer> lottoNum = new TreeSet<Integer>();

	static String date() {
		int year = 0;
		int month = 0;
		int day = 0;

		String result = "";
		Calendar cal = Calendar.getInstance();

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;

		day = cal.get(Calendar.DATE);

		result = year + "." + month + "." + day;
		return result;
	}

	public static void fileWrite() {
		try {
			FileWriter pw = new FileWriter("C:\\Temp\\" + date() + ".txt", true);

			pw.write("로또번호:" + newLotto.lottoNum.toString() + "");

			// for (int i = 0; i < lottoNumAuto.lottoNum.size(); i++) {
			// pw.write(lottoNumAuto.lottoNum+"\n");

			pw.write("\n");
			pw.close();
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		lottoNumStick stick = new lottoNumStick();
		lottoNumAuto auto = new lottoNumAuto();

		stick.start();
		auto.start();

	}

}