package oopLecture;
//
//public class Person {
//
//    // SLIDE 3
//        public String firstName;
//        public String lastName;
//        private String password;
//
//    // SLIDE 4
//
////        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }
//
//
//    // SLIDE 7
//        public static long worldPopulation = 7_500_000_000L; // class property
//        public String name;                                  // instance property
//        public int age;
//
//        public static void main(String[] args) {
//
//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
//                Person theBestDrummerAlive = new Person();
//                theBestDrummerAlive.name = "Neil Peart";
//                Person.worldPopulation += 1; // accessing a static property
////                 this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
////                 DONT DO THIS, it will not compile
//                 System.out.println(Person.name);
//
//
//                 DogHelper dogHelperObject = new DogHelper();
//                 double sparkysAge = DogHelperObject.humanToDogYears(3);
//                 System.out.println(sparkysAge);
//                 System.out.println(amountOfFood);
//        }
//}
//
//
//public class DogHelper {
//    public static final int NUMBER_OF_DOG_BREEDS = 340;
//
//    public static final int APPROX_POPULATION_OF_DOGS = 52000000;
//
//    public static double humanToDogYears(double years) {
//        return years * 7;
//    }
//
//    public static double ouncesOfFoodCalculator(double dogWeightInPounds) {
//        return dogWeightInPounds * 0.5;
//    }
//}