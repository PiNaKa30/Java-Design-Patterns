package BehavioralPatterns.Command;

public class Driver {

    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();
        Remote remote = new Remote();

        Command command = new LightOnCommand(light);
        remote.setCommand(command);
        remote.pressButton();

        command = new LightOffCommand(light);
        remote.setCommand(command);
        remote.pressButton();

        command = new FanOnCommand(fan);
        remote.setCommand(command);
        remote.pressButton();

        command = new FanOffCommand(fan);
        remote.setCommand(command);
        remote.pressButton();

    }

}
