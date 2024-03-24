public class DoubleLockLoading {

  // volatile for attribute due to avoid the CPU interchanging actions in
  // declaration, intialisation and assignment actions also volatile bypass CPU
  // cache and saves in memory avoid thread confusions in creating mutiple objects

  private static volatile DoubleLockLoading object;

  private DoubleLockLoading() {
  }

  public static DoubleLockLoading getInstance() {
    if (object == null) {
      synchronized (DoubleLockLoading.class) {
        if (object == null) {
          object = new DoubleLockLoading();
        }
      }
    }
    return object;
  }

}