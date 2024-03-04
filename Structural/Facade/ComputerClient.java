public class ComputerClient {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        computerFacade.shutDown();
    }
}
