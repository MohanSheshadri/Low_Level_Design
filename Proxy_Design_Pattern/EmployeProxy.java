class EmployeProxy {
  public void create(String user, Employee emp) {
    if (user.equals("ADMIN")) {
      EmployeDao emp1 = new EmployeDaoImpl();
      emp1.create(emp);
    }
  }
}