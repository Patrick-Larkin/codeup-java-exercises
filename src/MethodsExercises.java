import util.Input;

import java.util.Scanner;

public class MethodsExercises {
	public static void main(String[] args) {
		/*==============Calling All Methods=============*/
//		System.out.println("Multiplication(num1, num2) = " + Addition(0, 1));
//
//		System.out.println("Subtraction(num1, num2) = " + Subtraction(3, 1));
//
//		System.out.println("Multiplication(num1, num2) = " + Multiplication(1, 3));
//
//		System.out.println("Division(num1, num2) " + Division(4, 1));
//
//		System.out.println("Modulus(num1, num2) = " + Modulus(24, 19));
//
//		factorial(getInteger(1, 25));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of sides for a pair of dice");
		int faces = scanner.nextInt();
		System.out.println("3. 2. 1. Yahtzee");
		Roll(faces);
	}





































		/*==============Methods=============*/

	public static Integer Addition(int num1, int num2) {
		return num1 + num2;
	}

	public static Integer Subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public static Integer Multiplication(int num1, int num2) {
		//return num1 * num2;
		int sum = 0;
		for (int i = num2; i > 0; i--) {
			sum += num1;
		}
		return sum;
	}

	public static Integer Division(int num1, int num2) {
		return num1 / num2;
	}

	public static Integer Modulus(int num1, int num2) {
		return num1 % num2 ;
	}


	//Bonuses:

	public static int getInteger(int min, int max) {
		System.out.print("Enter a number between 1 and 10: ");
		Scanner sc = new Scanner(System.in);
		int userinput = sc.nextInt();

		if (userinput >= min && userinput <= max) {
			System.out.println("All done!");
			return userinput;
		}
		System.out.println("Not in the range");

		System.out.print("Enter a number between 1 and 10: ");
		getInteger(min, max);
		return userinput;
	}


	public static void factorial(int n) {
		Input input = new Input();
		long fact = 0;
		fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		System.out.println("factorial = " + fact);

		if (input.yesNo("Do you wish to continue?(Yes/No)")) {
			factorial(getInteger(1, 25));
		} else {
			System.out.println("Goodbye...");
			return;
		}
	}

	public static void Roll(int faces) {
		int dice1 = (int) (Math.random() * faces + 1);
		int dice2 = (int) (Math.random() * faces + 1);
		int sum = dice1 + dice2;
		System.out.println("dice1 = " + dice1);
		System.out.println("dice2 = " + dice2);
	}
}
