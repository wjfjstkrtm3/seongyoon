import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class TimeContorl extends Thread {
	
	int num = 0;
	WordControl r = new WordControl();
	
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			if(QuizExample.input) {
			
				return;
			} 
			if (i==0) {
				System.out.println("총 맞힌 개수는  : " + r.count);
				return;
			}
			System.out.println("남은 시간 : " + i);
			

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			
		}

	}

}

class WordControl extends Thread {
	
	static int count = 0;
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		String answer;
		count = 0;
		boolean result;
		QuizExample.quiz.put(1, new QuizInfo("2*2? ", "4", "결과?"));
		QuizExample.quiz.put(2, new QuizInfo("2*3?", "6", "결과?"));
		QuizExample.quiz.put(3, new QuizInfo("2*4?", "8", "결과?"));
		QuizExample.quiz.put(4, new QuizInfo("2*5?", "10", "결과?"));
		QuizExample.quiz.put(5, new QuizInfo("2*6?", "12", "결과?"));
		QuizExample.quiz.put(6, new QuizInfo("2*7?", "14", "결과?"));
		QuizExample.quiz.put(7, new QuizInfo("2*8?", "16", "결과?"));
		QuizExample.quiz.put(8, new QuizInfo("2*9?", "18", "결과?"));
		QuizExample.quiz.put(9, new QuizInfo("2*10?", "20", "결과?"));
		QuizExample.quiz.put(10, new QuizInfo("2*11?", "22", "결과?"));

		for (int i = 1; i <= QuizExample.quiz.size(); i++) {
			// Set set =quiz.keySet();

			System.out.println(QuizExample.quiz.get(i).question);
			answer = sc.nextLine();
			result = QuizExample.quiz.get(i).answer.equals(answer);
			if (result) {
				QuizExample.quiz.get(i).result = "정답";
				System.out.printf("%s입니다.\n", QuizExample.quiz.get(i).result);

				count++;
			} else {
				QuizExample.quiz.get(i).result = "오답";
				System.out.printf("%s입니다.\n", QuizExample.quiz.get(i).result);
			}
			// System.out.println(quiz.keySet().toArray()[i]);

		}
		System.out.printf("%d개 맞췄습니다 !", count);
		
		if(QuizExample.quiz.size() ==10) {
			QuizExample.input = true;
		}
		
		
	}

}

class QuizInfo {
	String question;
	String answer;
	String result;

	QuizInfo(String question, String answer, String result) {
		this.question = question;
		this.answer = answer;
		this.result = result;
	}

}

public class QuizExample {
	static HashMap<Integer, QuizInfo> quiz = new HashMap();
	static boolean input = false;
	
	
	public static void main(String[] args) {
		TimeContorl t = new TimeContorl();
		t.start();
		
		WordControl w = new WordControl();
		w.start();
		

	 
		
		
	}
	

}