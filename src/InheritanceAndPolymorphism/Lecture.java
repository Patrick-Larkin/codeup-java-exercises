package InheritanceAndPolymorphism;

/*Helpful links relating to topics discussed:
https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
 */

public class Lecture {
  /* ==================================Inheritance====================================
     Can define classes that extend or inherit from another class with the Extends keyword.
     We call these subclasses and the classes that are being inherited from/extend superclasses

     A subclass inherits all the fields of it's superclass, and can re-use any of its functionality

     Example:
        class Person {
          public String name;

          public Person(String name) {
              this.name = name;
          }

          public void sayHello() {
              System.out.println("Hello from " + name + "!");
          }
        }

        class Employee extends Person {
            public Employee(String employeeName){
                super(employeeName);
            }
        }

        Employee john = new Employee("John");
        john.sayHello();
        System.out.println(john.name);

     Because the Employee class extends Person : Employee objects can use the sayHello method,
     can use the Person con use the Person constructor, and have ta name property



    ==================================Extending Classes====================================
     A subclass can add new fields:
     class Person {
       public void sayHello() {
         System.out.println("Hello, world!");
       }
     }

     class Employee extends Person {
       private double salary;
       public void doWork() {
         System.out.println("Work, work...");
       }
     }

     Person p = new Person();
     Employee e = new Employee("name");

     e.sayHello(); // prints "Hello, World!"
     e.doWork(); // prints "Work, work..."


    ==================================Overriding====================================
    Subclasses can override methods on the superclass. To do this, the subclass must define a method
    with the same name, return type, and parameters as the superclass

    class Person {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }

    class Employee extends Person {
        private double salary;
        public void doWork() {
            System.out.println("Work, work...");
        }
        // method overriding
        public void sayHello() {
            System.out.println("How can I help you?");
        }
    }

    Person person = new Person();
    Employee employee = new Employee();

    person.sayHello();   // "Hello, World!"
    employee.sayHello(); // "How can I help you?"

    In addition to adding two new fields, the employee's sayHello method overrides the sayHello method defined in the Person class.
    When the sayHello method is called on an instance of the Person class, the code from the sayHello method defined on the Person class will run,
     but when we call the sayHello method on the instance of the Employee class, the code from the sayHello method defined in the Employee class will run.


    ==================================Access Modifiers====================================
    private cannot be referenced outside of the class that defines them. This includes subclasses.
    protected means that the field is not visible outside of the class, but is visible to classes that extend the class that the field is defined in.
    class Person {
        protected String name;
        private int age;
    }

    class Employee extends Person {
        public String getName() {
            return this.name;
        }

        public int getAge() {
            // ERROR!
            return this.age;
        }
    }


    ==================================The super Keyword====================================
    The super keyword allows us to access a superclass's methods and constructors from within a subclass.
        class Person {
            private String name;
            public Person(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }

        class SuperHero extends Person {
            private String alterEgo;
            public SuperHero(String name, String alterEgo) {
                super(name);
                this.alterEgo = alterEgo;
            }
            public String getName() {
                return alterEgo;
            }
            public String getSecretIdentity() {
                return super.getName();
            }
        }

    ==================================Polymorphism====================================
    feature of inheritance that allows us to treat objects of different subclasses that have the same superclass as if they were of the superclass type.
    Methods or variables that are defined with a superclass type can accept objects that are a subclass of that type.

    public class Employee {
      public String work() {
        return "Filling out TPS reports";
      }
    }



    public class Manager extends Employee {
      public String work() {
        return "Managing employees";
      }
    }



    class PolymorphismDemo {
      public void doWork(Employee e) {
        System.out.println(e.work());
      }

      public static void main(String[] args) {
        Employee one = new Employee();
        Employee two = new Manager();

        doWork(one); // "Filling out TPS reports"
        doWork(two); // "Managing employees"
      }
    }
    Todo: Return b/c failed to understand

    ==================================The final Keyword====================================
    Can be used to prevent inheritance or overriding. It can also be used with method parameters,
    like with variables to prevent reassignment

    Preventing Inheritance:
    public final class Movie { }

    //Error:
    public class Drama Extends Movie { }

    b/c Movie was declared final, no class is allowed to inherit from it


    Preventing method overiding
    public class Employee {
      public final String work() {
        return "Filling out TPS reports";
      }
    }

    public class Developer extends Employee {
    \\Error!
    public String work() {
      return "Writing code";
    }
    B/c the work method in the Employee class was declared final,
    it is not allowed to overridden tin the Developer class
   */
}
