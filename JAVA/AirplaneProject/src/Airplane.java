import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Airplane {
   private String date;
   private String time;
   private static long businessPrice;
   private static long economyPrice;
   private String path;
   public static List<Transaction> transaction = new ArrayList<Transaction>();
public static boolean getDate;
   private SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy/M/dd ");
   
   private SimpleDateFormat format2 = new SimpleDateFormat ( "HH:mm");
   protected String format_time1 = format1.format(System.currentTimeMillis());
   protected String format_time2 = format2.format(System.currentTimeMillis());
   
   public Airplane(long businessPrice, long economyPrice, String date, String time, String path) {
      this.businessPrice = businessPrice;
      this.economyPrice = economyPrice;
      this.date = date;
      this.time = time;
      this.path = path;
   }

   public String getPath() {
      return path;
   }
   
   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public String getTime() {
      return time;
   }

   public void setTime(String time) {
      this.time = time;
   }

   public long getBusinessPrice() {
      return businessPrice;
   }

   public static void setBusinessPrice(int businessPrice) {
      businessPrice = businessPrice;
   }

   public long getEconomyPrice() {
      return economyPrice;
   }

   public static void setEconomyPrice(int economyPrice) {
      economyPrice = economyPrice;
   }

   public abstract void business();
   public abstract void economy();
   @Override
   public String toString() {
      if(path.equals("����")) {
         path = "��õ-����";
      }
      if(path.equals("����")) {
         path = "��õ-����";
      }
      if(path.equals("�ĸ�")) {
         path = "��õ-�ĸ�";
      }
      if(path.equals("�����")) {
         path = "��õ-�����";
      }
      if(path.equals("����信��")) {
         path = "�����-��õ";
      }
      if(path.equals("�ĸ�����")) {
         path = "�ĸ�-��õ";
      }
      if(path.equals("���쿡��")) {
         path = "����-��õ";
      }
      if(path.equals("��������")) {
         path = "����-��õ";
      }
      return "Airplane [path= " +path + ", date=" + date + ", time=" + time + ", businessPrice=" + businessPrice + ", economyPrice="
            + economyPrice + "]";
   }
   
   
}