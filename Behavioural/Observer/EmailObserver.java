public class EmailObserver implements Observer{
    String emailId;
    Subject observable;

    EmailObserver(String emailId, Subject observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("State change for current subject notified via Email - " + emailId);
    }
}
