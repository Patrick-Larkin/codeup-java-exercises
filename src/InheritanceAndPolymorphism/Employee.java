package InheritanceAndPolymorphism;

public class Employee extends Person{
  private double salary;


  public void doWork() {
  System.out.println("Work, work...");
  }


  public Employee(String employeeName) {
    super(employeeName);
  }


  public void sayHelloThree() {
    System.out.println("How can I help you?");
  }

  public String work() {
    return "Filling out TPS reports";
  }
}
