import java.io.Serializable;
import java.util.Scanner;

public class Airplane_Large extends Airplane implements Serializable {
   Scanner scanner = new Scanner(System.in);
   String[][] largeSeat = new String[3][9];
   String[][] largeSeat2 = new String[17][9];
   
   
   
   public Airplane_Large(int businessPrice, int economyPrice, String date, String time, String path) {
      super(businessPrice, economyPrice, date, time, path);
   }

   @Override
   public void business() {

      int i = 0;
      System.out.println("Large 비행기");
      System.out.println("비지니스석");
      for (int j = 0; j < largeSeat[0].length; j++) {
         i += 1;
         System.out.print("  " + i);
         if (j == 2 || j == 5) {
            System.out.print("  ");
            continue;
         }
      }
      System.out.println();
      for (int k = 0; k < largeSeat.length; k++) {
         System.out.print((char) ('A' + k) + " ");
         for (int l = 0; l < largeSeat[0].length; l++) {
            if (largeSeat[k][l] != "X") {
               largeSeat[k][l] = "O";
            }
            if (l == 3 || l == 6) {
               System.out.print("  ");
            }
            System.out.print(largeSeat[k][l] + "  ");

         }
         System.out.println();
      }

      try {
         System.out.println("행을 입력하세요(A~C)");
         char c = scanner.next().charAt(0);
         int column = ((int) c) - 65;

         System.out.println("열을 입력하세요(1~9)");
         int row = scanner.nextInt();
         switch (largeSeat[column][row - 1]) {
         case "X":
            System.out.println();
            System.out.println("이미 예약된 좌석입니다.");
            return;
         default:
            largeSeat[column][row - 1] = "X";
            System.out.println("예약이 완료되었습니다.");
            break;
         }
         System.out.println("Large 비행기");
         System.out.println("비지니스석");
         for (int j = 0; j < largeSeat[0].length; j++) {
            if (i == 9) {
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
         for (int k = 0; k < largeSeat.length; k++) {
            System.out.print((char) ('A' + k) + " ");
            for (int l = 0; l < largeSeat[0].length; l++) {
               if (largeSeat[k][l] != "X") {
                  largeSeat[k][l] = "O";
               }
               if (l == 3 || l == 6) {
                  System.out.print("  ");
               }
               System.out.print(largeSeat[k][l] + "  ");

            }
            System.out.println();
         }

      } catch (Exception e) {
         System.out.println();
         System.out.println("좌석의 범위가 아닙니다.");
         System.out.println();
         business();
      }

      transaction.add(new Transaction(this.getPath(), this.format_time1, this.format_time2 , this.getDate(),this.getTime(),this.getBusinessPrice(),Member.balance));
      
      Member.reservation(this.getBusinessPrice());
   }
   
   @Override // 이코노미 좌석
   public void economy() {
      int i = 0;
      System.out.println("Large 비행기");
      System.out.println("이코노미석");
      for (int j = 0; j < largeSeat2[0].length; j++) {
         i += 1;
         System.out.print("  " + i);
         if (j == 2 || j == 5) {
            System.out.print("  ");
            continue;
         }
      }
      System.out.println();
      for (int k = 0; k < largeSeat2.length; k++) {
         System.out.print((char) ('A' + k) + " ");
         for (int l = 0; l < largeSeat2[0].length; l++) {
            if (largeSeat2[k][l] != "X") {
               largeSeat2[k][l] = "O";
            }
            if (l == 3 || l == 6) {
               System.out.print("  ");
            }
            System.out.print(largeSeat2[k][l] + "  ");

         }
         System.out.println();
      }
      


         try {
            System.out.println("행을 입력하세요(A~Q)");
            char c = scanner.next().charAt(0);
            int column = ((int) c) - 65;

            System.out.println("열을 입력하세요(1~4)");
            int row = scanner.nextInt();
            switch (largeSeat2[column][row - 1]) {
            case "X":
               System.out.println();
               System.out.println("이미 예약된 좌석입니다.");
               return;
            default:
               largeSeat2[column][row - 1] = "X";
               System.out.println("예약이 완료되었습니다.");
               break;
            }
            System.out.println("Large 비행기");
            System.out.println("이코노미석");
            for (int j = 0; j < largeSeat2[0].length; j++) {
               if (i == 9) {
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
            for (int k = 0; k < largeSeat2.length; k++) {
               System.out.print((char) ('A' + k) + " ");
               for (int l = 0; l < largeSeat2[0].length; l++) {
                  if (largeSeat2[k][l] != "X") {
                     largeSeat2[k][l] = "O";
                  }
                  if (l == 3 || l == 6) {
                     System.out.print("  ");
                  }
                  System.out.print(largeSeat2[k][l] + "  ");

               }
               System.out.println();
            }

         } catch (Exception e) {
            System.out.println();
            System.out.println("좌석의 범위가 아닙니다.");
            System.out.println();
            economy();
         }
         
         transaction.add(new Transaction(this.getPath(), this.format_time1 , this.format_time2 , this.getDate(),this.getTime(),this.getEconomyPrice(),Member.balance));
         Member.reservation(this.getEconomyPrice());
      }
}