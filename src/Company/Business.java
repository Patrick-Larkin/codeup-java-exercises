package Company;

public class Business {
  public static void main(String[] args) {
    Employee[] employees = {
            new Accountant("Cidney"),
            new Developer("Mike"),
            new Manager("Anne", "Deveelopment")
    };

    for (Employee e : employees) {
      e.sayHello();
      e.doWork();
    }
  }
}
//class --> extends
//interface --> implements
//abstract class cannot be instantiated, must be extended
//abstract method cannot have implementation, must be overridden
//mark abstract