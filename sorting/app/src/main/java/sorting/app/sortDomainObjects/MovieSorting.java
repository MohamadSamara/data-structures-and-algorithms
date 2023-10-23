package sorting.app.sortDomainObjects;

import java.util.Comparator;
import java.util.List;

public class MovieSorting {

    public static List<Movie> sortByRecentYear(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getYear).reversed());
        return movies;
    }

    public static List<Movie> sortByTitle(List<Movie> movies) {
        movies.sort(Comparator.comparing(movie -> movie.getTitle().replaceAll("^(A|An|The)\\s", "")));
        return movies;
    }
}
