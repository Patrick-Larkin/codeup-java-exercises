public class Person {
  public String fName;

  public Person(String fName) {
    this.fName = fName;
  }

  public String getName() {
    return this.fName;
  }

  public String setName(String fName) {
    this.fName = fName;
    return fName;
  }

  public void sayHello() {
    System.out.printf("\nHello %s\n", this.fName);
  }

  public static void main(String[] arg) {
    Person p1 = new Person("Patrick");
    //p1.setName("Carl"); /*Set new name*/
    p1.sayHello();
    System.out.println("This is a java program saying Hello " + p1.getName() + "!");

//    Person p2 = new Person("Patrick");
//    System.out.println("p2 = Patrick:\n" + p2.getName());
//    System.out.println(p2.setName(p2.getName()));
//    p2.sayHello();
//
//
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);
//    System.out.println("person1 = " + person1);
//    System.out.println("person2 = " + person2);
  }
}