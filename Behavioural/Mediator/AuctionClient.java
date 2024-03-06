public class AuctionClient {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();

        ConcreteBidder bidder1 = new ConcreteBidder("A");
        ConcreteBidder bidder2 = new ConcreteBidder("B");
        ConcreteBidder bidder3 = new ConcreteBidder("C");
        ConcreteBidder bidder4 = new ConcreteBidder("D");

        auctionMediator.addBidder(bidder1);
        auctionMediator.addBidder(bidder2);
        auctionMediator.addBidder(bidder3);
        auctionMediator.addBidder(bidder4);

        auctionMediator.placeBid(bidder1, 100);
        auctionMediator.placeBid(bidder2, 200);
    }
}
