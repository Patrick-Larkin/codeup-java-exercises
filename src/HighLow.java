import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("    ___       ___       ___       ___       ___       ___       ___   \n" +
						"   /\\__\\     /\\  \\     /\\  \\     /\\__\\     /\\__\\     /\\  \\     /\\__\\  \n" +
						"  /:/__/_   _\\:\\  \\   /::\\  \\   /:/__/_   /:/  /    /::\\  \\   /:/\\__\\ \n" +
						" /::\\/\\__\\ /\\/::\\__\\ /:/\\:\\__\\ /::\\/\\__\\ /:/__/    /:/\\:\\__\\ /:/:/\\__\\\n" +
						" \\/\\::/  / \\::/\\/__/ \\:\\:\\/__/ \\/\\::/  / \\:\\  \\    \\:\\/:/  / \\::/:/  /\n" +
						"   /:/  /   \\:\\__\\    \\::/  /    /:/  /   \\:\\__\\    \\::/  /   \\::/  / \n" +
						"   \\/__/     \\/__/     \\/__/     \\/__/     \\/__/     \\/__/     \\/__/  ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(" __             ___  __  \n" +
						"|__) |  | |    |__  /__` \n" +
						"|  \\ \\__/ |___ |___ .__/ \n" +
						"                         ");
		System.out.println("1)Game picks a random number between 1 and 100." +
						"\n2) Player will attempt to guess the number" +
						"\n3) If your guess is less than the number, it outputs \"HIGHER\"" +
						"\n\t If user's guess is more than the number, it outputs \"LOWER\"." +
						"\n\t If a user guesses the number, the game should declare \"GOOD GUESS!\"");
		System.out.println();
		System.out.println();

//		Todo: Broken difficulty level
//		System.out.println("1)Easy = 20 attempts");
//		System.out.println("2)Medium = 15 attempts");
//		System.out.println("3)Hard = 10 attempts");
//		System.out.println("4)Insane = 5 attempts");
//		System.out.println("5)Lucky = 1 attempts");
//		System.out.println("\nChoose difficulty:");
//		int difficulty = scanner.nextInt();
//		switch (difficulty) {
//			case 1:
//				System.out.println("Dificulty chosen: Easy = 20 attempts");
//				game(20);
//				break;
//			case 2:
//				System.out.println("Dificulty chosen: Medium = 15 attempts");
//				game(15);
//				break;
//			case 3:
//				System.out.println("Dificulty chosen: Hard = 10 attempts");
//				game(20);
//				break;
//			case 4:
//				System.out.println("Dificulty chosen: Insane = 5 attempts");
//				game(5);
//				break;
//			default:
//				System.out.println("Dificulty chosen: Lucky = 1 attempts");
//				game(1);
//				break;
		game();
		}

	public static void game() {
		Scanner scanner = new Scanner(System.in);
		int playerGuess;
		int attempts = 1;
		int cpu = (int) (Math.random() * 100 + 1);

		System.out.println("Guess a number between 1 and 100:");
		while ((playerGuess = scanner.nextInt()) != cpu) {
			if (playerGuess < cpu) {
				System.out.println("Attempt " + attempts + ") HIGHER");
				attempts += 1;
			} else if (playerGuess > cpu) {
				System.out.println("Attempt " + attempts + ") LOWER");
				attempts += 1;
			}
		}
		System.out.println("GOOD GUESS!\n" + "Attempts: " + attempts);
	}
}