import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//int[] numbers = {1, 2, 3, 4, 5};
		//System.out.println(Arrays.toString(numbers));

		/*Array list of Person objects*/
		Person[] people = new Person[3];
		people[0] = new Person("Patrick");
		people[1] = new Person("Jeffrey");
		people[2] = new Person("Sean");

		System.out.println("First round of names.");
		for (Person addPerson : people) {
			System.out.println("aPerson.getName() = " + addPerson.getName());
		}
		System.out.println();

		/*Input get input add name*/
		System.out.println("Please enter a name you want to add to the list");
		String addName = scanner.nextLine();


		/*New person array*/
		Person[] newArray = addPerson(people, new Person(addName));

		System.out.println("Second round of names.");
		for (Person aPerson : newArray) {
			System.out.println("aPerson.getName() = " + aPerson.getName());
		}
	}

	public static Person[] addPerson(Person[] tempArray, Person personToAdd){
		tempArray = Arrays.copyOf(tempArray, tempArray.length+1);
		tempArray[tempArray.length-1] = personToAdd;
		return tempArray;
	}
}