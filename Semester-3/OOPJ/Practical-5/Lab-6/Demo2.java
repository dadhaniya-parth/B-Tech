// 2. Define Time class with constructor to initialize hour and minute. Also define addition method to add two time objects. [A]

class Time{
    int hr,min;

    Time(){
        this.hr=9;
        this.min=45;
    }
    Time(int hr,int min){
        this.hr=hr;
        this.min=min;
    }

    void displayTime(){
        System.out.println(this.hr+" hr:"+this.min+" min");
    }

    static void addTime(Time t1,Time t2){
        int totalhrs = t1.hr+t2.hr;
        int totalmin = t1.min+t2.min;
        System.out.println("Total = "+totalhrs+" hr:"+totalmin+" min");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Time t1  = new Time();
        Time t2  = new Time(2,10);

        t1.displayTime();
        t2.displayTime();

        Time.addTime(t1,t2);
    }
}

