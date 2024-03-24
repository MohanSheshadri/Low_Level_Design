class IRobot implements Robot {

  // attributes has to be immutable hence assign values at creation and create
  // only getters
  private String type;
  private Sprites sprites;

  private int xCoordinate;
  private int yCoordinate;

  public void display(int xCoordinate, int yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  IRobot(String type, Sprites sprites) {
    this.type = type;
    this.sprites = sprites;
  }

  public String getType() {
    return this.type;
  }

  public Sprites getSprites() {
    return this.sprites;
  }
}