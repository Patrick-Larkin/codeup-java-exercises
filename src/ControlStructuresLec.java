import java.util.Scanner;

public class ControlStructuresLec {
    public static void main(String[] args) {
//        System.out.println("Control Structure Lec");
//        Scanner sc = new Scanner(System.in);
//
//        //Get Employee Id?
//        System.out.print("What is your employee ID?");
//        int operatorID = Integer.parseInt(sc.next());
//
//        //Get Employee Age?
//        System.out.println("What is your Age?");
//        int operatorAge = Integer.parseInt(sc.next());
//
//        //Is signed in?
//        boolean isSignedIn = operatorID == 8922;
//        System.out.println("isSignedIn = " + isSignedIn);
//
//        //Is terminated?
//        boolean isTerminated = operatorID != 8922;
//        System.out.println("isTerminated = " + isSignedIn);
//
//        //Is Age?
//        boolean isMinor = operatorAge < 18;
//        System.out.print("isMinor = " + isMinor);
//
//        //Sell me some ciggies C***
//        boolean canSellTabacco = operatorAge > 17;
//        System.out.println("canSellTabacco = " + canSellTabacco);
//
//        //Can Sell Alcohol?
//        boolean canSellAlcohol = operatorAge >= 21;
//        System.out.println("canSellAlcohol = " + canSellAlcohol);
//
//        //Is restricted?
//        boolean isRestrictedCashier = !canSellAlcohol || !canSellTabacco;
//        System.out.println("isRestrictedCashier = " + isRestrictedCashier);
//
//        //Can sell both
//        boolean canProceed = canSellAlcohol && canSellTabacco;
//        if (canProceed) {
//            System.out.println("You can process the transaction");
//        } else {
//            System.out.println("You do not meet the criteria to sell products");
//        }
//
//
//        if (!isTerminated && isSignedIn) {
//            System.out.println("Start ringing items.");
//        } else if (isTerminated) {
//            System.out.println("Hasta la vista! You are terminate!");
//        } else if (!isSignedIn) {
//            System.out.println("You are not signed in. Please sign in");
//        } else {
//            System.out.println("Cannot Compute");
//        }
//
//        int dayOfWeekNumber = 5;
//        String dayOfWeek = "";
//
//        switch (dayOfWeekNumber) {
//            case 1:
//                dayOfWeek = "Sunday";
//                break;
//            case 2:
//                dayOfWeek = "Monday";
//                break;
//            case 3:
//                dayOfWeek = "Tuesday";
//                break;
//            case 4:
//                dayOfWeek = "Wednesday";
//                break;
//            case 5:
//                dayOfWeek = "Thursday";
//                break;
//            case 6:
//                dayOfWeek = "Friday";
//                break;
//            case 7:
//                dayOfWeek = "Saturday";
//                break;
//            default:
//                System.out.println("Unknown Value entered");
//                break;
//        }
//        System.out.printf("Today is /n", dayOfWeek);

        //While loop
//        int i = 0;
//        while (i <= 10) {
//            System.out.println("Iteration = " + i);
//            i++;
//        }
//
//        //Do While loop
//        int counter = 0;
//        do {
//            System.out.println("Do while loop counter: " + counter);
//            counter++;
//        } while (counter <= 10);
//
//        //For loop
//        for (int loop = 0; loop <= 10; loop++) {
//            System.out.println("For loop: " + loop);
//        }
//
//        //Break and Continue
//        for (int a = 0; a <= 10; a++) {
//            if (a % 2 == 1) {
//                System.out.println("Fizz");
//                continue;
//            } else if (a > 5) {
//                System.out.print("Buzz");
//                continue;
//            } else if (a == = 8) {
//                break;
//            }
//            System.out.println("A = 8 Break!");
//        }

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
    }
}
