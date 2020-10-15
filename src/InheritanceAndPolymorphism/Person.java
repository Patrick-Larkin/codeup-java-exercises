package InheritanceAndPolymorphism;

public class Person {
  protected String name;
  private int age;

  public Person(String name) {
    this.name = name;
  }
  public void sayHello(){
    System.out.println("Hello from " + name + "!");
  }
  public void sayHelloTwo(){
    System.out.println("Hello, world!");
  }
}
