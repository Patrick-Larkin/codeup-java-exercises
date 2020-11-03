import java.util.Scanner;

public class StringExercises {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    /* String Basics.*/
    String education = "We don't need no education";
    System.out.println(education + "\n" + education.replace("education", "thought control"));

    String quotes = "Check \"this\" out!, \"s inside of \"s!";
    System.out.println(quotes);

    String windows = "In windows, the main drive is usually C:\\";
    System.out.println(windows);

    String backslash = "I can do backslashes \\, double backslashes \\\\,\n" + "and the amazing triple backslash \\\\\\!";
    System.out.println(backslash);


    /*Convos with Bob.*/
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
