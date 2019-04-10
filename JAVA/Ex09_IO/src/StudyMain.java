

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class StudyMain {
    static HashMap<Integer, StudyCheck> map = new HashMap<Integer, StudyCheck>();
    static int count = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudyMain bc = new StudyMain();
        while (true) {
            System.out.println("성적관리 프로그램");
            System.out.print("<1>추가 <2>삭제 <3>출력 <4>저장 <5>로드 <6>종료 : ");

            switch (sc.nextInt()) {
            case 1:
                bc.add();
                break;
            case 2:
                bc.delete();
                break;
            case 3:
                bc.print();
                break;
            case 4:
                bc.save();
                break;
            case 5:
                bc.load();
                break;
            case 6:
                bc.exit();
                break;

            }
        }
    }

    private void save() {
        File file = new File("Study.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(map);

            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("에러발생!!!");
            e.printStackTrace();
        }
        System.out.println("저장되었습니다.");
    }

    private void exit() {
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
        sc.close();
    }

    private void print() {
        Set<Integer> set = map.keySet();
        System.out.println("번호\t\t수학\t\t자바\t\t파이선\t평균\t\t등급\n");
        for (Integer number : set) {
            double math = map.get(number).getMath();
            double java = map.get(number).getJava();
            double python = map.get(number).getPython();
            double average = map.get(number).getAvg();
            String you = map.get(number).getYou();

            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%f\t\t%s\n", number, math, java, python, average, you);
        }
    }

    private void delete() {
        System.out.print("삭제하실 넘버를 입력해 주세요 : ");
        int num = sc.nextInt();
        if (map.containsKey(num)) {
            map.remove(num);
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("학생넘버를 잘못입력하셨습니다. 해당 정보가 없습니다.");
        }
    }

    private void add() {
        StudyCheck std = new StudyCheck();
        map.put(count, std.input(std));
        count++;
    }

    private void load() {
        File file = new File("Study.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis);

            map = (HashMap) oos.readObject();

            Set<Integer> set = map.keySet();
            System.out.println("번호\t\t수학\t\t자바\t\t파이선\t\t평균\t\t등급\t\t판정");
            for (Integer number : set) {
                double math = map.get(number).getMath();
                double java = map.get(number).getJava();
                double python = map.get(number).getPython();
                double average = map.get(number).getAvg();
                String you = map.get(number).getYou();
                System.out.printf("[%s]\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", number, math, java, python, average,
                        you);
            }
            oos.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("불러오는데 실패하였습니다.");
            e.printStackTrace();
        }
    }
}