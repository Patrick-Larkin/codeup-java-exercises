public class SyntaxLecture {
    public static void main(String[] args) {

        // ================== STATEMENTS ==================
        // Statements may be...
        // Declarations                 int x;
        // Assignment expressions       x = 3;
        //Any use of ++ or --           x++; or --x;
        // Method invocations           Math.random();
        // Object creation expressions  SomeObject = new SomeObject();


        // ================== DATA TYPES ==================
        //int primitiveExample = 3;
        //Student referenceExample = new Student();
        // use the smallest type needed for the job

        // primitive types...
        //byte             Very short integers from -128 to 127                                                                           byte age = 32; //byte
        //short            Short integers from -32,768 to 32,767                                                                          short minimumAnnualSalary = 15080;//short
        //int 	           integers from -2,147,483,648 to 2,147,483,647                                                                  int  distanceToSaturn = 1200000000;//int
        //long 	           Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807                                     long  numberOfHumanCells = 37000000000000L; // L needed for compiler//long
        //float	           Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits                float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler//float
        //double           Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits             double widthOfAtomInMeters = .00000000001;//double
        //char 	           A single Unicode character that’s stored in two bytes                                                          char seatingSection = 'M'; // must wrap in single quotes//char
        //boolean          A true or false value                                                                                          boolean everythingIsAwesome = false;//boolean


        // ================== Strings ==================
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


        // ================== Concatenation ==================
        //String Name = "Patrick";
        //System.out.printf("Hello, my name is %n", Name);


        // ================== Input ==================
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter your first name");
        //String firstName = sc.next();
        //String lastName = sc.next();
        //System.out.printf("Hello, %s %s", firstName, lastName);


        // ================== Print ==================
        //System.out.println("\nWhat is your favourite quote");
        //String quote = sc.nextLine();
        //System.out.printf("Wow \"%s\" is a great quote.\n", quote);
    }
}