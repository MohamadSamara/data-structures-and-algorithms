package sorting.app.sortDomainObjects;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Film One", 2000, List.of("Crime")));
        movies.add(new Movie("A Hello Tow", 2001, List.of("Crime", "Drama")));
        movies.add(new Movie("An Test Three", 2002, List.of("Crime", "Drama")));
        movies.add(new Movie("Wow Four", 2003, List.of("Comedy")));
        movies.add(new Movie("Zee Five", 2004, List.of("Drama" , "Comedy")));

        List<Movie> sortedByYear = MovieSorting.sortByRecentYear(movies);
        System.out.println("========== Sorted by year ==========");
        for (Movie movie : sortedByYear) {
            System.out.println(movie);
        }

        System.out.println("\n**************************************\n");

        List<Movie> sortedByTitle = MovieSorting.sortByTitle(movies);
        System.out.println("========== Sorted by title ==========");
        for (Movie movie : sortedByTitle) {
            System.out.println(movie);
        }
    }
}
