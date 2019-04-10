import java.util.Scanner; 
public class Calendar2 {
    static int year;
    static int month;
    static String[] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static String[] daysAbrv={"일\t", "월\t", "화\t", "수\t", "목\t", " 금\t", " 토\t"}; 
    static void input(){
        Scanner sc=new Scanner(System.in);
        while(true) {
           System.out.println("예매할 날짜의 년도를 입력하세요.");
           year=sc.nextInt();
           if(! (year>=2019)) System.out.println("올바르지 않은 값입니다.");
           else break;
        }
        while(true) {
           System.out.println("예매할 날짜의 월을 입력하세요.");
           month=sc.nextInt();
           if(!(month >=1 && month<=12)) System.out.println("1~12월 중 한개를 입력해주세요.");
           else break;
        }
    }
    static void output(int y, int m){
        printTitle();
        printBody(y, m); 
        System.out.println();
    }
    static void printTitle(){
        for(int i=0;i<6;i++){
            System.out.printf(daysAbrv[i]+" ");
        }
        System.out.println(daysAbrv[6]);
    }
    static void printBody(int year, int month){
        int startday=startDay(year, month)+1;
        if(startday==7) {
            startday = 0;
        } 
        for(int i=0;i<startday;i++){  //공백 맞추고
            System.out.printf(" \t  ");
        }
        for(int i=1;i<totalDaysInMonth(year, month);i++){
            if((i-(7-startday))%7==0){
                System.out.printf("%2d\t\n",i);
            }else{
                System.out.printf("%2d\t  ",i);
            }
        }
        System.out.printf("%2d",totalDaysInMonth(year,month));
    }
    static int startDay(int year, int month){
        return totalDateDifference(year, month)%7;
    }
    static int totalDateDifference(int year, int month){
        int stdYear=1500;
        int stdMonth=1;
        int dateDif=0;

        for(int i=stdYear;i<year;i++){
            if(isLeapYear(i)){
                dateDif+=366;
            }else{
                dateDif+=365;
            }
        }
        for(int i=stdMonth;i<month;i++){  //구하고자 하는 해에 갔을 때
            dateDif+=totalDaysInMonth(year, i);
        }
        return dateDif;
    }
    static int totalDaysInMonth(int year, int month){
        int tD=0;
        if(month==2){   //2월
            if(isLeapYear(year)){
                tD=29;
            }else{
                tD=28;
            }
        }else if(isFullMonth(month)){  //1,3,5,7,8,10.12
            tD=31;
        }else{  //4,6,9,11
            tD=30;
        }
        return tD;
    }
    static boolean isFullMonth(int month){
        if(month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12){
            return true;
        }else {
            return false;
        }
    }
    static boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }else {
            return false;
        }
    }
}