public class SingletonEnumClient {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.SINGLETON;
        singletonEnum.useSingletonObject();
    }
}
