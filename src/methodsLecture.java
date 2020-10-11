import java.util.Scanner;

//public class methodsLecture {
//    public static void main(String[] arg) {
//        Scanner sc = new Scanner(System.in);
//        //    public static returnType methodName([param1[, param2[, ...]]) {
//        //      the statements of the method
//        //      return statement, if a return type is declared
//        //    }
//        System.out.println(sayHello("Patrick"));
//
//        System.out.println(Addition(1, 8));
//        System.out.println(Subtraction(2, 8));
//        System.out.println(Multiplication(3, 8));
//        System.out.println(Division(8, 4));
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//        System.out.println(getInteger(userInput));
//    }

    //Example
//    public static String sayHello(String name) {
//        return String.format("Hello, %s!\nHELLO, %s!", name, name.toUpperCase());
//    }
    //Let's take a look at all the individual pieces of the method definition in the example above:
    //public -- this is the visibility modifier.
    //static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.
    //String -- this is the return type of the method.
    //sayHello -- the name of the method.
    //(String name) -- the parameter the method accepts.
    //A method can be defined with no parameters, one parameter (like in our example), or multiple parameters (separated by commas). A type must be specified for each parameter.
    //Everything inside the curly braces is the body of the method.


    //Calling Methods
    //When we call a function, we call it with arguments. Arguments can be literal values, variables, or themselves expressions, but the data type of the arguments must be the same as the data type of the parameters that the method is defined with
    //Here are some examples of calling methods:
    //startApplication();                         // called with no arguments
    //logInfo("User #214 registered!");           // called with one argument
    //addAttribute("loggedInUser", loggedInUser); // called with multiple arguments


    //Method Overloading
    //Is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.

    // version 1
    //public static void sayHello(int times) {
    //    for (int i = 0; i < times; i += 1) {
    //        sayHello();
    //    }
    //}

    // version 2
    //public static void sayHello() {
    //    sayHello("Hello", "World");
    //}

    // version 3
    //public static void sayHello(String name) {
    //    sayHello("Hello", name);
    //}

    // version 4
    //public static void sayHello(String greeting, String name) {
    //    System.out.println(greeting + ", " name "!");
    //}
    //When we call sayHello, the code that will be run depends on the arguments we pass to it. For example when we call it like this:


    //    //Exercises
//    public static Integer Addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static Integer Subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static Integer Multiplication(int num1, int num2) {
//        int multiply = 0;
//        for (int i = 1; i <= num2; i++) {
//            multiply = num1 + num1;
//        }
//        return multiply;
////        todo:broken
//    }
//
//    public static Integer Division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int getInteger(int userInput) {
//        for (int f = 0; f < userInput; f--) {
//            return f;
//        }
//    }
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//}
