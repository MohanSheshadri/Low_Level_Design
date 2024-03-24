class FileNone {
  String fileName;

  FileNone(String fileName) {
    this.fileName = fileName;
  }

  public void ls() {
    System.out.println("File name " + fileName);
  }
}