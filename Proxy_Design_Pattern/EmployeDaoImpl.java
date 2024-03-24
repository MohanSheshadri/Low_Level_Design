class EmployeDaoImpl implements EmployeDao {

  @Override
  public void create(Employee emp) {
    System.out.println("Employee Created");
  }

  @Override
  public void delete(Employee emp) {
    System.out.println("Employee Deleted");
  }
}
