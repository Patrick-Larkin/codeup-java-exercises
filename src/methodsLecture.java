import java.util.Scanner;

public class MethodsLecture {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		/*==============Defining Methods==============

			public static returnType methodName([param1[, param2[, ...]]) {
			  the statements of the method
			  return statement, if a return type is declared
			}

		Example:
			public static String sayHello(String name) {
					return String.format("Hello, %s!\nHELLO, %s!", name, name.toUpperCase());
			}
			Let's take a look at all the individual pieces of the method definition in the example above:
			 - public -- this is the visibility modifier.
			 - static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.
			 - String -- this is the return type of the method.
			 - sayHello -- the name of the method.
			 - (String name) -- the parameter the method accepts.
			 - A method can be defined with no parameters, one parameter (like in our example), or multiple parameters (separated by commas). A type must be specified for each parameter.
			 - Everything inside the curly braces is the body of the method.

		==============Calling Methods==============
			When we call a function, we call it with arguments. Arguments can be literal values, variables, or themselves expressions, but the data type of the arguments must be the same as the data type of the parameters that the method is defined with
			Here are some examples of calling methods:
				startApplication();                           - called with no arguments
				logInfo("User #214 registered!");             - called with one argument
				addAttribute("loggedInUser", loggedInUser);   - called with multiple arguments


		==============Method Overloading=============
			Is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
			When we call sayHello, the code that will be run depends on the arguments we pass to it. For example when we call it like this:*/
		//Version 1:
		sayHello();
		//Version 2:
		sayHello("Patrick");
		//Version 3:
		sayHello("Greetings", "Patrick");
		//Version 4:
		sayHello(4);


		/*==============Passing Parameters To Methods=============
			In Java, parameters are passed by value. This means that a copy of the value passed is created inside of a method, and that reassigning a value inside of a method will not change it outside
			of the method.
			Let's see an example:
				public static void changeString(String s) {
					s = "Wub a lub a dub dub";
				}

				public static void main(String[] args) {
					String changeMe = "hello codeup!";

					changeString(changeMe);

					System.out.println(changeMe);
				}


		==============Recursion=============
			The core idea of recursion is creating a method that calls itself, but with different parameters than were originally passed. You must make sure to have a base case or stop condition so that
			the method does not call itself over and over again indefinitely.

				public static void count(int n) {
				  if (n <= 0) {
				    System.out.println("All done!");
				    return;
				  }
				  System.out.println(n);
				  count(n - 1);
				}

				public static void main(String[] args) {
				  count(5);
				}
			The method count is recursive because it calls itself, and will continue to call itself with an argument of 1 less that the value that was originally passed.


		==============Further Reading:=============
			Defining Methods              https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
	*/
	}

	//Version 1:
	public static void sayHello( int times){
		for (int i = 0; i < times; i += 1) {
			sayHello();
		}
	}

	//Version 2:
	public static void sayHello () {
		sayHello("Hello", "World");
	}

	//Version 3:
	public static void sayHello (String name){
		sayHello("Hello", name);
	}

	//Version 4:
	public static void sayHello (String greeting, String name){
		System.out.println(greeting + ", " + name + "!");
	}
}