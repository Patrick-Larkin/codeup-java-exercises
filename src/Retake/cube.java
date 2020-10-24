package Retake;

public class cube {
	public static int cube(int num) {
		return num * num * num;
	}

	public static int difference(int num1, int num2) {
		int dif = num1 - num2;
		if (dif < 0) {
			return dif * -1;
		}
		return dif;
	}

	public static double average(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum = sum + number;
		}
		return sum / numbers.length;
	}
}
