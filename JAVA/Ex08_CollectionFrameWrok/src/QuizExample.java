import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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

    public static void main(String[] args) {
       HashMap<Integer, QuizInfo> quiz = new HashMap();
       Scanner sc = new Scanner(System.in);
       String answer;
       int count=0;
       boolean result;
       quiz.put(1, new QuizInfo("아르헨티나의 수도는? ","부에노스아이레스","결과?"));
       quiz.put(2, new QuizInfo("호주의 수도는?","캔버라","결과?"));
       quiz.put(3, new QuizInfo("인도의 수도는?","뉴델리","결과?"));
       quiz.put(4, new QuizInfo("네팔의 수도는?","카트만두","결과?"));
       quiz.put(5, new QuizInfo("필리핀의 수도는?","마닐라","결과?"));
       quiz.put(6, new QuizInfo("독일의 수도는?","베를린","결과?"));
       quiz.put(7, new QuizInfo("이라크의 수도는?","바그다드","결과?"));
       quiz.put(8, new QuizInfo("대만의 수도는?","타이베이","결과?"));
       quiz.put(9, new QuizInfo("중국의 수도는?","베이징","결과?"));
       quiz.put(10, new QuizInfo("북한의 수도는?","평양","결과?"));

       for(int i = 1 ; i <= quiz.size() ; i++) {
           // Set set =quiz.keySet();

           System.out.println(quiz.get(i).question);
           answer = sc.nextLine();
           result = quiz.get(i).answer.equals(answer);
           if(result) {
               quiz.get(i).result = "정답";
               System.out.printf("%s입니다.\n",quiz.get(i).result);
               
               count++;
           }else {
               quiz.get(i).result = "오답";
               System.out.printf("%s입니다.\n",quiz.get(i).result);
           }
           //System.out.println(quiz.keySet().toArray()[i]);


       }
       System.out.printf("%d개 맞췄습니다 !" , count);
    }

}