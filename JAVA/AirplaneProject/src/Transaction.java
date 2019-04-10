public class Transaction {
   
   String routeinfo;   //노선정보필드
   String payDate ;
   String payTime ;
   String flightDate;
   String flightTime;
   
   long amount;
   long balance;
   
   public Transaction(String routeinfo, String payDate, String payTime, String flightDate, String flightTime, long amount, long balance) {   
      this.routeinfo = routeinfo; 
      this.payDate = payDate;
      this.payTime = payTime;
      this.flightDate = flightDate;
      this.flightTime = flightTime;
      this.amount = amount ;
      this.balance = balance;
   }   
}