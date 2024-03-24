class BreatheMain {
  public void main() {
    Human h = new Human(new HumanBreatheSystem());
    h.breathe();
    Dog1 d = new Dog1(new PlantBreatheSystem());
    d.breathe();
  }

}