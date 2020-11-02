import util.Input;

public class ExceptionsLecture {
	public static void main(String[] args) throws Exception {
		Input input = new Input();
		/* ================== Throwing Exceptions ==================
			 Java feature to provide a formalized way to do error handling. An exception is thrown when the application can't perform an operation
			 example:
		 */

		//int[] numbers = {1, 2, 3};
		//System.out.println(numbers[999]);

		/*  Results:
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 999 out of bounds for length 3
			at ExceptionsLec.main(ExceptionsLec.java:8)

		We can also explicitly throw our own exception:
		*/

		//throw new Exception("Something bad happened!"); //java: unreported exception java.lang.Exception; must be caught or declared to be thrown
		//System.out.println("after the throw statement"); //java: unreachable statement

		/* It is important to note that exceptions effect the control flow of your application. Once an exception is thrown,
		   no code after the thrown exception will be executed until the exception is handled.

		================== Catching Exceptions ==================
		Instead of crashing our application, we can handle exceptions by catching them. We do this with a try-catch block:
			try: the code that is going to be tried; code that could potentially cause an exception.
			catch: code that handles any exceptions (if produced).

		Here is a generic form of what a try-catch block looks like:
			try {
        // something that
        // might go wrong
			} catch (Exception e) {
        // handle the error
			}

		Example:
		*/

		//int[] numbers = {1, 2, 3};
		//int x;

		//try {
		//	x = numbers[100];
		//} catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println("Caught an array index exception!");
		//} catch (Exception e) {
		//	System.out.println("Caught a generic exception!");
		//} finally {
		//	System.out.println("This will always run.");
		//}

	/*Importante: A try-catch block is a code block just like a body of an if statement, or the body of a while loop is. If you need to do assignment inside of a try-catch, declare the variables outside of the block, and assign to them inside the block.

		.getMessage: returns the exception message as a string
		.printStackTrace: prints the full details of the exception (where it occurred) to the console


	================== Types of Exceptions ==================
		Two Main Types of Exceptions:
			Checked - Must be handled in our code, either with a try-catch, or by declaring them in the method signature with the throws keyword
			Unchecked - These are mostly exceptions that are built into the Java language, and do not need to be explicitly dealt with.
		Extra:
			Error - Errors represent something going very wrong, usually this is not something that we can anticipate or handle in our code.


		Three Base Classes:
			Exception
       - Errors our code should prepare for.
       - Generally, any custom exceptions we create will subclass Exception.
       - For example: FileNotFoundException, or SQLException.
      RuntimeException
			 - Things that can go wrong, but that we can usually prevent programmatically.
			 - ArrayIndexOutOfBoundsException, NullPointerException, and IllegalArgumentException are all examples of runtime exceptions.
			Error
			 - A serious problem.
			 - Usually occurs at the OS or JVM level.
			 - OutOfMemoryError, or StackOverflowError.

	================== Working with Checked Exceptions ==================
	Using a try-catch:
		public static void main(String[] args) {
			String indentationPreference;

			try {
			  indentationPreference = getIndentationPreference();
			  System.out.println("Okay, " + indentationPreference + " is a great choice.");
			} catch (Exception e) {
			  System.out.println("Uh oh, something went wrong: " + e.getMessage());
			  System.out.println("Here is some more detail:");
			  e.printStackTrace();
			}
		}

	Adding the exception to the method signature
		public static void main(String[] args) throws Exception {
			String indentationPreference = getIndentationPreference();
			System.out.println("Okay, " + indentationPreference + " is a great choice.");
		}
	- If a method contains a line of code that can cause an exception to be thrown (including an explicit throw statement), the line must either be inside of a try-catch, or the exception must be added to the method's signature using throws
	- Using an explicit try-catch allows us more control over how the error is handled. Using throws indicates that the error handling is the responsibility of the code calling the method.

	================== Custom Exceptions ==================
	We can create our own application-specific exceptions by extending the Exception class.
	Because exceptions are just objects, we can store them in a variable, declare, and initialize them just like any other object.

	class WrongIndentationTypeException extends Exception {}

		Scanner sc = new Scanner(System.in);
		System.out.print("What type of indentation do you prefer?");
		String indentationPreference = sc.nextLine();

		if (indentationPreference.equals("tabs")) {
		    WrongIndentationTypeException e;
		    e = new WrongIndentationTypeException("Spaces are superior!");
		    throw e;
		}

	================== Further Reading ==================
		Exceptions                        https://docs.oracle.com/javase/tutorial/essential/exceptions/
		Integer.valueOf() Docs            https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf-java.lang.String-
		Double.valueOf() Docs             https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#valueOf-java.lang.String-
	*/


//================== Exercises ==================
		input.getInt();
		input.getDouble();
	}
}