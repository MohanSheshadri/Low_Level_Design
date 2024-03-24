public class PriceVisitor implements Visitor {

  public void visit(SingleRoom room) {
    // price logic here

    room.price = 1000;
    System.out.println("Single room price " + room.price);
  }

  public void visit(DoubleRoom room) {
    room.price = 2000;
    System.out.println("Double room price " + room.price);
  }

  public void visit(DeluxeRoom room) {
    room.price = 2500;
    System.out.println("Deluxe room price " + room.price);
  }

}