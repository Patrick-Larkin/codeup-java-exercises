import java.util.Arrays;

public class arrayLecture {
  public static void main(String[] args) {
    //==============Declarations==============
    double[] prices = new double[3];
    prices[0] = 1.0;
    prices[1] = 2.5;
    prices[2] = 8.0;
    //==============Names==============
    String[] names = {"Patrick", "Doug", "Dan",};

    int[] numbers = new int[8];
    int[] othernumbers = new int[8];


    System.out.println("prices[0] = " + prices[0]);
    System.out.println("prices[2] = " + prices[2]);
    System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names[2]);

    for (int i = 0; i < prices.length; i++) {
      System.out.println("prices[i] = " + prices[i]);
    }

    for(String name: names) {
      System.out.println("name = " + name);
    }

    Arrays.fill(numbers, 10);
    System.out.println("Arrays.toString() = " + Arrays.toString(numbers));

    Arrays.fill(othernumbers, 5);
    System.out.println("Arrays.toString() = " + Arrays.toString(othernumbers));

    //==============Array Comparison==============
    System.out.println("Arrays.equals(other) = " + Arrays.equals(othernumbers, numbers));
    System.out.println("Arrays.equals(other) = " + Arrays.equals(othernumbers, othernumbers));

    //==============Array Copy==============
    String[] copyOfNames  = Arrays.copyOf(names,names.length+1);
    copyOfNames[3] = "Sean";
    System.out.println("copyOfNames = " + Arrays.toString(copyOfNames));

    //==============Matrix==============

  }
}
