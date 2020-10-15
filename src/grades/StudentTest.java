package grades;

import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Student fer = new Student("Fer");
    fer.addGrade(90);
    fer.addGrade(80);
    fer.addGrade(70);
    fer.addGrade(60);

    System.out.println("fer.getGradeAverage() = " + fer.getGradeAverage());
  }
}

//    System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:");
//    for (Student names : Student) { //Todo: Expression expected
//      usernames.displayStudents();
//    }
//
//
//    do {
//      System.out.println("What student would you like to see more information on?");
//      String studentInfo = scanner.nextLine();
//      if (Student.indexOf(studentInfo)) {
//        studentInfo.displayStudentInfo();
//      } else {
//        System.out.println("Sorry, no student found with the GitHub username of \"%s\".\n", studentInfo);
//      }
//      String quit = scanner.nextLine();
//    } while (!quit.equalsIgnoreCase("no"));
//    System.out.println("Goodbye, and have a wonderful day!");
//  }