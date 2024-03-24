class BidderMain {
  public void main() {
    BidMediator a = new Auction();
    BidPanel bid1 = new Bidder("A", a);
    BidPanel bid2 = new Bidder("B", a);
    a.addBidder(bid1);
    a.addBidder(bid2);
    
    a.addBid(bid1, 12);
    a.addBid(bid2, 14);
    a.addBid(bid1, 17);
  }
}