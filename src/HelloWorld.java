import java.util.Scanner;

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
    //Todo:Inside your project, right click on the src directory and select 'New -> Java Class'.
    //Todo:Name this class HelloWorld.
    public static void main(String[] args) {
        //Todo:Create a program that outputs "Hello, World!" to the console.
        System.out.println("Hello, World!");

        //Todo:Try renaming the main method. What happens when you try to run the program?
         /* Result:
         /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Users/patrick/Desktop/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=64403:/Users/patrick/Desktop/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/patrick/IdeaProjects/codeup-java-exercises/out/production/codeup-java-exercises HelloWorld
          Error: Main method not found in class HelloWorld, please define the main method as:
          public static void main(String[] args)
          or a JavaFX application class must extend javafx.application.Application
         */

        //Todo:System.out.println is used to output information to the console with a newline. System.out.print can be used to output information without a newline. Refactor your code to use two System.out.print statements without changing the output.
        System.out.print("Hello");
        System.out.print("World!");
    }
}