//FactoryDesignPatter

class VehicleFactory{

  public static Vehicle getVehicle(String type){
    if(type=="Car"){
      return new Car();
    }
    return new NullVehicle();
  }
}