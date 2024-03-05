public class PasswordHandler extends Handler {
    Database database;

    PasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String userName, String password) {
        if (database.isPasswordCorrect(userName, password)) {
            System.out.println("User Authenticated!");
        } else {
            System.out.println("Invalid Password");
            return false;
        }
        return handleNext(userName, password);
    }
}
