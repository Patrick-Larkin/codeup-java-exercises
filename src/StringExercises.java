import java.util.Scanner;

public class StringExercises {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    /* String Basics.


    Todo: For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
    We don't need no education
    We don't need no thought control

    Check "this" out!, "s inside of "s!

    In windows, the main drive is usually C:\

    I can do backslashes \, double backslashes \\,
    and the amazing triple backslash \\\!
    */

    String education = "We don't need no education";
    System.out.println(education + "\n" + education.replace("education", "thought control"));

    String quotes = "Check \"this\" out!, \"s inside of \"s!";
    System.out.println(quotes);

    String windows = "In windows, the main drive is usually C:\\";
    System.out.println(windows);

    String backslash = "I can do backslashes \\, double backslashes \\\\,\n" + "and the amazing triple backslash \\\\\\!";
    System.out.println(backslash);

    /*
      Todo: Create a class named Bob with a main method for the following exercise.
      Bob is a lackadaisical teenager. In conversation, his responses are very limited:
      Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
      He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
      He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
      He answers 'Whatever.' to anything else.
      Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
    */
    System.out.println("Talk to Bob:");
    String talkToBob = sc.nextLine().trim();
    if (talkToBob.endsWith("?")) {
      System.out.println("Bob: Sure.");
    } else if (talkToBob.endsWith("!") || (talkToBob.equals(talkToBob.toUpperCase()))) {
      System.out.println("Bob: Whoa, chill out!");
    } else if (talkToBob.equals("")) {
      System.out.println("Bob: Fine. Be that way!");
    } else {
      System.out.println("Bob: Whatever.");
    }
  }
}
