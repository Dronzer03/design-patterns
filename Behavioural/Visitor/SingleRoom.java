public class SingleRoom implements Room {
    public int roomPrice = 0;
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
