package BehavioralPatterns.Strategy;

public class Order {

    private PayStrategy payStrategy;

    public Order(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processOrder(int items, double itemPrice){
        System.out.println("Order total: " + (items * itemPrice));
        payStrategy.collectPaymentInfo();
    }

    public void completePayment(){
        if(payStrategy.makePayment())
            System.out.println("Order placed");
        else System.out.println("Order failed");
    }

}
