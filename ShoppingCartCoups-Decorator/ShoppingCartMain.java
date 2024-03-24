//Here We have list of products and some products are eligible for diffrent sort of coupouns and implementation using Decorator pattern because coupon can be decorated to any hirearchy of product

class ShoppingCartMain {
  public void main() {
    ProductOrder fridge = new ProductOrder("Refridgerator", 10000, ProductType_ENUM.ELECTRONICS);
    System.out.println(fridge.name);

    ProductOrder sofa = new ProductOrder("Sofa", 15000, ProductType_ENUM.GADJETS);
    ProductOrder p11 = new PercentageCouponDecorator(fridge, 10);
    System.out.println(p11.name + p11.type);
    ProductOrder p = new TypeCouponDecorator(new PercentageCouponDecorator(fridge, 10), 5, fridge.type);
    ProductOrder o = new TypeCouponDecorator(new PercentageCouponDecorator(sofa, 10), 5, sofa.type);
    double pri1 = p.getPrice();
    double pri2 = o.getPrice();
    System.out.println(pri1);
    System.out.println(pri2);
  }
}