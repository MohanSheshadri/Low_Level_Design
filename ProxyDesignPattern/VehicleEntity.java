class VehicleEntity implements Proxy {

  private Integer id;
  private String type;
  private String engine;
  private Long wheels;

  public Proxy clone() {
    return this;
  }

}