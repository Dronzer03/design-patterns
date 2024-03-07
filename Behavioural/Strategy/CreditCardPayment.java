public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by Credit Card. Amount - " + amount);
    }
}
