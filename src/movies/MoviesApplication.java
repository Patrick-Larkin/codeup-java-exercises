package movies;

import util.Input;

//Todo 4: Create a class named MoviesApplication that has a main method.
public class MoviesApplication {
  Movie [] movies = MoviesArray.findAll();

  public static void main(String[] args) {

    Input input = new Input();

    //Todo 5: Give the user a list of options for viewing all the movies or viewing movies by category.
    //Todo: If a category is selected, only movies from that category should be displayed.
    //Todo: Your application should continue to run until the user chooses to exit.
    do {
      System.out.println("What Movies would you like to view?\n");
      System.out.println("0 - exit");
      System.out.println("1 - view all movies");
      System.out.println("2 - view movies in the animated category");
      System.out.println("3 - view movies in the dream category");
      System.out.println("4 - view movies in the horror category");
      System.out.println("5 - view movies in the sci-fi category");

      switch (input) {
        case 1:
          System.exit(0);
          break;
        case 2:
          System.out.println("view all movies in the animated category");
          if (movie.getCategory().equalsIgnoreCase("animated")) {
            for (Movie movie: movies) {
              System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
          }
          break;
        case 3:
          System.out.println("view all movies in the animated category");
          if (movie.getCategory().equalsIgnoreCase("animated")) {
            for (Movie movie: movies) {
              System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
          }
          break;
        case 4:
          System.out.println("view all movies in the animated category");
          if (movie.getCategory().equalsIgnoreCase("animated")) {
            for (Movie movie: movies) {
              System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
          }
          break;
        case 5:
          System.out.println("view all movies in the animated category");
          if (movie.getCategory().equalsIgnoreCase("animated")) {
            for (Movie movie: movies) {
              System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
          }
          break;
        default:
          System.out.println("Hi");
      }
    } while (listSettings != 0);
  }
}
