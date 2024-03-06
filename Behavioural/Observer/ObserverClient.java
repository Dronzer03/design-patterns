public class ObserverClient {
    public static void main(String[] args) {
        Subject iphoneXs = new IphoneXs();

        Observer mobile = new MobileObserver("123", iphoneXs);
        Observer email = new EmailObserver("mailId", iphoneXs);

        iphoneXs.addObserver(mobile);
        iphoneXs.addObserver(email);

        iphoneXs.setState(false);
        iphoneXs.setState(true);
    }
}
