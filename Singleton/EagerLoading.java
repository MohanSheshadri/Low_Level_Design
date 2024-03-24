class EagerLoading {
  static EagerLoading object = new EagerLoading();

  private EagerLoading() {

  }

  public static EagerLoading getInstance() {
    return object;
  }

}