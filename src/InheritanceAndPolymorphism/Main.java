package InheritanceAndPolymorphism;

public class Main {
  public static void main(String[] args) {
    Employee john = new Employee("John");

    john.sayHello();
    System.out.println(john.name);


    System.out.println("\nExample of adding new fields through subclass");
//    Person p = new Person();
    Employee e = new Employee("Patrick");

    e.sayHello(); // prints "Hello, World!"
    e.doWork(); // prints "Work, work..."


    System.out.println("\nExample of overriding");
    System.out.println("\nKinda fudged it up but you get the point");
    Person person = new Person("Steve");//filler name in order to please syntax
    Employee employee = new Employee("Alex");//filler name in order to please syntax

    person.sayHelloTwo();
    employee.sayHelloThree();


//    System.out.println("\nExample of Super");
//    SuperHero theManOfSteel = new SuperHero("Superman", "Clark Kent");
//    System.out.println(theManOfSteel.getName());
//    System.out.println(theManOfSteel.getSecretIdentity());
  }
}
