public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    void setPaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void makePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
