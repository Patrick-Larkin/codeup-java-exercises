//Todo: Notes are trash redo and study
public class oopLecture {
    public static void main(String[] args) {
/*================================= OOP ================================
Object-oriented programming  --  A way to organize code, especially for larger/more complex programs.
  - A programming paradigm where state (data/properties) and behavior (functionality/methods)
    are grouped together (often into objects)
  - Objects in Java are created from classes (a blueprint for an object/instance)
ADVANTAGES OF OOP
  Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:
    - implementation details abstracted away making code more readable (Abstraction)
    - restricted access to various levels of abstraction, preventing data inconsistencies (Encapsulation)
    - duplication minimized through inheritance hierarchies (Inheritance)
    - flexible code where multiple implementations are swapped out behind a common interface (Polymorphism)
PILLARS OF OOP
  1. Abstraction - keep it clean
  2. Encapsulation - keep it contained
  3. Inheritance - keep it hierarchical (DRY)
  4. Polymorphism - keep it versatile
   https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219


================================= Classes And Objects =================================
    A class is used to define a custom type in Java.
      You can think of a class as a template, or a blueprint, for objects that will be created based on it.

    A field is a variable or method that belongs to an object or a class.
      Fields are accessed with the . operator. By default, fields belong to objects, but can be defined as belonging to a class with the static keyword.
      Fields are either properties (variables) or methods (functions).

    An object is an instance of a class.
      Objects have properties and methods, and are instantiated, i.e. created, with the new keyword.

    Let's look at an example of defining a Person class and creating an instance of it:
    */
        class Person { //define a class named Person
            //two instance variables, or properties,
            public String firstName;
            public String lastName;

            public String sayHello() { //class also defines an instance method, sayHello
                return String.format("Hello from %s %s!", firstName, lastName);
            }
        }
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        //sayHello method we can refer to firstName and lastName, despite them having variables with those names defined in the method. If we had defined a variable with the same name as a property, any references would refer to the variables, not the property.
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"
/*================================= Static vs Instance =================================
We said that fields can belong either to a class or an object. Means that each object can have different values for their instance fields
*/
        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
        System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"

    /* In the above example, each instance of the Person class has a different value for each of the firstName and lastName properties,
    but they both have properties named firstName and lastName.

    Let's take a look at a simple example of referencing a static field on a class:
    */
        System.out.println(Math.PI); // 3.141592653589793
    /*
    Static fields are defined with the static keyword
    Unsure what to note for this section: https://java.codeup.com/java-ii/object-oriented-programming/



================================= Constructors ================================
  A constructor is a special method that is called when an object is created
    A constructor has the same name as the class and does not define a return type.
    Constructors, like any other method, can accept arguments and be overloaded.

    class Person { //Have to comment out b/c otherwise required static --- self-interpretation:
        public String name;

        // the Person constructor
        public Person() {
            System.out.println("A Person is being created!");
        }

        public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person();

        Result:
            A Person is being created!
            A Person is being created!
        }
    }
    */

        //A common use case for constructors is to set, or provide default values for, an object's properties:
        class Student1 {
            public String name;
            public String cohort;

            public Student1(String studentName) {
                name = studentName;
                cohort = "Unassigned";
            }

            public Student1(String studentName, String assignedCohort) {
                name = studentName;
                cohort = assignedCohort;
            }

            public String getInfo() {
                return String.format("name: %s, cohort: %s", name, cohort);
            }
        }

        Student1 s1 = new Student1("Student A");
        Student1 s2 = new Student1("Student B", "Voyagers");
        System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
        System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"


/*================================= The this Keyword ================================
  The this keyword provides us a way to refer to the current instance
    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public sayHello() {
            return String.format("%s says hello!", this.name);
        }
*/

    }
}

