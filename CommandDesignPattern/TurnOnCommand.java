class TurnOnCommand implements Command {
  ACReceiver ac;

  TurnOnCommand(ACReceiver ac) {
    this.ac = ac;
  }

  public void execute() {
    ac.turnOnAc();
  }

  public void undo() {
    ac.turnOffAc();
  }
}