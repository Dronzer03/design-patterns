public class DebitCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment done using Debit Card. Amount - " + amount);
    }
}
