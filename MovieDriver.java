package MyFirstProject;

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")){

            System.out.println("Enter the name of a movie");
            String movieName = scn.nextLine();

            System.out.println("Enter the rating of the movie");
            String rating = scn.nextLine();

            System.out.println("Enter the number of tickets sold for this movie");
            int ticketsSold = scn.nextInt(); scn.nextLine();

            // Create an object
            Movie aMovie = new Movie(movieName,rating,ticketsSold);
            System.out.println(aMovie);

            System.out.println("Do you want to enter another? (y or n)");
            repeat = scn.nextLine();
        }
        System.out.println("Goodbye");
    }
}