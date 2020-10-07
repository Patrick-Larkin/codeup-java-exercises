import java.util.Scanner;

public class stringLecture {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    /* ================== Immutability and Concatenation ==================
      Strings are immutable. This means that once a string is created, it cannot be changed.
    */
    String message = "Hello";
    //message = message.replace('e','a'); Doest Work
    System.out.println(message); // prints "Hello"
    message = message + " World!";
    System.out.println(message); // prints "Hello, World!"


    /* ================== Comparing Strings ==================
      Because strings are not primitive data types but objects, we must use methods to compare them rather than the relational operators.
        //Comparison methods:
          //.equals	                  determine, case-sensitively, if two strings have the same value.
          //.equalsIgnoreCase	        determine if two strings have the same value, disregarding their casing.
          //.startsWith          	    determine, case-sensitively, if one string starts with another.
          //.endsWith	determine,      case-sensitively, if one string ends with another.
    */
    //DON'T DO THIS
    //if ("I am a string" == "I am a string") {
    //  System.out.println("Strings are equal");
    //}

    // Do this instead!
    if ("I am a string".equals("I am a string")) {
      System.out.println("Strings are equal");
    }

    String input = "Codeup Rocks!";

    System.out.println(input.equals("codeup rocks!")); // false
    System.out.println(input.equals("Codeup Rocks!")); // true

    System.out.println(input.equalsIgnoreCase("codeup rocks!")); // true
    System.out.println(input.equalsIgnoreCase("Codeup Rocks!")); // true

    System.out.println(input.startsWith("codeup")); // false
    System.out.println(input.startsWith("Codeup")); // true

    System.out.println(input.endsWith("rocks")); // false
    System.out.println(input.endsWith("rocks!")); // false
    System.out.println(input.endsWith("Rocks!")); // true


    /* ================== String Manipulation Methods ==================
      The following methods can be used to manipulate strings:
        char charAt(int index)
        Returns the character at the specified index of the string.

        int indexOf(String subString)
        Returns the index of the first occurrence of a certain substring.
        Returns -1 if the substring is not found.

        int lastIndexOf(String subString)
        Like indexOf, but starts the search from the end of the string.

        int length()
        Returns the length of a string.

        String replace(String pattern, String replacement)
        Returns a copy of the string that has pattern replaced with replacement.

        String substring(int beginIndex[, int endIndex])
        Returns a new substring that starts at a specified index and (optionally) ends at the specified index

        String toLowerCase()
        Returns a string that has all lower case letters.

        String toUpperCase()
        Returns a string that has all upper case letters.

        String trim()
        Returns a copy of the string without leading and trailing whitespaces.
     */
  }
}