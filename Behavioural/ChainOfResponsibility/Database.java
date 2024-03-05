import java.util.HashMap;

public class Database {
    private HashMap<String, String> users = new HashMap<>();

    public Database() {
        users.put("user", "user");
        users.put("admin", "admin");
    }

    public boolean isValidUser(String userName) {
        if (users.containsKey(userName))
            return true;
        return false;
    }

    public boolean isPasswordCorrect(String userName, String password) {
        if (users.get(userName).equals(password))
            return true;
        return false;
    }
}
