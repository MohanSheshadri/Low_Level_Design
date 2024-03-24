class TurnOffCommand implements Command {
  ACReceiver ac;

  TurnOffCommand(ACReceiver ac) {
    this.ac = ac;
  }

  public void execute() {
    ac.turnOffAc();
  }

  public void undo() {
    ac.turnOnAc();
  }
}