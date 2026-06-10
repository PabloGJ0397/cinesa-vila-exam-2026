package edu.PabloGJ0397.movies.data;

import edu.PabloGJ0397.movies.domain.Movie;

import java.util.ArrayList;
import java.util.Objects;

public class MovieMemLocalDataSource {
    private static MovieMemLocalDataSource instance = null;
    private ArrayList<Movie> storage = new ArrayList<>();

    public static MovieMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new MovieMemLocalDataSource();
        }
        return instance;
    }

    public ArrayList<Movie> findAll() {
        return storage;
    }

    public void save(Movie movie) {
        storage.add(movie);
    }

    public void delete(String id) {
        storage.removeIf(movie ->
                Objects.equals(movie.getId(), id)
        );
    }
}
