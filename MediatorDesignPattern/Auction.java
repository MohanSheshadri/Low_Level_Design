import java.util.*;

class Auction implements BidMediator {
  List<BidPanel> bids;

  Auction() {
    bids = new ArrayList<>();
  }

  public void addBidder(BidPanel bidder) {
    bids.add(bidder);
  }

  public void addBid(BidPanel bid, int amount) {
    for (BidPanel bidd : bids) {
      if (!bidd.getId().equals(bid.getId())) {
        bidd.recieveBidUpdates(amount);
      }
    }
  }

}