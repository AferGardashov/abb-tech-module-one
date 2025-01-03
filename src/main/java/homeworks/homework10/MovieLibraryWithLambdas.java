package homeworks.homework10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieLibraryWithLambdas {

    private final List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void removeMovie(Movie movie) {
        movieList.remove(movie);
    }

    public List<Movie> getMovieByTitle(String title) {
        return movieList.stream()
                .filter(movie -> movie.getTitle().equals(title))
                .toList();
    }

    public List<Movie> getMovieByDirector(String director) {
        return movieList.stream()
                .filter(movie -> movie.getDirector().equals(director))
                .toList();
    }

    public List<Movie> getMovieByGenre(String genre) {
        return movieList.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .toList();
    }

    public List<Movie> getMovieByReleaseYear(int year) {
        return movieList.stream()
                .filter(movie -> movie.getReleaseYear() == year)
                .toList();
    }

    public List<Movie> sortByTitle() {
        return movieList.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .toList();
    }

    public List<Movie> sortByDirector() {
        return movieList.stream()
                .sorted(Comparator.comparing(Movie::getDirector))
                .toList();
    }

    public List<Movie> sortByGenre() {
        return movieList.stream()
                .sorted(Comparator.comparing(Movie::getGenre))
                .toList();
    }

    public List<Movie> sortByYear() {
        return movieList.stream()
                .sorted(Comparator.comparing(Movie::getReleaseYear))
                .toList();
    }


    public int averageReleaseYear() {
        return (int) movieList.stream()
                .map(Movie::getReleaseYear)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(-1);
    }


    public int numberOfMovies() {
        return (int) movieList.stream().count();
    }

}
