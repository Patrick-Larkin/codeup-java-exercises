package Company;

public class Manager extends Employee {
  public Manager(String name, String dept) {
    super(name, dept);
  }

  @Override
  public void doWork() {
    System.out.println("Meeting, Meeting, Meeting...");
  }
}