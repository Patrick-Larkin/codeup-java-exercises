public class AbstractLecture {
	/* ==================================Abstract Classes====================================
	An abstract class is a class that can serve as a superclass, but cannot be directly instantiated
	Which means they are methods with no body, they only provide information about the method name, return type, and parameters.
	Any class that inherits from an abstract class must define all abstract methods, or itself be abstract

	We would use an abstract class when we want to force subclasses to provide a unique implementation for a method. Let's look at an example of using an abstract class:
		abstract class Employee {
		    public abstract String work();
		}

		class Accountant extends Employee {
		    public String work() {
		        return "crunching numbers";
		    }
		}

		// ERROR!
			Employee tim = new Employee();
		// okay
			Employee bob = new Accountant();

	==================================Working With Abstract Classes====================================
	An abstract class is used to represent something that needs to be extended.

	Let's say that we want to model employees and their different job positions in an application.
	We know that every employee will have a name, and belong to a department, but the work that each employee does is dependent on their position.
	We might model this scenario by creating an Employee class, and specialized job position classes that extend Employee. We can define the Employee class as abstract,
	and define an abstract method in it to force subclasses to provide an implementation.

		abstract class Employee {
      protected String name;
      protected String department;
      public Employee(String name, String department) {
        this.name = name;
        this.department = department;
      }
      public String getName() {
        return name;
      }
      public String getDepartment() {
        return department;
      }

      public abstract String work();
		}

		class Developer extends Employee {
			public String work() {
				return "writing code";
			}
		}

		class Manager extends Employee {
		  public String work() {
		    return "holding meetings";
		  }
		}
	We can now create instances of Developer or Manager, and have full access to the constructor, the getName, and the getDepartment methods from Employee.
	By having both inherit from an abstract class, we ensure each subclass has a unique implementation of work, and prevent duplicating code that deals with handling
	employee names or departments.

	==================================Interfaces====================================
	An interface is an abstract class that follows these rules:
		- all methods are public and abstract.
		- all properties are public static and final.
		- no static methods.
	Interfaces are used to define the behaviour of our objects, and thus are typically only used to define methods, and occasionally class constants (public static properties).
	Interfaces allow us to define the way that our objects interact with the rest of our application.

	Let's take a look at an interface:
		public interface WritesCode {
		  Bug[] writeCode(int numberOfLines);

		  boolean debug(Bug bug);

		  void drinkCoffee();

		  // could return null!
		  StackOverflowLink searchForAnswer(Bug bug);

		  BrokenKeyboard smashKeyboard(Keyboard k);
		}
	The name of the interface usually contains information about what an object does, or what it is capable of doing.
	The methods, along with the types of the parameters and return value, convey what the object is doing, but not how (the implementation).

	Interfaces are implemented by classes with the implements keyword.
	A class that implements an interface must provide an implementation for each method defined by the interface.
		class Developer implements WritesCode {
			//implementations go here
		}
	The Developer class must provide implementations for all of the methods in WritesCode because it implements the WritesCode interface. If it does not, the code will not compile.

	==================================Working With Interfaces====================================
		While interfaces cannot be directly instantiated, they can be used in most places a class is expected; for example, the type of a variable, or the type of a method parameter.
		This allows our application to be less tightly coupled; that is, We define the implementation of the code independent of where it is used. This allows us to easily swap out
		implementations for an interface as the business requirements of our application change.

			Interface:
				interface Formatter {
				  String display(User user);
				}

			Implementation:
				class ConsoleFormatter implements Formatter {
					public String display(User user) {
					  return "--------------------" +
					    "\n  name:  " + user.getName() +
					    "\n  email: " + user.getEmail();
				  }
				}

			Main:
				Formatter fmt = new ConsoleFormatter();
					// ...
				fmt.display(loggedInUser);
					// ...
				for (User user : searchResults) {
					fmt.display(user);
				}

			Change:
				class HTMLFormatter implements Formatter {
				  public String display(User user) {
				    return String.format(
				      "<div class=\"user\"><h2>%s(%s)</h2></div>",
				      user.getName(), user.getEmail()
				    );
				  }
				}
		More generally speaking, if we write our code such that it relies on interfaces instead of implementations, it allows us to easily switch out the implementation,
		and for our code base to be better structured and more flexible.


	==================================Interfaces vs Abstract Classes====================================
	In summary:
		Abstract Classes
			* Can use instance as well as static variables and constants.
			* Can define regular methods that contain code and abstract methods that don’t contain code.
			* Can define static methods.
			* Make use of the abstract and extends keywords.
			* Contain
				- instance and static variables.
				- instance and static constants.
				- instance and static methods.

		Interfaces
			* A class can directly implement multiple interfaces.
			* Any object created from a class that implements an interface can be used wherever the interface is accepted.
			* Can be used in place of classes to decouple parts of our code from implementation details.
			* Make use of the implements and interface keywords.
			* Contain1
				- abstract methods.
				- static constants.
		In Java, any class can both extend abstract classes and implement interfaces.


		==================================Further Reading====================================
			Interfaces                                  https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
			Abstract Classes and Methods                https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
	 */
}
