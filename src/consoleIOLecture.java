import java.util.Scanner;
public class consoleIOLecture {
    public static void main(String[] arg) {
    /* ================== Printing Data To The Console ==================
      We have already been using System.out.println and System.out.print to display information in the console.
      Another method we can use is System.out.printf. This allows us to define a string with placeholders and then pass values for those placeholders.
      */
        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.\n", name);
        /*
        In the example above, the %s will be replaced with the value of the name variable, resulting in an output of:
          Hello there, codeup. Nice to see you.

        You can also use multiple placeholders:
        */
          String greeting = "Salutations";
          String codeup = "codeup";
          System.out.printf("%s, %s!\n", greeting, codeup);


    /* ================== Getting Input From The Console ==================
      Before we can use the Scanner class, we'll need to import it.
        import java.util.Scanner;
      go at the top of your file, before the class definition

      Example of using the Scanner class:
      */
        Scanner scanner = new Scanner(System.in); // First we declare a variable of type Scanner, and assign to it a new Scanner object. We also specify System.in for the source of the scanner

        System.out.print("Enter something: "); // Next we prompt the user to type something,
        String userInput = scanner.next(); // Obtain the value the user entered as a String, and store it in the variable userInput

        System.out.println("You entered: --> \"" + userInput + "\" <--"); // Lastly we'll print out the value the user entered.
    }
}
