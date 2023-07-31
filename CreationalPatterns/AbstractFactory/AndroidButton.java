package CreationalPatterns.AbstractFactory;

public class AndroidButton implements Button{

    @Override
    public void click() {
        System.out.println("Android button clicked");
    }

}
