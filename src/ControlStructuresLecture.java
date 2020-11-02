import java.util.Scanner;
//Most of the content of this lesson should be a review, as the concepts are the same as in JavaScript, but you should focus on the parts that are unique to Java.

public class ControlStructuresLecture {
  public static void main(String[] args) {
    /* ================== Boolean Expressions ==================
    an expression that evaluates to a boolean value, that is, either true or false
      Operator	    Name                            Operator	Name	Description
      ==	          Equality                        &&	      And	    Returns a true value if both expressions are true. This operator only evaluates the second expression if necessary.
      !=	          Inequality                      ||	      Or	    Returns a true value if either expression is true. This operator only evaluates the second expression if necessary.
      >	            Greater Than                    &	        And	    Returns a true value if both expressions are true. This operator always evaluates both expressions.
      <	            Less Than                       |	        Or	    Returns a true value if either expressions is true. This operator always evaluates both expressions.
      >=	          Greater Than Or Equal           !	        Not	    Reverses the value of the expression.
      <=	          Less Than Or Equal


    ================== String Comparison ==================
    In JS we use == or === to compare expressions but in Java its just .equals or .equalsIgnoreCase
     Scanner sc = new Scanner(System.in);
     System.out.print("Continue? [y/N] ")
     String userInput = sc.next();

     Do this instead:
     boolean confirmation = userInput.equals("y");


    ================== Control Structures ==================
    Allows us to control the flow of execution of our code, either executing code conditionally, or repeatedly.
    Java has the same control structures as JavaScript, the only difference is that the condition part of the control structures must evaluate to a boolean value.
      Our control structures fall into two categories:
        Selection Statements (Conditionals)
        Control structures that conditionally execute code. Includes the if and switch statements.

        Loops
        Control structures that repeatedly execute code. Includes the while, do, and for loops.

        //If Statement
          if (condition) {
            conditional code
          } else if (someOtherCondition) {
              executes if someOtherCondition is true *and* all of the previous ifs in this block were false
          } else {
              // executes if none of the conditions checked in this block were true
          }
    */
    Scanner sc = new Scanner(System.in);
    //Get Employee Id?
    System.out.print("What is your employee ID?");
    int operatorID = Integer.parseInt(sc.next());

    //Get Employee Age?
    System.out.println("What is your Age?");
    int operatorAge = Integer.parseInt(sc.next());

    //Is signed in?
    boolean isSignedIn = operatorID == 8922;
    System.out.println("isSignedIn = " + isSignedIn);

    //Is terminated?
    boolean isTerminated = operatorID != 8922;
    System.out.println("isTerminated = " + isSignedIn);

    //Is Age?
    boolean isMinor = operatorAge < 18;
    System.out.print("isMinor = " + isMinor);

    //Sell me some ciggies C***
    boolean canSellTabacco = operatorAge > 17;
    System.out.println("canSellTabacco = " + canSellTabacco);

    //Can Sell Alcohol?
    boolean canSellAlcohol = operatorAge >= 21;
    System.out.println("canSellAlcohol = " + canSellAlcohol);

    //Is restricted?
    boolean isRestrictedCashier = !canSellAlcohol || !canSellTabacco;
    System.out.println("isRestrictedCashier = " + isRestrictedCashier);

    //Can sell both
    boolean canProceed = canSellAlcohol && canSellTabacco;
    if (canProceed) {
      System.out.println("You can process the transaction");
    } else {
      System.out.println("You do not meet the criteria to sell products");
    }

    if (!isTerminated && isSignedIn) {
      System.out.println("Start ringing items.");
    } else if (isTerminated) {
      System.out.println("Hasta la vista! You are terminate!");
    } else if (!isSignedIn) {
      System.out.println("You are not signed in. Please sign in");
    } else {
      System.out.println("Cannot Compute");
    }

    /*Switch Statement
       witch statements can be thought of as a special case of the if-else if block; one where we are comparing a given value
         int caseSwitch = declaration;

         switch (caseSwitch) {
             case 1:
                 System.out.println("Case 1");
                 // Fall through!
             case 2:
                 System.out.println("Case 2");
                 break;
             default:
                 System.out.println("Default case");
                 break;
         }
       In Java, all values in the case labels of a given switch statement must be of the same type. In addition, they must also be either literals, or final variables.
     */
    int dayOfWeekNumber = 5;
    String dayOfWeek = "";

    switch (dayOfWeekNumber) {
      case 1:
        dayOfWeek = "Sunday";
        break;
      case 2:
        dayOfWeek = "Monday";
        break;
      case 3:
        dayOfWeek = "Tuesday";
        break;
      case 4:
        dayOfWeek = "Wednesday";
        break;
      case 5:
        dayOfWeek = "Thursday";
        break;
      case 6:
        dayOfWeek = "Friday";
        break;
      case 7:
        dayOfWeek = "Saturday";
        break;
      default:
        System.out.println("Unknown Value entered");
        break;
    }
    System.out.printf("Today is /n", dayOfWeek);


    /* While Loop
       A while loop executes the body of the loop as long as the loop condition evaluates to true. The condition will be evaluated before the body of the loop executes, and after the body of loop finishes.
         while (condition) {
           // loop body
         }
     */
    int i = 0;
    while (i <= 10) {
      System.out.println("Iteration = " + i);
      i++;
    }


    /*Do Loop
      A while loop executes the body of the loop as long as the loop condition evaluates to true. The condition will be evaluated before the body of the loop executes, and after the body of loop finishes.
        do {
          //Statements
        } while(condition);
      Same as a while loop, except that the body of the loop will execute before the condition is evaluated.
    */
    int counter = 0;
    do {
      System.out.println("Do while loop counter: " + counter);
      counter++;
    } while (counter <= 10);


    /*For Loop
      useful when we know ahead of time how many times our loop needs to execute.
        for(init; condition;update) {
          // statements
        }
    */
    for (int loop = 0; loop <= 10; loop++) {
      System.out.println("For loop: " + loop);
    }


    /*Break And Continue
      break statement is used to exit the current loop
       // print the numbers 1 through 5
         for(int i = 1; i < 100; i++) {
             System.out.println(i);
             if (i == 5) {
                 break; // --------------+
             } //                        |
         } //                            |
         // <----------------------------+

      continue statement is used to skip any remaining statements in the current loop and jump to the top of the current loop
        for(int i = 1; i <= 10; i++) { // <--+
          if(i % 2 == 1) { //              |
              continue; // ----------------+
          }
          System.out.println(i);
        }
    */
    for (int a = 0; a <= 10; a++) {
      if (a % 2 == 1) {
        System.out.println("Fizz");
      } else if (a > 5) {
        System.out.print("Buzz");
      } else if (a == 8) {
        break;
      }
    }
  }
}
