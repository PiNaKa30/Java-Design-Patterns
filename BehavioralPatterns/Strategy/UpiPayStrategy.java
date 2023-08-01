package BehavioralPatterns.Strategy;

public class UpiPayStrategy implements PayStrategy{

    @Override
    public void collectPaymentInfo() {
        System.out.println("Collecting UPI related info here");
    }

    @Override
    public boolean makePayment() {
        System.out.println("Pay via UPI successful");
        return true;
    }

}
