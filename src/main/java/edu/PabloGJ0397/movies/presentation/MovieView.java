package edu.PabloGJ0397.movies.presentation;

import edu.PabloGJ0397.movies.data.MovieDataRepository;
import edu.PabloGJ0397.movies.data.MovieMemLocalDataSource;
import edu.PabloGJ0397.movies.domain.GetMoviesUseCase;
import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.domain.SaveMovieUseCase;

import java.util.ArrayList;

public class MovieView {
    public static void save(Movie movie){
        SaveMovieUseCase saveMovieUseCase = new SaveMovieUseCase(new MovieDataRepository(MovieMemLocalDataSource.getInstance()));
        saveMovieUseCase.execute(movie);

    }
    public static void getMovies(){
        GetMoviesUseCase getMoviesUseCase = new GetMoviesUseCase(new MovieDataRepository(MovieMemLocalDataSource.getInstance()));
        ArrayList<Movie> movies = getMoviesUseCase.execute();
        System.out.println(movies);
    }
}
