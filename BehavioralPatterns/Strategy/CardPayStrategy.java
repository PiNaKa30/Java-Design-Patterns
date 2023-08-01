package BehavioralPatterns.Strategy;

public class CardPayStrategy implements PayStrategy{

    @Override
    public void collectPaymentInfo() {
        System.out.println("Collecting Card related info here");
    }

    @Override
    public boolean makePayment() {
        System.out.println("Pay via Card successful");
        return true;
    }

}
