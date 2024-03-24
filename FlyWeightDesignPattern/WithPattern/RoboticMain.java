class RoboticMain {

  public void main() {
    RobotFactory r = new RobotFactory();
    Robot one = r.getRobot("HUMONOID");
    one.display(1, 4);

    Robot two = r.getRobot("HUMONOID");
    one.display(71, 41);

    Robot three = r.getRobot("ROBOTIC_DOG");
    one.display(4, 43);

    Robot four = r.getRobot("ROBOTIC_DOG");
    one.display(11, 14);
    System.out.println(one == two);
    System.out.println(two == three);
    System.out.println(three == four);
  }
}