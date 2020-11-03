import java.util.Scanner;

public class ConsoleExercises {
	public static void main(String[] arg) {
		// ================== Java Syntax, Data Types, and Variables Exercises ==================
		// Pi exercise
		double pi = 3.14159;
		System.out.printf("The value of pi is approximately %n.2f\n", pi);

		//Fav Int
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your favorite number");
		int favNumber = sc.nextInt();
		System.out.printf("Cool %h is my favorite number too", favNumber);


		//3 words
		System.out.println("\nEnter 3 words");
		String wordA = sc.next();
		String wordB = sc.next();
		String wordC = sc.next();
		System.out.printf("Word A: %s\n Word B: %s\n Word C: %s\n", wordA, wordB, wordC);


		/*Sentence - Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.*/
		System.out.println("\nEnter a sentence");
		Scanner sentence = new Scanner(System.in);
		String quote = sentence.nextLine();
		System.out.printf("Wow \"%s\" is what you wrote.\n", quote);

		//Classroom - final bonus causes syntax error
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
