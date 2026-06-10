package edu.PabloGJ0397.movies.presentation;

import edu.PabloGJ0397.movies.data.MovieDataRepository;
import edu.PabloGJ0397.movies.data.MovieMemLocalDataSource;
import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.SaveMovieUseCase;

public class MovieView {
    public static void save(Movie movie){
        SaveMovieUseCase saveMovieUseCase = new SaveMovieUseCase(new MovieDataRepository(MovieMemLocalDataSource.getInstance()));
        saveMovieUseCase.execute(movie);

    }
}
