package edu.PabloGJ0397.mocks;

import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.MovieRepository;

import java.util.ArrayList;

public class NullMovieMockRepository implements MovieRepository {
    private Integer countSaveMethod = 0;

    @Override
    public void save(Movie movie) {    }

    @Override
    public ArrayList<Movie> getMovies() {
        return null;
    }

    @Override
    public void delete(String id) {    }
}
