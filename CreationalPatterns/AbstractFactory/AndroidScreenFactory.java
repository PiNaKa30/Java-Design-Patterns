package CreationalPatterns.AbstractFactory;

public class AndroidScreenFactory implements ScreenFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dialog createDialog() {
        return new AndroidDialog();
    }

}
