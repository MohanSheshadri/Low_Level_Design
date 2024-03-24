public class MaintainanceVisitor implements Visitor {

  public void visit(SingleRoom room) {
    // Maintance logic here
    System.out.println("Single room Maintained");
  }

  public void visit(DoubleRoom room) {
    System.out.println("Double room Maintained");
  }

  public void visit(DeluxeRoom room) {
    System.out.println("Deluxe room Maintained");
  }

}