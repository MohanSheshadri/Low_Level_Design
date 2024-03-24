public abstract class BreathingSystem {
  Breathe br;

  BreathingSystem(Breathe br) {
    this.br = br;
  }

  public void breathe() {
    br.breathe();
  }
}