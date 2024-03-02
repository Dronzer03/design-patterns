public class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHolder {
        private static final BillPughSingleton singleton = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.singleton;
    }
}
