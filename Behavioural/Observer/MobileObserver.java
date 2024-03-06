public class MobileObserver implements Observer{
    String mobileNumber;
    Subject observable;
    MobileObserver(String mobileNumber, Subject observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("State change for current subject notified via Mobile Number - " + mobileNumber);
    }
}
