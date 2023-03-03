public class TimeV2 {
    
    int seconds;
    
    
    
    public TimeV2(int hoursPassed,int minutesPassed,int secondsPassed){
        seconds += secondsPassed;
        seconds+=minutesPassed*60;
        seconds+=hoursPassed*3600;

    }

    public int getHours(){
        return(seconds/3600);
    }
    public int getMinutes(){
        return((seconds-(getHours()*3600))/60);
    }
    public int getSeconds(){
        return (seconds-(getHours()*3600)-getMinutes()*60);
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
