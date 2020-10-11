package Company;

abstract class Employee {

  protected String department;
  public Employee(String name, String dept) {
    super(name);
    this.department = dept;
  }
  public String getName() {
    return name;
  }
  public String getDepartment() {
    return this.department;
  }

  public abstract String work();

  public abstract void doWork();

  @Override
  public void sayHello() {
    System.out.println("Hello my name is %s, I work in %s\n",
            this.getName(),
            this.getDepartment());
  }
}