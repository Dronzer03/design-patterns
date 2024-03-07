public class StrategyClient {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy debitCard = new DebitCardPayment();

        shoppingCart.setPaymentMethod(creditCard);
        shoppingCart.makePayment(999);

        shoppingCart.setPaymentMethod(debitCard);
        shoppingCart.makePayment(599);
    }
}
