import java.util.Scanner;
public class syntaxLecture {
    public static void main(String[] args) {

        // ================== STATEMENTS

        // Statements may be...
        // Declarations
        //int x;

        // Assignment expressions
        //x = 3;

        // Any use of ++ or --
        //x++;
        //--x;

        // Method invocations
        //Math.random();

        // Object creation expressions
        //SomeObject = new SomeObject();

        // ================== DATA TYPES ==================

//        int primitiveExample = 3;

        //Student referenceExample = new Student();
        // use the smallest type needed for the job

        // primitive types...
        //byte age = 32; //byte	   Very short integers from -128 to 127
        //short minimumAnnualSalary = 15080;//short	   Short integers from -32,768 to 32,767
        //int distanceToSaturn = 1200000000;//int	   integers from -2,147,483,648 to 2,147,483,647
        //long numberOfHumanCells = 37000000000000L; // L needed for compiler//long	   Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler//float	   Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        //double widthOfAtomInMeters = .00000000001;//double   Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        //char seatingSection = 'M'; // must wrap in single quotes//char	   A single Unicode character that’s stored in two bytes
        //boolean everythingIsAwesome = false;//boolean  A true or false value

        // strings (not a primitive type)
        //String thisIsAString = "Hello";
        //like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting

        //special characters
        //"\"" // => "
        //"\\" // => \
        //"\n" // => the newline character
        //"\t" // => the tab character


        // ================== VARIABLES ==================
        // declaration separate from initialization
        //int seven;
        //seven = 7;

        // declaration and initialization
        //int eight = 8;


        // ================== CASTING ==================
        //Casting is coercing a value of one type into another. There are two types of casting, implicit casting and explicit casting.
        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/
        // implicit casting - less to more precise (widening)
        //float num1 = 2.22F;
        //double num2 = num1;

        // explicit casting - more to less explicit casting (narrowing)
        //double num3 = 3.1;
        //float num4 = (float) num3;


        // ================== ?? ==================
        //String Name = "Patrick";
        //System.out.printf("Hello, my name is %n", Name);

        // ================== Input ==================
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter your first name");
        //String firstName = sc.next();
        //String lastName = sc.next();
        //System.out.printf("Hello, %s %s", firstName, lastName);


        //System.out.println("\nWhat is your favourite quote");
        //String quote = sc.nextLine();
        //System.out.printf("Wow \"%s\" is a great quote.\n", quote);


        // ================== Exercises ==================
        //Pi exercise
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %n.2f", pi);

        //Fav Int
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite number");
        int favNumber = sc.nextInt();
        System.out.printf("Cool %h is my favorite number too", favNumber);


        //3 words
        System.out.println("\nEnter 3 words");
        String wordA = sc.next();
        String wordB = sc.next();
        String wordC = sc.next();
        System.out.printf("Word A: %s\n Word B: %s\n Word C: %s\n", wordA, wordB, wordC);
        //Todo:Return and fix


        //Sentence
        System.out.println("\nEnter a sentence");
        Scanner sentence = new Scanner(System.in);
        String quote = sentence.nextLine();
        System.out.printf("Wow \"%s\" is what you wrote.\n", quote);

        //Classroom
        //Todo:final bonus causes syntax error
        System.out.print("Enter length of classroom at Codeup\n");
        double length = Integer.parseDouble(sc.nextLine());
        System.out.print("Enter width of a classroom at Codeup\n");
        double width = Integer.parseFloat(sc.nextLine());
        System.out.print("Enter height of a classroom at Codeup\n");
        double height = Integer.parseInt(sc.nextLine());
        double area = length * width;
        double volume = length * width * height;
        System.out.printf("L:%s x W:%s x H:%s\n", length, width, height);
        System.out.printf("The area of the classroom is: %s\n", area);
        System.out.printf("The volume of the classroom is: %s", volume);

        //Misc

    }
}