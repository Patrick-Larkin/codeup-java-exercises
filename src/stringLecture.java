import java.util.Scanner;
public class stringLecture {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

//Strings are immutable. This means that once a string is created, it cannot be changed.
        String message = "Hello";
        //message = message.replace('e','a'); Doest Work
        System.out.println(message); // prints "Hello"
        message = message + " World!";
        System.out.println(message); // prints "Hello, World!"

        String dbEmail = " fer@codeup.com ".trim();
        String email = "Fer@Codeup.Com".toLowerCase();
        String studentEmail = "fergmail.com";

  //Comparing Strings
    //Because strings are not primitive data types but objects, we must use methods to compare them rather than the relational operators
        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");
        }

    //Comparison methods  -------  All return boolean
        //.equals	             determine, case-sensitively, if two strings have the same value.
        //.equalsIgnoreCase	     determine if two strings have the same value, disregarding their casing.
        //.startsWith          	 determine, case-sensitively, if one string starts with another.
        //.endsWith	determine,   case-sensitively, if one string ends with another.
        if (email.equalsIgnoreCase(dbEmail)) {
            System.out.println("email = " + email);
            System.out.println("they match");
        }
        if (studentEmail.endsWith("@codeup.com")) {
            System.out.println("You can see the grades sheet");
        } else {
            System.out.println("You are not allowed to see this file");
        }

        if (studentEmail.startsWith("fer".toLowerCase())) {
            System.out.println("You can see your grades sheet");
        }


    //String Manipulation Methods
      // The following methods can be used to manipulate strings:
        System.out.println(email.charAt(0) == 'f');

        System.out.println(email.indexOf("@"));
        System.out.println(studentEmail.indexOf("@"));

        if (email.indexOf("@") > 0) {
            System.out.println("Email validation passed");
        } else {
            System.out.println("Email validation failed");
        }

        System.out.println("first index = " + email.indexOf("o"));
        System.out.println("last index = " + email.lastIndexOf("o"));

        System.out.println("studentEmail.length() = " + studentEmail.length());
        email = email.replace(".com", ".org");
        System.out.println("org email = " + email);

        System.out.println("email.substring(0,3) = " + email.substring(0, 3));


        //Exercises
        String education = "We don't need no education";
        System.out.println(education + "\n" + education.replace("education", "thought control"));

        String quotes = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(quotes);

        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);

        String backslash = "I can do backslashes \\, double backslashes \\\\,\n" + "and the amazing triple backslash \\\\\\!";
        System.out.println(backslash);
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
