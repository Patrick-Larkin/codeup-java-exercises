//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArraysExercises {
//  private Scanner scanner;
//
//  public static void main(String[] args) {
//
////==============Person==============
//    //Todo: What happens when you run the following code? Why is Arrays.toString necessary?
//    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);
//    //Result:   [I@2c8d66b2
//
//    //Todo: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
//    Person[] people = new String[3];
//    people[0] = new Person("Patrick");
//    people[1] = new Person("Jeffrey");
//    people[2] = new Person("Sean");
//
//    for (int i = 0; i < people.length; i++) {
//      System.out.println("people[i] = " + people[i]);
//    }
//
//    for (Person aPerson : people) {
//      System.out.println("aPerson.getName() = " + aPerson.getName());
//    }
//
//
//    /*Todo:Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array,
//          with the passed person object at the end of the array. */
//
//    System.out.println("Please enter a name you want to add to the list");
//    String addName = scanner.nextLine();
//    addPerson(person[], addName);
//  }
//
//  public static Person[] addPerson(Person[] origninalArray, Person personToAdd) {
//    Person[] newArray = Arrays.copyOf(origninalArray, origninalArray.length + 1);
//    copyOfPerson[3] = "Eileen";
//    System.out.println("Arrays.toString(copyOfPerson) = " + Arrays.toString(copyOfPerson));
//    System.out.println("Arrays.toString(copyOfPerson) == Arrays.toString(copyOfPerson) = " + Arrays.toString(copyOfPerson).equals(Arrays.toString(copyOfPerson)));
//
////    For Loop Printing out the names of copyOfPerson
////    for (String name : copyOfPerson) {
////      Arrays.toString(copyOfPerson);
////      System.out.println("name = " + copyOfPerson);
//    }
//  }
//}
//
