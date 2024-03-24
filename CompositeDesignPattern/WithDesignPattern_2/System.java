import java.util.*;

class System1 implements ProductSystem {
  String name;
  List<ProductSystem> productSystems;

  System1(String name) {
    this.name = name;
    productSystems = new ArrayList();

  }

  public void add(ProductSystem productSys) {
    productSystems.add(productSys);
  }

  public void ls() {
    System.out.println("System Name " + name);
    for (ProductSystem productSystem : productSystems) {
      productSystem.ls();
    }
  }
}