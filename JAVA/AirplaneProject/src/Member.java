import java.io.Serializable;

public class Member implements Serializable{
   private String name;
   private String phoneNum;
   private String cardInfo;
   private String passportNum;
   private String pwd;
   public static long balance;
   
   
   Member(String name, String phoneNum, String cardInfo, String passportNum, String pwd,long balance){
      this.name = name;
      this.pwd = pwd;
      this.phoneNum = phoneNum;
      this.cardInfo = cardInfo;
      this.passportNum = passportNum;
      this.balance = balance;
   }
   public static void reservation(long amount) {
      balance -= amount;
      System.out.println("³²Àº ÀÜ¾× : " + balance);
   }
   
   public String getPwd() {
      return pwd;
   }
   public String getName() {
      return name;
   }

}