package BehavioralPatterns.Command;

public class FanOnCommand implements Command{

    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
        fan.setSpeed(5);
    }

}
