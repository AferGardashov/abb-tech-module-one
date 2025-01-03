package homeworks.homework10;

//Examples in main method to test the MovieLibraryWithLambdas are written by ChatGPT.
public class Main {
    public static void main(String[] args) {
        // Create an instance of MovieLibraryWithLambdas
        MovieLibraryWithLambdas library = new MovieLibraryWithLambdas();

        // Add some movies to the library
        library.addMovie(new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010));
        library.addMovie(new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014));
        library.addMovie(new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008));
        library.addMovie(new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", 1994));
        library.addMovie(new Movie("The Matrix", "Lana Wachowski", "Sci-Fi", 1999));

        // Test search methods
        System.out.println("Search by Title: ");
        System.out.println(library.getMovieByTitle("Inception"));

        System.out.println("\nSearch by Director: ");
        System.out.println(library.getMovieByDirector("Christopher Nolan"));

        System.out.println("\nSearch by Genre: ");
        System.out.println(library.getMovieByGenre("Sci-Fi"));

        System.out.println("\nSearch by Release Year: ");
        System.out.println(library.getMovieByReleaseYear(1999));

        // Test sorting methods
        System.out.println("\nMovies sorted by Title:");
        System.out.println(library.sortByTitle());

        System.out.println("\nMovies sorted by Director:");
        System.out.println(library.sortByDirector());

        System.out.println("\nMovies sorted by Genre:");
        System.out.println(library.sortByGenre());

        System.out.println("\nMovies sorted by Release Year:");
        System.out.println(library.sortByYear());

        // Test aggregation methods
        System.out.println("\nAverage Release Year:");
        System.out.println(library.averageReleaseYear());

        System.out.println("\nNumber of Movies in Library:");
        System.out.println(library.numberOfMovies());

        // Test removing a movie
        library.removeMovie(new Movie("The Matrix", "Lana Wachowski", "Sci-Fi", 1999));
        System.out.println("\nMovies after removing 'The Matrix':");
        System.out.println(library.sortByTitle());


    }
}
