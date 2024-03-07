public class TemplateClient {
    public static void main(String[] args) {
        BeverageTemplate tea = new TeaBeverage();
        BeverageTemplate coffee = new CoffeeBeverage();

        tea.prepareBeverage();
        System.out.println();
        coffee.prepareBeverage();
    }
}
