class ProductOrder {
  String name;
  double originalPrice;
  ProductType_ENUM type;

  ProductOrder() {
  }

  ProductOrder(String name, double originalPrice, ProductType_ENUM type) {
    this.name = name;
    this.originalPrice = originalPrice;
    this.type = type;
  }

  public double getPrice() {
    return originalPrice;
  }
}