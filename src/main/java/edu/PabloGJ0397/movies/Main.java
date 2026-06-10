package edu.PabloGJ0397.movies;

import edu.PabloGJ0397.movies.domain.Movie;
import edu.PabloGJ0397.movies.presentation.MovieView;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //Main test on SaveMovieUseCase. Function 1
        Movie movie1 = new Movie("tt0133093","140","Drama","25/05/1995","Disney","Tarzán");
        Movie movie2 = new Movie("tt0133094","140","Comedy","25/05/2010","Pixar","Entangled");
        MovieView.save(movie1);

        //Main test on GetMoviesUseCase. Function 2
        MovieView.getMovies();
        MovieView.save(movie2);
        MovieView.getMovies();


    }




}
