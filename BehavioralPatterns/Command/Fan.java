package BehavioralPatterns.Command;

public class Fan {

    public void on(){
        System.out.println("Fan is ON");
    }

    public void off(){
        System.out.println("Fan is OFF");
    }

    public void setSpeed(int speed){
        System.out.println("Fan speed set to: " + speed);
    }

}
