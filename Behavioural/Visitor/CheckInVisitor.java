public class CheckInVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom room) {
        System.out.println("CheckedIn Single Room");
    }

    @Override
    public void visit(SuiteRoom room) {
        System.out.println("CheckedIn Suite Room");
    }
}
