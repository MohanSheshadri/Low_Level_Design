class Bidder implements BidPanel {
  String id;
  BidMediator bidMediator;

  Bidder(String id, BidMediator bidMediator) {
    this.id = id;
    this.bidMediator = bidMediator;
  }

  public String getId() {
    return this.id;
  }

  public void recieveBidUpdates(int amount) {
    System.out.println("Id " + this.id + " " + amount);
  }

}