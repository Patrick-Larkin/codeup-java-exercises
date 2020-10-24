package grades;

//imports
import util.Input;

import java.util.HashMap;

public class GradesApplication {
  public static void main(String[] args) {
    //initialize
    HashMap<String, Student> students = new HashMap<>();

    //Student #1 added
    Student fer = new Student("Fer");
    fer.addGrade(90);
    fer.addGrade(80);
    fer.addGrade(70);
    fer.addGrade(60);

    //Student #2 added
    Student pat = new Student("Patrick");
    pat.addGrade(80);
    pat.addGrade(85);
    pat.addGrade(75);
    pat.addGrade(60);

    //Student #3 added
    Student sean = new Student("Sean");
    pat.addGrade(80);
    pat.addGrade(85);
    pat.addGrade(75);
    pat.addGrade(60);

    //Student #4 added
    Student jr = new Student("Jeff");
    pat.addGrade(80);
    pat.addGrade(85);
    pat.addGrade(75);
    pat.addGrade(60);

    //Student #5 added
    Student kelly = new Student("Kelly");
    pat.addGrade(80);
    pat.addGrade(85);
    pat.addGrade(75);
    pat.addGrade(60);

    //Add Keymap (String: "name", Object: (phone, email))
    students.put("plarkin", pat);
    students.put("fergy", fer);
    students.put("slarkin", sean);
    students.put("gkelly", kelly);
    students.put("jlarkin", jr);

    //call interface()
    cli(students);
  }

  public static void cli(HashMap<String, Student> students) {
    //initialize
    Input input = new Input();

    //Start interface
    System.out.println("Welcome!");

    //For Loop displaying users
    for (String ghUsername : students.keySet()) {
      System.out.print(ghUsername + "  ");
    }
    System.out.println();

    //Do while loop retrieving user and grade based on input
    do {
      System.out.println("What student would you like to see more information on?");
      String keyTyped = input.getString().trim();
      //If statement returning data for valid input
      if (students.containsKey(keyTyped)) {
        System.out.printf("Name: %s - GitHub Username: %s\n" + "Current Average: %f\n", students.get(keyTyped).getName(), keyTyped, students.get(keyTyped).getGradeAverage());
        //If statement for invalid input
      } else {
        System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", keyTyped);
        //End of Do while loop if
      }
    } while (input.yesNo("Would you like to see another student?\n"));
    System.out.println("Goodbye, and have a wonderful day!");
  }
}
