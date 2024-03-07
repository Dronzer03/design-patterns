public class VisitorClient {
    public static void main(String[] args) {
        Room singleRoom = new SingleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomVisitor priceVisitor = new RoomPriceVisitor();
        RoomVisitor checkInVisitor = new CheckInVisitor();

        singleRoom.accept(priceVisitor);
        suiteRoom.accept(priceVisitor);

        System.out.println();

        singleRoom.accept(checkInVisitor);
        suiteRoom.accept(checkInVisitor);
    }
}
