public class TimeV1 {

    int hours;
    int minutes;
    int seconds;

    public TimeV1(int hoursPassed,int minutesPassed,int secondsPassed){
        hours = hoursPassed;
        minutes = minutesPassed;
        seconds = secondsPassed;
    }


    public String toString(){
        String result = "";
        int newHours;
        if(hours>=12){
            newHours = hours-12;
        }else{
            newHours=hours;
        }
        if(newHours<10){
            result+=0;
        }
        result+=newHours+":";
        if(minutes<10){
            result+="0";
        }
        result+=minutes+":";
        if(seconds<10){
            result+=0;
        }
        result+=seconds;
        return result;
    }








    public static void main(String[] args) {
        TimeV1 time1 = new TimeV1(24,4,15);
        System.out.println(time1);
        TimeV1 time2 = new TimeV1(4,54,7);
        System.out.println(time2);
    }
}
