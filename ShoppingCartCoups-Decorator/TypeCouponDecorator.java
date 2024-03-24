import java.util.*;

public class TypeCouponDecorator extends CouponDecorator {
  static List<ProductType_ENUM> eligibleTypes = new ArrayList();
  static {
    eligibleTypes.add(ProductType_ENUM.JEWELLERY);
    eligibleTypes.add(ProductType_ENUM.GADJETS);
  };
  ProductOrder product;
  double percentage;
  ProductType_ENUM type;

  TypeCouponDecorator(ProductOrder product, double percentage, ProductType_ENUM type) {
    this.product = product;
    this.percentage = percentage;
    this.type = type;
    System.out.println(product.name + " " + product.type + type);
  }

  public double getPrice() {
    double p = product.getPrice();
    if (eligibleTypes.contains(this.type)) {
      return p - (p * percentage) / 100;

    }
    return p;
  }

}