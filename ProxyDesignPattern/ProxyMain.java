class ProxyMain {
  public void main() {
    VehicleEntity veh1 = new VehicleEntity();
    VehicleEntity veh2 = (VehicleEntity) veh1.clone();
    VehicleEntity veh3 = new VehicleEntity();
    System.out.println(veh1 == veh2);

    System.out.println(veh1 == veh3);
  }
}