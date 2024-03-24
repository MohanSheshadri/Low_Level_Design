import java.util.*;

class Directory implements FileSystem {
  List<FileSystem> files;
  String name;

  Directory(String name) {
    this.name = name;
    files = new ArrayList<>();
  }

  public void add(FileSystem file){
    files.add(file);
  }

  public void ls() {
    System.out.println("DIrectory name " + name);
    for (FileSystem file : files) {
      file.ls();
    }
  }
}