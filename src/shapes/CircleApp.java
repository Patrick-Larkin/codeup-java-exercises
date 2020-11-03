package shapes;
import util.Input;

public class CircleApp {
  public static void main(String[] args) {
    System.out.println("\n" +
            " __          __  _                            _          __  __            _       _       _____ _                 _____ _                 \n" +
            " \\ \\        / / | |                          | |        |  \\/  |          (_)     ( )     |  __ (_)               / ____| |                \n" +
            "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   | \\  / | __ _ _ __ _  ___ |/ ___  | |__) | __________ _  | (___ | |__   ___  _ __  \n" +
            "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | |\\/| |/ _` | '__| |/ _ \\  / __| |  ___/ |_  /_  / _` |  \\___ \\| '_ \\ / _ \\| '_ \\ \n" +
            "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | a|| (_) | | |  | | (_| | |  | | (_) | \\__ \\ | |   | |/ / / / (_| |  ____) | | | | (_) | |_) |\n" +
            "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|  |_|\\__,_|_|  |_|\\___/  |___/ |_|   |_/___/___\\__,_| |_____/|_| |_|\\___/| .__/ \n" +
            "                                                                                                                                    | |    \n" +
            "                                                                                                                                    |_|    \n");
    System.out.println("\n" +
            "  __  __              \n" +
            " |  \\/  |___ _ _ _  _ \n" +
            " | |\\/| / -_) ' \\ || |\n" +
            " |_|  |_\\___|_||_\\_,_|\n");
    System.out.print("\n" +
            "  ___            _ _                    ___   _            \n" +
            " / __|_ __  __ _| | |                  ( _ ) (_)_ _        \n" +
            " \\__ \\ '  \\/ _` | | |                  / _ \\ | | ' \\       \n" +
            " |___/_|_|_\\__,_|_|_|                  \\___/_|_|_||_|      \n" +
            " |  \\/  |___ __| (_)_  _ _ __          / |_  |_)_ _       \n" +
            " | |\\/| / -_) _` | | || | '  \\         | |/ /| | ' \\      \n" +
            " |_|  |_\\___\\__,_|_|\\_,_|_|_|_|        |_/___|_|_||_|     \n" +
            " | |   __ _ _ _ __ _ ___               / |/ /(_)_ _    \n" +
            " | |__/ _` | '_/ _` / -_)              | / _ \\ | ' \\   \n" +
            " |____\\__,_|_| \\__, \\___|              |_\\___/_|_||_|  \n" +
            "               |___/                                       \n");

    int order = correctOrder();
    Circle pizza = new Circle(order);
    System.out.printf("\nArea of the pizza: %.2f in", pizza.getArea());
    System.out.printf("\nRadius of the pizza: %.2f in", pizza.getRadius());
    System.out.println("\nEnjoy!");
  }

  public static int correctOrder() {
    Input input = new Input();
    double pie = input.getDouble("What size pizza do you want?");
    if (pie == 8) {
      System.out.println("One Small pizza coming right up.");
      return (int) pie;
    } else if (pie == 12) {
      System.out.println("One Medium pizza coming right up.");
      return (int) pie;
    } else if (pie == 16) {
      System.out.println("One Large pizza coming right up..");
      return (int) pie;
    } else {
      System.out.println("That's not a size we have on the menu, Sorry.");
      correctOrder();
    }
    return (int) pie;
  }
}

/*Todo Bonus: After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them
    until the user says they do not want to continue.
  Todo Bonus: Before exiting, the program should output the total number of circles created. Use a private static property, along with a public static method to keep track of and display the total
   number of circles created.
  Todo:Code copied from stack over. Need to at least reverse engineer/understands how it works before I might do anything with it
public abstract class ObjectCounter {

    private static Map<String, Long> classNameCount = new TreeMap<String, Long>();

    public ObjectCounter() {
        String key = this.getClass().getName();
        if (classNameCount.containsKey(key)) {
            classNameCount.put(key, classNameCount.get(key) + 1);
        } else {
            classNameCount.put(key, 1L);
        }
    }

    public static <T extends ObjectCounter> long getCount(Class<T> c) {
        String key = c.getName();
        if (classNameCount.containsKey(key)) {
            return classNameCount.get(key);
        } else {
            return 0;
        }
    }

    public static long totalObjectsCreated() {
        long totalCount = 0;

        for (long count : classNameCount.values()) {
            totalCount += count;
        }

        return totalCount;
    }
}
*/