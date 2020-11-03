package util;

import java.util.Scanner;

public class Input {
  private Scanner scanner;
  private int num;
  //============Input============
  public Input(){
    this.scanner = new Scanner(System.in);
  }
  //============Get String============
  public String getString(){
    return this.scanner.nextLine();
  }
  public String getString(String prompt){
    System.out.println(prompt);
    return getString();
  }

  //============Yes No============
  public boolean yesNo(){
    return yesNo("Please enter yes or no");
  }
  public boolean yesNo(String prompt){
    System.out.println(prompt);
    String input = this.scanner.nextLine();
    return (input.trim().toLowerCase().equals("y") ||
            input.trim().toLowerCase().equals("yes"));
  }


  //============Get Int============
  public int getInt(int min,int max){
    return getInt(min,max,"Please enter an integer between "+min+" and "+max);
  }

  public int getInt(int min,int max,String prompt) {
    while (true) {
      System.out.println(prompt);
      String input = scanner.nextLine();
      int num = 0;
      try {
        num = Integer.parseInt(input);
      } catch (NumberFormatException NFExc) {
        System.err.println("Not a valid integer");
        getInt(min, max, prompt);
      }
      if (num >= min && num <= max)
        return num;
    }
  }

  public int getInt(){
    return getInt("Please enter an integer");
  }

  public int getInt(String prompt) {
    String stringInteger = getString("Enter an Valid Integer");
    int aInteger;
    try {
      aInteger = Integer.parseInt(stringInteger);
    } catch (NumberFormatException NFExc) {
      System.err.println("Not a valid integer");
      return getInt(prompt);
    }
    return aInteger;
  }


  //============Get Double============
  public double getDouble(double min,double max){
    while (true) {
      System.out.printf("Please enter a number between %f and %f", min, max);

      String input = scanner.nextLine();
      double num = Double.parseDouble(input);
      if (num >= min && num <= max)
        return num;
    }
  }

  public double getDouble(){
    return getDouble("Please enter an Double");
  }

  public double getDouble(String prompt) {
    String stringDouble = getString(prompt);
    int aDouble;
    try {
      aDouble = Integer.parseInt(stringDouble);
    } catch (NumberFormatException NFExc) {
      System.err.println("Not a valid Double");
      return getDouble(prompt);
    }
    return aDouble;
  }
}