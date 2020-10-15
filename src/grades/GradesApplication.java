package grades;

import java.util.HashMap;
//inport scanner
public class GradesApplication {
  public static void main(String[] args) {
    HashMap <String, Student> students = new HashMap<>();

    Student fer = new Student("Fer");
    fer.addGrade(90);
    fer.addGrade(80);
    fer.addGrade(70);
    fer.addGrade(60);

    Student pat = new Student("Patrick");
    pat.addGrade(80);
    pat.addGrade(85);
    pat.addGrade(75);
    pat.addGrade(60);

    students.put("plarkin", pat);
    students.put("fergy", fer);

    cli(students);
  }

  public static void cli(HashMap<String, Student> students) {
    //hello msg
    for (String ghUsername : students. keySet()) {
      System.out.println(ghUsername + " ");
    }
    do {
    System.out.println("What student would you like to see more information on?");
    String username = input.getString();
    String keyTyped = input.getString();
    if (students.containsKey(username)) {
      students.get(keyTyped).getName(),
      keyTyped,
      students.get(keyTyped).getGradeAverage());
    } else {
        System.out.println("Sorry, no student found with the GitHub username of \"%s\".\n", keyTyped);
    } while (input.yesNo("Would you like to see another student?\n"));

//      String quit = scanner.nextLine();
//    } while (!quit.equalsIgnoreCase("no"));
//    System.out.println("Goodbye, and have a wonderful day!");
  }
  }
}
