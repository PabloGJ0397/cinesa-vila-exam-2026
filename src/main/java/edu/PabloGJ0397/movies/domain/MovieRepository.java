package edu.PabloGJ0397.movies.domain;

import java.util.ArrayList;

public interface MovieRepository {
    public void save(Movie movie);

    public ArrayList<Movie> getMovies();

    public void delete(String id);
}
