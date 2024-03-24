class ACReceiver {
  boolean isOn;
  int temparature;

  public void turnOnAc() {
    this.isOn = true;
    System.out.println("AC is turned on");

  }

  public void turnOffAc() {
    this.isOn = false;
    System.out.println("AC is turned off");
  }

  public void setTemparature(int temparature) {
    this.temparature = temparature;
    System.out.println("Ac Temparature set to " + temparature);
  }
}