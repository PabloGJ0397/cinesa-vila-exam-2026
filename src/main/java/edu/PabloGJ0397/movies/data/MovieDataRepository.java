package edu.PabloGJ0397.movies.data;

import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.MovieRepository;

import java.util.ArrayList;

public class MovieDataRepository implements MovieRepository {
    private MovieMemLocalDataSource moviesMemLocalDataSource;

    public MovieDataRepository(MovieMemLocalDataSource moviesMemLocalDataSource) {
        this.moviesMemLocalDataSource = moviesMemLocalDataSource;
    }

    @Override
    public void save(Movie movie) {
        moviesMemLocalDataSource.save(movie);
    }

    @Override
    public ArrayList<Movie> getMovies() {
        return moviesMemLocalDataSource.findAll();
    }

    @Override
    public void delete(String id) {
        moviesMemLocalDataSource.delete(id);
    }
}

