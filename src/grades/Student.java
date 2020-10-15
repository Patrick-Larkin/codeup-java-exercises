package grades;

import java.util.ArrayList;

//Todo: Create a Student class
public class Student {
  private String name;
  private ArrayList<Integer> grades; //Todo: The grades property should be an ArrayList of integers. ArrayList<Integer> grades = new ArrayList<>()

  public Student(String aName) {
    this.name = aName;
    this.grades = new ArrayList<>(); //initializes the grades property as an empty ArrayList.
  }

  // returns the student's name
  public String getName() {
    return name;
  }

  // adds the given grade to the grades property
  public void addGrade(int grade) {
    grades.add(grade);
  }

  // returns the average of the students grades
  public double getGradeAverage() {
    double sum = 0;
    for (int grade : this.grades) {
      sum += grade;
    } return sum / grades.size();
  }
}




//public void displayStudents(usernames){ //Error: Parameter expected   Unknown class: 'name'   Identifier expected
//  System.out.printf("|%s|\t", usernames.get);
//}

//public void displayStudentInfo(usernames,int grades){ //Error: Parameter expected   Unknown class: 'name'   Identifier expected
//  System.out.printf("Name: %s - GitHub Username: %s\n" + "Current Average: %f",usernames.get,usernames,getGradeAverage(int grade));
//}

//public int getGradeAverage(int grades){
//  return grades/grades.size(); //Error: Cannot resolve method 'size()'
//}

//public String getName(){
//  return name;
//}

//public void addGrade(int grade){
//  grades.add(grade); //Error: cannot resolve method 'add(int)'
//}

//// returns the average of the students grades

// //Error: 'class' or 'interface' expected

