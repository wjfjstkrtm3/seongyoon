import java.io.Serializable;
import java.util.Scanner;

public class Airplane_Small extends Airplane implements Serializable {

   Scanner scanner = new Scanner(System.in);
   String[][] smallSeat = new String[3][4];
   String[][] smallSeat2 = new String[17][4];

   public Airplane_Small(int businessPrice, int economyPrice, String date, String time, String path) {
      super(businessPrice, economyPrice, date, time, path);
   }

   @Override
   public void business() {

      int i = 0;
      System.out.println("Small �����");
      System.out.println("�����Ͻ���");
      for (int j = 0; j < smallSeat[0].length; j++) {
         i += 1;
         System.out.print("  " + i);
         if (j == 1) {
            System.out.print("  ");
            continue;
         }
      }
      System.out.println();
      for (int k = 0; k < smallSeat.length; k++) {
         System.out.print((char) ('A' + k) + " ");
         for (int l = 0; l < smallSeat[0].length; l++) {
            if (smallSeat[k][l] != "X") {
               smallSeat[k][l] = "O";
            }
            if (l == 2) {
               System.out.print("  ");
            }
            System.out.print(smallSeat[k][l] + "  ");

         }
         System.out.println();
      }

      try {
         System.out.println("���� �Է��ϼ���(A~C)");
         char c = scanner.next().charAt(0);
         int column = ((int) c) - 65;

         System.out.println("���� �Է��ϼ���(1~4)");
         int row = scanner.nextInt();
         switch (smallSeat[column][row - 1]) {
         case "X":
            System.out.println();
            System.out.println("�̹� ����� �¼��Դϴ�.");
            return;
         default:
            smallSeat[column][row - 1] = "X";
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            break;
         }
         System.out.println("Small �����");
         System.out.println("�����Ͻ���");
         for (int j = 0; j < smallSeat[0].length; j++) {
            if (i == 4) {
               i = 0;
            }
            i += 1;
            System.out.print("  " + i);
            if (j == 1) {
               System.out.print("  ");
               continue;
            }
         }
         System.out.println();
         for (int k = 0; k < smallSeat.length; k++) {
            System.out.print((char) ('A' + k) + " ");
            for (int l = 0; l < smallSeat[0].length; l++) {
               if (smallSeat[k][l] != "X") {
                  smallSeat[k][l] = "O";
               }
               if (l == 2) {
                  System.out.print("  ");
               }
               System.out.print(smallSeat[k][l] + "  ");

            }
            System.out.println();
         }

      } catch (Exception e) {
         System.out.println();
         System.out.println("�¼��� ������ �ƴմϴ�.");
         System.out.println();
         business();
      }
      transaction.add(new Transaction(this.getPath(), format_time1 , format_time2 , this.getDate(),this.getTime(),this.getBusinessPrice(),Member.balance));      
      Member.reservation(this.getBusinessPrice());

   }

   @Override
   public void economy() {
      int i = 0;
      System.out.println("Small �����");
      System.out.println("���ڳ�̼�");
      for (int j = 0; j < smallSeat[0].length; j++) {
         i += 1;
         System.out.print("  " + i);
         if (j == 1) {
            System.out.print("  ");
            continue;
         }
      }
      System.out.println();
      for (int k = 0; k < smallSeat2.length; k++) {
         System.out.print((char) ('A' + k) + " ");
         for (int l = 0; l < smallSeat2[0].length; l++) {
            if (smallSeat2[k][l] != "X") {
               smallSeat2[k][l] = "O";
            }
            if (l == 2) {
               System.out.print("  ");
            }
            System.out.print(smallSeat2[k][l] + "  ");

         }
         System.out.println();
      }

      try {
         System.out.println("���� �Է��ϼ���(A~Q)");
         char c = scanner.next().charAt(0);
         int column = ((int) c) - 65;

         System.out.println("���� �Է��ϼ���(1~4)");
         int row = scanner.nextInt();
         switch (smallSeat2[column][row - 1]) {
         case "X":
            System.out.println();
            System.out.println("�̹� ����� �¼��Դϴ�.");
            return;
         default:
            smallSeat2[column][row - 1] = "X";
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            break;
         }
         System.out.println("Small �����");
         System.out.println("���ڳ�̼�");
         for (int j = 0; j < smallSeat2[0].length; j++) {
            if (i == 4) {
               i = 0;
            }
            i += 1;
            System.out.print("  " + i);
            if (j == 1) {
               System.out.print("  ");
               continue;
            }
         }
         System.out.println();
         for (int k = 0; k < smallSeat2.length; k++) {
            System.out.print((char) ('A' + k) + " ");
            for (int l = 0; l < smallSeat2[0].length; l++) {
               if (smallSeat2[k][l] != "X") {
                  smallSeat2[k][l] = "O";
               }
               if (l == 2) {
                  System.out.print("  ");
               }
               System.out.print(smallSeat2[k][l] + "  ");

            }
            System.out.println();
         }

      } catch (Exception e) {
         System.out.println();
         System.out.println("�¼��� ������ �ƴմϴ�.");
         System.out.println();
         economy();
      }
      transaction.add(new Transaction(this.getPath(), format_time1 , format_time2 , this.getDate(),this.getTime(),this.getEconomyPrice(),Member.balance));
      Member.reservation(this.getEconomyPrice());

   }
}