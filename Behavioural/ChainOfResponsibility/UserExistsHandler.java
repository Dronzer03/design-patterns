public class UserExistsHandler extends Handler{
    Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String userName, String password) {
        if (database.isValidUser(userName)) {
            System.out.println("Valid userName");
        } else {
            System.out.println("Invalid User!!!");
            return false;
        }
        return handleNext(userName, password);
    }
}
