package edu.PabloGJ0397.movies.data;

import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.MovieRepository;

public class MovieDataRepository implements MovieRepository {
    private MovieMemLocalDataSource moviesMemLocalDataSource;

    public MovieDataRepository(MovieMemLocalDataSource moviesMemLocalDataSource) {
        this.moviesMemLocalDataSource = moviesMemLocalDataSource;
    }

    @Override
    public void save(Movie movie) {
        moviesMemLocalDataSource.save(movie);
    }
}

