

public class HelloWorld {
    // ================== Introduction To Java ==================
    /*    Java Compared To JavaScript
            Java syntax is very similar JavaScript, however, most of the similarities end there. The major differences between the two include:
            Java is compiled while JavaScript is interpreted.
            Java is statically typed while JavaScript has dynamic typing.
            While JavaScript does have objects, there is much more focus on them in Java, and the way they are defined and used is quite different.
                JavaScript runs (mostly) in the browser, while Java runs almost everywhere.


    Java is Object Oriented. For now, this means that in Java, objects are defined by classes, and all of our code must live inside of a class (or later on, multiple different classes).
        //Let's take a look at the stereotypical Hello World application:
          public class Main {                                            * Defines a class and the name of the class should be the same as the name of the file
              public static void main(String[] args) {                   * This defines our main method, which is the entry point into our application.
                  System.out.println("Hello, World!");                   * Code is written here, and when we define other methods and classes, they will be called from the main method.
              }
          }
    */
    // ================== Introduction To Java Exercises==================
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        System.out.print("Hello");
        System.out.print("World!");
    }
}