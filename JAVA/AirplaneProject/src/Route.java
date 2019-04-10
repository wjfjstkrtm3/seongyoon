import java.util.Scanner;
import java.util.regex.Pattern;

public class Route {

   public Airplane Incheon_Tokyo_Large(String date, String time) {
      
      return new Airplane_Large(500000,300000,date,time, "��õ-����");
   }

   public Airplane Incheon_Tokyo_Medium(String date , String time) {
      return new Airplane_Medium(400000, 200000,date, time,"��õ-����");
   }

   public Airplane Incheon_Tokyo_Small(String date , String time) {
      return new Airplane_Small(300000, 100000, date, time,"��õ-����");
   }

   public Airplane Incheon_Paris_Large(String date , String time) {
      return new Airplane_Large(1000000, 800000,date, time,"��õ-�ĸ�");
   }

   public Airplane Incheon_Paris_Medium(String date , String time) {
      return new Airplane_Medium(900000, 700000,date, time,"��õ-�ĸ�");
   }

   public Airplane Incheon_Paris_Small(String date , String time) {
      return new Airplane_Small(800000, 600000,date, time,"��õ-�ĸ�");
   }

   public Airplane Incheon_Toronto_Large(String date , String time) {
      return new Airplane_Large(1200000, 1000000,date, time,"��õ-�����");
   }

   public Airplane Incheon_Toronto_Medium(String date , String time) {
      return new Airplane_Medium(1100000, 900000,date, time,"��õ-�����");
   }

   public Airplane Incheon_Toronto_Small(String date , String time) {
      return new Airplane_Small(1000000, 800000,date, time,"��õ-�����");
   }

   public Airplane Incheon_London_Large(String date , String time) {
      return new Airplane_Large(1000000, 800000,date, time,"��õ-����");
   }

   public Airplane Incheon_London_Medium(String date , String time) {
      return new Airplane_Medium(900000, 700000,date, time,"����");
   }

   public Airplane Incheon_London_Small(String date , String time) {
      return new Airplane_Small(800000, 600000,date, time,"��õ-����");
   }

   public Airplane Tokyo_Incheon_Large(String date , String time) {
      return new Airplane_Large(500000, 300000,date, time,"����-��õ");
   }
   public Airplane Tokyo_Incheon_Medium(String date , String time) {
      return new Airplane_Medium(400000, 200000,date, time,"����-��õ");
   }

   public Airplane Tokyo_Incheon_Small(String date , String time) {
      return new Airplane_Small(300000, 100000,date, time,"����-��õ");
   }

   public Airplane Paris_Incheon_Large(String date , String time) {
      return new Airplane_Large(1000000, 800000,date, time,"�ĸ�-��õ");
   }

   public Airplane Paris_Incheon_Medium(String date , String time) {
      return new Airplane_Medium(900000, 700000,date, time,"�ĸ�-��õ");
   }

   public Airplane Paris_Incheon_Small(String date , String time) {
      return new Airplane_Small(800000, 600000,date, time,"�ĸ�-��õ");
   }

   public Airplane Toronto_Incheon_Large(String date , String time) {
      return new Airplane_Large(1200000, 1000000,date, time,"�����-��õ");
   }

   public Airplane Toronto_Incheon_Medium(String date , String time) {
      return new Airplane_Medium(1100000, 900000,date, time,"�����-��õ");
   }

   public Airplane Toronto_Incheon_Small(String date , String time) {
      return new Airplane_Small(1000000, 800000,date, time,"�����-��õ");
   }

   public Airplane London_Incheon_Large(String date , String time) {
      return new Airplane_Large(1000000, 800000,date, time,"����-��õ");
   }

   public Airplane London_Incheon_Medium(String date , String time) {
      return new Airplane_Medium(900000, 700000,date, time,"����-��õ");
   }

   public Airplane London_Incheon_Small(String date , String time) {
      return new Airplane_Small(800000, 600000,date, time,"����-��õ");
   }
}