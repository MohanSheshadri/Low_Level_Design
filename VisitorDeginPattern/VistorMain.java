//this design pattern  is used when object and operations can be sepaerated out for example hotelRoom can have operations of reservation, roombooking, maintanance but will tend to restest when their is a new operation of becomes largesr when operations increase

// this design pattern helps in double dispatch i.e if i have one interface and base on object creation if method is triggered then its a single dispatch if final method is triggered base on two objects its double dispath , here room is calling accept hence which room is decide under object creation and under accpet method the argument passed to that method decides which method to be called

class VisitorMain {

  public void main() {
    Room singleR = new SingleRoom();
    Room doubleR = new DoubleRoom();
    Room deluxeR = new DeluxeRoom();
    Visitor price = new PriceVisitor();
    singleR.accept(price);
    doubleR.accept(price);
    Visitor maint = new MaintainanceVisitor();
    doubleR.accept(maint);
  }
}