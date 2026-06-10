package edu.PabloGJ0397.movies.data;

import edu.PabloGJ0397.movies.domain.Movie;

import java.util.ArrayList;
import java.util.Objects;

public class MoviesMemLocalDataSource {
    private ArrayList<Movie> storage = new ArrayList<>();

    public ArrayList<Movie> findAll() {
        return storage;
    }

    public void save(Movie pelicula) {
        storage.add(pelicula);
    }

    public void delete(String id) {
        storage.removeIf(movie ->
                Objects.equals(movie.getId(), id)
        );
    }
}
