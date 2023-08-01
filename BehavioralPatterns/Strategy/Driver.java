package BehavioralPatterns.Strategy;

public class Driver {

    public static void main(String[] args) {

        String[] paymentMethods = {"UPI", "Card"};

        for(int i=0; i<paymentMethods.length; i++){

            int items = 5 * (i + 1);
            double itemPrice = 10.0 * (i + 1);

            PayStrategy payStrategy;

            if(paymentMethods[i].equals("UPI")){
                payStrategy = new UpiPayStrategy();
            } else {
                payStrategy = new CardPayStrategy();
            }

            Order order = new Order(payStrategy);
            order.processOrder(items, itemPrice);

            order.completePayment();
        }
    }

}
