import java.util.*;

class RemoteInvoker {
  Command command;

  Stack<Command> actions = new Stack();

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
    actions.push(command);
  }

  public void undo() {
    if (!actions.isEmpty()) {
      Command com = actions.pop();
      com.undo();
    }
  }

  public void redo() {
    if (!actions.isEmpty()) {
      Command com = actions.firstElement();
      setCommand(com);
      pressButton();
    }
  }

}