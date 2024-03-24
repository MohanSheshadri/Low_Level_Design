class PercentageCouponDecorator extends CouponDecorator {
  ProductOrder product;
  double percentage;

  PercentageCouponDecorator(ProductOrder product, double percentage) {
    this.product = product;
    this.percentage = percentage;
    System.out.println(product.name + "  " + product.type);
    System.out.println(this.product.name + "  " + this.product.type);
  }

  public double getPrice() {
    double p = product.getPrice();
    return p - (p * percentage) / 100;
  }
}