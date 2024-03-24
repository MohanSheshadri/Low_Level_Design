class NullRobotObject implements Robot {

  // attributes has to be immutable hence assign values at creation and create
  // only getters
  private String type = null;
  private Sprites sprites = new Sprites();

  private int xCoordinate;
  private int yCoordinate;

  public void display(int xCoordinate, int yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  NullRobotObject() {
  }

  public String getType() {
    return this.type;
  }

  public Sprites getSprites() {
    return this.sprites;
  }
}