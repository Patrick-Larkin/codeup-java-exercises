import java.util.Scanner;

public class ControlFlowExercises {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    /*================== While ==================
      Todo: Create an integer variable i with a value of 5.
      Todo: Create a while loop that runs so long as i is less than or equal to 15
      Todo: Each loop iteration, output the current value of i, then increment i by one.
      Todo: Your output should look like this:
      5 6 7 8 9 10 11 12 13 14 15
    */
    int i = 5;
    while (i <= 15) {
      System.out.println(i);
      i++;
    }

    /*================== Do while #1 ==================
      Todo:Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
    */
    int a = 0;
    do {
      a = a + 2;
      System.out.println("Do while loop counter A: " + a);
    } while (a < 100);


    /*================== Do while #2 ==================
      Todo:Alter your loop to count backwards by 5's from 100 to -10.
    */
    int b = 100;
    do {

      System.out.println("Do while loop counter B: " + b);
      b = b - 5;
    } while (b > -10);

    /*================== Do while #3 ==================
      Todo:Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
      Todo: Your output should look like this:
      2
      4
      16
      256
      65536
    */
    long c = 2;
    do {
      System.out.println("Do while loop counter C: " + c);
      c *= c;
    } while (c < 1000000L);

    //================== For Loop #1 ==================
    for (int d = 100; d > -10; d -= 5) {
      System.out.println("For loop counter D: " + d);
    }
    //================== For Loop #2 ==================
    for (long e = 2; e <= 10000; e *= e) {
      System.out.println("For loop counter E: " + e);
    }


  /*================== Do while #3 ==================
    Todo:Write a program that prints the numbers from 1 to 100.
    Todo:For multiples of three: print “Fizz” instead of the number.
    Todo:For the multiples of five: print “Buzz”.
    Todo:For numbers which are multiples of both three and five: print “FizzBuzz”.
   */
    for (int f = 0; f <= 100; f++) {
      if (f % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if (f % 3 == 0) {
        System.out.println("Fizz");
      } else if (f % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(f);
      }
    }


  /*================== Table of Powers ==================
    Todo:Prompt the user to enter an integer.
    Todo:Display a table of squares and cubes from 1 to the value entered.
    Todo:Ask if the user wants to continue.
    Todo:Assume that the user will enter valid data.
    Todo:Only continue if the user agrees to.
   */
    System.out.println("Enter a number");
    int userNumber = Integer.parseInt(sc.next());
    System.out.println(" number | squared | cubed ");
    System.out.println("------- | ------- | ------");
    for (int h = 0; h < userNumber; h++) {
      int squared = h * h;
      int cubed = h * h * h;
      System.out.printf("%-6d\t", h);
      System.out.print(" | ");
      System.out.printf("%-6d", squared);
      System.out.print(" | ");
      System.out.printf("%-6d", cubed);
      System.out.println();
    }


  /*================== Grades to Numbers ==================
    Todo:Prompt the user to enter an integer.
    Todo:Display a table of squares and cubes from 1 to the value entered.
    Todo:Ask if the user wants to continue.
    Todo:Assume that the user will enter valid data.
    Todo:Only continue if the user agrees to.
   */
    String userContinue;
    do {
      System.out.println("Enter your Grade");
      int grade = Integer.parseInt(sc.next());
      if (grade >= 88) {
        System.out.println("A");
      } else if (grade >= 80) {
        System.out.println("B");
      } else if (grade >= 67) {
        System.out.println("C");
      } else if (grade >= 60) {
        System.out.println("D");
      } else {
        System.out.println("F");
      }
      System.out.println("Do you wish to continue?(y/n)");
      userContinue = sc.next();
    } while (userContinue.equals('y'));
  }
}

