class Product implements ProductSystem {
  String name;

  Product(String name) {
    this.name = name;
  }

  public void ls() {
    System.out.println("Product Name  " + name);
  }

}