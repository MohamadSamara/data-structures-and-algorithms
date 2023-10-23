# Code Challenge: Sorting Domain Objects

This code challenge involves sorting an array of Movie objects using two different sorting functions. The Movie objects have attributes including title (string), year (integer), and genres (list of strings). The sorting functions will sort the movies by most recent year first and alphabetically by title, ignoring leading "A"s, "An"s, or "The"s.

## Sorting Functions

1. `sortByRecentYear`: Sorts the movies by most recent year first.

2. `sortByTitle`: Sorts the movies alphabetically by title, ignoring "A", "An", or "The" at the beginning of the title.

## Comparator Functions

The sorting functions will use comparator functions to determine the order of the movies

### Comparator Function for Sorting by Recent Year

```
    public static List<Movie> sortByRecentYear(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getYear).reversed());
        return movies;
        }
```

### Comparator Function for Sorting by Title

```
    public static List<Movie> sortByTitle(List<Movie> movies) {
        movies.sort(Comparator.comparing(movie -> movie.getTitle().replaceAll("^(A|An|The)\\s", "")));
        return movies;
    }
```

## Sample Data

You can use the provided sample data for testing your sorting functions:

```
List<Movie> movies = new ArrayList<>();
movies.add(new Movie("The Film One", 2000, Arrays.asList("Crime")));
movies.add(new Movie("A Hello Tow", 2001, Arrays.asList("Crime", "Drama")));
movies.add(new Movie("An Test Three", 2002, Arrays.asList("Crime", "Drama")));
movies.add(new Movie("Wow Four", 2003, Arrays.asList("Comedy")));
movies.add(new Movie("Zee Five", 2004, Arrays.asList("Drama", "Comedy")));
```

## How to Use

You can use the sorting functions as follows:

```
List<Movie> sortedByYear = MovieSorting.sortByRecentYear(movies);
List<Movie> sortedByTitle = MovieSorting.sortByTitle(movies);
```

## Testing

In the second part of the code challenge, write tests for your comparator functions. Ensure that the comparator functions correctly determine the order of the movies.
