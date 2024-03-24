import java.util.*;

class RobotFactory {
  Map<String, Robot> cachedRobots = new HashMap<>();

  public Robot getRobot(String type) {
    if (cachedRobots.containsKey(type)) {
      return cachedRobots.get(type);
    } else {
      if (type.equals("HUMONOID") || type.equals("ROBOTIC_DOG")) {
        // if() to check if type== HUMONOID or ROBOTIC_DOG
        Sprites sprites = new Sprites();
        Robot robot = new IRobot(type, sprites);
        cachedRobots.put(type, robot);
        return robot;
      }
    }
    return new NullRobotObject();
  }

}