class SingletonMain {

  public static void main() {
    EagerLoading one = EagerLoading.getInstance();
    EagerLoading two = EagerLoading.getInstance();
    System.out.println(one == two);

    LazyLoading lazy1 = LazyLoading.getInstance();
    LazyLoading lazy2 = LazyLoading.getInstance();
    System.out.println(lazy1 == lazy2);

    SynchronisedLoading syn1 = SynchronisedLoading.getInstance();
    SynchronisedLoading syn2 = SynchronisedLoading.getInstance();
    System.out.println(syn1 == syn2);

    //
    DoubleLockLoading dou1 = DoubleLockLoading.getInstance();
    DoubleLockLoading dou2 = DoubleLockLoading.getInstance();
    System.out.println(dou1 == dou2);
  }
}