import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] arg) {
        // ================== Java Syntax, Data Types, and Variables Exercises ==================
        // Pi exercise
        //Todo: Write some Java code that uses the variable pi to output the following:
        //Todo: Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %n.2f\n", pi);

        //Fav Int
        //Todo: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //Todo:What happens if you input something that is not an integer?
            /* Result:
            Exception in thread "main" java.util.InputMismatchException
	          at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	          at java.base/java.util.Scanner.next(Scanner.java:1594)
	          at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	          at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	          at ConsoleExercises.main(ConsoleExercises.java:17)
             */
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite number");
        int favNumber = sc.nextInt();
        System.out.printf("Cool %h is my favorite number too", favNumber);


        //3 words
          //Todo: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
          //Todo:What happens if you enter less than 3 words?
                //Forced me to enter 3 words
          //Todo:What happens if you enter more than 3 words?
                //Deleted Fourth Word
             System.out.println("\nEnter 3 words");
             String wordA = sc.next();
             String wordB = sc.next();
             String wordC = sc.next();
             System.out.printf("Word A: %s\n Word B: %s\n Word C: %s\n", wordA, wordB, wordC);


        //Sentence
            //Todo: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
              System.out.println("\nEnter a sentence");
              Scanner sentence = new Scanner(System.in);
              String quote = sentence.nextLine();
              System.out.printf("Wow \"%s\" is what you wrote.\n", quote);

        //Classroom
        //Todo:final bonus causes syntax error
        System.out.print("Enter length of classroom at Codeup\n");
        double length = Integer.parseInt(sc.nextLine());
        System.out.print("Enter width of a classroom at Codeup\n");
        double width = Integer.parseInt(sc.nextLine());
        System.out.print("Enter height of a classroom at Codeup\n");
        double height = Integer.parseInt(sc.nextLine());
        double area = length * width;
        double volume = length * width * height;
        System.out.printf("L:%s x W:%s x H:%s\n", length, width, height);
        System.out.printf("The area of the classroom is: %s\n", area);
        System.out.printf("The volume of the classroom is: %s", volume);
    }
}
