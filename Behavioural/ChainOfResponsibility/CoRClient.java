public class CoRClient {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new PasswordHandler(database));
        AuthService authService = new AuthService(handler);
        authService.login("user", "user");
        System.out.println();
        authService.login("user", "notUser");
    }
}
