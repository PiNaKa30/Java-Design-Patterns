package CreationalPatterns.AbstractFactory;

public class Application {

    private Button button;
    private Dialog dialog;

    Application(ScreenFactory screenFactory){
        button = screenFactory.createButton();
        dialog = screenFactory.createDialog();
    }

    public void start() {
        dialog.show();
        button.click();
    }

}
