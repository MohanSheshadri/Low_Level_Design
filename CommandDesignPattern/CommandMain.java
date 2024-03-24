class CommandMain {
  public void main() {
    ACReceiver ac = new ACReceiver();
    RemoteInvoker remote = new RemoteInvoker();
    remote.setCommand(new TurnOnCommand(ac));
    remote.pressButton();
    remote.undo();
    remote.pressButton();
    remote.redo();

  }
}