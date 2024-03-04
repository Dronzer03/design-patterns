import java.util.HashSet;
import java.util.Set;

public class OfficeNetworkProxy implements NetworkInterface{
    private Internet internet = new Internet();
    Set<String> restrictedUrl = new HashSet<>();

    public OfficeNetworkProxy() {
        restrictedUrl.add("instagram");
        restrictedUrl.add("you_know_which_ones");
    }

    @Override
    public void getResults(String url) {
        if (restrictedUrl.contains(url)) {
            System.out.println("Access Denied!!");
        } else {
            internet.getResults(url);
        }
    }
}
