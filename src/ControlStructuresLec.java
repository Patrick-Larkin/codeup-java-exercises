import java.util.Scanner;

public class ControlStructuresLec {
    public static void main(String[] args) {
        System.out.println("Control Structure Lec");
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

        //While loop
        int i = 0;
        while (i <= 10) {
            System.out.println("Iteration = " + i);
            i++;
        }

        //Do While loop
        int counter = 0;
        do {
            System.out.println("Do while loop counter: " + counter);
            counter++;
        } while (counter <= 10);

        //For loop
        for (int loop = 0; loop <= 10; loop++) {
            System.out.println("For loop: " + loop);
        }

        //Break and Continue
        for (int a = 0; a <= 10; a++) {
            if (a % 2 == 1) {
                System.out.println("Fizz");
                continue;
            } else if (a > 5) {
                System.out.print("Buzz");
                continue;
            } else if (a == 8) {
                break;
            }
            System.out.println("A = 8 Break!");
        }


// Exercises
//While
        int t = 5;
        while (t <= 15) {
            System.out.println(t);
            t++;
        }

//Do while #1
        int a = 0;
        do {
            a = a + 2;
            System.out.println("Do while loop counter A: " + a);
        } while (a < 100);

//Do while #2
        int b = 100;
        do {

            System.out.println("Do while loop counter B: " + b);
            b = b - 5;
        } while (b > -10);

//Do while #3
        long c = 2;
        do {
            System.out.println("Do while loop counter C: " + c);
            c *= c;
        } while (c < 1000000L);

//For loop #1
        for (int d = 100; d > -10; d-=5) {
            System.out.println("For loop counter D: " + d);
        }
//For loop #2
        for (long e = 2; e <= 10000; e*=e) {
            System.out.println("For loop counter E: " + e);
        }
//Fizz Buzz
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
//Table of Powers
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

//Grades to Numbers
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
