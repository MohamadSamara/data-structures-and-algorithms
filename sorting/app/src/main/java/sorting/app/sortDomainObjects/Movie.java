package sorting.app.sortDomainObjects;
import java.util.List;

public class Movie {
    private final String title;
    private final int year;
    private final List<String> genres;

    public Movie(String title, int year, List<String> genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title= '" + title + '\'' +
                ", year=" + year +
                ", genres= " + genres +
                " }";
    }
}
