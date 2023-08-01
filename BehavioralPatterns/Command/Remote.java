package BehavioralPatterns.Command;

public class Remote {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
