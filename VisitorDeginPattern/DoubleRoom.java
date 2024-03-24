class DoubleRoom implements Room {
  int price = 0;

  public void accept(Visitor vistor) {
    vistor.visit(this);
  }

}