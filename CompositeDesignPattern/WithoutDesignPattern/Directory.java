import java.util.*;

class DirectoryNone {
  String name;
  List<Object> types;

  DirectoryNone(String name) {
    this.name = name;
  }

  // add Objects method

  public void ls() {
    for (Object type : types) {
      if (type instanceof FileNone) {
        // type.ls();
      } else {
        System.out.println("Directnary name " + name);
        // type.types.ls();
      }
    }
  }
}