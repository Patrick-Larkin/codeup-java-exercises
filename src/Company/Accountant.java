package Company;

public class Accountant extends Employee {
  public Accountant(String name) {
    super(name, "Accounting");
  }

  public void doWork() {
    System.out.println("crunching numbers");
  }

  public static void main(String[] args) {
    Employee tim = new Accountant("Sidney");
  }
}