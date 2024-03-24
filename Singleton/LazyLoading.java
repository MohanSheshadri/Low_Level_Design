class LazyLoading {
  private static LazyLoading object;

  private LazyLoading() {

  }

  public static LazyLoading getInstance() {
    if (object == null) {
      return object = new LazyLoading();
    }
    return object;
  }

}