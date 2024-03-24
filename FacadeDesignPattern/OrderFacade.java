class OrderFacade {
  OrderProduct pr;
  Invoice in;
  Notification not;

  OrderFacade() {
    pr = new OrderProduct();
    in = new Invoice();
    not = new Notification();
  }

  public void proceedToOrder() {
    pr.get();
    in.create();
    not.notifyUser();
  }
}