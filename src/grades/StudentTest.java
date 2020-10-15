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