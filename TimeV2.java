public class TimeV2 {
    
    int seconds;
    
    
    
    public TimeV2(int secondsPassed){
        seconds = secondsPassed;
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
        TimeV2 time1 = new TimeV2(86655);
        System.out.println(time1);
        TimeV2 time2 = new TimeV2(17647);
        System.out.println(time2);
        
    
    }
}
