package edu.PabloGJ0397.movies.domain;

import java.util.ArrayList;

public class GetMoviesUseCase {
    private MovieRepository movieRepository;

    public GetMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public ArrayList<Movie> execute(){
        ArrayList<Movie> movies = movieRepository.getMovies();
        return movies;
    }
}
