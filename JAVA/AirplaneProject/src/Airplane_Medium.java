import java.io.Serializable;
import java.util.Scanner;

public class Airplane_Medium extends Airplane implements Serializable {

   Scanner scanner = new Scanner(System.in);
   String[][] mediumSeat = new String[3][6];
   String[][] mediumSeat2 = new String[17][6];
   
   public Airplane_Medium(int businessPrice, int economyPrice, String date, String time, String path) {
      super(businessPrice, economyPrice, date, time, path);
   }

   @Override
   public void business() {

      int i = 0;
      System.out.println("Medium 비행기");
      System.out.println("비지니스석");
      for (int j = 0; j < mediumSeat[0].length; j++) {

         i += 1;
         System.out.print("  " + i);

         if (j == 2) {
            System.out.print("  ");
            continue;
         }

      }
      System.out.println();
      for (int k = 0; k < mediumSeat.length; k++) {
         System.out.print((char) ('A' + k) + " ");
         for (int l = 0; l < mediumSeat[0].length; l++) {
            if (mediumSeat[k][l] != "X") {
               mediumSeat[k][l] = "O";
            }
            if (l % 3 == 0 && l != 0) {
               System.out.print("  ");
            }
            System.out.print(mediumSeat[k][l] + "  ");

         }
         System.out.println();
      }

      try {
         System.out.println("행을 입력하세요(A~C)");
         char c = scanner.next().charAt(0);
         int column = ((int) c) - 65;

         System.out.println("열을 입력하세요(1~6)");
         int row = scanner.nextInt();
         switch (mediumSeat[column][row - 1]) {
         case "X":
            System.out.println();
            System.out.println("이미 예약된 좌석입니다.");
            return;
         default:
            mediumSeat[column][row - 1] = "X";
            System.out.println("예약이 완료되었습니다.");
            break;
         }
         System.out.println("Medium 비행기");
         System.out.println("비즈니스석");
         for (int j = 0; j < mediumSeat[0].length; j++) {
            if (i == 6) {
               i = 0;
            }
            i += 1;
            System.out.print("  " + i);
            if (j == 2 || j == 5) {
               System.out.print("  ");
               continue;
            }
         }
         System.out.println();
         for (int k = 0; k < mediumSeat.length; k++) {
            System.out.print((char) ('A' + k) + " ");
            for (int l = 0; l < mediumSeat[0].length; l++) {
               if (mediumSeat[k][l] != "X") {
                  mediumSeat[k][l] = "O";
               }
               if (l == 3) {
                  System.out.print("  ");
               }
               System.out.print(mediumSeat[k][l] + "  ");

            }
            System.out.println();
         }

      } catch (Exception e) {
         System.out.println();
         System.out.println("좌석의 범위가 아닙니다.");
         System.out.println();
         business();
      }
      transaction.add(new Transaction(this.getPath(), format_time1 , format_time2 , this.getDate(),this.getTime(),this.getBusinessPrice(),Member.balance));
      
      Member.reservation(this.getBusinessPrice());

   }

   @Override
   public void economy() {
      int i = 0;
      System.out.println("Medium 비행기");
      System.out.println("이코노미석");
      for (int j = 0; j < mediumSeat2[0].length; j++) {

         i += 1;
         System.out.print("  " + i);

         if (j == 2) {
            System.out.print("  ");
            continue;
         }

      }
      System.out.println();
      for (int k = 0; k < mediumSeat2.length; k++) {
         System.out.print((char) ('A' + k) + " ");
         for (int l = 0; l < mediumSeat2[0].length; l++) {
            if (mediumSeat2[k][l] != "X") {
               mediumSeat2[k][l] = "O";
            }
            if (l % 3 == 0 && l != 0) {
               System.out.print("  ");
            }
            System.out.print(mediumSeat2[k][l] + "  ");

         }
         System.out.println();
      }

      try {
         System.out.println("행을 입력하세요(A~Q)");
         char c = scanner.next().charAt(0);
         int column = ((int) c) - 65;

         System.out.println("열을 입력하세요(1~4)");
         int row = scanner.nextInt();
         switch (mediumSeat2[column][row - 1]) {
         case "X":
            System.out.println();
            System.out.println("이미 예약된 좌석입니다.");
            return;
            default:
            mediumSeat2[column][row - 1] = "X";
            System.out.println("예약이 완료되었습니다.");
            break;
         }
         System.out.println("Medium 비행기");
         System.out.println("이코노미석");
         for (int j = 0; j < mediumSeat2[0].length; j++) {
            if (i == 6) {
               i = 0;
            }
            i += 1;
            System.out.print("  " + i);
            if (j == 2) {
               System.out.print("  ");
               continue;
            }
         }
         System.out.println();
         for (int k = 0; k < mediumSeat2.length; k++) {
            System.out.print((char) ('A' + k) + " ");
            for (int l = 0; l < mediumSeat2[0].length; l++) {
               if (mediumSeat2[k][l] != "X") {
                  mediumSeat2[k][l] = "O";
               }
               if (l == 3) {
                  System.out.print("  ");
               }
               System.out.print(mediumSeat2[k][l] + "  ");

            }
            System.out.println();
         }

      } catch (Exception e) {
         System.out.println();
         System.out.println("좌석의 범위가 아닙니다.");
         System.out.println();
         economy();
      }
      transaction.add(new Transaction(this.getPath(), format_time1 , format_time2 , this.getDate(),this.getTime(),this.getEconomyPrice(),Member.balance));
      Member.reservation(this.getEconomyPrice());

   }

}