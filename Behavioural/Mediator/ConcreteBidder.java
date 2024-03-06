public class ConcreteBidder implements Bidder{
    String name;

    ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void placeBid(int bidAmount) {
        System.out.println("Bid placed : " + bidAmount);
    }

    @Override
    public void getBidNotification(int bidAmount) {
        System.out.println(name + " received a bid notification of : "+ bidAmount);
    }

    public String getName() {
        return name;
    }
}
