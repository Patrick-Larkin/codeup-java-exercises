

public class ArrayLecture {
  public static void main(String[] args) {
    /*==============Declarations==============
    In Java, arrays are a special kind of object that contain zero or more items called elements.
    Array elements can be any valid type (including a custom class we've defined ourselves), but all elements must be of the same type.
    An array type is defined by suffixing an existing type with square brackets

    Here, we'll define a variable named prices whose type is an array where each element is a double: */
    double[] prices = new double[3];
    prices[0] = 1.0;
    prices[1] = 2.5;
    prices[2] = 8.0;
    //Here, we'll define a variable named prices whose type is an array where each element is a double that must be defined when they are created.


    //The size of the array can be either a literal (like in the example above), a constant, or a variable.
      //final int NUMBER_OF_BEATLES = 4;
      //BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];

    //An array's size and and elements can both be defined when it is created with array initializer syntax.*/
      //String[] beatles = {"John", "Paul", "Ringo"};
      //System.out.println(beatles.length); // 3


    /*==============Iterating==============
    We can use the length property of any array in combination with a looping construct object to iterate over it.
    */
    String[] languages = {"html", "css", "javascript", "java"};

    System.out.println("For loop");
    for (int i = 0; i < languages.length; i += 1) {
      System.out.println(languages[i]);
    }

    //Java provides an enhanced for that is similar to a forEach in JavaScript. It is useful when we want to do something for every item in an array
    System.out.println("Enhanced for loop");
    for (String language : languages) {
      System.out.println(language);
    }
    //When using the enhanced for, we must specify what collection we are iterating over, a variable to hold each element, and the type of each element in the collection.


    /*==============The Arrays Class==============
    The java.util.Arrays class contains static methods for common array manipulation tasks.
    All methods can accept arrays of primitive data types or of objects, and all index arguments must be of the type int.
    Some of the most common methods:

    void Arrays.fill(arrayName, value)
    - Fills all elements of the specified array with the specified value.

    boolean Arrays.equals(array1, array2)
    - Returns true if both arrays are of the same type and all of the elements within the arrays are equal to each other.

    array Arrays.copyOf(array, length)
    - Returns a copy of the given array with the specified length.

    String Arrays.toString(array)
    - Returns a string representation of the array.

    void Arrays.sort(array)
    - Sorts the elements of an array into ascending order.
    */

    /*==============The Arrays Class==============
      We can define an array whose elements are themselves arrays. This is called a two-dimensional array, or a matrix.
      You can think of a two-dimensional array like a grid, with rows and columns.

      Let's take a look at an example: */
        int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
        };

        // access the first element in the second row
        System.out.println(matrix[1][0]); // 4
        // the last element in the first row
        System.out.println(matrix[0][2]); // 3
        // the first element in the last row
        System.out.println(matrix[2][0]); // 7


    //We can also iterate over the rows in a matrix, and, within the loop iterating over the rows, iterate over each element in each row with a nested loop:
      for (int[] row : matrix) {
        System.out.println("+---+---+---+");

        System.out.print("| ");

        for (int n : row) {
          System.out.print(n + " | ");
        }

        System.out.println();
      }

      System.out.println("+---+---+---+");


    //==============Further Reading==============
    //Arrays Tutorial                 https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
  }
}















//    //==============Names==============
//    String[] names = {"Patrick", "Doug", "Dan",};
//
//    int[] numbers = new int[8];
//    int[] othernumbers = new int[8];
//
//
//    System.out.println("prices[0] = " + prices[0]);
//    System.out.println("prices[2] = " + prices[2]);
//    System.out.println(names[0]);
//    System.out.println(names[1]);
//    System.out.println(names[2]);
//
//    for (int i = 0; i < prices.length; i++) {
//      System.out.println("prices[i] = " + prices[i]);
//    }
//
//    for(String name: names) {
//      System.out.println("name = " + name);
//    }
//
//    Arrays.fill(numbers, 10);
//    System.out.println("Arrays.toString() = " + Arrays.toString(numbers));
//
//    Arrays.fill(othernumbers, 5);
//    System.out.println("Arrays.toString() = " + Arrays.toString(othernumbers));
//
//    //==============Array Comparison==============
//    System.out.println("Arrays.equals(other) = " + Arrays.equals(othernumbers, numbers));
//    System.out.println("Arrays.equals(other) = " + Arrays.equals(othernumbers, othernumbers));
//
//    //==============Array Copy==============
//    String[] copyOfNames  = Arrays.copyOf(names,names.length+1);
//    copyOfNames[3] = "Sean";
//    System.out.println("copyOfNames = " + Arrays.toString(copyOfNames));
//
//    //==============Matrix==============