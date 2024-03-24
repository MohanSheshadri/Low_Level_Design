class Robotic_1Main {
  // Requirement is to create 500000 Robots of HUMANOID type and ROBOTIC_DOG types
  // solution will be too expensive to create 1000000objects as heap size, memeory
  // everyt6hing will be affected

  // Hence in FlyWeightDesign Pattern
  // If Objects has a intinstic data : has a common data shared accorsed objects
  // and Extrinsic data unique or which drives the object.

  // we can use FlyWeight Design Pattern
  public void main() {
    // ..i.e
    int x = 0;
    int y = 0;
    // Sprites is a 2d represention or image
    Sprites sprites = new Sprites();
    // for(int i =0; i<5000000; i++){
    // new Robot(x+i, y+i, "HUMONOID", sprites);
    // }

    // same for ROBOTIC_DOG
  }
}