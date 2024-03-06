import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{
    List<Bidder> bidders = new ArrayList<>();

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(ConcreteBidder bidder, int amount) {
        System.out.println(bidder.getName() + " placed a bid of " + amount);
        for (Bidder participant : bidders) {
            if (participant != bidder) {
                participant.getBidNotification(amount);
            }
        }
    }
}
