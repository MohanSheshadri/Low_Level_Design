class SynchronisedLoading {
  private static SynchronisedLoading object;

  private SynchronisedLoading() {
  }

  public synchronized static SynchronisedLoading getInstance() {
    if (object == null) {
      object = new SynchronisedLoading();
      return object;
    }
    return object;

  }

}