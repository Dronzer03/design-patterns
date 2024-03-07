public class RoomPriceVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom room) {
        room.roomPrice = 1000;
        System.out.println("Room Price - " + room.roomPrice);
    }

    @Override
    public void visit(SuiteRoom room) {
        room.roomPrice = 5000;
        System.out.println("Room Price - " + room.roomPrice);
    }
}
