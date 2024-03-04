public class NetworkClient {
    public static void main(String[] args) {
        NetworkInterface officeNetwork = new OfficeNetworkProxy();
        officeNetwork.getResults("instagram");
        officeNetwork.getResults("dronzer-github.com");
    }
}
