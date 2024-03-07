public class SuiteRoom implements Room {
    public int roomPrice = 0;
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
