public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String userName, String password) {
        if (handler.handle(userName, password)) {
            System.out.println("Authorization Successful!");
            return true;
        }
        return false;
    }
}
