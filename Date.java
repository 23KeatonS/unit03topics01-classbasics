public class Date {
    
    
    private int month;
    private int day;
    private int year;

    public Date(int month1, int day1, int year1){
        month = month1;
        day = day1;
        year = year1;
    }

    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        String result = "";
        if(getMonth()<10){
            result+=0;
        }
        result+=getMonth()+"/";
        if(getDay()<10){
            result+=0;
        }
        result+=getDay()+"/";
        if(getYear()<1000){
            result+=0;
        }
        if(getYear()<100){
            result+=0;
        }
        if(getYear()<10){
            result+=0;
        }
        result+=getYear();
        return result;
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Date date1 = new Date(3,1,2023);
        System.out.println(date1);
        Date date2 = new Date(10,23,2022);
        System.out.println(date2);
        Date date3 = new Date(11,2,2021);
        System.out.println(date3);
        Date date4 = new Date(12,3,5);
        System.out.println(date4);
    }
}