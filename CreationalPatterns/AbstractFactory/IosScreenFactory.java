package CreationalPatterns.AbstractFactory;

public class IosScreenFactory implements ScreenFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dialog createDialog() {
        return new IosDialog();
    }

}
