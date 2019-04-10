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
      if(path.equals("도쿄")) {
         path = "인천-도쿄";
      }
      if(path.equals("런던")) {
         path = "인천-런던";
      }
      if(path.equals("파리")) {
         path = "인천-파리";
      }
      if(path.equals("토론토")) {
         path = "인천-토론토";
      }
      if(path.equals("토론토에서")) {
         path = "토론토-인천";
      }
      if(path.equals("파리에서")) {
         path = "파리-인천";
      }
      if(path.equals("도쿄에서")) {
         path = "도쿄-인천";
      }
      if(path.equals("런던에서")) {
         path = "런던-인천";
      }
      return "Airplane [path= " +path + ", date=" + date + ", time=" + time + ", businessPrice=" + businessPrice + ", economyPrice="
            + economyPrice + "]";
   }
   
   
}