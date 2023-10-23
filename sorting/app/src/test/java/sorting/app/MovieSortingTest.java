package sorting.app;

import org.junit.jupiter.api.Test;
import sorting.app.sortDomainObjects.Movie;
import sorting.app.sortDomainObjects.MovieSorting;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieSortingTest {

// ====== Test Movie Class ======
    @Test
    public void testMovieTitle() {
        Movie movie = new Movie("The Test Movie", 2020, List.of("Action", "Adventure"));
        assertEquals("The Test Movie", movie.getTitle());
    }

    @Test
    public void testMovieYear() {
        Movie movie = new Movie("Another Movie", 2005, List.of("Drama"));
        assertEquals(2005, movie.getYear());
    }

    @Test
    public void testMovieGenres() {
        Movie movie = new Movie("Comedy Movie", 2010, List.of("Comedy", "Romance"));
        assertEquals(List.of("Comedy", "Romance"), movie.getGenres());
    }


    // ====== Test MovieSorting Class ======

    @Test
    void testSortByRecentYear() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Film One", 2000, List.of("Crime")));
        movies.add(new Movie("A Hello Tow", 2001, List.of("Crime", "Drama")));
        movies.add(new Movie("An Test Three", 2002, List.of("Crime", "Drama")));
        movies.add(new Movie("Wow Four", 2003, List.of("Comedy")));
        movies.add(new Movie("Zee Five", 2004, List.of("Drama", "Comedy")));

        List<Movie> sortedMovies = MovieSorting.sortByRecentYear(movies);

        assertEquals(5, sortedMovies.size());
        assertEquals("Zee Five", sortedMovies.get(0).getTitle());
        assertEquals("Wow Four", sortedMovies.get(1).getTitle());
        assertEquals("An Test Three", sortedMovies.get(2).getTitle());
        assertEquals("A Hello Tow", sortedMovies.get(3).getTitle());
        assertEquals("The Film One", sortedMovies.get(4).getTitle());
    }


    @Test
    void testSortByTitle() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Film One", 2000, List.of("Crime")));
        movies.add(new Movie("A Hello Tow", 2001, List.of("Crime", "Drama")));
        movies.add(new Movie("An Test Three", 2002, List.of("Crime", "Drama")));
        movies.add(new Movie("Wow Four", 2003, List.of("Comedy")));
        movies.add(new Movie("Zee Five", 2004, List.of("Drama", "Comedy")));

        List<Movie> sortedMovies = MovieSorting.sortByTitle(movies);

        assertEquals(5, sortedMovies.size());
        assertEquals("The Film One", sortedMovies.get(0).getTitle());
        assertEquals("A Hello Tow", sortedMovies.get(1).getTitle());
        assertEquals("An Test Three", sortedMovies.get(2).getTitle());
        assertEquals("Wow Four", sortedMovies.get(3).getTitle());
        assertEquals("Zee Five", sortedMovies.get(4).getTitle());
    }




}
