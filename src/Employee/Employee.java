package Employee;

public class Employee {

  private String name;
  private String email;

  // new Employee("name", "email")
  public Employee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }
}