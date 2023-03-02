public class TimeV1 {

    int hours;
    int minutes;
    int seconds;

    public TimeV1(int hoursPassed,int minutesPassed,int secondsPassed){
        hours = hoursPassed;
        minutes = minutesPassed;
        seconds = secondsPassed;
    }



    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }


    public String toString(){
        String result = "";
        int newHours;
        if(getHours()>=12){
            newHours = getHours()-12;
        }else{
            newHours=getHours();
        }
        if(newHours<10){
            result+=0;
        }
        result+=newHours+":";
        if(getMinutes()<10){
            result+="0";
        }
        result+=getMinutes()+":";
        if(getSeconds()<10){
            result+=0;
        }
        result+=getSeconds();
        return result;
    }








    public static void main(String[] args) {
        TimeV1 time1 = new TimeV1(24,4,15);
        System.out.println(time1);
        TimeV1 time2 = new TimeV1(4,54,7);
        System.out.println(time2);
        
        
    }
}
