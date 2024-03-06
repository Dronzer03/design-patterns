public interface Mediator {
    void addBidder(Bidder bidder);
    void placeBid(ConcreteBidder bidder, int amount);
}
